package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmx implements kah {
    private final byte[] a;
    private final byte[] b;
    private final Object c;
    private final Object d;
    private final Object e;

    private kmx(ECPrivateKey eCPrivateKey, kmq kmqVar, kmi kmiVar, byte[] bArr, byte[] bArr2) {
        if (iuu.y(2)) {
            this.d = eCPrivateKey;
            this.c = kne.d(kmqVar);
            this.e = kmiVar;
            this.a = bArr;
            this.b = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }

    public static kah a(kla klaVar) {
        byte[] bArr;
        byte[] c;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) kmn.g.a("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(klaVar.a.b, klaVar.V().c, (BigInteger) klaVar.b.a, (BigInteger) klaVar.c.a, (BigInteger) klaVar.d.a, (BigInteger) klaVar.e.a, (BigInteger) klaVar.f.a, (BigInteger) klaVar.g.a));
        kmq kmqVar = (kmq) kmy.a.o(klaVar.V().e);
        byte[] c2 = klaVar.X().c();
        if (klaVar.V().d.equals(kky.c)) {
            bArr = new byte[]{0};
        } else {
            bArr = new byte[0];
        }
        kmx kmxVar = new kmx(rSAPrivateCrtKey, kmqVar, c2, bArr);
        kai b = kmy.b(klaVar.a);
        try {
            byte[] bArr2 = {1, 2, 3};
            byte[] bArr3 = kmxVar.b;
            if (bArr3.length == 0) {
                c = kmxVar.c(bArr2);
            } else {
                c = kmxVar.c(jql.I(bArr2, bArr3));
            }
            byte[] bArr4 = kmxVar.a;
            if (bArr4.length != 0) {
                c = jql.I(bArr4, c);
            }
            b.a(c, new byte[]{1, 2, 3});
            return kmxVar;
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }

    public static kah b(kki kkiVar) {
        byte[] bArr;
        byte[] d;
        kmq kmqVar = (kmq) kmd.a.o(kkiVar.V().c);
        kmi kmiVar = (kmi) kmd.b.o(kkiVar.V().a);
        ECPrivateKey w = jql.w((kmh) kmd.c.o(kkiVar.V().b), ((BigInteger) kkiVar.b.a).toByteArray());
        byte[] c = kkiVar.X().c();
        if (kkiVar.V().d.equals(kkg.c)) {
            bArr = new byte[]{0};
        } else {
            bArr = new byte[0];
        }
        kmx kmxVar = new kmx(w, kmqVar, kmiVar, c, bArr);
        kai b = kmd.b(kkiVar.a);
        try {
            byte[] bArr2 = {1, 2, 3};
            byte[] bArr3 = kmxVar.b;
            if (bArr3.length == 0) {
                d = kmxVar.d(bArr2);
            } else {
                d = kmxVar.d(jql.I(bArr2, bArr3));
            }
            byte[] bArr4 = kmxVar.a;
            if (bArr4.length != 0) {
                d = jql.I(bArr4, d);
            }
            b.a(d, new byte[]{1, 2, 3});
            return kmxVar;
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.security.PrivateKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.security.PublicKey] */
    private final byte[] c(byte[] bArr) {
        Signature signature = (Signature) kmn.c.a((String) this.e);
        signature.initSign(this.c);
        signature.update(bArr);
        byte[] sign = signature.sign();
        Signature signature2 = (Signature) kmn.c.a((String) this.e);
        signature2.initVerify((PublicKey) this.d);
        signature2.update(bArr);
        if (signature2.verify(sign)) {
            return sign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.security.interfaces.ECPrivateKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.security.PrivateKey, java.lang.Object] */
    private final byte[] d(byte[] bArr) {
        int i;
        int i2;
        Signature signature = (Signature) kmn.c.b((String) this.c, kmn.c("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"));
        signature.initSign(this.d);
        signature.update(bArr);
        byte[] sign = signature.sign();
        if (this.e == kmi.IEEE_P1363) {
            int t = jql.t(this.d.getParams().getCurve());
            int i3 = t + t;
            if (jql.D(sign)) {
                byte[] bArr2 = new byte[i3];
                int i4 = 1;
                if ((sign[1] & 255) >= 128) {
                    i = 3;
                } else {
                    i = 2;
                }
                int i5 = i + 1;
                int i6 = i + 2;
                int i7 = sign[i5];
                if (sign[i6] == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                System.arraycopy(sign, i6 + i2, bArr2, ((i3 / 2) - i7) + i2, i7 - i2);
                int i8 = i6 + i7 + 1;
                int i9 = i8 + 1;
                int i10 = sign[i8];
                if (sign[i9] != 0) {
                    i4 = 0;
                }
                System.arraycopy(sign, i9 + i4, bArr2, (i3 - i10) + i4, i10 - i4);
                return bArr2;
            }
            throw new GeneralSecurityException("Invalid DER encoding");
        }
        return sign;
    }

    private kmx(RSAPrivateCrtKey rSAPrivateCrtKey, kmq kmqVar, byte[] bArr, byte[] bArr2) {
        if (iuu.y(2)) {
            kna.d(kmqVar);
            kna.b(rSAPrivateCrtKey.getModulus().bitLength());
            kna.c(rSAPrivateCrtKey.getPublicExponent());
            this.c = rSAPrivateCrtKey;
            kna.d(kmqVar);
            this.e = kmqVar.toString().concat("withRSA");
            this.d = (RSAPublicKey) ((KeyFactory) kmn.g.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            this.a = bArr;
            this.b = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }
}
