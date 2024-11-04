package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nqk implements nrc, nra {
    protected final nns a;
    protected final int b;
    protected final boolean c;

    public nqk(nns nnsVar, int i, boolean z) {
        this.a = nnsVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.nra
    public final int a() {
        return this.b;
    }

    public int c(nqw nqwVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4;
        char charAt;
        int min = Math.min(this.b, charSequence.length() - i);
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i6 < min) {
            char charAt2 = charSequence.charAt(i + i6);
            if (i6 == 0) {
                if (charAt2 != '-') {
                    if (charAt2 == '+') {
                        charAt2 = '+';
                    } else {
                        i6 = 0;
                    }
                }
                if (!this.c) {
                    i6 = 0;
                } else {
                    if (charAt2 == '-') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (charAt2 == '+') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (min <= 1 || (charAt = charSequence.charAt(i + 1)) < '0' || charAt > '9') {
                        break;
                    }
                    min = Math.min(min + 1, charSequence.length() - i);
                    i6 = 1;
                }
            }
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            i6++;
        }
        i5 = i6;
        if (i5 >= 9) {
            i3 = i5 + i;
            if (z2) {
                i4 = Integer.parseInt(charSequence.subSequence(i + 1, i3).toString());
            } else {
                i4 = Integer.parseInt(charSequence.subSequence(i, i3).toString());
            }
        } else {
            if (!z && !z2) {
                i2 = i;
            } else {
                i2 = i + 1;
            }
            try {
                int charAt3 = charSequence.charAt(i2) - '0';
                i3 = i5 + i;
                for (int i7 = i2 + 1; i7 < i3; i7++) {
                    charAt3 = (((charAt3 << 3) + (charAt3 + charAt3)) + charSequence.charAt(i7)) - 48;
                }
                if (z) {
                    i4 = -charAt3;
                } else {
                    i4 = charAt3;
                }
            } catch (StringIndexOutOfBoundsException unused) {
                return ~i;
            }
        }
        nqwVar.d(this.a, i4);
        return i3;
    }
}
