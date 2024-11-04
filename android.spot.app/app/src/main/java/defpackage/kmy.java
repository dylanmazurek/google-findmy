package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmy implements kai {
    static final kuv a;
    private final RSAPublicKey b;
    private final kmq c;
    private final byte[] d;
    private final byte[] e;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kmq.SHA256, kkx.a, hashMap, hashMap2);
        iuu.u(kmq.SHA384, kkx.b, hashMap, hashMap2);
        iuu.u(kmq.SHA512, kkx.c, hashMap, hashMap2);
        a = iuu.G(hashMap, hashMap2);
    }

    private kmy(RSAPublicKey rSAPublicKey, kmq kmqVar, byte[] bArr, byte[] bArr2) {
        if (iuu.y(2)) {
            kna.d(kmqVar);
            kna.b(rSAPublicKey.getModulus().bitLength());
            kna.c(rSAPublicKey.getPublicExponent());
            this.b = rSAPublicKey;
            this.c = kmqVar;
            this.d = bArr;
            this.e = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static kai b(klb klbVar) {
        byte[] bArr;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) kmn.g.a("RSA")).generatePublic(new RSAPublicKeySpec(klbVar.b, klbVar.a.c));
        kmq kmqVar = (kmq) a.o(klbVar.a.e);
        byte[] c = klbVar.c.c();
        if (klbVar.a.d.equals(kky.c)) {
            bArr = new byte[]{0};
        } else {
            bArr = new byte[0];
        }
        return new kmy(rSAPublicKey, kmqVar, c, bArr);
    }

    private final void c(byte[] bArr, byte[] bArr2) {
        byte[] s;
        int i;
        RSAPublicKey rSAPublicKey = this.b;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength == bArr.length) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(modulus) < 0) {
                byte[] w = iuu.w(bigInteger.modPow(publicExponent, modulus), bitLength);
                kmq kmqVar = this.c;
                kna.d(kmqVar);
                MessageDigest messageDigest = (MessageDigest) kmn.d.a(kne.c(this.c));
                messageDigest.update(bArr2);
                byte[] digest = messageDigest.digest();
                int ordinal = kmqVar.ordinal();
                int i2 = 2;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            s = jql.s("3051300d060960864801650304020305000440");
                        } else {
                            throw new GeneralSecurityException("Unsupported hash ".concat(kmqVar.toString()));
                        }
                    } else {
                        s = jql.s("3041300d060960864801650304020205000430");
                    }
                } else {
                    s = jql.s("3031300d060960864801650304020105000420");
                }
                if (bitLength >= s.length + digest.length + 11) {
                    byte[] bArr3 = new byte[bitLength];
                    bArr3[0] = 0;
                    bArr3[1] = 1;
                    int i3 = 0;
                    while (true) {
                        i = i2 + 1;
                        if (i3 >= (bitLength - r5) - 3) {
                            break;
                        }
                        bArr3[i2] = -1;
                        i3++;
                        i2 = i;
                    }
                    bArr3[i2] = 0;
                    int length = s.length;
                    System.arraycopy(s, 0, bArr3, i, length);
                    System.arraycopy(digest, 0, bArr3, i + length, digest.length);
                    if (MessageDigest.isEqual(w, bArr3)) {
                        return;
                    } else {
                        throw new GeneralSecurityException("invalid signature");
                    }
                }
                throw new GeneralSecurityException("intended encoded message length too short");
            }
            throw new GeneralSecurityException("signature out of range");
        }
        throw new GeneralSecurityException("invalid signature's length");
    }

    @Override // defpackage.kai
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.d;
        if (bArr3.length == 0 && this.e.length == 0) {
            c(bArr, bArr2);
            return;
        }
        if (kgt.c(bArr3, bArr)) {
            byte[] bArr4 = this.e;
            if (bArr4.length != 0) {
                bArr2 = jql.I(bArr2, bArr4);
            }
            c(Arrays.copyOfRange(bArr, this.d.length, bArr.length), bArr2);
            return;
        }
        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
    }
}
