package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cey implements msw, cfa {
    public final cex a;
    private final mnb b;

    public cey() {
        throw null;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        if (this.a.b.compareTo(cew.DESTROYED) <= 0) {
            this.a.c(this);
            mkm.aA(this.b, null);
        }
    }

    @Override // defpackage.msw
    public final mnb b() {
        return this.b;
    }

    public cey(cex cexVar, mnb mnbVar) {
        mnbVar.getClass();
        this.a = cexVar;
        this.b = mnbVar;
        if (cexVar.b == cew.DESTROYED) {
            mkm.aA(mnbVar, null);
        }
    }
}
