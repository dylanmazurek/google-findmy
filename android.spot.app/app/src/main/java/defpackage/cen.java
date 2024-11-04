package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cen implements cfa {
    private final cem a;
    private final cfa b;

    public cen(cem cemVar, cfa cfaVar) {
        this.a = cemVar;
        this.b = cfaVar;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        switch (cevVar) {
            case ON_CREATE:
                this.a.b();
                break;
            case ON_START:
                this.a.cT(cfcVar);
                break;
            case ON_RESUME:
                this.a.e();
                break;
            case ON_PAUSE:
                this.a.d();
                break;
            case ON_STOP:
                this.a.f();
                break;
            case ON_DESTROY:
                this.a.c();
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        cfa cfaVar = this.b;
        if (cfaVar != null) {
            cfaVar.a(cfcVar, cevVar);
        }
    }
}
