package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsq extends jrq implements Serializable {
    public static final jsb a = new jsq();
    private static final long serialVersionUID = 0;
    public final int b = 0;
    public final boolean c = true;

    static {
        int i = jse.a;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24) | ((bArr[i + 1] & 255) << 8);
    }

    public static int f(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static int g(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public static jsa h(int i, int i2) {
        int i3 = jsa.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new jry(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.jrq
    public final jsa c(byte[] bArr, int i) {
        int i2 = 0;
        hwx.T(0, i, bArr.length);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + 4;
            if (i5 > i) {
                break;
            }
            i4 = f(i4, g(e(bArr, i3)));
            i3 = i5;
        }
        int i6 = 0;
        while (i3 < i) {
            i2 ^= iqh.k(bArr[i3]) << i6;
            i3++;
            i6 += 8;
        }
        return h(g(i2) ^ i4, i);
    }

    @Override // defpackage.jsb
    public final jsc d() {
        return new jsp();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jsq) {
            jsq jsqVar = (jsq) obj;
            int i = jsqVar.b;
            boolean z = jsqVar.c;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_32(0)";
    }
}
