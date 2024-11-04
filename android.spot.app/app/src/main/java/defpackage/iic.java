package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iic {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/e2ee/E2eeCalculator");
    public static final iia b;
    public static final iia c;
    public static final BigInteger d;
    private static final byte[] e;
    private static final byte[] f;
    private static final lim g;
    private static final lim h;

    static {
        List nCopies = Collections.nCopies(11, (byte) -1);
        if (!(nCopies instanceof jvw)) {
            Object[] array = nCopies.toArray();
            int length = array.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                Object obj = array[i];
                obj.getClass();
                bArr[i] = ((Number) obj).byteValue();
            }
            e = bArr;
            f = new byte[11];
            g = iji.g(32);
            h = lim.b;
            new SecureRandom();
            b = new iia(new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("ffffffffffffffffffffffffffffffff7fffffff", 16)), new BigInteger("ffffffffffffffffffffffffffffffff7ffffffc", 16), new BigInteger("1c97befc54bd7a8b65acf89f81d4d4adc565fa45", 16)), new ECPoint(new BigInteger("4a96b5688ef573284664698968c38bb913cbfc82", 16), new BigInteger("23a628553168947d59dcc912042351377ac5fb32", 16)), new BigInteger("0100000000000000000001f4c8f927aed3ca752257", 16), 1), 20);
            c = new iia(new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("ffffffff00000001000000000000000000000000ffffffffffffffffffffffff", 16)), new BigInteger("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc", 16), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16)), new ECPoint(new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16), new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16)), new BigInteger("ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551", 16), 1), 32);
            d = new BigInteger("3");
            return;
        }
        throw null;
    }

    public static lim a(lim limVar) {
        try {
            lim limVar2 = g;
            lim limVar3 = h;
            int i = ijm.a;
            return lim.t(kne.e("HmacSha256", limVar.A(), limVar2.A(), limVar3.A(), 32));
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    public static BigInteger b(iia iiaVar, lim limVar, int i, int i2) {
        boolean z;
        boolean z2;
        limVar.getClass();
        if (limVar.d() == 32) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        if (i >= 0 && i < 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.J(z2);
        byte[] bArr = {(byte) i};
        int i3 = (i2 >>> i) << i;
        byte[] bArr2 = {(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3};
        byte[][] bArr3 = {e, bArr, bArr2, f, bArr, bArr2};
        int i4 = 0;
        for (int i5 = 0; i5 < 6; i5++) {
            i4 += bArr3[i5].length;
        }
        byte[] bArr4 = new byte[i4];
        int i6 = 0;
        for (int i7 = 0; i7 < 6; i7++) {
            byte[] bArr5 = bArr3[i7];
            int length = bArr5.length;
            System.arraycopy(bArr5, 0, bArr4, i6, length);
            i6 += length;
        }
        return new BigInteger(1, ijm.c(limVar, lim.t(bArr4)).A()).mod(((ECParameterSpec) iiaVar.b).getOrder());
    }

    public static void c(hot hotVar, int i, lim limVar, ihy ihyVar, int i2, long j, int i3, long j2) {
        boolean z;
        boolean z2;
        iia iiaVar;
        int i4 = i2;
        limVar.getClass();
        int i5 = 0;
        if (limVar.d() == 32) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        if (i4 >= 0 && i4 < 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.J(z2);
        int i6 = 1 << i4;
        int i7 = (int) (j - j2);
        int i8 = (i7 >>> i4) << i4;
        int i9 = i7 - i8;
        long j3 = j - i9;
        int i10 = i3 + i9;
        if (i == 2) {
            iiaVar = b;
        } else {
            iiaVar = c;
        }
        ByteBuffer allocate = ByteBuffer.allocate(32);
        allocate.put(e);
        byte b2 = (byte) i4;
        allocate.put(b2);
        allocate.putInt(0);
        allocate.put(f);
        allocate.put(b2);
        allocate.putInt(0);
        ByteBuffer allocate2 = ByteBuffer.allocate(32);
        Cipher l = ijm.l(limVar);
        iib a2 = iib.a(((ECParameterSpec) iiaVar.b).getGenerator());
        jis o = jis.o(hzc.K(iiaVar.b(a2), new iig(iiaVar, 1)));
        while (i5 <= i10) {
            int i11 = i10;
            int i12 = i6;
            ((jni) ((jni) ((jni) a.b().h(flv.a, 284)).g(4, TimeUnit.SECONDS)).j("com/google/android/libraries/spot/e2ee/E2eeCalculator", "computeAndPopulateE2eeEids", 450, "E2eeCalculator.java")).s("Calculating EIDs [windowOffset=%d]", i5);
            int i13 = ((i8 + i5) >>> i4) << i4;
            allocate.putInt(12, i13);
            allocate.putInt(28, i13);
            allocate.rewind();
            ijm.j(l, allocate, allocate2);
            ((jiu) hotVar.a).d(iiaVar.d(iiaVar.a(a2, o, new BigInteger(1, allocate2.array()).mod(((ECParameterSpec) iiaVar.b).getOrder())).b((BigInteger) iiaVar.c)), new igi(i5 + j3, ihyVar));
            i5 += i12;
            allocate2 = allocate2;
            i4 = i2;
            i10 = i11;
            i6 = i12;
        }
    }
}
