package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgj implements Runnable {
    private final cev a;
    private boolean b;
    private final cex c;

    public cgj(cex cexVar, cev cevVar) {
        cevVar.getClass();
        this.c = cexVar;
        this.a = cevVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b) {
            this.c.b(this.a);
            this.b = true;
        }
    }
}
