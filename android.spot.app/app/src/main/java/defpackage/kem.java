package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kem implements keu {
    private final int a;

    public kem(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(a.ae(i, "Unsupported key length: "));
        }
        this.a = i;
    }

    @Override // defpackage.keu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.keu
    public final byte[] b() {
        int i = this.a;
        if (i != 16) {
            if (i == 32) {
                return kfa.j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return kfa.i;
    }

    @Override // defpackage.keu
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.a) {
            if (iuu.y(2)) {
                SecretKey c = kcm.c(bArr);
                if (bArr2.length == 12) {
                    if (bArr3.length <= 2147483631) {
                        AlgorithmParameterSpec a = kcm.a(bArr2);
                        Cipher b = kcm.b();
                        b.init(1, c, a);
                        return b.doFinal(bArr3);
                    }
                    throw new GeneralSecurityException("plaintext too long");
                }
                throw new GeneralSecurityException("iv is wrong size");
            }
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new InvalidAlgorithmParameterException(a.ae(length, "Unexpected key length: "));
    }
}
