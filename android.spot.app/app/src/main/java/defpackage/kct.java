package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kct extends kcu {
    public kct(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.kcu
    public final int a() {
        return 12;
    }

    @Override // defpackage.kcu
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            kcs.b(iArr2, this.a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
