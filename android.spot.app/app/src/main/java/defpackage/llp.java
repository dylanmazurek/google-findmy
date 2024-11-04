package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llp {
    public static final llp a = new llp(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public llp(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int ab;
        int i = this.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.b; i3++) {
                int i4 = this.c[i3];
                int a2 = llz.a(i4);
                int b = llz.b(i4);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 5) {
                                    ((Integer) this.d[i3]).intValue();
                                    ab = liv.at(a2);
                                } else {
                                    throw new IllegalStateException(new ljx());
                                }
                            } else {
                                int Y = liv.Y(a2);
                                ab = Y + Y + ((llp) this.d[i3]).a();
                            }
                        } else {
                            ab = liv.G(a2, (lim) this.d[i3]);
                        }
                    } else {
                        ((Long) this.d[i3]).longValue();
                        ab = liv.au(a2);
                    }
                } else {
                    ab = liv.ab(a2, ((Long) this.d[i3]).longValue());
                }
                i2 += ab;
            }
            this.e = i2;
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.f) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    public final void e(int i, Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof llp)) {
            return false;
        }
        llp llpVar = (llp) obj;
        int i = this.b;
        if (i == llpVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = llpVar.c;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.d;
                    Object[] objArr2 = llpVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(ktd ktdVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int b = llz.b(i2);
                int a2 = llz.a(i2);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 5) {
                                    ktdVar.r(a2, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new ljx());
                                }
                            } else {
                                ((liv) ktdVar.a).A(a2, 3);
                                ((llp) obj).f(ktdVar);
                                ((liv) ktdVar.a).A(a2, 4);
                            }
                        } else {
                            ktdVar.o(a2, (lim) obj);
                        }
                    } else {
                        ktdVar.s(a2, ((Long) obj).longValue());
                    }
                } else {
                    ktdVar.w(a2, ((Long) obj).longValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public llp() {
        this(0, new int[8], new Object[8], true);
    }
}
