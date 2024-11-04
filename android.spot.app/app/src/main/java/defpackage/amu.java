package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amu extends amz {
    private final moh a;
    private final amz b;

    public amu(int i, anf anfVar, moh mohVar, amz amzVar) {
        super(i, anfVar);
        this.a = mohVar;
        this.b = amzVar;
        amzVar.f();
    }

    @Override // defpackage.amz
    public final /* bridge */ /* synthetic */ amz b(moh mohVar) {
        moh p;
        moh mohVar2 = this.a;
        int i = this.h;
        anf anfVar = this.g;
        p = anm.p(mohVar, mohVar2, true);
        return new amu(i, anfVar, p, this.b);
    }

    @Override // defpackage.amz
    public final void d() {
        if (!this.i) {
            if (this.h != this.b.v()) {
                y();
            }
            this.b.g();
            super.d();
        }
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
    public final /* bridge */ /* synthetic */ void o(aoc aocVar) {
        anm.A();
        throw new mks();
    }

    @Override // defpackage.amz
    public final boolean s() {
        return true;
    }

    @Override // defpackage.amz
    public final void e() {
    }
}
