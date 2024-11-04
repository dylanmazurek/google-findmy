package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwa extends mjo {
    public final mjo a;
    private final jbo b;

    public kwa(mjo mjoVar) {
        super(null);
        this.a = mjoVar;
        this.b = new jbo(jbu.b());
    }

    private final void i(Runnable runnable) {
        jbe a = jbu.a();
        if (a != null && a != jaw.a) {
            runnable.run();
        } else {
            new jbk(this.b.a, runnable).run();
        }
    }

    @Override // defpackage.mjo
    public final void S(mbc mbcVar) {
        i(new kvz(this, (Object) mbcVar, 1));
    }

    @Override // defpackage.mjo
    public final void a(mca mcaVar, mbc mbcVar) {
        i(new kvo((mjo) this, mcaVar, mbcVar, 2));
    }

    @Override // defpackage.mjo
    public final void f(Object obj) {
        i(new kvz(this, obj, 0));
    }

    @Override // defpackage.mjo
    public final void g() {
        i(new jxe(this.a, 16));
    }
}
