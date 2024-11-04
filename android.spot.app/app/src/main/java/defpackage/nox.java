package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nox extends nps {
    private final nor a;

    public nox(nor norVar) {
        super(nns.k, 31556952000L);
        this.a = norVar;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        return this.a.Y(j);
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
        return h(j, a(j) + i);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long g(long j) {
        long g = this.a.l.g(j);
        if (this.a.V(g) > 1) {
            return g - ((r0 - 1) * 604800000);
        }
        return g;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long h(long j, int i) {
        moz.ay(this, Math.abs(i), -292275054, 292278993);
        int a = a(j);
        if (a == i) {
            return j;
        }
        int P = this.a.P(j);
        nor norVar = this.a;
        int X = norVar.X(a);
        int X2 = norVar.X(i);
        if (X2 < X) {
            X = X2;
        }
        int V = this.a.V(j);
        if (V <= X) {
            X = V;
        }
        long af = this.a.af(j, i);
        int a2 = a(af);
        if (a2 < i) {
            af += 604800000;
        } else if (a2 > i) {
            af -= 604800000;
        }
        return this.a.j.h(af + ((X - this.a.V(af)) * 604800000), P);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx t() {
        return this.a.d;
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return null;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final boolean v(long j) {
        nor norVar = this.a;
        if (norVar.X(norVar.Y(j)) > 52) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nps
    public final long z(long j, long j2) {
        return e(j, moz.aw(j2));
    }

    @Override // defpackage.nnq
    public final void x() {
    }
}
