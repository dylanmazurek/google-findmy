package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class miu extends lyy {
    long a;
    final /* synthetic */ mjc b;
    private final mja c;

    public miu(mjc mjcVar, mja mjaVar) {
        this.b = mjcVar;
        this.c = mjaVar;
    }

    @Override // defpackage.mjo
    public final void d(long j) {
        Runnable runnable;
        if (this.b.q.f == null) {
            synchronized (this.b.l) {
                if (this.b.q.f == null) {
                    mja mjaVar = this.c;
                    if (!mjaVar.b) {
                        long j2 = this.a + j;
                        this.a = j2;
                        mjc mjcVar = this.b;
                        long j3 = mjcVar.u;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > mjcVar.m) {
                            mjaVar.c = true;
                        } else {
                            long v = mjcVar.E.v(j2 - j3);
                            mjc mjcVar2 = this.b;
                            mjcVar2.u = this.a;
                            if (v > mjcVar2.n) {
                                this.c.c = true;
                            }
                        }
                        mja mjaVar2 = this.c;
                        if (mjaVar2.c) {
                            runnable = this.b.c(mjaVar2);
                        } else {
                            runnable = null;
                        }
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
            }
        }
    }
}
