package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nku implements nll {
    public final nll b;

    public nku(nll nllVar) {
        this.b = nllVar;
    }

    @Override // defpackage.nll
    public long a(nkp nkpVar, long j) {
        throw null;
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.nll
    public final nln dv() {
        return this.b.dv();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
