package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nav extends mst implements mtd {
    public final mst a;
    private final int b;
    private final /* synthetic */ mtd c = mtb.a;
    private final mrp d = new mrp(0, mrs.a);
    private final ktf f = new ktf((byte[]) null, (char[]) null);
    private final Object e = new Object();

    public nav(mst mstVar, int i) {
        this.a = mstVar;
        this.b = i;
    }

    private final boolean h() {
        synchronized (this.e) {
            if (this.d.b >= this.b) {
                return false;
            }
            this.d.b();
            return true;
        }
    }

    @Override // defpackage.mst
    public final void a(mnb mnbVar, Runnable runnable) {
        Runnable e;
        this.f.t(runnable);
        if (this.d.b < this.b && h() && (e = e()) != null) {
            this.a.a(this, new nau(this, e));
        }
    }

    @Override // defpackage.mtd
    public final void c(long j, msd msdVar) {
        this.c.c(j, msdVar);
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.f.r();
            if (runnable == null) {
                synchronized (this.e) {
                    this.d.a();
                    if (this.f.q() == 0) {
                        return null;
                    }
                    this.d.b();
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // defpackage.mst
    public final void f(mnb mnbVar, Runnable runnable) {
        Runnable e;
        this.f.t(runnable);
        if (this.d.b < this.b && h() && (e = e()) != null) {
            this.a.f(this, new nau(this, e));
        }
    }

    @Override // defpackage.mtd
    public final mtl g(long j, Runnable runnable, mnb mnbVar) {
        return this.c.g(j, runnable, mnbVar);
    }
}
