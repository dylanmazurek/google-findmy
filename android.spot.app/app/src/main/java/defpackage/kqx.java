package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqx implements Runnable {
    public final FirebaseInstanceId a;
    final ExecutorService b = kqn.a();
    private final long c;
    private final PowerManager.WakeLock d;

    public kqx(FirebaseInstanceId firebaseInstanceId, long j) {
        this.a = firebaseInstanceId;
        this.c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.a.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseInstanceId firebaseInstanceId;
        if (lyn.t().c(a())) {
            this.d.acquire();
        }
        try {
            try {
                boolean z = true;
                this.a.l(true);
                if (this.a.d.b() != 0) {
                    lyn t = lyn.t();
                    Context a = a();
                    if (t.a == null) {
                        if (a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        t.a = Boolean.valueOf(z);
                    }
                    ((Boolean) t.b).booleanValue();
                    if (((Boolean) t.a).booleanValue() && !b()) {
                        kqw kqwVar = new kqw(this);
                        kqwVar.a.a().registerReceiver(kqwVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    } else {
                        if (this.a.o(this.a.b())) {
                            try {
                                firebaseInstanceId = this.a;
                            } catch (IOException e) {
                                String message = e.getMessage();
                                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                                    if (e.getMessage() == null) {
                                        Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                                    } else {
                                        throw e;
                                    }
                                }
                                Log.w("FirebaseInstanceId", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                            } catch (SecurityException unused) {
                                Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                            }
                            if (firebaseInstanceId.h(amr.n(firebaseInstanceId.c), "*") == null) {
                                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                                this.a.n(this.c);
                            }
                        }
                        this.a.l(false);
                    }
                } else {
                    this.a.l(false);
                }
            } catch (IOException e2) {
                Log.e("FirebaseInstanceId", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.l(false);
            }
        } finally {
            if (lyn.t().c(a())) {
                this.d.release();
            }
        }
    }
}
