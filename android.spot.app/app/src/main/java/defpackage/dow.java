package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dow implements dov {
    private final /* synthetic */ int a;
    private final Object b;

    public dow(InputStream inputStream, int i) {
        this.a = i;
        this.b = inputStream;
    }

    @Override // defpackage.dov
    public final int a() {
        int d;
        short d2;
        if (this.a != 0) {
            d = d() << 8;
            d2 = d();
        } else {
            d = d() << 8;
            d2 = d();
        }
        return d | d2;
    }

    @Override // defpackage.dov
    public final int b(byte[] bArr, int i) {
        int i2 = 0;
        if (this.a != 0) {
            int min = Math.min(i, ((ByteBuffer) this.b).remaining());
            if (min == 0) {
                return -1;
            }
            ((ByteBuffer) this.b).get(bArr, 0, min);
            return min;
        }
        int i3 = 0;
        while (i2 < i) {
            i3 = ((InputStream) this.b).read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new dou();
        }
        return i2;
    }

    @Override // defpackage.dov
    public final long c(long j) {
        if (this.a != 0) {
            int min = (int) Math.min(((ByteBuffer) this.b).remaining(), j);
            ((ByteBuffer) this.b).position(((ByteBuffer) this.b).position() + min);
            return min;
        }
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = ((InputStream) this.b).skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else {
                if (((InputStream) this.b).read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    @Override // defpackage.dov
    public final short d() {
        if (this.a != 0) {
            if (((ByteBuffer) this.b).remaining() > 0) {
                return (short) (((ByteBuffer) this.b).get() & 255);
            }
            throw new dou();
        }
        int read = ((InputStream) this.b).read();
        if (read != -1) {
            return (short) read;
        }
        throw new dou();
    }

    public dow(ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
