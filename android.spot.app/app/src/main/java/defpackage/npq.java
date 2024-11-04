package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npq extends npo {
    final int a;
    final nnx c;
    final nnx d;
    private final int e;
    private final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npq(nnq nnqVar, nns nnsVar) {
        super(nnqVar, nnsVar);
        int i;
        int i2;
        nnx u = nnqVar.u();
        nnx s = nnqVar.s();
        if (s == null) {
            this.c = null;
        } else {
            this.c = new npz(s, ((nnr) nnsVar).a);
        }
        this.d = u;
        this.a = 100;
        int d = nnqVar.d();
        if (d >= 0) {
            i = d / 100;
        } else {
            i = ((d + 1) / 100) - 1;
        }
        int c = nnqVar.c();
        if (c >= 0) {
            i2 = c / 100;
        } else {
            i2 = ((c + 1) / 100) - 1;
        }
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int a(long j) {
        int a = this.b.a(j);
        if (a >= 0) {
            return a / 100;
        }
        return ((a + 1) / 100) - 1;
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final int c() {
        return this.f;
    }

    @Override // defpackage.npo, defpackage.nnq
    public final int d() {
        return this.e;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final long g(long j) {
        int a = a(j) * 100;
        nnq nnqVar = this.b;
        return nnqVar.g(nnqVar.h(j, a));
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final long h(long j, int i) {
        int i2;
        moz.ay(this, i, this.e, this.f);
        int a = this.b.a(j);
        if (a >= 0) {
            i2 = a % 100;
        } else {
            i2 = ((a + 1) % 100) + 99;
        }
        return this.b.h(j, (i * 100) + i2);
    }

    @Override // defpackage.npo, defpackage.npm, defpackage.nnq
    public final nnx s() {
        return this.c;
    }

    @Override // defpackage.npo, defpackage.nnq
    public final nnx u() {
        nnx nnxVar = this.d;
        if (nnxVar != null) {
            return nnxVar;
        }
        return super.u();
    }
}
