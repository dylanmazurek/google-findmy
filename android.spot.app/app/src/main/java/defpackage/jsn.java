package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsn extends jrv {
    private long b = 0;
    private long c = 0;
    private int d = 0;

    private static long h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long i(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long j(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.jrv
    protected final jsa d() {
        long j = this.b;
        long j2 = this.d;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.c;
        long j5 = j3 + j4;
        this.b = j5;
        long j6 = j4 + j5;
        this.c = j6;
        long h = h(j5);
        this.b = h;
        long h2 = h(j6);
        long j7 = h + h2;
        this.b = j7;
        this.c = h2 + j7;
        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.b).putLong(this.c).array();
        int i = jsa.b;
        return new jrx(array);
    }

    @Override // defpackage.jrv
    protected final void f(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long i = i(j) ^ this.b;
        this.b = i;
        long rotateLeft = Long.rotateLeft(i, 27);
        long j3 = this.c;
        this.b = ((rotateLeft + j3) * 5) + 1390208809;
        long j4 = j(j2) ^ j3;
        this.c = j4;
        this.c = ((Long.rotateLeft(j4, 31) + this.b) * 5) + 944331445;
        this.d += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001b. Please report as an issue. */
    @Override // defpackage.jrv
    protected final void g(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long k;
        this.d += byteBuffer.remaining();
        long j7 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j = 0;
                k = j ^ iqh.k(byteBuffer.get(0));
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 2:
                j2 = 0;
                j = j2 ^ (iqh.k(byteBuffer.get(1)) << 8);
                k = j ^ iqh.k(byteBuffer.get(0));
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 3:
                j3 = 0;
                j2 = j3 ^ (iqh.k(byteBuffer.get(2)) << 16);
                j = j2 ^ (iqh.k(byteBuffer.get(1)) << 8);
                k = j ^ iqh.k(byteBuffer.get(0));
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 4:
                j4 = 0;
                j3 = j4 ^ (iqh.k(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (iqh.k(byteBuffer.get(2)) << 16);
                j = j2 ^ (iqh.k(byteBuffer.get(1)) << 8);
                k = j ^ iqh.k(byteBuffer.get(0));
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 5:
                j5 = 0;
                j4 = j5 ^ (iqh.k(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (iqh.k(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (iqh.k(byteBuffer.get(2)) << 16);
                j = j2 ^ (iqh.k(byteBuffer.get(1)) << 8);
                k = j ^ iqh.k(byteBuffer.get(0));
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 6:
                j6 = 0;
                j5 = (iqh.k(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (iqh.k(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (iqh.k(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (iqh.k(byteBuffer.get(2)) << 16);
                j = j2 ^ (iqh.k(byteBuffer.get(1)) << 8);
                k = j ^ iqh.k(byteBuffer.get(0));
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 7:
                j6 = iqh.k(byteBuffer.get(6)) << 48;
                j5 = (iqh.k(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (iqh.k(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (iqh.k(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (iqh.k(byteBuffer.get(2)) << 16);
                j = j2 ^ (iqh.k(byteBuffer.get(1)) << 8);
                k = j ^ iqh.k(byteBuffer.get(0));
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 8:
                k = byteBuffer.getLong();
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 9:
                j7 ^= iqh.k(byteBuffer.get(8));
                k = byteBuffer.getLong();
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 10:
                j7 ^= iqh.k(byteBuffer.get(9)) << 8;
                j7 ^= iqh.k(byteBuffer.get(8));
                k = byteBuffer.getLong();
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 11:
                j7 ^= iqh.k(byteBuffer.get(10)) << 16;
                j7 ^= iqh.k(byteBuffer.get(9)) << 8;
                j7 ^= iqh.k(byteBuffer.get(8));
                k = byteBuffer.getLong();
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 12:
                j7 ^= iqh.k(byteBuffer.get(11)) << 24;
                j7 ^= iqh.k(byteBuffer.get(10)) << 16;
                j7 ^= iqh.k(byteBuffer.get(9)) << 8;
                j7 ^= iqh.k(byteBuffer.get(8));
                k = byteBuffer.getLong();
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 13:
                j7 ^= iqh.k(byteBuffer.get(12)) << 32;
                j7 ^= iqh.k(byteBuffer.get(11)) << 24;
                j7 ^= iqh.k(byteBuffer.get(10)) << 16;
                j7 ^= iqh.k(byteBuffer.get(9)) << 8;
                j7 ^= iqh.k(byteBuffer.get(8));
                k = byteBuffer.getLong();
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 14:
                j7 ^= iqh.k(byteBuffer.get(13)) << 40;
                j7 ^= iqh.k(byteBuffer.get(12)) << 32;
                j7 ^= iqh.k(byteBuffer.get(11)) << 24;
                j7 ^= iqh.k(byteBuffer.get(10)) << 16;
                j7 ^= iqh.k(byteBuffer.get(9)) << 8;
                j7 ^= iqh.k(byteBuffer.get(8));
                k = byteBuffer.getLong();
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            case 15:
                j7 = iqh.k(byteBuffer.get(14)) << 48;
                j7 ^= iqh.k(byteBuffer.get(13)) << 40;
                j7 ^= iqh.k(byteBuffer.get(12)) << 32;
                j7 ^= iqh.k(byteBuffer.get(11)) << 24;
                j7 ^= iqh.k(byteBuffer.get(10)) << 16;
                j7 ^= iqh.k(byteBuffer.get(9)) << 8;
                j7 ^= iqh.k(byteBuffer.get(8));
                k = byteBuffer.getLong();
                this.b = i(k) ^ this.b;
                this.c ^= j(j7);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
