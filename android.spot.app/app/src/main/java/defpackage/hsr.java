package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsr {
    public static volatile jer a;
    private static volatile jer b;

    public static boolean a(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i > 0) {
                if (byteBuffer.get() == 32) {
                    i--;
                }
            } else {
                return true;
            }
        }
        if (i != 0) {
            return false;
        }
        return true;
    }
}
