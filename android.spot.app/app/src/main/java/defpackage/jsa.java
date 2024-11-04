package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jsa {
    private static final char[] a = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract boolean d(jsa jsaVar);

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        if (obj instanceof jsa) {
            jsa jsaVar = (jsa) obj;
            if (b() == jsaVar.b() && d(jsaVar)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return e();
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] f = f();
        int i = f[0] & 255;
        for (int i2 = 1; i2 < f.length; i2++) {
            i |= (f[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] f = f();
        int length = f.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : f) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
