package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlf implements nkr {
    public final nll a;
    public final nkp b = new nkp();
    public boolean c;

    public nlf(nll nllVar) {
        this.a = nllVar;
    }

    @Override // defpackage.nll
    public final long a(nkp nkpVar, long j) {
        if (j >= 0) {
            if (!this.c) {
                nkp nkpVar2 = this.b;
                if (nkpVar2.b == 0 && this.a.a(nkpVar2, 8192L) == -1) {
                    return -1L;
                }
                return this.b.a(nkpVar, Math.min(j, this.b.b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a.ap(j, "byteCount < 0: "));
    }

    public final int c() {
        t(4L);
        int f = this.b.f();
        int i = f >>> 24;
        int i2 = 16711680 & f;
        int i3 = 65280 & f;
        return ((f & 255) << 24) | i | (i2 >>> 8) | (i3 << 8);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.nll
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.a.close();
            this.b.s();
        }
    }

    @Override // defpackage.nkr
    public final byte d() {
        t(1L);
        return this.b.d();
    }

    @Override // defpackage.nll
    public final nln dv() {
        return this.a.dv();
    }

    public final long e() {
        return h((byte) 0, Long.MAX_VALUE);
    }

    @Override // defpackage.nkr
    public final int f() {
        t(4L);
        return this.b.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014d A[SYNTHETIC] */
    @Override // defpackage.nkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(defpackage.nks r18) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlf.g(nks):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x012d, code lost:            throw new java.lang.IllegalArgumentException("size=" + r11.b + " fromIndex=" + r6 + " toIndex=" + r2);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(byte r21, long r22) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlf.h(byte, long):long");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        if (!this.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nkr
    public final String k() {
        return l(Long.MAX_VALUE);
    }

    @Override // defpackage.nkr
    public final String l(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long h = h((byte) 10, j2);
            if (h != -1) {
                return nlo.a(this.b, h);
            }
            if (j2 < Long.MAX_VALUE && w(j2) && this.b.c((-1) + j2) == 13 && w(1 + j2) && this.b.c(j2) == 10) {
                return nlo.a(this.b, j2);
            }
            nkp nkpVar = new nkp();
            nkp nkpVar2 = this.b;
            nkpVar2.z(nkpVar, 0L, Math.min(32L, nkpVar2.b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.b.b, j) + " content=" + nkpVar.m().c() + "…");
        }
        throw new IllegalArgumentException(a.ap(j, "limit < 0: "));
    }

    @Override // defpackage.nkr
    public final nks n(long j) {
        t(j);
        return this.b.n(j);
    }

    @Override // defpackage.nkr
    public final short q() {
        t(2L);
        return this.b.q();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        nkp nkpVar = this.b;
        if (nkpVar.b == 0 && this.a.a(nkpVar, 8192L) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    @Override // defpackage.nkr
    public final void t(long j) {
        if (w(j)) {
        } else {
            throw new EOFException();
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // defpackage.nkr
    public final void u(long j) {
        if (!this.c) {
            while (j > 0) {
                nkp nkpVar = this.b;
                if (nkpVar.b == 0 && this.a.a(nkpVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.b.b);
                this.b.u(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nkr
    public final boolean v() {
        if (!this.c) {
            nkp nkpVar = this.b;
            if (nkpVar.v() && this.a.a(nkpVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nkr
    public final boolean w(long j) {
        nkp nkpVar;
        if (j >= 0) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            do {
                nkpVar = this.b;
                if (nkpVar.b >= j) {
                    return true;
                }
            } while (this.a.a(nkpVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(a.ap(j, "byteCount < 0: "));
    }

    @Override // defpackage.nkr
    public final byte[] x() {
        this.b.C(this.a);
        return this.b.x();
    }

    @Override // defpackage.nkr
    public final byte[] y(long j) {
        t(j);
        return this.b.y(j);
    }
}
