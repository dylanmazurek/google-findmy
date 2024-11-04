package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoh extends ams {
    public moh k;
    public moh l;
    public final long m;
    private final ams n;
    private final boolean o;
    private final boolean p;

    public aoh(ams amsVar, moh mohVar, moh mohVar2, boolean z, boolean z2) {
        super(0, anf.a, anm.p(mohVar, (amsVar == null || (r1 = amsVar.j()) == null) ? ((amq) anm.i.get()).a : r1, z), anm.q(mohVar2, (amsVar == null || (r1 = amsVar.l()) == null) ? ((amq) anm.i.get()).b : r1));
        moh l;
        moh j;
        this.n = amsVar;
        this.o = z;
        this.p = z2;
        this.k = this.a;
        this.l = this.b;
        this.m = alq.a();
    }

    private final ams F() {
        ams amsVar = this.n;
        if (amsVar == null) {
            return (ams) anm.i.get();
        }
        return amsVar;
    }

    @Override // defpackage.amz
    public final void A(int i) {
        ant.a();
        throw new mks();
    }

    @Override // defpackage.amz
    public final void B(anf anfVar) {
        ant.a();
        throw new mks();
    }

    @Override // defpackage.ams
    public final ams a(moh mohVar, moh mohVar2) {
        moh p;
        p = anm.p(mohVar, this.k, true);
        moh q = anm.q(mohVar2, this.l);
        if (!this.o) {
            return new aoh(F().a(null, q), p, q, false, true);
        }
        return F().a(p, q);
    }

    @Override // defpackage.ams, defpackage.amz
    public final amz b(moh mohVar) {
        moh p;
        amz a;
        p = anm.p(mohVar, this.k, true);
        if (!this.o) {
            a = anm.a(F().b(null), p, true);
            return a;
        }
        return F().b(p);
    }

    @Override // defpackage.ams
    public final anc c() {
        return F().c();
    }

    @Override // defpackage.ams, defpackage.amz
    public final void d() {
        ams amsVar;
        D();
        if (this.p && (amsVar = this.n) != null) {
            amsVar.d();
        }
    }

    @Override // defpackage.ams, defpackage.amz
    public final void e() {
        F().e();
    }

    @Override // defpackage.ams, defpackage.amz
    public final /* synthetic */ void f() {
        amr.o();
    }

    @Override // defpackage.ams, defpackage.amz
    public final /* synthetic */ void g() {
        amr.o();
    }

    @Override // defpackage.ams, defpackage.amz
    public final int h() {
        return F().h();
    }

    @Override // defpackage.ams, defpackage.amz
    public final /* synthetic */ moh j() {
        return this.k;
    }

    @Override // defpackage.ams
    /* renamed from: k */
    public final moh j() {
        return this.k;
    }

    @Override // defpackage.ams, defpackage.amz
    public final moh l() {
        return this.l;
    }

    @Override // defpackage.ams, defpackage.amz
    public final void o(aoc aocVar) {
        F().o(aocVar);
    }

    @Override // defpackage.ams, defpackage.amz
    public final void r(int i) {
        F().r(i);
    }

    @Override // defpackage.ams, defpackage.amz
    public final boolean s() {
        F().s();
        return false;
    }

    @Override // defpackage.ams
    public final sy t() {
        return F().t();
    }

    @Override // defpackage.ams
    public final void u(sy syVar) {
        ant.a();
        throw new mks();
    }

    @Override // defpackage.amz
    public final int v() {
        return F().v();
    }

    @Override // defpackage.amz
    public final anf x() {
        return F().x();
    }
}
