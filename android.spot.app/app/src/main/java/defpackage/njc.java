package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njc implements nll {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final nkr f;

    public njc(nkr nkrVar) {
        this.f = nkrVar;
    }

    @Override // defpackage.nll
    public final long a(nkp nkpVar, long j) {
        int i;
        int f;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                this.f.u(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int g = ngt.g(this.f);
                    this.d = g;
                    this.a = g;
                    int x = ngt.x(this.f.d());
                    this.b = ngt.x(this.f.d());
                    if (njd.a.isLoggable(Level.FINE)) {
                        Logger logger = njd.a;
                        nks nksVar = nik.a;
                        logger.fine(nik.b(true, this.c, this.a, x, this.b));
                    }
                    f = this.f.f() & Integer.MAX_VALUE;
                    this.c = f;
                    if (x != 9) {
                        throw new IOException(x + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long a = this.f.a(nkpVar, Math.min(8192L, i2));
                if (a != -1) {
                    this.d -= (int) a;
                    return a;
                }
            }
            return -1L;
        } while (f == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.nll
    public final nln dv() {
        return this.f.dv();
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
