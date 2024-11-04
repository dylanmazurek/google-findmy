package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llr extends llt {
    public llr(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.llt
    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // defpackage.llt
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.llt
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.llt
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.llt
    public final void e(Object obj, long j, boolean z) {
        if (llu.c) {
            llu.o(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            llu.p(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.llt
    public final void f(Object obj, long j, byte b) {
        if (llu.c) {
            llu.o(obj, j, b);
        } else {
            llu.p(obj, j, b);
        }
    }

    @Override // defpackage.llt
    public final void g(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.llt
    public final void h(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.llt
    public final boolean i(Object obj, long j) {
        if (llu.c) {
            return llu.x(obj, j);
        }
        return llu.y(obj, j);
    }
}
