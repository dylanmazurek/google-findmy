package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iji {
    public static final /* synthetic */ int a = 0;
    private static final lim b = lim.t(new byte[32]);

    static {
        char[] cArr = new char[64];
        int i = 2;
        "FF".getChars(0, 2, cArr, 0);
        while (true) {
            int i2 = 64 - i;
            if (i < i2) {
                System.arraycopy(cArr, 0, cArr, i, i);
                i += i;
            } else {
                System.arraycopy(cArr, 0, cArr, i, i2);
                lim.B(new String(cArr));
                return;
            }
        }
    }

    public static long a(lim limVar) {
        boolean z;
        boolean z2;
        if (limVar.d() == 8) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        byte[] A = limVar.A();
        int length = A.length;
        if (length >= 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.P(z2, "array too small: %s < %s", length, 8);
        return iqh.l(A[0], A[1], A[2], A[3], A[4], A[5], A[6], A[7]);
    }

    public static kxv b(lim limVar) {
        boolean z;
        if (limVar.d() == 16) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        long a2 = a(limVar.j(0, 8));
        long a3 = a(limVar.w(8));
        ljh k = kxv.b.k();
        String uuid = new UUID(a2, a3).toString();
        if (!k.b.y()) {
            k.t();
        }
        kxv kxvVar = (kxv) k.b;
        uuid.getClass();
        kxvVar.a = uuid;
        return (kxv) k.q();
    }

    public static lim c(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return lim.t(bArr);
        }
        return lim.b;
    }

    public static lim d(long j) {
        return lim.t(iqh.m(j));
    }

    public static lim e(kxv kxvVar) {
        UUID fromString = UUID.fromString(kxvVar.a);
        return d(fromString.getMostSignificantBits()).r(d(fromString.getLeastSignificantBits()));
    }

    public static lim f(int... iArr) {
        boolean z;
        int length = iArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 >= -128 && i2 <= 255) {
                z = true;
            } else {
                z = false;
            }
            hwx.J(z);
            bArr[i] = (byte) iArr[i];
        }
        return lim.t(bArr);
    }

    public static lim g(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        return b.j(0, i);
    }

    public static String h(lim limVar) {
        return kzy.p(limVar, jtf.f);
    }
}
