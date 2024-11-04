package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhv extends atq implements afq {
    public final dhb a;
    public final adt b;
    public final adt c;
    public final adt d;
    public final dgq e;
    private final adt f;
    private final adt g;
    private final msw h;
    private muf i;

    public dhv(dhb dhbVar, dgq dgqVar, msw mswVar) {
        dhbVar.getClass();
        this.a = dhbVar;
        this.e = dgqVar;
        this.b = new aee(dih.a, agw.a);
        this.c = new aee(null, agw.a);
        this.f = new aee(Float.valueOf(1.0f), agw.a);
        this.g = new aee(null, agw.a);
        this.d = new aee(null, agw.a);
        msw n = msz.n(mswVar, new mva(mkm.az(((naj) mswVar).a)));
        mst mstVar = mtj.a;
        this.h = msz.n(n, nbc.a.h());
    }

    @Override // defpackage.atq
    public final long a() {
        atq g = g();
        if (g != null) {
            return g.a();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.atq
    protected final void b(asn asnVar) {
        atq g = g();
        if (g != null) {
            g.f(asnVar, asnVar.l(), ((Number) this.f.a()).floatValue(), (ji) this.g.a());
        }
    }

    @Override // defpackage.afq
    public final void c() {
        afq afqVar;
        Object g = g();
        if (g instanceof afq) {
            afqVar = (afq) g;
        } else {
            afqVar = null;
        }
        if (afqVar != null) {
            afqVar.c();
        }
        if (this.i == null) {
            this.i = mpp.q(this.h, null, 0, new eau(this, (mmx) null, 1), 3);
        }
    }

    @Override // defpackage.atq
    protected final void d(ji jiVar) {
        this.g.h(jiVar);
    }

    public final atq g() {
        return (atq) this.d.a();
    }

    @Override // defpackage.afq
    public final void h() {
        afq afqVar;
        Object g = g();
        if (g instanceof afq) {
            afqVar = (afq) g;
        } else {
            afqVar = null;
        }
        if (afqVar != null) {
            afqVar.h();
        }
    }

    @Override // defpackage.afq
    public final void i() {
        afq afqVar;
        Object g = g();
        if (g instanceof afq) {
            afqVar = (afq) g;
        } else {
            afqVar = null;
        }
        if (afqVar != null) {
            afqVar.i();
        }
        muf mufVar = this.i;
        if (mufVar != null) {
            mufVar.s(null);
        }
        this.i = null;
    }

    @Override // defpackage.atq
    protected final void j(float f) {
        this.f.h(Float.valueOf(f));
    }
}
