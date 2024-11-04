package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkn implements nll {
    final /* synthetic */ nko a;
    final /* synthetic */ nll b;

    public nkn(nko nkoVar, nll nllVar) {
        this.a = nkoVar;
        this.b = nllVar;
    }

    @Override // defpackage.nll
    public final long a(nkp nkpVar, long j) {
        nko nkoVar = this.a;
        nkoVar.e();
        try {
            long a = this.b.a(nkpVar, 8192L);
            if (!nkoVar.f()) {
                return a;
            }
            throw nkoVar.d(null);
        } catch (IOException e) {
            if (nkoVar.f()) {
                throw nkoVar.d(e);
            }
            throw e;
        } finally {
            nkoVar.f();
        }
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        nko nkoVar = this.a;
        nkoVar.e();
        try {
            this.b.close();
            if (!nkoVar.f()) {
            } else {
                throw nkoVar.d(null);
            }
        } catch (IOException e) {
            if (nkoVar.f()) {
                throw nkoVar.d(e);
            }
        } finally {
            nkoVar.f();
        }
    }

    @Override // defpackage.nll
    public final /* synthetic */ nln dv() {
        return this.a;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
