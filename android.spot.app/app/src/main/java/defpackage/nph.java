package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nph extends npo {
    static final nnq a = new nph();

    private nph() {
        super(npe.H.n, nns.c);
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int a(long j) {
        int a2 = this.b.a(j);
        if (a2 < 0) {
            return -a2;
        }
        return a2;
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.npo, defpackage.nnq
    public final int d() {
        return 0;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final long h(long j, int i) {
        moz.ay(this, i, 0, c());
        if (this.b.a(j) < 0) {
            i = -i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.npo, defpackage.nnq
    public final nnx u() {
        return npe.H.h;
    }
}
