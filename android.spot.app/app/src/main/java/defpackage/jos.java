package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jos {
    public static final jos a;
    private static final long e;
    public final int b;
    public final int c;
    public final int d;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        e = j;
        a = new jos(0, -1, -1);
    }

    public jos(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static int a(char c) {
        return ((int) ((e >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    public static int b(String str, int i, int i2) {
        if (i != i2) {
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                char charAt = (char) (str.charAt(i4) - '0');
                if (charAt < '\n') {
                    i3 = (i3 * 10) + charAt;
                    if (i3 > 999999) {
                        throw jrb.b("precision too large", str, i, i2);
                    }
                } else {
                    throw jrb.a("invalid precision character", str, i4);
                }
            }
            if (i3 == 0) {
                if (i2 == i + 1) {
                    return 0;
                }
                throw jrb.b("invalid precision", str, i, i2);
            }
            return i3;
        }
        throw jrb.a("missing precision", str, i - 1);
    }

    public final boolean c() {
        if (this == a) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if ((this.b & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e(int i, boolean z) {
        int i2;
        if (c()) {
            return true;
        }
        int i3 = this.b;
        if (((~i) & i3) != 0) {
            return false;
        }
        if (!z && this.d != -1) {
            return false;
        }
        int i4 = this.c;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        if (i2 == 0 || i4 != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jos) {
            jos josVar = (jos) obj;
            if (josVar.b == this.b && josVar.c == this.c && josVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final void f(StringBuilder sb) {
        if (!c()) {
            int i = this.b;
            int i2 = 0;
            while (true) {
                int i3 = i & (-129);
                int i4 = 1 << i2;
                if (i4 > i3) {
                    break;
                }
                if ((i3 & i4) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i5 = this.c;
            if (i5 != -1) {
                sb.append(i5);
            }
            if (this.d != -1) {
                sb.append('.');
                sb.append(this.d);
            }
        }
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }
}
