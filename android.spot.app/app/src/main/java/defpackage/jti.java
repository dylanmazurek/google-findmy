package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jti {
    public static final /* synthetic */ int a = 0;

    static {
        new jth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:            return defpackage.amr.m(r7, r2);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.io.InputStream r6, java.util.Queue r7, int r8) {
        /*
            int r0 = java.lang.Integer.highestOneBit(r8)
            int r0 = r0 + r0
            r1 = 128(0x80, float:1.8E-43)
            int r0 = java.lang.Math.max(r1, r0)
            r1 = 8192(0x2000, float:1.148E-41)
            int r0 = java.lang.Math.min(r1, r0)
        L11:
            r1 = -1
            r2 = 2147483639(0x7ffffff7, float:NaN)
            if (r8 >= r2) goto L41
            int r2 = r2 - r8
            int r2 = java.lang.Math.min(r0, r2)
            byte[] r3 = new byte[r2]
            r7.add(r3)
            r4 = 0
        L22:
            if (r4 >= r2) goto L31
            int r5 = r2 - r4
            int r5 = r6.read(r3, r4, r5)
            if (r5 == r1) goto L2f
            int r4 = r4 + r5
            int r8 = r8 + r5
            goto L22
        L2f:
            r2 = r8
            goto L47
        L31:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 >= r1) goto L37
            r1 = 4
            goto L38
        L37:
            r1 = 2
        L38:
            long r2 = (long) r0
            long r0 = (long) r1
            long r2 = r2 * r0
            int r0 = defpackage.iqh.o(r2)
            goto L11
        L41:
            int r6 = r6.read()
            if (r6 != r1) goto L4c
        L47:
            byte[] r6 = defpackage.amr.m(r7, r2)
            return r6
        L4c:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            java.lang.String r7 = "input is too large to fit in a byte array"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jti.a(java.io.InputStream, java.util.Queue, int):byte[]");
    }
}
