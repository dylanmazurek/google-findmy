package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgb implements Closeable, cfa {
    public final cfz a;
    public boolean b;
    private final String c;

    public cgb(String str, cfz cfzVar) {
        this.c = str;
        this.a = cfzVar;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        if (cevVar == cev.ON_DESTROY) {
            this.b = false;
            cfcVar.N().c(this);
        }
    }

    public final void b(cjy cjyVar, cex cexVar) {
        if (!this.b) {
            this.b = true;
            cexVar.a(this);
            cjyVar.b(this.c, this.a.f);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
