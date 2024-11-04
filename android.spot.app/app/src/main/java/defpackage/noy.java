package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class noy extends nps {
    protected final nor a;

    public noy(nor norVar) {
        super(nns.f, 31556952000L);
        this.a = norVar;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        return this.a.Z(j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.nnq
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long e(long j, int i) {
        if (i == 0) {
            return j;
        }
        int a = a(j);
        int i2 = a + i;
        if ((a ^ i2) < 0 && (a ^ i) >= 0) {
            throw new ArithmeticException(a.ad(i, a, "The calculation caused an overflow: ", " + "));
        }
        return h(j, i2);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long g(long j) {
        return this.a.ad(a(j));
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long h(long j, int i) {
        moz.ay(this, i, -292275054, 292278993);
        return this.a.af(j, i);
    }

    @Override // defpackage.nnq
    public final long j(long j, int i) {
        moz.ay(this, i, -292275055, 292278994);
        return this.a.af(j, i);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx t() {
        return this.a.c;
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return null;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final boolean v(long j) {
        return this.a.ah(a(j));
    }

    @Override // defpackage.nps
    public final long z(long j, long j2) {
        return e(j, moz.aw(j2));
    }

    @Override // defpackage.nnq
    public final void x() {
    }
}
