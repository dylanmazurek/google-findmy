package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgb {
    public static final knb a = knb.b(new byte[0]);

    public static final knb a(int i) {
        return knb.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final knb b(int i) {
        return knb.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
