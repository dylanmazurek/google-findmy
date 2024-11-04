package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nky implements nll {
    private final InputStream a;
    private final nln b;

    public nky(InputStream inputStream, nln nlnVar) {
        this.a = inputStream;
        this.b = nlnVar;
    }

    @Override // defpackage.nll
    public final long a(nkp nkpVar, long j) {
        try {
            this.b.l();
            nlg p = nkpVar.p(1);
            int read = this.a.read(p.a, p.c, (int) Math.min(8192L, 8192 - p.c));
            if (read == -1) {
                if (p.b == p.c) {
                    nkpVar.a = p.a();
                    nlh.b(p);
                    return -1L;
                }
                return -1L;
            }
            p.c += read;
            long j2 = read;
            nkpVar.b += j2;
            return j2;
        } catch (AssertionError e) {
            if (nkz.d(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.nll
    public final nln dv() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
