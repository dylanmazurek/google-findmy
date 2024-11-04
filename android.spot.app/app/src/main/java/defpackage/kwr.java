package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwr implements Closeable {
    public long d;
    public int e;
    public String f;
    public String[] h;
    public int[] i;
    private final Reader j;
    private int[] n;
    public final char[] a = new char[1024];
    public int b = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    public int c = 0;
    public int g = 1;

    static {
        hwx.a = new hwx((char[]) null);
    }

    public kwr(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        iArr[0] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.j = reader;
    }

    private final int k(boolean z) {
        int i = this.b;
        int i2 = this.k;
        while (true) {
            if (i == i2) {
                this.b = i;
                if (!n(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(e()));
                }
                i = this.b;
                i2 = this.k;
            }
            char[] cArr = this.a;
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.b = i3;
                    if (i3 == i2) {
                        this.b = i;
                        boolean n = n(2);
                        this.b++;
                        if (!n) {
                            return 47;
                        }
                    }
                    l();
                    int i4 = this.b;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.b = i4 + 1;
                        m();
                        i = this.b;
                        i2 = this.k;
                    } else {
                        this.b = i4 + 1;
                        while (true) {
                            if (this.b + 2 > this.k && !n(2)) {
                                throw b("Unterminated comment");
                            }
                            char[] cArr2 = this.a;
                            int i5 = this.b;
                            if (cArr2[i5] == '\n') {
                                this.l++;
                                this.m = i5 + 1;
                            } else {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (this.a[this.b + i6] == "*/".charAt(i6)) {
                                    }
                                }
                                i = this.b + 2;
                                i2 = this.k;
                                break;
                            }
                            this.b++;
                        }
                    }
                } else if (c == '#') {
                    this.b = i3;
                    l();
                    m();
                    i = this.b;
                    i2 = this.k;
                } else {
                    this.b = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private final void l() {
        throw b("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    private final void m() {
        char c;
        do {
            if (this.b < this.k || n(1)) {
                char[] cArr = this.a;
                int i = this.b;
                int i2 = i + 1;
                this.b = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.l++;
                    this.m = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    private final boolean n(int i) {
        int i2;
        int i3 = this.m;
        int i4 = this.b;
        this.m = i3 - i4;
        char[] cArr = this.a;
        int i5 = this.k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.k = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            Reader reader = this.j;
            int i7 = this.k;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.k + read;
            this.k = i2;
            if (this.l == 0 && this.m == 0 && i2 > 0 && cArr[0] == 65279) {
                this.b++;
                this.m = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean o(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            l();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cb, code lost:            if (o(r14) != false) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x024e, code lost:            if (r4 == 1) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01cf, code lost:            if (r13 != 2) goto L158;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d1, code lost:            if (r16 == false) goto L157;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d7, code lost:            if (r6 != Long.MIN_VALUE) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d9, code lost:            if (r17 == false) goto L157;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01db, code lost:            r8 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:            if (r6 != 0) goto L153;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e5, code lost:            if (r8 != false) goto L157;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01eb, code lost:            r6 = -r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ec, code lost:            r22.d = r6;        r22.b += r4;        r22.c = 15;        r6 = 15;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e8, code lost:            if (r8 == false) goto L155;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:            r8 = r17;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fa, code lost:            r13 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fb, code lost:            if (r13 == 2) goto L163;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fe, code lost:            if (r13 == 4) goto L163;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0201, code lost:            if (r13 != 7) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0149, code lost:            r6 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0203, code lost:            r22.e = r4;        r6 = 16;        r22.c = 16;     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0249 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwr.a():int");
    }

    public final kws b(String str) {
        throw new kws(str + e() + "\nSee " + hwx.af("malformed-json"));
    }

    public final IllegalStateException c(String str) {
        String str2;
        int j = j();
        String h = amr.h(j());
        String e = e();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(h);
        sb.append(e);
        sb.append("\nSee ");
        if (j == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        sb.append(hwx.af(str2));
        return new IllegalStateException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }

    public final String d() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.g; i++) {
            int i2 = this.n[i];
            switch (i2) {
                case 1:
                case 2:
                    int i3 = this.i[i];
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.h[i];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(a.ae(i2, "Unknown scope value: "));
            }
        }
        return sb.toString();
    }

    final String e() {
        int i = this.l + 1;
        int i2 = this.b - this.m;
        return " at line " + i + " column " + (i2 + 1) + " path " + d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x011c, code lost:            r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0128, code lost:            r0.append(r4, r2, r3);        r10.b = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00df, code lost:            throw b("Malformed Unicode escape \\u".concat(new java.lang.String(r6, r10.b, 4)));     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0118, code lost:            r3 = r1 - r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011a, code lost:            if (r0 != null) goto L90;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(char r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwr.f(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:            l();     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r5.b
            int r3 = r3 + r2
            int r4 = r5.k
            if (r3 >= r4) goto L4c
            char[] r4 = r5.a
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.l()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.n(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.a
            int r4 = r5.b
            r1.append(r3, r4, r2)
            int r3 = r5.b
            int r3 = r3 + r2
            r5.b = r3
            r2 = 1
            boolean r2 = r5.n(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.a
            java.lang.String r2 = new java.lang.String
            int r3 = r5.b
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.a
            int r3 = r5.b
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.b
            int r1 = r1 + r0
            r5.b = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwr.g():java.lang.String");
    }

    public final void h(int i) {
        int i2 = this.g;
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.n = Arrays.copyOf(iArr, i3);
            this.i = Arrays.copyOf(this.i, i3);
            this.h = (String[]) Arrays.copyOf(this.h, i3);
        }
        int[] iArr2 = this.n;
        int i4 = this.g;
        this.g = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean i() {
        int i = this.c;
        if (i == 0) {
            i = a();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final int j() {
        int i = this.c;
        if (i == 0) {
            i = a();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(e());
    }
}
