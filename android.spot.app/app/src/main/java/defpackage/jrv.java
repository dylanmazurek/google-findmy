package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jrv extends jrr {
    public final ByteBuffer a;

    /* JADX INFO: Access modifiers changed from: protected */
    public jrv() {
        hwx.J(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void h() {
        this.a.flip();
        while (this.a.remaining() >= 16) {
            f(this.a);
        }
        this.a.compact();
    }

    @Override // defpackage.jrr, defpackage.jsc
    public final void b(byte[] bArr, int i, int i2) {
        ByteBuffer order = ByteBuffer.wrap(bArr, 0, i2).order(ByteOrder.LITTLE_ENDIAN);
        if (order.remaining() <= this.a.remaining()) {
            this.a.put(order);
            e();
            return;
        }
        int position = 16 - this.a.position();
        for (int i3 = 0; i3 < position; i3++) {
            this.a.put(order.get());
        }
        h();
        while (order.remaining() >= 16) {
            f(order);
        }
        this.a.put(order);
    }

    protected abstract jsa d();

    public final void e() {
        if (this.a.remaining() < 8) {
            h();
        }
    }

    protected abstract void f(ByteBuffer byteBuffer);

    protected void g(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.jsc
    public final jsa k() {
        h();
        this.a.flip();
        if (this.a.remaining() > 0) {
            g(this.a);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.limit());
        }
        return d();
    }
}
