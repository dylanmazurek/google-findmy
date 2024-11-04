package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfa {
    public static final byte[] a = a(1, 0);
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;

    static {
        a(1, 2);
        b = a(2, 32);
        c = a(2, 16);
        d = a(2, 17);
        e = a(2, 18);
        f = a(2, 1);
        g = a(2, 2);
        h = a(2, 3);
        i = a(2, 1);
        j = a(2, 2);
        k = a(2, 3);
        l = new byte[0];
        n = "KEM".getBytes(kgt.a);
        m = "HPKE".getBytes(kgt.a);
        o = "HPKE-v1".getBytes(kgt.a);
    }

    public static byte[] a(int i2, int i3) {
        if (i3 >= 0 && i3 < (1 << (i2 * 8))) {
            byte[] bArr = new byte[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & 255);
            }
            return bArr;
        }
        throw new IllegalArgumentException("value too large");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(byte[] bArr) {
        return jql.I(n, bArr);
    }

    public static byte[] c(String str, byte[] bArr, byte[] bArr2) {
        return jql.I(o, bArr2, str.getBytes(kgt.a), bArr);
    }

    public static byte[] d(String str, byte[] bArr, byte[] bArr2, int i2) {
        return jql.I(a(2, i2), o, bArr2, str.getBytes(kgt.a), bArr);
    }
}
