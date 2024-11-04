package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfo implements cem {
    final njz a;
    private final hba b;

    public hfo(hcd hcdVar, hjy hjyVar, hfn hfnVar) {
        final njz njzVar = new njz(hfnVar);
        this.a = njzVar;
        String str = hba.a;
        this.b = new hba(hcdVar, new haz() { // from class: hay
            @Override // defpackage.haz
            public final jyz a(jis jisVar) {
                return ivc.E(jis.o(jisVar));
            }
        }, hjyVar);
    }

    @Override // defpackage.cem
    public final void cT(cfc cfcVar) {
        this.b.cT(cfcVar);
        this.b.h();
    }

    @Override // defpackage.cem
    public final void f() {
        this.b.g();
    }

    @Override // defpackage.cem
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void e() {
    }
}
