package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nli extends nks {
    public final transient byte[][] e;
    public final transient int[] f;

    public nli(byte[][] bArr, int[] iArr) {
        super(nks.a.b);
        this.e = bArr;
        this.f = iArr;
    }

    private final nks l() {
        return new nks(k());
    }

    private final Object writeReplace() {
        return l();
    }

    @Override // defpackage.nks
    public final byte a(int i) {
        int i2;
        mkm.aM(this.f[this.e.length - 1], i, 1L);
        int aJ = moz.aJ(this, i);
        if (aJ == 0) {
            i2 = 0;
        } else {
            i2 = this.f[aJ - 1];
        }
        int[] iArr = this.f;
        byte[][] bArr = this.e;
        return bArr[aJ][(i - i2) + iArr[bArr.length + aJ]];
    }

    @Override // defpackage.nks
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.nks
    public final String c() {
        return l().c();
    }

    @Override // defpackage.nks
    public final nks e() {
        return l().e();
    }

    @Override // defpackage.nks
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nks) {
            nks nksVar = (nks) obj;
            if (nksVar.b() == b() && i(nksVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nks
    public final boolean f(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int aJ = moz.aJ(this, i);
        while (i < i5) {
            if (aJ == 0) {
                aJ = 0;
                i4 = 0;
            } else {
                i4 = this.f[aJ - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[aJ] - i4;
            int i7 = iArr[this.e.length + aJ];
            int min = Math.min(i5, i6 + i4) - i;
            if (!mkm.aN(this.e[aJ], i7 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            aJ++;
        }
        return true;
    }

    @Override // defpackage.nks
    public final byte[] h() {
        return k();
    }

    @Override // defpackage.nks
    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            byte[][] bArr = this.e;
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            while (true) {
                int length = bArr.length;
                if (i2 < length) {
                    int[] iArr = this.f;
                    byte[][] bArr2 = this.e;
                    int i5 = iArr[length + i2];
                    int i6 = iArr[i2];
                    int i7 = (i6 - i4) + i5;
                    byte[] bArr3 = bArr2[i2];
                    while (i5 < i7) {
                        i3 = (i3 * 31) + bArr3[i5];
                        i5++;
                    }
                    i2++;
                    i4 = i6;
                } else {
                    this.c = i3;
                    return i3;
                }
            }
        } else {
            return i;
        }
    }

    @Override // defpackage.nks
    public final boolean i(nks nksVar, int i) {
        int i2;
        nksVar.getClass();
        if (b() - i < 0) {
            return false;
        }
        int aJ = moz.aJ(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (aJ == 0) {
                aJ = 0;
                i2 = 0;
            } else {
                i2 = this.f[aJ - 1];
            }
            int[] iArr = this.f;
            int i5 = iArr[aJ] - i2;
            int i6 = iArr[this.e.length + aJ];
            int min = Math.min(i, i5 + i2) - i3;
            if (!nksVar.f(i4, this.e[aJ], i6 + (i3 - i2), min)) {
                return false;
            }
            i4 += min;
            i3 += min;
            aJ++;
        }
        return true;
    }

    @Override // defpackage.nks
    public final void j(nkp nkpVar, int i) {
        int i2;
        int aJ = moz.aJ(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (aJ == 0) {
                aJ = 0;
                i2 = 0;
            } else {
                i2 = this.f[aJ - 1];
            }
            int[] iArr = this.f;
            int i4 = iArr[aJ] - i2;
            int i5 = iArr[this.e.length + aJ];
            int min = Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            nlg nlgVar = new nlg(this.e[aJ], i6, i6 + min, true);
            nlg nlgVar2 = nkpVar.a;
            if (nlgVar2 == null) {
                nlgVar.g = nlgVar;
                nlgVar.f = nlgVar.g;
                nkpVar.a = nlgVar.f;
            } else {
                nlg nlgVar3 = nlgVar2.g;
                nlgVar3.getClass();
                nlgVar3.d(nlgVar);
            }
            i3 += min;
            aJ++;
        }
        nkpVar.b += i;
    }

    public final byte[] k() {
        byte[] bArr = new byte[b()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            int length = bArr2.length;
            if (i < length) {
                int[] iArr = this.f;
                int i4 = iArr[length + i];
                int i5 = iArr[i];
                int i6 = i5 - i2;
                mkm.o(bArr2[i], bArr, i3, i4, i4 + i6);
                i3 += i6;
                i++;
                i2 = i5;
            } else {
                return bArr;
            }
        }
    }

    @Override // defpackage.nks
    public final String toString() {
        return l().toString();
    }
}
