package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsx {
    public final char[] a;
    final int b;
    final int c;
    final int d;
    final int e;
    private final String f;
    private final byte[] g;
    private final boolean[] h;
    private final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jsx(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = 0
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = 1
            goto L15
        L14:
            r7 = 0
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            defpackage.hwx.L(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = 0
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            defpackage.hwx.L(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsx.<init>(java.lang.String, char[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char a(int i) {
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(char c) {
        if (c <= 127) {
            byte b = this.g[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    throw new jta("Unrecognized character: " + c);
                }
                throw new jta("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            return b;
        }
        throw new jta("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(int i) {
        return this.h[i % this.d];
    }

    public final boolean d(char c) {
        if (c < 128 && this.g[c] != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jsx) {
            jsx jsxVar = (jsx) obj;
            boolean z = jsxVar.i;
            if (Arrays.equals(this.a, jsxVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 1237;
    }

    public final String toString() {
        return this.f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[LOOP:0: B:14:0x0061->B:16:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private jsx(java.lang.String r5, char[] r6, byte[] r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.f = r5
            r6.getClass()
            r4.a = r6
            int r5 = r6.length     // Catch: java.lang.ArithmeticException -> L85
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L85
            if (r5 <= 0) goto L7d
            int[] r1 = defpackage.jvg.a     // Catch: java.lang.ArithmeticException -> L85
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L85
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L85
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L37;
                case 2: goto L42;
                case 3: goto L42;
                case 4: goto L2e;
                case 5: goto L2e;
                case 6: goto L1f;
                case 7: goto L1f;
                case 8: goto L1f;
                default: goto L1c;
            }     // Catch: java.lang.ArithmeticException -> L85
        L1c:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L85
            goto L79
        L1f:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L85
            r3 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r3 = r3 >>> r0
            int r0 = 31 - r0
            int r3 = r3 - r5
            int r3 = r3 >>> 31
            int r0 = r0 + r3
            goto L48
        L2e:
            int r0 = r5 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L85
            int r0 = 32 - r0
            goto L48
        L37:
            int r0 = r5 + (-1)
            r0 = r0 & r5
            if (r0 != 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            defpackage.iqh.w(r0)     // Catch: java.lang.ArithmeticException -> L85
        L42:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L85
            int r0 = 31 - r0
        L48:
            r4.c = r0     // Catch: java.lang.ArithmeticException -> L85
            int r5 = r5 + (-1)
            int r6 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r3 = 3 - r6
            int r3 = r2 << r3
            r4.d = r3
            int r6 = r0 >> r6
            r4.e = r6
            r4.b = r5
            r4.g = r7
            boolean[] r5 = new boolean[r3]
            r6 = 0
        L61:
            int r7 = r4.e
            if (r6 >= r7) goto L74
            int r7 = r6 * 8
            int r0 = r4.c
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            int r7 = defpackage.iqg.p(r7, r0, r3)
            r5[r7] = r2
            int r6 = r6 + 1
            goto L61
        L74:
            r4.h = r5
            r4.i = r1
            return
        L79:
            r5.<init>()     // Catch: java.lang.ArithmeticException -> L85
            throw r5     // Catch: java.lang.ArithmeticException -> L85
        L7d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L85
            java.lang.String r7 = "x (0) must be > 0"
            r5.<init>(r7)     // Catch: java.lang.ArithmeticException -> L85
            throw r5     // Catch: java.lang.ArithmeticException -> L85
        L85:
            r5 = move-exception
            int r6 = r6.length
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal alphabet length "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsx.<init>(java.lang.String, char[], byte[]):void");
    }
}
