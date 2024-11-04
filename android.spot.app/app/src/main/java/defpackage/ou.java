package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ou implements cfa, nv {
    final /* synthetic */ ox a;
    private final cex b;
    private final op c;
    private nv d;

    public ou(ox oxVar, cex cexVar, op opVar) {
        cexVar.getClass();
        this.a = oxVar;
        this.b = cexVar;
        this.c = opVar;
        cexVar.a(this);
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        if (cevVar == cev.ON_START) {
            this.d = this.a.a(this.c);
            return;
        }
        if (cevVar == cev.ON_STOP) {
            nv nvVar = this.d;
            if (nvVar != null) {
                nvVar.b();
                return;
            }
            return;
        }
        if (cevVar == cev.ON_DESTROY) {
            b();
        }
    }

    @Override // defpackage.nv
    public final void b() {
        this.b.c(this);
        this.c.g(this);
        nv nvVar = this.d;
        if (nvVar != null) {
            nvVar.b();
        }
        this.d = null;
    }
}
