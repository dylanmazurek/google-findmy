package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes.dex */
final class keo implements keq {
    private final int a;

    public keo(kbd kbdVar) {
        int i = kbdVar.b;
        int i2 = kbdVar.c;
        if (kbdVar.d == kbc.c) {
            this.a = kbdVar.a;
            return;
        }
        throw new GeneralSecurityException("invalid variant");
    }

    @Override // defpackage.keq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.keq
    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == this.a) {
            SecretKey c = kcm.c(bArr);
            byte[] b = kgn.b(12);
            AlgorithmParameterSpec a = kcm.a(b);
            Cipher b2 = kcm.b();
            b2.init(1, c, a);
            int length = bArr4.length;
            int outputSize = b2.getOutputSize(length);
            int length2 = bArr2.length;
            int length3 = bArr3.length;
            int i = length2 + length3;
            if (outputSize <= 2147483635 - i) {
                int i2 = i + 12;
                byte[] copyOf = Arrays.copyOf(bArr2, i2 + outputSize);
                System.arraycopy(bArr3, 0, copyOf, length2, length3);
                System.arraycopy(b, 0, copyOf, i, 12);
                if (b2.doFinal(bArr4, 0, length, copyOf, i2) == outputSize) {
                    return copyOf;
                }
                throw new GeneralSecurityException("not enough data written");
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("invalid key size");
    }
}
