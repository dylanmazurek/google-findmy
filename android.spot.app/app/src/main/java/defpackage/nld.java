package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nld implements nkq {
    public final nlj a;
    public final nkp b = new nkp();
    public boolean c;

    public nld(nlj nljVar) {
        this.a = nljVar;
    }

    @Override // defpackage.nkq
    public final void E(int i) {
        if (!this.c) {
            this.b.D(i);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nkq
    public final void G(int i) {
        if (!this.c) {
            this.b.F(i);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nkq
    public final void L(String str) {
        str.getClass();
        if (!this.c) {
            this.b.K(str);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void c() {
        if (!this.c) {
            nkp nkpVar = this.b;
            long j = nkpVar.b;
            if (j == 0) {
                j = 0;
            } else {
                nlg nlgVar = nkpVar.a;
                nlgVar.getClass();
                nlg nlgVar2 = nlgVar.g;
                nlgVar2.getClass();
                if (nlgVar2.c < 8192 && nlgVar2.e) {
                    j -= r6 - nlgVar2.b;
                }
            }
            if (j > 0) {
                this.a.dw(nkpVar, j);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.nlj
    public final void close() {
        Throwable th;
        if (!this.c) {
            try {
                nkp nkpVar = this.b;
                long j = nkpVar.b;
                th = null;
                if (j > 0) {
                    this.a.dw(nkpVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // defpackage.nlj
    public final nln dv() {
        return this.a.dv();
    }

    @Override // defpackage.nlj
    public final void dw(nkp nkpVar, long j) {
        if (!this.c) {
            this.b.dw(nkpVar, j);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nkq, defpackage.nlj, java.io.Flushable
    public final void flush() {
        if (!this.c) {
            nkp nkpVar = this.b;
            long j = nkpVar.b;
            if (j > 0) {
                this.a.dw(nkpVar, j);
            }
            this.a.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        if (!this.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int write = this.b.write(byteBuffer);
            c();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
