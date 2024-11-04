package defpackage;

import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsj {
    private static final jsg a;

    static {
        jsg jsgVar = jsf.a;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                    jsgVar = jsi.UNSAFE_LITTLE_ENDIAN;
                } else {
                    jsgVar = jsi.UNSAFE_BIG_ENDIAN;
                }
            }
        } catch (Throwable unused) {
        }
        a = jsgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(byte[] bArr, int i) {
        return a.a(bArr, i);
    }
}
