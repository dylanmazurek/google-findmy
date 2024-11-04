package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mto extends mst {
    private long a;
    public mlv b;
    private boolean c;

    private static final long di(boolean z) {
        if (z) {
            return 4294967296L;
        }
        return 1L;
    }

    public static /* synthetic */ void s(mto mtoVar) {
        mtoVar.l(false);
    }

    public static /* synthetic */ void t(mto mtoVar) {
        mtoVar.n(false);
    }

    protected abstract Thread e();

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(long j, mtr mtrVar) {
        mta.a.v(j, mtrVar);
    }

    public void j() {
        throw null;
    }

    public long k() {
        throw null;
    }

    public final void l(boolean z) {
        long di = this.a - di(z);
        this.a = di;
        if (di <= 0) {
            boolean z2 = msy.a;
            if (this.c) {
                j();
            }
        }
    }

    public final void m(mth mthVar) {
        mlv mlvVar = this.b;
        if (mlvVar == null) {
            mlvVar = new mlv();
            this.b = mlvVar;
        }
        mlvVar.addLast(mthVar);
    }

    public final void n(boolean z) {
        this.a += di(z);
        if (!z) {
            this.c = true;
        }
    }

    public final boolean o() {
        if (this.a >= di(true)) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        mlv mlvVar = this.b;
        if (mlvVar != null) {
            return mlvVar.isEmpty();
        }
        return true;
    }

    public final boolean q() {
        mth mthVar;
        mlv mlvVar = this.b;
        if (mlvVar != null && (mthVar = (mth) mlvVar.a()) != null) {
            mthVar.run();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        Thread e = e();
        if (Thread.currentThread() != e) {
            LockSupport.unpark(e);
        }
    }
}
