package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvm extends mvn implements mtd {
    public final Handler a;
    public final mvm b;
    private final String c;
    private final boolean d;

    public mvm(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void i(mnb mnbVar, Runnable runnable) {
        mkm.aA(mnbVar, new CancellationException(a.af(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        mtj.b.a(mnbVar, runnable);
    }

    @Override // defpackage.mst
    public final void a(mnb mnbVar, Runnable runnable) {
        if (!this.a.post(runnable)) {
            i(mnbVar, runnable);
        }
    }

    @Override // defpackage.mtd
    public final void c(long j, msd msdVar) {
        miy miyVar = new miy(msdVar, this, 4);
        if (this.a.postDelayed(miyVar, moz.ag(j, 4611686018427387903L))) {
            msdVar.d(new erg(this, miyVar, 5));
        } else {
            i(((mse) msdVar).b, miyVar);
        }
    }

    @Override // defpackage.mst
    public final boolean cp(mnb mnbVar) {
        if (this.d) {
            if (amr.i(Looper.myLooper(), this.a.getLooper())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mvm) {
            mvm mvmVar = (mvm) obj;
            if (mvmVar.a == this.a && mvmVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.mvn, defpackage.mtd
    public final mtl g(long j, final Runnable runnable, mnb mnbVar) {
        if (this.a.postDelayed(runnable, moz.ag(j, 4611686018427387903L))) {
            return new mtl() { // from class: mvl
                @Override // defpackage.mtl
                public final void dc() {
                    mvm.this.a.removeCallbacks(runnable);
                }
            };
        }
        i(mnbVar, runnable);
        return muu.a;
    }

    @Override // defpackage.mur
    public final /* synthetic */ mur h() {
        return this.b;
    }

    public final int hashCode() {
        int i;
        boolean z = this.d;
        int identityHashCode = System.identityHashCode(this.a);
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ identityHashCode;
    }

    @Override // defpackage.mur, defpackage.mst
    public final String toString() {
        String e = e();
        if (e == null) {
            String str = this.c;
            if (str == null) {
                str = this.a.toString();
            }
            if (this.d) {
                return String.valueOf(str).concat(".immediate");
            }
            return str;
        }
        return e;
    }

    private mvm(Handler handler, String str, boolean z) {
        this.a = handler;
        this.c = str;
        this.d = z;
        this.b = z ? this : new mvm(handler, str, true);
    }
}
