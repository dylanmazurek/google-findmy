package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksp implements Runnable {
    public final FirebaseMessaging a;
    final ExecutorService b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new fmd("firebase-iid-executor"));
    private final long c;
    private final PowerManager.WakeLock d;

    public ksp(FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.a.e;
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
        if (jde.c().b(a())) {
            this.d.acquire();
        }
        try {
            try {
                boolean z = true;
                this.a.f(true);
                if (!this.a.i.e()) {
                    this.a.f(false);
                } else {
                    jde c = jde.c();
                    Context a = a();
                    if (c.c == null) {
                        if (a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        c.c = Boolean.valueOf(z);
                    }
                    ((Boolean) c.a).booleanValue();
                    if (((Boolean) c.c).booleanValue() && !b()) {
                        kso ksoVar = new kso(this);
                        ksoVar.a.a().registerReceiver(ksoVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    } else {
                        try {
                        } catch (IOException e) {
                            String message = e.getMessage();
                            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                                if (e.getMessage() == null) {
                                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                        } catch (SecurityException unused) {
                            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                        }
                        if (this.a.c() == null) {
                            Log.e("FirebaseMessaging", "Token retrieval failed: null");
                            this.a.h(this.c);
                        } else {
                            this.a.f(false);
                        }
                    }
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.f(false);
            }
        } finally {
            if (jde.c().b(a())) {
                this.d.release();
            }
        }
    }
}
