package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nha extends nkt {
    final /* synthetic */ nhc a;
    private final long c;
    private boolean d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nha(nhc nhcVar, nlj nljVar, long j) {
        super(nljVar);
        nljVar.getClass();
        this.a = nhcVar;
        this.c = j;
    }

    private final IOException c(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return this.a.e(false, true, iOException);
    }

    @Override // defpackage.nkt, defpackage.nlj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.e == this.c) {
            try {
                this.b.close();
                c(null);
                return;
            } catch (IOException e) {
                throw c(e);
            }
        }
        throw new ProtocolException("unexpected end of stream");
    }

    @Override // defpackage.nkt, defpackage.nlj
    public final void dw(nkp nkpVar, long j) {
        if (!this.f) {
            long j2 = this.e + j;
            long j3 = this.c;
            if (j2 <= j3) {
                try {
                    this.b.dw(nkpVar, j);
                    this.e += j;
                    return;
                } catch (IOException e) {
                    throw c(e);
                }
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + (this.e + j));
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nkt, defpackage.nlj, java.io.Flushable
    public final void flush() {
        try {
            this.b.flush();
        } catch (IOException e) {
            throw c(e);
        }
    }
}
