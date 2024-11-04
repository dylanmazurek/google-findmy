package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jrp extends jrr {
    public jrp() {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void a(byte[] bArr, int i, int i2) {
        throw null;
    }

    @Override // defpackage.jrr, defpackage.jsc
    public final void b(byte[] bArr, int i, int i2) {
        hwx.T(i, i + i2, bArr.length);
        a(bArr, i, i2);
    }
}
