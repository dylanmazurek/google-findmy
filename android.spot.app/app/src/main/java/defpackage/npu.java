package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npu extends npo {
    private final int a;
    private final int c;
    private final int d;

    public npu(nnq nnqVar, nns nnsVar) {
        this(nnqVar, nnsVar, 1);
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int c() {
        return this.d;
    }

    @Override // defpackage.npo, defpackage.nnq
    public final int d() {
        return this.c;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long e(long j, int i) {
        long e = super.e(j, i);
        moz.ay(this, a(e), this.c, this.d);
        return e;
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
        moz.ay(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx t() {
        return this.b.t();
    }

    @Override // defpackage.npm, defpackage.nnq
    public final boolean v(long j) {
        return this.b.v(j);
    }

    public npu(nnq nnqVar, nns nnsVar, int i) {
        super(nnqVar, nnsVar);
        this.a = i;
        if (nnqVar.d() + i > Integer.MIN_VALUE) {
            this.c = nnqVar.d() + i;
        } else {
            this.c = Integer.MIN_VALUE;
        }
        if (nnqVar.c() + i < Integer.MAX_VALUE) {
            this.d = nnqVar.c() + i;
        } else {
            this.d = Integer.MAX_VALUE;
        }
    }
}
