package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npd extends npo {
    private final nor a;

    public npd(nnq nnqVar, nor norVar) {
        super(nnqVar, nns.c);
        this.a = norVar;
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int a(long j) {
        int a = this.b.a(j);
        if (a <= 0) {
            return 1 - a;
        }
        return a;
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.npo, defpackage.nnq
    public final int d() {
        return 1;
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
        moz.ay(this, i, 1, c());
        if (this.a.Z(j) <= 0) {
            i = 1 - i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.npo, defpackage.nnq
    public final nnx u() {
        return this.a.h;
    }
}
