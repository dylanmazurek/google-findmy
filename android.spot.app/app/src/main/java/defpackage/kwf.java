package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwf extends mjo {
    private final Object a;
    private kwe b;
    private final kwd c;

    public kwf(kwd kwdVar) {
        super(null);
        this.a = new Object();
        this.c = kwdVar;
    }

    @Override // defpackage.mjo
    public final lyy R() {
        synchronized (this.a) {
            if (this.b != null) {
                return new lyy();
            }
            kwe kweVar = new kwe(this.c);
            this.b = kweVar;
            return kweVar;
        }
    }
}
