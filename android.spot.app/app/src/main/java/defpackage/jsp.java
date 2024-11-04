package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsp extends jrr {
    private long b;
    private int c;
    private int a = 0;
    private int d = 0;
    private boolean e = false;

    private final void d(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.b = j3;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            this.a = jsq.f(this.a, jsq.g((int) j3));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.jrr, defpackage.jsc
    public final void b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        hwx.T(0, i2, bArr.length);
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i2) {
                break;
            }
            d(4, jsq.e(bArr, i3));
            i3 = i4;
        }
        while (i3 < i2) {
            d(1, bArr[i3] & 255);
            i3++;
        }
    }

    @Override // defpackage.jsc
    public final jsa k() {
        hwx.U(!this.e);
        this.e = true;
        int g = this.a ^ jsq.g((int) this.b);
        this.a = g;
        return jsq.h(g, this.d);
    }
}
