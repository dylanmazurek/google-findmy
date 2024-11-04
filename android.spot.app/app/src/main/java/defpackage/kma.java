package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kma implements jzw {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new kly();
    private final byte[] c;
    private final SecretKeySpec d;

    static {
        new klz();
    }

    public kma(byte[] bArr, int i) {
        if (iuu.y(1)) {
            if (i != 12 && i != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            kna.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.d = secretKeySpec;
            Cipher cipher = (Cipher) b.get();
            cipher.init(1, secretKeySpec);
            byte[] a2 = a(cipher.doFinal(new byte[16]));
            this.c = a2;
            a(a2);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b2 + b2) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b3 + b3));
        return bArr2;
    }
}
