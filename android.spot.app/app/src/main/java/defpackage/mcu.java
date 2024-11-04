package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mcu implements mhg {
    public final Object a = new Object();
    public final mjz b;
    public final mhi c;
    public int d;
    public boolean e;
    public boolean f;
    public final int g;
    public final mjt h;
    public mds i;
    public lzm j;
    public volatile boolean k;
    public boolean l;
    public mhi m;
    private boolean n;
    private boolean o;
    private Runnable p;
    private boolean q;

    /* JADX INFO: Access modifiers changed from: protected */
    public mcu(int i, mjt mjtVar, mjz mjzVar) {
        this.b = mjzVar;
        mhi mhiVar = new mhi(this, lyz.a, i, mjtVar, mjzVar);
        this.c = mhiVar;
        this.m = mhiVar;
        this.g = 32768;
        this.j = lzm.b;
        this.o = false;
        this.h = mjtVar;
    }

    public final void a() {
        boolean b;
        synchronized (this.a) {
            b = b();
        }
        if (b) {
            this.i.d();
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.e && this.d < this.g && !this.f) {
                z = true;
            }
        }
        return z;
    }

    public final void c(mca mcaVar, mdr mdrVar, mbc mbcVar) {
        if (!this.n) {
            this.n = true;
            mjt mjtVar = this.h;
            if (mjtVar.a.compareAndSet(false, true)) {
                for (mjo mjoVar : mjtVar.b) {
                    mjoVar.T();
                }
            }
            mjz mjzVar = this.b;
            if (mcaVar.f()) {
                mjzVar.b++;
            } else {
                mjzVar.c++;
            }
            this.i.a(mcaVar, mdrVar, mbcVar);
        }
    }

    @Override // defpackage.mhg
    public final void d(boolean z) {
        hwx.V(this.l, "status should have been reported on deframer closed");
        this.o = true;
        if (this.q && z) {
            e(mca.h.d("Encountered end-of-stream mid-frame"), true, new mbc());
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            this.p = null;
        }
    }

    public final void e(mca mcaVar, boolean z, mbc mbcVar) {
        mdr mdrVar = mdr.PROCESSED;
        mcaVar.getClass();
        mbcVar.getClass();
        if (this.l) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        this.l = true;
        this.q = mcaVar.f();
        synchronized (this.a) {
            this.f = true;
        }
        if (this.o) {
            this.p = null;
            c(mcaVar, mdrVar, mbcVar);
            return;
        }
        this.p = new bxi(this, mcaVar, mdrVar, mbcVar, 7);
        if (z) {
            this.m.close();
            return;
        }
        mhi mhiVar = this.m;
        if (mhiVar.b()) {
            return;
        }
        if (mhiVar.c()) {
            mhiVar.close();
        } else {
            mhiVar.f = true;
        }
    }

    @Override // defpackage.mhg
    public final void f(lrs lrsVar) {
        this.i.e(lrsVar);
    }
}
