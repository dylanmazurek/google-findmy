package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmz implements kai {
    public static final kuv a;
    private final RSAPublicKey b;
    private final kmq c;
    private final kmq d;
    private final int e;
    private final byte[] f;
    private final byte[] g;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kmq.SHA256, kle.a, hashMap, hashMap2);
        iuu.u(kmq.SHA384, kle.b, hashMap, hashMap2);
        iuu.u(kmq.SHA512, kle.c, hashMap, hashMap2);
        a = iuu.G(hashMap, hashMap2);
    }

    public kmz(RSAPublicKey rSAPublicKey, kmq kmqVar, kmq kmqVar2, int i, byte[] bArr, byte[] bArr2) {
        if (iuu.y(2)) {
            kna.d(kmqVar);
            kna.b(rSAPublicKey.getModulus().bitLength());
            kna.c(rSAPublicKey.getPublicExponent());
            this.b = rSAPublicKey;
            this.c = kmqVar;
            this.d = kmqVar2;
            this.e = i;
            this.f = bArr;
            this.g = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.b;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 == bArr.length) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(modulus) < 0) {
                byte[] w = iuu.w(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
                int bitLength3 = modulus.bitLength() - 1;
                kna.d(this.c);
                MessageDigest messageDigest = (MessageDigest) kmn.d.a(kne.c(this.c));
                byte[] digest = messageDigest.digest(bArr2);
                int digestLength = messageDigest.getDigestLength();
                int length = w.length;
                if (length >= this.e + digestLength + 2) {
                    if (w[length - 1] == -68) {
                        int i = length - digestLength;
                        int i2 = i - 1;
                        byte[] copyOf = Arrays.copyOf(w, i2);
                        int length2 = copyOf.length;
                        byte[] copyOfRange = Arrays.copyOfRange(w, length2, length2 + digestLength);
                        int i3 = 0;
                        while (true) {
                            MessageDigest messageDigest2 = messageDigest;
                            byte[] bArr3 = digest;
                            byte[] bArr4 = copyOfRange;
                            int i4 = bitLength3;
                            long j = (length * 8) - bitLength3;
                            if (i3 < j) {
                                if (((copyOf[i3 / 8] >> (7 - (i3 % 8))) & 1) == 0) {
                                    i3++;
                                    messageDigest = messageDigest2;
                                    digest = bArr3;
                                    bitLength3 = i4;
                                    copyOfRange = bArr4;
                                } else {
                                    throw new GeneralSecurityException("inconsistent");
                                }
                            } else {
                                MessageDigest messageDigest3 = (MessageDigest) kmn.d.a(kne.c(this.d));
                                int digestLength2 = messageDigest3.getDigestLength();
                                byte[] bArr5 = new byte[i2];
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 <= (i - 2) / digestLength2) {
                                    messageDigest3.reset();
                                    messageDigest3.update(bArr4);
                                    messageDigest3.update(iuu.w(BigInteger.valueOf(i5), 4));
                                    byte[] digest2 = messageDigest3.digest();
                                    int length3 = digest2.length;
                                    System.arraycopy(digest2, 0, bArr5, i6, Math.min(length3, i2 - i6));
                                    i6 += length3;
                                    i5++;
                                    messageDigest3 = messageDigest3;
                                }
                                byte[] bArr6 = new byte[i2];
                                for (int i7 = 0; i7 < i2; i7++) {
                                    bArr6[i7] = (byte) (bArr5[i7] ^ copyOf[i7]);
                                }
                                for (int i8 = 0; i8 <= j; i8++) {
                                    int i9 = i8 / 8;
                                    bArr6[i9] = (byte) ((~(1 << (7 - (i8 % 8)))) & bArr6[i9]);
                                }
                                int i10 = 0;
                                while (true) {
                                    int i11 = this.e;
                                    int i12 = (i - i11) - 2;
                                    if (i10 < i12) {
                                        if (bArr6[i10] == 0) {
                                            i10++;
                                        } else {
                                            throw new GeneralSecurityException("inconsistent");
                                        }
                                    } else {
                                        if (bArr6[i12] == 1) {
                                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr6, i2 - i11, i2);
                                            int i13 = digestLength + 8;
                                            byte[] bArr7 = new byte[this.e + i13];
                                            System.arraycopy(bArr3, 0, bArr7, 8, bArr3.length);
                                            System.arraycopy(copyOfRange2, 0, bArr7, i13, copyOfRange2.length);
                                            if (MessageDigest.isEqual(messageDigest2.digest(bArr7), bArr4)) {
                                                return;
                                            } else {
                                                throw new GeneralSecurityException("inconsistent");
                                            }
                                        }
                                        throw new GeneralSecurityException("inconsistent");
                                    }
                                }
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("inconsistent");
                    }
                } else {
                    throw new GeneralSecurityException("inconsistent");
                }
            } else {
                throw new GeneralSecurityException("signature out of range");
            }
        } else {
            throw new GeneralSecurityException("invalid signature's length");
        }
    }

    @Override // defpackage.kai
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f;
        if (bArr3.length == 0 && this.g.length == 0) {
            b(bArr, bArr2);
            return;
        }
        if (kgt.c(bArr3, bArr)) {
            byte[] bArr4 = this.g;
            if (bArr4.length != 0) {
                bArr2 = jql.I(bArr2, bArr4);
            }
            b(Arrays.copyOfRange(bArr, this.f.length, bArr.length), bArr2);
            return;
        }
        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
    }
}
