package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxk implements fxt {
    public final Object a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public fxk(Executor executor, fxi fxiVar, fxv fxvVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = fxiVar;
        this.a = fxvVar;
    }

    @Override // defpackage.fxt
    public final void b(fxs fxsVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (fxsVar.i()) {
                            synchronized (this.a) {
                            }
                            this.c.execute(new fbh(this, fxsVar, 17, (char[]) null));
                            return;
                        }
                        return;
                    }
                    if (!fxsVar.i() && !((fxv) fxsVar).c) {
                        synchronized (this.a) {
                        }
                        this.c.execute(new fbh(this, fxsVar, 16, (char[]) null));
                        return;
                    }
                    return;
                }
                synchronized (this.a) {
                }
                this.c.execute(new fbh(this, fxsVar, 15, (char[]) null));
                return;
            }
            this.c.execute(new fbh(this, fxsVar, 13, (char[]) null));
            return;
        }
        if (((fxv) fxsVar).c) {
            synchronized (this.a) {
            }
            this.c.execute(new eta(this, 17, null));
        }
    }

    public fxk(Executor executor, Object obj, int i) {
        this.d = i;
        this.a = new Object();
        this.c = executor;
        this.b = obj;
    }
}
