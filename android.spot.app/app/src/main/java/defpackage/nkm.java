package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkm implements nlj {
    final /* synthetic */ nko a;
    final /* synthetic */ nlj b;

    public nkm(nko nkoVar, nlj nljVar) {
        this.a = nkoVar;
        this.b = nljVar;
    }

    @Override // defpackage.nlj, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.nlj
    public final /* synthetic */ nln dv() {
        return this.a;
    }

    @Override // defpackage.nlj
    public final void dw(nkp nkpVar, long j) {
        mkm.aM(nkpVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                nlg nlgVar = nkpVar.a;
                nlgVar.getClass();
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += nlgVar.c - nlgVar.b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        nlgVar = nlgVar.f;
                        nlgVar.getClass();
                    }
                }
                nko nkoVar = this.a;
                nlj nljVar = this.b;
                nkoVar.e();
                try {
                    nljVar.dw(nkpVar, j2);
                    if (!nkoVar.f()) {
                        j -= j2;
                    } else {
                        throw nkoVar.d(null);
                    }
                } catch (IOException e) {
                    if (nkoVar.f()) {
                        throw nkoVar.d(e);
                    }
                    throw e;
                } finally {
                    nkoVar.f();
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.nlj, java.io.Flushable
    public final void flush() {
        nko nkoVar = this.a;
        nkoVar.e();
        try {
            this.b.flush();
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

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ")";
    }
}
