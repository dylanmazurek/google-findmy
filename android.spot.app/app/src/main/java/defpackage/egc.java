package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class egc implements efx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ egc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.efx
    public final void a(efn efnVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        efnVar.e = jdl.a;
                        efnVar.f = jer.i(this.a);
                        return;
                    }
                    jdl jdlVar = jdl.a;
                    efnVar.g = jdlVar;
                    efnVar.h = jdlVar;
                    efnVar.e = jer.i(this.a);
                    efnVar.f = jdl.a;
                    return;
                }
                efnVar.b = jer.i(((loy) this.a).a);
                return;
            }
            efnVar.a = jer.i(this.a);
            efnVar.e(false);
            efnVar.g(false);
            efnVar.h(false);
            efnVar.i(false);
            return;
        }
        efnVar.h(true);
        efp efpVar = (efp) this.a;
        if (efpVar.r() == 1 && !efpVar.h().g()) {
            efnVar.i = 7;
        }
    }
}
