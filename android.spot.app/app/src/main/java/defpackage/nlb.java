package defpackage;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlb implements nlj {
    private final OutputStream a;
    private final nln b;

    public nlb(OutputStream outputStream, nln nlnVar) {
        this.a = outputStream;
        this.b = nlnVar;
    }

    @Override // defpackage.nlj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.nlj
    public final nln dv() {
        return this.b;
    }

    @Override // defpackage.nlj
    public final void dw(nkp nkpVar, long j) {
        mkm.aM(nkpVar.b, 0L, j);
        while (j > 0) {
            this.b.l();
            nlg nlgVar = nkpVar.a;
            nlgVar.getClass();
            int min = (int) Math.min(j, nlgVar.c - nlgVar.b);
            this.a.write(nlgVar.a, nlgVar.b, min);
            int i = nlgVar.b + min;
            nlgVar.b = i;
            long j2 = min;
            nkpVar.b -= j2;
            j -= j2;
            if (i == nlgVar.c) {
                nkpVar.a = nlgVar.a();
                nlh.b(nlgVar);
            }
        }
    }

    @Override // defpackage.nlj, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    public final String toString() {
        return "sink(" + this.a + ")";
    }
}
