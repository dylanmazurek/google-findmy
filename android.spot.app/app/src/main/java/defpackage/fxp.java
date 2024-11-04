package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxp implements fxt, fxo, fxn, fxl {
    public final fxv a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public fxp(Executor executor, Object obj, fxv fxvVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
        this.a = fxvVar;
    }

    @Override // defpackage.fxl
    public final void a() {
        if (this.d != 0) {
            this.a.u();
        } else {
            this.a.u();
        }
    }

    @Override // defpackage.fxt
    public final void b(fxs fxsVar) {
        if (this.d != 0) {
            this.c.execute(new fbh(this, fxsVar, 14, (char[]) null));
        } else {
            this.c.execute(new fbh(this, fxsVar, 18, (char[]) null));
        }
    }

    @Override // defpackage.fxn
    public final void c(Exception exc) {
        if (this.d != 0) {
            this.a.r(exc);
        } else {
            this.a.r(exc);
        }
    }

    @Override // defpackage.fxo
    public final void d(Object obj) {
        if (this.d != 0) {
            this.a.s(obj);
        } else {
            this.a.s(obj);
        }
    }
}
