package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mct implements mif {
    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        if (f() >= i) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // defpackage.mif
    public void b() {
        throw null;
    }

    @Override // defpackage.mif
    public void c() {
        throw null;
    }

    @Override // defpackage.mif
    public boolean d() {
        throw null;
    }

    @Override // defpackage.mif, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
