package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmt implements khm {
    private static final ThreadLocal a = new kms();
    private final SecretKey b;
    private final byte[] c;
    private final byte[] d;

    public kmt(byte[] bArr) {
        kna.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.b = secretKeySpec;
        Cipher b = b();
        b.init(1, secretKeySpec);
        byte[] Q = jql.Q(b.doFinal(new byte[16]));
        this.c = Q;
        this.d = jql.Q(Q);
    }

    private static Cipher b() {
        if (iuu.y(1)) {
            return (Cipher) a.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // defpackage.khm
    public final byte[] a(byte[] bArr, int i) {
        byte[] J;
        if (i <= 16) {
            SecretKey secretKey = this.b;
            Cipher b = b();
            int i2 = 1;
            b.init(1, secretKey);
            int length = bArr.length;
            if (length != 0) {
                i2 = 1 + ((length - 1) >> 4);
            }
            int i3 = i2 - 1;
            int i4 = i3 * 16;
            if (i2 * 16 == length) {
                J = jql.K(bArr, i4, this.c, 16);
            } else {
                J = jql.J(jql.P(Arrays.copyOfRange(bArr, i4, length)), this.d);
            }
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            for (int i5 = 0; i5 < i3; i5++) {
                c(bArr2, bArr, i5 * 16, bArr3);
                if (b.doFinal(bArr3, 0, 16, bArr2) != 16) {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            c(bArr2, J, 0, bArr3);
            if (b.doFinal(bArr3, 0, 16, bArr2) == 16) {
                if (i == 16) {
                    return bArr2;
                }
                return Arrays.copyOf(bArr2, i);
            }
            throw new IllegalStateException("Cipher didn't write full block");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
