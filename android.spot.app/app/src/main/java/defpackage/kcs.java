package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcs {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int e = e(i5 ^ iArr[i4], 16);
        iArr[i4] = e;
        int i6 = iArr[i3] + e;
        iArr[i3] = i6;
        int e2 = e(iArr[i2] ^ i6, 12);
        iArr[i2] = e2;
        int i7 = iArr[i] + e2;
        iArr[i] = i7;
        int e3 = e(iArr[i4] ^ i7, 8);
        iArr[i4] = e3;
        int i8 = iArr[i3] + e3;
        iArr[i3] = i8;
        iArr[i2] = e(iArr[i2] ^ i8, 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int[] iArr, int[] iArr2) {
        int[] iArr3 = b;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] d(byte[] bArr) {
        if ((bArr.length & 3) == 0) {
            IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            int[] iArr = new int[asIntBuffer.remaining()];
            asIntBuffer.get(iArr);
            return iArr;
        }
        throw new IllegalArgumentException("invalid input length");
    }

    private static int e(int i, int i2) {
        int i3 = -i2;
        return (i >>> i3) | (i << i2);
    }
}
