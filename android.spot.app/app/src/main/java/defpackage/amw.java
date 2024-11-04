package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amw extends amz {
    private final moh a;
    private int b;

    public amw(int i, anf anfVar, moh mohVar) {
        super(i, anfVar);
        this.a = mohVar;
        this.b = 1;
    }

    @Override // defpackage.amz
    public final amz b(moh mohVar) {
        moh p;
        anm.w(this);
        moh mohVar2 = this.a;
        int i = this.h;
        anf anfVar = this.g;
        p = anm.p(mohVar, mohVar2, true);
        return new amu(i, anfVar, p, this);
    }

    @Override // defpackage.amz
    public final void d() {
        if (!this.i) {
            g();
            super.d();
        }
    }

    @Override // defpackage.amz
    public final void f() {
        this.b++;
    }

    @Override // defpackage.amz
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
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
