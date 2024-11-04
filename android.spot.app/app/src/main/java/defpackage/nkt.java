package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nkt implements nlj {
    public final nlj b;

    public nkt(nlj nljVar) {
        this.b = nljVar;
    }

    @Override // defpackage.nlj, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.nlj
    public final nln dv() {
        return this.b.dv();
    }

    @Override // defpackage.nlj
    public void dw(nkp nkpVar, long j) {
        throw null;
    }

    @Override // defpackage.nlj, java.io.Flushable
    public void flush() {
        this.b.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
