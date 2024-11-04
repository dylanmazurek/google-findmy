package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nid extends nhy {
    private boolean c;

    public nid(nie nieVar) {
        super(nieVar);
    }

    @Override // defpackage.nhy, defpackage.nll
    public final long a(nkp nkpVar, long j) {
        if (!this.a) {
            if (this.c) {
                return -1L;
            }
            long a = super.a(nkpVar, 8192L);
            if (a == -1) {
                this.c = true;
                c();
                return -1L;
            }
            return a;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            c();
        }
        d();
    }
}
