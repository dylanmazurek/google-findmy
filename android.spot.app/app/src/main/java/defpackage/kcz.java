package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcz implements jzw {
    public kcz(ktn ktnVar) {
        if (ktnVar.d()) {
            kfx.a.a();
            iuu.x(ktnVar);
        }
    }

    public static jzw a(knb knbVar) {
        return new kcz(knbVar.c());
    }

    public static boolean b() {
        if (kcq.a() != null) {
            return true;
        }
        return false;
    }

    public kcz(byte[] bArr) {
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
    }

    public kcz(byte[] bArr, byte[] bArr2) {
        if (iuu.y(1)) {
            if (b()) {
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                return;
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public kcz(byte[] bArr, knb knbVar) {
        if (iuu.y(2)) {
            kcm.c(bArr);
            knbVar.c();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public kcz(byte[] bArr, char[] cArr) {
        new kcv(bArr);
    }

    public kcz(byte[] bArr, short[] sArr) {
        new kcy(bArr);
    }
}
