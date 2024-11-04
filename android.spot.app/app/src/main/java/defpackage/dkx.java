package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkx implements dtv {
    public dir b;
    public boolean c;
    public dlf d;
    public boolean e;
    dlb f;
    public boolean g;
    dkz h;
    public volatile boolean i;
    int j;
    public final dkt k;
    public final dkt l;
    private final buf n;
    private final dmm o;
    private final dmm p;
    private final dmm q;
    private boolean s;
    private dkj t;
    final dkw a = new dkw(new ArrayList(2));
    public final iyu m = new iyu();
    private final AtomicInteger r = new AtomicInteger();

    public dkx(dmm dmmVar, dmm dmmVar2, dmm dmmVar3, dkt dktVar, dkt dktVar2, buf bufVar) {
        this.o = dmmVar;
        this.p = dmmVar2;
        this.q = dmmVar3;
        this.l = dktVar;
        this.k = dktVar2;
        this.n = bufVar;
    }

    private final boolean j() {
        if (!this.g && !this.e && !this.i) {
            return false;
        }
        return true;
    }

    public final dmm a() {
        if (this.s) {
            return this.q;
        }
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        boolean z;
        dkz dkzVar;
        synchronized (this) {
            this.m.a();
            bsc.n(j(), "Not yet complete!");
            int decrementAndGet = this.r.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            bsc.n(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                dkzVar = this.h;
                d();
            } else {
                dkzVar = null;
            }
        }
        if (dkzVar != null) {
            dkzVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(int i) {
        dkz dkzVar;
        bsc.n(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) == 0 && (dkzVar = this.h) != null) {
            dkzVar.d();
        }
    }

    public final synchronized void d() {
        if (this.b != null) {
            this.a.a.clear();
            this.b = null;
            this.h = null;
            this.d = null;
            this.g = false;
            this.i = false;
            this.e = false;
            dkj dkjVar = this.t;
            if (dkjVar.b.d()) {
                dkjVar.a();
            }
            this.t = null;
            this.f = null;
            this.j = 0;
            this.n.b(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void e(dkj dkjVar) {
        dmm dmmVar;
        this.t = dkjVar;
        int c = dkjVar.c(1);
        if (c != 2 && c != 3) {
            dmmVar = a();
            dmmVar.execute(dkjVar);
        }
        dmmVar = this.o;
        dmmVar.execute(dkjVar);
    }

    @Override // defpackage.dtv
    public final iyu f() {
        return this.m;
    }

    public final synchronized void g(dso dsoVar, Executor executor) {
        this.m.a();
        this.a.a.add(new dkv(dsoVar, executor));
        if (this.e) {
            c(1);
            executor.execute(new dku(this, dsoVar, 0));
        } else if (this.g) {
            c(1);
            executor.execute(new dku(this, dsoVar, 1));
        } else {
            bsc.n(!this.i, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public final synchronized void h(dso dsoVar) {
        this.m.a();
        this.a.a.remove(new dkv(dsoVar, dti.b));
        if (this.a.c()) {
            if (!j()) {
                this.i = true;
                dkj dkjVar = this.t;
                dkjVar.m = true;
                dkg dkgVar = dkjVar.l;
                if (dkgVar != null) {
                    dkgVar.a();
                }
                this.l.a(this, this.b);
            }
            if ((this.e || this.g) && this.r.get() == 0) {
                d();
            }
        }
    }

    public final synchronized void i(dir dirVar, boolean z, boolean z2) {
        this.b = dirVar;
        this.c = z;
        this.s = z2;
    }
}
