package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcx extends kcu {
    public kcx(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.kcu
    public final int a() {
        return 24;
    }

    @Override // defpackage.kcu
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.a;
            int i2 = kcs.a;
            kcs.b(r0, iArr3);
            int[] iArr4 = {0, 0, 0, 0, iArr4[12], iArr4[13], iArr4[14], iArr4[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            kcs.c(iArr4);
            kcs.b(iArr2, Arrays.copyOf(iArr4, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
