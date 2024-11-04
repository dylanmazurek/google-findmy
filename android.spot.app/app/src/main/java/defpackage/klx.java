package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klx implements kmr {
    public static final ThreadLocal a = new klw();
    public final SecretKeySpec b;
    public final int c;
    public final int d;

    public klx(byte[] bArr, int i) {
        if (iuu.y(2)) {
            kna.a(bArr.length);
            this.b = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) a.get()).getBlockSize();
            this.d = blockSize;
            if (i <= blockSize) {
                this.c = i;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
