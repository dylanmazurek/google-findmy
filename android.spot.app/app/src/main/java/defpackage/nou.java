package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nou extends nor {
    private static final int[] H = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] I = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] J = new long[12];
    private static final long[] K = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (i < 11) {
            j += H[i] * 86400000;
            int i2 = i + 1;
            J[i2] = j;
            j2 += I[i] * 86400000;
            K[i2] = j2;
            i = i2;
        }
    }

    public nou(nno nnoVar, int i) {
        super(nnoVar, i);
    }

    @Override // defpackage.nor
    public final int S(int i, int i2) {
        int i3 = i2 - 1;
        if (ah(i)) {
            return I[i3];
        }
        return H[i3];
    }

    @Override // defpackage.nor
    public final int U(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long ad = j - ad(i);
        boolean ah = ah(i);
        if (true != ah) {
            i2 = 15271875;
        } else {
            i2 = 15356250;
        }
        int i12 = (int) (ad >> 10);
        if (i12 < i2) {
            if (true != ah) {
                i8 = 7593750;
            } else {
                i8 = 7678125;
            }
            if (i12 < i8) {
                if (i12 < 2615625) {
                    return 1;
                }
                if (true != ah) {
                    i11 = 4978125;
                } else {
                    i11 = 5062500;
                }
                if (i12 >= i11) {
                    return 3;
                }
                return 2;
            }
            if (true != ah) {
                i9 = 10125000;
            } else {
                i9 = 10209375;
            }
            if (i12 < i9) {
                return 4;
            }
            if (true != ah) {
                i10 = 12740625;
            } else {
                i10 = 12825000;
            }
            if (i12 >= i10) {
                return 6;
            }
            return 5;
        }
        if (true != ah) {
            i3 = 23034375;
        } else {
            i3 = 23118750;
        }
        if (i12 < i3) {
            if (true != ah) {
                i6 = 17887500;
            } else {
                i6 = 17971875;
            }
            if (i12 < i6) {
                return 7;
            }
            if (true != ah) {
                i7 = 20503125;
            } else {
                i7 = 20587500;
            }
            if (i12 >= i7) {
                return 9;
            }
            return 8;
        }
        if (true != ah) {
            i4 = 25650000;
        } else {
            i4 = 25734375;
        }
        if (i12 < i4) {
            return 10;
        }
        if (true != ah) {
            i5 = 28181250;
        } else {
            i5 = 28265625;
        }
        if (i12 >= i5) {
            return 12;
        }
        return 11;
    }

    @Override // defpackage.nor
    public final long ac(int i, int i2) {
        int i3 = i2 - 1;
        if (ah(i)) {
            return K[i3];
        }
        return J[i3];
    }

    @Override // defpackage.nor
    public final long af(long j, int i) {
        int Z = Z(j);
        int Q = Q(j, Z);
        if (Q > 59) {
            if (ah(Z)) {
                if (!ah(i)) {
                    Q--;
                }
            } else if (ah(i)) {
                Q++;
            }
        }
        return ae(i, 1, Q) + T(j);
    }

    @Override // defpackage.nor
    public final boolean ag(long j) {
        if (this.k.a(j) == 29 && this.m.v(j)) {
            return true;
        }
        return false;
    }
}
