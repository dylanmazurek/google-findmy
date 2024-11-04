package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqc extends npo {
    public nqc(nnq nnqVar, nns nnsVar) {
        super(nnqVar, nnsVar);
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int a(long j) {
        int a = this.b.a(j);
        if (a == 0) {
            return c();
        }
        return a;
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int c() {
        return this.b.c() + 1;
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
        int c = c();
        moz.ay(this, i, 1, c);
        if (i == c) {
            i = 0;
        }
        return this.b.h(j, i);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx t() {
        return this.b.t();
    }

    @Override // defpackage.npm, defpackage.nnq
    public final boolean v(long j) {
        return this.b.v(j);
    }
}
