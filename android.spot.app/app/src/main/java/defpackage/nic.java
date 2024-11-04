package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nic implements nlj {
    final /* synthetic */ nie a;
    private final nkv b;
    private boolean c;

    public nic(nie nieVar) {
        this.a = nieVar;
        this.b = new nkv(nieVar.d.dv());
    }

    @Override // defpackage.nlj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
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
            ngt.y(nkpVar.b, j);
            this.a.d.dw(nkpVar, j);
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nlj, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }
}
