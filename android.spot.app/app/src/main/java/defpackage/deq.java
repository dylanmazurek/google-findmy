package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deq extends dep {
    private static final nks f = mkm.aK("'\\");
    private static final nks g = mkm.aK("\"\\");
    private static final nks h = mkm.aK("{}[]:, \n\t\r\f/\\;#=");
    private static final nks i = mkm.aK("\n\r");
    private static final nks j = mkm.aK("*/");
    private final nkr k;
    private final nkp l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    public deq(nkr nkrVar) {
        this.k = nkrVar;
        this.l = ((nlf) nkrVar).b;
        k(6);
    }

    private final boolean A(int i2) {
        if (i2 != 9 && i2 != 10 && i2 != 12 && i2 != 13 && i2 != 32) {
            if (i2 != 35) {
                if (i2 != 44) {
                    if (i2 != 47 && i2 != 61) {
                        if (i2 != 123 && i2 != 125 && i2 != 58) {
                            if (i2 != 59) {
                                switch (i2) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
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
            w();
            return false;
        }
        return false;
    }

    private final int B(String str, elo eloVar) {
        int length = ((String[]) eloVar.b).length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(((String[]) eloVar.b)[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private final char r() {
        int i2;
        if (this.k.w(1L)) {
            byte d = this.l.d();
            if (d != 10 && d != 34 && d != 39 && d != 47 && d != 92) {
                if (d != 98) {
                    if (d != 102) {
                        if (d == 110) {
                            return '\n';
                        }
                        if (d != 114) {
                            if (d != 116) {
                                if (d == 117) {
                                    if (this.k.w(4L)) {
                                        char c = 0;
                                        for (int i3 = 0; i3 < 4; i3++) {
                                            byte c2 = this.l.c(i3);
                                            char c3 = (char) (c << 4);
                                            if (c2 >= 48 && c2 <= 57) {
                                                i2 = c2 - 48;
                                            } else if (c2 >= 97 && c2 <= 102) {
                                                i2 = c2 - 87;
                                            } else {
                                                if (c2 < 65 || c2 > 70) {
                                                    throw c("\\u".concat(this.l.j(4L)));
                                                }
                                                i2 = c2 - 55;
                                            }
                                            c = (char) (c3 + i2);
                                        }
                                        this.l.u(4L);
                                        return c;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path ".concat(d()));
                                }
                                throw c("Invalid escape sequence: \\" + ((char) d));
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) d;
        }
        throw c("Unterminated escape sequence");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01da, code lost:            r1 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01db, code lost:            if (r3 == false) goto L150;     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01de, code lost:            r5 = -r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01df, code lost:            r19.n = r5;        r19.l.u(r1);        r19.m = 16;        r3 = 16;     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d0, code lost:            r3 = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ed, code lost:            r2 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:            if (r2 == 2) goto L158;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f3, code lost:            if (r2 == 4) goto L158;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f5, code lost:            if (r2 != 7) goto L177;     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f7, code lost:            r19.o = r4;        r3 = 17;        r19.m = 17;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ef, code lost:            r2 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:            r1 = r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:            if (A(r10) == false) goto L136;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:            if (r1 != 2) goto L153;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c5, code lost:            if (r9 == false) goto L152;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cb, code lost:            if (r5 != Long.MIN_VALUE) goto L142;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:            if (r7 == false) goto L152;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d5, code lost:            if (r5 != 0) goto L147;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d7, code lost:            if (r3 != false) goto L152;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d9, code lost:            r3 = false;     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0246 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int s() {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deq.s():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0165, code lost:            r10 = r21;     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016b, code lost:            if (defpackage.nlo.b(r11, r9, r10, r6) == false) goto L143;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016d, code lost:            r1 = r1 + (r3 - r11.b);     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0176, code lost:            r3 = r9;        r21 = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0174, code lost:            r10 = r21;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017a, code lost:            r1 = r1 + (r11.c - r11.b);        r11 = r11.f;        r11.getClass();        r4 = r21;        r3 = r20;        r9 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ec, code lost:            throw new java.lang.IllegalArgumentException(defpackage.a.ap(r8, "fromIndex < 0: "));     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f4, code lost:            throw new java.lang.IllegalArgumentException("bytes is empty");     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fc, code lost:            throw new java.lang.IllegalStateException("closed");     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x003c, code lost:            return 47;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ff, code lost:            if (r3 != 35) goto L121;     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0201, code lost:            w();        y();     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0209, code lost:            return r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:            r24.l.u(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:            if (r3 != 47) goto L114;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:            if (r24.k.w(2) != false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:            w();        r4 = 1;        r3 = r24.l.c(1);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:            if (r3 == 42) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:            if (r3 == 47) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:            return 47;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:            r24.l.d();        r24.l.d();        r2 = r24.k;        r3 = defpackage.deq.j;        r3.getClass();        r2 = (defpackage.nlf) r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:            if (r2.c != false) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:            r6 = 0;        r8 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:            r10 = r2.b;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:            if (r3.b() <= 0) goto L119;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:            if (r8 < r6) goto L112;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:            r11 = r10.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:            if (r11 != null) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:            r19 = r2;        r20 = r3;        r22 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:            r1 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0190, code lost:            if (r1 == (-1)) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0193, code lost:            r2 = r19;        r1 = r2.b;        r5 = r2.a;        r6 = r1.b;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a3, code lost:            if (r5.a(r1, 8192) != (-1)) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ca, code lost:            r8 = java.lang.Math.max(r22, (r6 - r20.b()) + 1);        r4 = 1;        r3 = r20;        r1 = 0;        r6 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a5, code lost:            r1 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a6, code lost:            r5 = r24.l;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01aa, code lost:            if (r1 == (-1)) goto L86;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ac, code lost:            r15 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01af, code lost:            if (r15 == false) goto L89;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b1, code lost:            r1 = r1 + defpackage.deq.j.b();     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bc, code lost:            r5.u(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01bf, code lost:            if (r15 == false) goto L116;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c9, code lost:            throw c("Unterminated comment");     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ba, code lost:            r1 = r5.b;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ae, code lost:            r15 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0093, code lost:            r14 = r10.b;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0099, code lost:            if ((r14 - r8) >= r8) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009d, code lost:            if (r14 <= r8) goto L132;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:            r11 = r11.g;        r11.getClass();        r14 = r14 - (r11.c - r11.b);     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:            if (r11 != null) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:            r6 = r3.b;        r7 = r6[r1];        r12 = r3.b();        r19 = r2;        r20 = r14;        r1 = (r10.b - r12) + r4;        r13 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:            if (r20 >= r1) goto L133;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c7, code lost:            r10 = r11.a;        r22 = r8;        r5 = (int) java.lang.Math.min(r11.c, (r11.b + r1) - r20);        r4 = (int) ((r11.b + r13) - r20);     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e0, code lost:            if (r4 >= r5) goto L135;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e2, code lost:            r8 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e6, code lost:            if (r10[r4] != r7) goto L136;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ec, code lost:            if (defpackage.nlo.b(r11, r8, r6, r12) == false) goto L137;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ee, code lost:            r1 = (r4 - r11.b) + r20;        r20 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f7, code lost:            r4 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f9, code lost:            r13 = r20 + (r11.c - r11.b);        r11 = r11.f;        r11.getClass();        r20 = r13;        r8 = r22;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010d, code lost:            r22 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012a, code lost:            r20 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0110, code lost:            r19 = r2;        r22 = r8;        r1 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0116, code lost:            r4 = (r11.c - r11.b) + r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011f, code lost:            if (r4 > r22) goto L138;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0121, code lost:            r11 = r11.f;        r11.getClass();        r1 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0128, code lost:            if (r11 != null) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012e, code lost:            r4 = r3.b;        r5 = r4[0];        r6 = r3.b();        r7 = (r10.b - r6) + 1;        r9 = r22;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0142, code lost:            if (r1 >= r7) goto L139;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0144, code lost:            r12 = r11.a;        r20 = r3;        r21 = r4;        r4 = (int) java.lang.Math.min(r11.c, (r11.b + r7) - r1);        r3 = (int) ((r11.b + r9) - r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015d, code lost:            if (r3 >= r4) goto L141;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015f, code lost:            r9 = r3 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0163, code lost:            if (r12[r3] != r5) goto L74;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int t(boolean r25) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deq.t(boolean):int");
    }

    private final String u(nks nksVar) {
        StringBuilder sb = null;
        while (true) {
            long g2 = this.k.g(nksVar);
            if (g2 != -1) {
                if (this.l.c(g2) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.l.j(g2));
                    this.l.d();
                    sb.append(r());
                } else {
                    if (sb == null) {
                        String j2 = this.l.j(g2);
                        this.l.d();
                        return j2;
                    }
                    sb.append(this.l.j(g2));
                    this.l.d();
                    return sb.toString();
                }
            } else {
                throw c("Unterminated string");
            }
        }
    }

    private final String v() {
        long g2 = this.k.g(h);
        if (g2 != -1) {
            return this.l.j(g2);
        }
        return this.l.i();
    }

    private final void w() {
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void x(nks nksVar) {
        while (true) {
            long g2 = this.k.g(nksVar);
            if (g2 != -1) {
                long j2 = 1 + g2;
                if (this.l.c(g2) == 92) {
                    this.l.u(j2);
                    r();
                } else {
                    this.l.u(j2);
                    return;
                }
            } else {
                throw c("Unterminated string");
            }
        }
    }

    private final void y() {
        long j2;
        long g2 = this.k.g(i);
        nkp nkpVar = this.l;
        if (g2 != -1) {
            j2 = g2 + 1;
        } else {
            j2 = nkpVar.b;
        }
        nkpVar.u(j2);
    }

    private final void z() {
        long g2 = this.k.g(h);
        nkp nkpVar = this.l;
        if (g2 == -1) {
            g2 = nkpVar.b;
        }
        nkpVar.u(g2);
    }

    @Override // defpackage.dep
    public final double a() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 17) {
            this.p = this.l.j(this.o);
        } else if (i2 == 9) {
            this.p = u(g);
        } else if (i2 == 8) {
            this.p = u(f);
        } else if (i2 == 10) {
            this.p = v();
        } else if (i2 != 11) {
            throw new den(der.a(this, "Expected a double but was "));
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.p = null;
                this.m = 0;
                int[] iArr2 = this.e;
                int i4 = this.b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseDouble;
            }
            throw new deo("JSON forbids NaN and infinities: " + parseDouble + " at path " + d());
        } catch (NumberFormatException unused) {
            throw new den("Expected a double but was " + this.p + " at path " + d());
        }
    }

    @Override // defpackage.dep
    public final int b() {
        String u;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.m = 0;
                int[] iArr = this.e;
                int i4 = this.b - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new den("Expected an int but was " + j2 + " at path " + d());
        }
        if (i2 == 17) {
            this.p = this.l.j(this.o);
        } else {
            if (i2 != 9) {
                if (i2 == 8) {
                    u = u(f);
                } else if (i2 != 11) {
                    throw new den(der.a(this, "Expected an int but was "));
                }
            } else {
                u = u(g);
            }
            this.p = u;
            try {
                int parseInt = Integer.parseInt(u);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            int i6 = (int) parseDouble;
            if (i6 == parseDouble) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new den("Expected an int but was " + this.p + " at path " + d());
        } catch (NumberFormatException unused2) {
            throw new den("Expected an int but was " + this.p + " at path " + d());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.s();
        this.k.close();
    }

    @Override // defpackage.dep
    public final String e() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            str = v();
        } else if (i2 == 13) {
            str = u(g);
        } else if (i2 == 12) {
            str = u(f);
        } else if (i2 == 15) {
            str = this.p;
        } else {
            throw new den(der.a(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    @Override // defpackage.dep
    public final String f() {
        String j2;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 10) {
            j2 = v();
        } else if (i2 == 9) {
            j2 = u(g);
        } else if (i2 == 8) {
            j2 = u(f);
        } else if (i2 == 11) {
            j2 = this.p;
            this.p = null;
        } else if (i2 == 16) {
            j2 = Long.toString(this.n);
        } else if (i2 == 17) {
            j2 = this.l.j(this.o);
        } else {
            throw new den(der.a(this, "Expected a string but was "));
        }
        this.m = 0;
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        return j2;
    }

    @Override // defpackage.dep
    public final void g() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 3) {
            k(1);
            this.e[this.b - 1] = 0;
            this.m = 0;
            return;
        }
        throw new den(der.a(this, "Expected BEGIN_ARRAY but was "));
    }

    @Override // defpackage.dep
    public final void h() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 1) {
            k(3);
            this.m = 0;
            return;
        }
        throw new den(der.a(this, "Expected BEGIN_OBJECT but was "));
    }

    @Override // defpackage.dep
    public final void i() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 4) {
            int i3 = this.b;
            this.b = i3 - 1;
            int[] iArr = this.e;
            int i4 = i3 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        throw new den(der.a(this, "Expected END_ARRAY but was "));
    }

    @Override // defpackage.dep
    public final void j() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 2) {
            int i3 = this.b;
            int i4 = i3 - 1;
            this.b = i4;
            this.d[i4] = null;
            int[] iArr = this.e;
            int i5 = i3 - 2;
            iArr[i5] = iArr[i5] + 1;
            this.m = 0;
            return;
        }
        throw new den(der.a(this, "Expected END_OBJECT but was "));
    }

    @Override // defpackage.dep
    public final void l() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            z();
        } else if (i2 == 13) {
            x(g);
        } else if (i2 == 12) {
            x(f);
        } else if (i2 != 15) {
            throw new den(der.a(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.dep
    public final void m() {
        int i2 = 0;
        do {
            int i3 = this.m;
            if (i3 == 0) {
                i3 = s();
            }
            if (i3 == 3) {
                k(1);
            } else if (i3 == 1) {
                k(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        throw new den(der.a(this, "Expected a value but was "));
                    }
                } else if (i3 == 2) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        throw new den(der.a(this, "Expected a value but was "));
                    }
                } else if (i3 != 14 && i3 != 10) {
                    if (i3 != 9 && i3 != 13) {
                        if (i3 != 8 && i3 != 12) {
                            if (i3 == 17) {
                                this.l.u(this.o);
                            } else if (i3 == 18) {
                                throw new den(der.a(this, "Expected a value but was "));
                            }
                        } else {
                            x(f);
                        }
                    } else {
                        x(g);
                    }
                } else {
                    z();
                }
                this.m = 0;
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i4 = this.b - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i4] = "null";
    }

    @Override // defpackage.dep
    public final boolean n() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 != 2 && i2 != 4 && i2 != 18) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dep
    public final boolean o() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 == 6) {
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        throw new den(der.a(this, "Expected a boolean but was "));
    }

    @Override // defpackage.dep
    public final int p() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        switch (i2) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:            r8 = -2;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[SYNTHETIC] */
    @Override // defpackage.dep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q(defpackage.elo r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deq.q(elo):int");
    }

    public final String toString() {
        return "JsonReader(" + this.k.toString() + ")";
    }
}
