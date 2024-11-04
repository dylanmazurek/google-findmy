package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvx extends lzp {
    private final AtomicReference a;

    public kvx(lyv lyvVar) {
        super(lyvVar);
        this.a = new AtomicReference(kvw.b(1));
    }

    @Override // defpackage.lzq, defpackage.lyv
    public final void a(mjo mjoVar, mbc mbcVar) {
        kvw kvwVar;
        kvw kvwVar2;
        do {
            kvwVar = (kvw) this.a.get();
            if (kvwVar.a == 1) {
                kvwVar2 = kvw.b(2);
            } else {
                kvwVar2 = kvwVar;
            }
        } while (!a.o(this.a, kvwVar, kvwVar2));
        int i = kvwVar.a;
        if (i != 1) {
            if (i == 4) {
                mjoVar.a((mca) kvwVar.b, new mbc());
                return;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Already started");
                this.b.c("start() called more than once", illegalStateException);
                throw illegalStateException;
            }
        }
        this.b.a(mjoVar, mbcVar);
    }

    @Override // defpackage.mbr, defpackage.lyv
    public final void c(String str, Throwable th) {
        kvw kvwVar;
        kvw a;
        mca mcaVar = mca.c;
        if (str != null) {
            mcaVar = mcaVar.d(str);
        }
        if (th != null) {
            mcaVar = mcaVar.c(th);
        }
        do {
            kvwVar = (kvw) this.a.get();
            int i = kvwVar.a;
            if (i == 4) {
                a = kvwVar;
            } else if (i == 1) {
                a = kvw.a(4, mcaVar);
            } else {
                a = kvw.a(5, mcaVar);
            }
        } while (!a.o(this.a, kvwVar, a));
        this.b.c(str, th);
    }

    @Override // defpackage.mbr, defpackage.lyv
    public final void d() {
        kvw kvwVar;
        do {
            kvwVar = (kvw) this.a.get();
            if (kvwVar.a != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!a.o(this.a, kvwVar, kvw.b(3)));
        this.b.d();
    }

    @Override // defpackage.mbr, defpackage.lyv
    public final void e(int i) {
        int i2 = ((kvw) this.a.get()).a;
        if (i2 != 1 && i2 != 4) {
            hwx.K(true, "Number requested must be non-negative");
            this.b.e(i);
            return;
        }
        throw new IllegalStateException("Not started");
    }

    @Override // defpackage.lzq, defpackage.lyv
    public final void f(Object obj) {
        obj.getClass();
        int i = ((kvw) this.a.get()).a;
        if (i == 2) {
            this.b.f(obj);
        } else if (i == 5) {
        } else {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
