package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fir extends fjj implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    protected final fgp d;

    public fir(fjk fjkVar, fgp fgpVar) {
        super(fjkVar);
        this.b = new AtomicReference(null);
        this.c = new fqw(Looper.getMainLooper());
        this.d = fgpVar;
    }

    private static final int k(kvw kvwVar) {
        if (kvwVar == null) {
            return -1;
        }
        return kvwVar.a;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        e(connectionResult, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.fjj
    public final void c(int i, int i2, Intent intent) {
        kvw kvwVar = (kvw) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int f = this.d.f(l());
                if (f == 0) {
                    b();
                    return;
                } else if (kvwVar != null) {
                    if (((ConnectionResult) kvwVar.b).c == 18 && f == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            if (i2 == -1) {
                b();
                return;
            }
            if (i2 == 0) {
                if (kvwVar != null) {
                    int i3 = 13;
                    if (intent != null) {
                        i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                    }
                    a(new ConnectionResult(i3, null, ((ConnectionResult) kvwVar.b).toString()), k(kvwVar));
                    return;
                }
                return;
            }
        }
        if (kvwVar != null) {
            a((ConnectionResult) kvwVar.b, kvwVar.a);
        }
    }

    @Override // defpackage.fjj
    public final void d(Bundle bundle) {
        kvw kvwVar;
        if (bundle != null) {
            AtomicReference atomicReference = this.b;
            if (bundle.getBoolean("resolving_error", false)) {
                kvwVar = new kvw(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                kvwVar = null;
            }
            atomicReference.set(kvwVar);
        }
    }

    protected abstract void e(ConnectionResult connectionResult, int i);

    protected abstract void f();

    @Override // defpackage.fjj
    public final void g(Bundle bundle) {
        kvw kvwVar = (kvw) this.b.get();
        if (kvwVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", kvwVar.a);
        bundle.putInt("failed_status", ((ConnectionResult) kvwVar.b).c);
        bundle.putParcelable("failed_resolution", ((ConnectionResult) kvwVar.b).d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), k((kvw) this.b.get()));
    }
}
