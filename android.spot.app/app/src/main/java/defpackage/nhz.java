package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhz implements nlj {
    final /* synthetic */ nie a;
    private final nkv b;
    private boolean c;

    public nhz(nie nieVar) {
        this.a = nieVar;
        this.b = new nkv(nieVar.d.dv());
    }

    @Override // defpackage.nlj, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.d.L("0\r\n\r\n");
        nie.l(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.nlj
    public final nln dv() {
        return this.b;
    }

    @Override // defpackage.nlj
    public final void dw(nkp nkpVar, long j) {
        if (!this.c) {
            nld nldVar = (nld) this.a.d;
            if (!nldVar.c) {
                nldVar.b.J(j);
                nldVar.c();
                this.a.d.L("\r\n");
                this.a.d.dw(nkpVar, j);
                this.a.d.L("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nlj, java.io.Flushable
    public final synchronized void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }
}
