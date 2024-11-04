package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npy extends npo {
    final nnx a;
    final nnx c;

    public npy(nnq nnqVar, nnx nnxVar, nns nnsVar) {
        super(nnqVar, nnsVar);
        this.c = nnxVar;
        this.a = nnqVar.s();
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int a(long j) {
        int a = this.b.a(j);
        if (a >= 0) {
            return a % 100;
        }
        return ((a + 1) % 100) + 99;
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int c() {
        return 99;
    }

    @Override // defpackage.npo, defpackage.nnq
    public final int d() {
        return 0;
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
        int i2;
        moz.ay(this, i, 0, 99);
        int a = this.b.a(j);
        if (a >= 0) {
            i2 = a / 100;
        } else {
            i2 = ((a + 1) / 100) - 1;
        }
        return this.b.h(j, (i2 * 100) + i);
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final nnx s() {
        return this.a;
    }

    @Override // defpackage.npo, defpackage.nnq
    public final nnx u() {
        return this.c;
    }

    public npy(npq npqVar, nns nnsVar) {
        this(npqVar, npqVar.b.s(), nnsVar);
    }

    public npy(npq npqVar, nnx nnxVar, nns nnsVar) {
        super(npqVar.b, nnsVar);
        int i = npqVar.a;
        this.a = nnxVar;
        this.c = npqVar.c;
    }
}
