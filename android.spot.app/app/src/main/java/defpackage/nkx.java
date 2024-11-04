package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkx implements nll {
    private final nkr a;
    private final Inflater b;
    private int c;
    private boolean d;

    public nkx(nkr nkrVar, Inflater inflater) {
        this.a = nkrVar;
        this.b = inflater;
    }

    @Override // defpackage.nll
    public final long a(nkp nkpVar, long j) {
        do {
            long c = c(nkpVar);
            if (c > 0) {
                return c;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.v());
        throw new EOFException("source exhausted prematurely");
    }

    public final long c(nkp nkpVar) {
        if (!this.d) {
            try {
                nlg p = nkpVar.p(1);
                int min = (int) Math.min(8192L, 8192 - p.c);
                if (this.b.needsInput() && !this.a.v()) {
                    nlg nlgVar = ((nlf) this.a).b.a;
                    nlgVar.getClass();
                    int i = nlgVar.c;
                    int i2 = nlgVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    this.b.setInput(nlgVar.a, i2, i3);
                }
                int inflate = this.b.inflate(p.a, p.c, min);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - this.b.getRemaining();
                    this.c -= remaining;
                    this.a.u(remaining);
                }
                if (inflate > 0) {
                    p.c += inflate;
                    long j = inflate;
                    nkpVar.b += j;
                    return j;
                }
                if (p.b == p.c) {
                    nkpVar.a = p.a();
                    nlh.b(p);
                    return 0L;
                }
                return 0L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.nll
    public final nln dv() {
        return this.a.dv();
    }
}
