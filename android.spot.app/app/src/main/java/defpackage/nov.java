package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class nov extends nps {
    private final nor a;
    private final int c;
    private final int d;

    public nov(nor norVar) {
        super(nns.h, 2629746000L);
        this.a = norVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        nor norVar = this.a;
        return norVar.U(j, norVar.Z(j));
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return this.c;
    }

    @Override // defpackage.nnq
    public final int d() {
        return 1;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long e(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return j;
        }
        long T = this.a.T(j);
        int Z = this.a.Z(j);
        int U = this.a.U(j, Z);
        int i7 = U - 1;
        int i8 = i7 + i;
        if (i8 < 0) {
            if (Math.signum(this.c + i) == Math.signum(i)) {
                i5 = Z - 1;
                i6 = i + this.c;
            } else {
                i5 = Z + 1;
                i6 = i - this.c;
            }
            int i9 = i5;
            i8 = i6 + i7;
            i2 = i9;
        } else {
            i2 = Z;
        }
        if (i8 >= 0) {
            int i10 = this.c;
            i3 = i2 + (i8 / i10);
            i4 = (i8 % i10) + 1;
        } else {
            int i11 = this.c;
            i3 = i2 + (i8 / i11);
            int i12 = i3 - 1;
            int abs = Math.abs(i8) % i11;
            if (abs == 0) {
                abs = this.c;
            }
            i4 = (this.c - abs) + 1;
            if (i4 != 1) {
                i3 = i12;
            }
        }
        int O = this.a.O(j, Z, U);
        int S = this.a.S(i3, i4);
        if (O > S) {
            O = S;
        }
        return this.a.ae(i3, i4, O) + T;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long g(long j) {
        nor norVar = this.a;
        int Z = norVar.Z(j);
        int U = norVar.U(j, Z);
        nor norVar2 = this.a;
        return norVar2.ad(Z) + norVar2.ac(Z, U);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long h(long j, int i) {
        moz.ay(this, i, 1, this.c);
        nor norVar = this.a;
        int Z = norVar.Z(j);
        int O = norVar.O(j, Z, norVar.U(j, Z));
        int S = this.a.S(Z, i);
        if (O > S) {
            O = S;
        }
        return this.a.ae(Z, i, O) + this.a.T(j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx t() {
        return this.a.c;
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return this.a.g;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final boolean v(long j) {
        nor norVar = this.a;
        int Z = norVar.Z(j);
        if (!norVar.ah(Z) || this.a.U(j, Z) != this.d) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nps
    public final long z(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return e(j, i);
        }
        long T = this.a.T(j);
        int Z = this.a.Z(j);
        long j5 = Z;
        int U = this.a.U(j, Z);
        long j6 = (U - 1) + j2;
        if (j6 >= 0) {
            long j7 = this.c;
            j3 = j5 + (j6 / j7);
            j4 = (j6 % j7) + 1;
        } else {
            long j8 = this.c;
            j3 = j5 + (j6 / j8);
            int abs = (int) (Math.abs(j6) % j8);
            if (abs == 0) {
                abs = this.c;
            }
            long j9 = (-1) + j3;
            j4 = (this.c - abs) + 1;
            if (j4 != 1) {
                j3 = j9;
            }
        }
        if (j3 >= -292275054 && j3 <= 292278993) {
            int i2 = (int) j4;
            int O = this.a.O(j, Z, U);
            int i3 = (int) j3;
            int S = this.a.S(i3, i2);
            if (O > S) {
                O = S;
            }
            return this.a.ae(i3, i2, O) + T;
        }
        throw new IllegalArgumentException(a.ap(j2, "Magnitude of add amount is too large: "));
    }

    @Override // defpackage.nnq
    public final void x() {
    }
}
