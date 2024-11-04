package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoi extends amz {
    public moh a;
    public final long b;
    private final amz c;
    private final boolean d;

    public aoi(amz amzVar, moh mohVar, boolean z) {
        super(0, anf.a);
        moh j;
        this.c = amzVar;
        this.d = z;
        this.a = anm.p(mohVar, (amzVar == null || (j = amzVar.j()) == null) ? ((amq) anm.i.get()).a : j, false);
        this.b = alq.a();
    }

    private final amz a() {
        amz amzVar = this.c;
        if (amzVar == null) {
            return (amz) anm.i.get();
        }
        return amzVar;
    }

    @Override // defpackage.amz
    public final amz b(moh mohVar) {
        moh p;
        amz a;
        p = anm.p(mohVar, this.a, true);
        a = anm.a(a().b(null), p, true);
        return a;
    }

    @Override // defpackage.amz
    public final void d() {
        amz amzVar;
        D();
        if (this.d && (amzVar = this.c) != null) {
            amzVar.d();
        }
    }

    @Override // defpackage.amz
    public final void e() {
        a().e();
    }

    @Override // defpackage.amz
    public final /* synthetic */ void f() {
        amr.o();
    }

    @Override // defpackage.amz
    public final /* synthetic */ void g() {
        amr.o();
    }

    @Override // defpackage.amz
    public final /* synthetic */ moh j() {
        return this.a;
    }

    @Override // defpackage.amz
    public final moh l() {
        return null;
    }

    @Override // defpackage.amz
    public final void o(aoc aocVar) {
        a().o(aocVar);
    }

    @Override // defpackage.amz
    public final boolean s() {
        return a().s();
    }

    @Override // defpackage.amz
    public final int v() {
        return a().v();
    }

    @Override // defpackage.amz
    public final anf x() {
        return a().x();
    }
}
