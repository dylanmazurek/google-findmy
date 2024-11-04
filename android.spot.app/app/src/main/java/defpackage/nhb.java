package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhb extends nku {
    final /* synthetic */ nhc a;
    private final long c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhb(nhc nhcVar, nll nllVar, long j) {
        super(nllVar);
        nllVar.getClass();
        this.a = nhcVar;
        this.c = j;
        this.e = true;
        if (j == 0) {
            b(null);
        }
    }

    @Override // defpackage.nku, defpackage.nll
    public final long a(nkp nkpVar, long j) {
        if (!this.g) {
            try {
                long a = this.b.a(nkpVar, 8192L);
                if (this.e) {
                    this.e = false;
                }
                if (a == -1) {
                    b(null);
                    return -1L;
                }
                long j2 = this.d + a;
                long j3 = this.c;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.c + " bytes but received " + j2);
                }
                this.d = j2;
                if (j2 == j3) {
                    b(null);
                }
                return a;
            } catch (IOException e) {
                throw b(e);
            }
        }
        throw new IllegalStateException("closed");
    }

    public final IOException b(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
        }
        return this.a.e(true, false, iOException);
    }

    @Override // defpackage.nku, defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            this.b.close();
            b(null);
        } catch (IOException e) {
            throw b(e);
        }
    }
}
