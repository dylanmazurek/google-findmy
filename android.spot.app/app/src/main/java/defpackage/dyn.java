package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyn implements ewk {
    private final dyo a;
    private final /* synthetic */ int b;

    public dyn(dyo dyoVar, int i) {
        this.b = i;
        this.a = dyoVar;
    }

    @Override // defpackage.ewk
    public final void cx() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                jis jisVar = this.a.c.c;
                lqc lqcVar = null;
                if (jisVar != null && !jisVar.isEmpty()) {
                    lqc a = this.a.g.a();
                    if (a != null) {
                        lqcVar = eyf.f(jisVar, a);
                    }
                    if (lqcVar == null && ((ebf) this.a.d.a()).q()) {
                        ((ebf) this.a.d.a()).s();
                    }
                    this.a.g.h(lqcVar);
                } else {
                    this.a.g.h(null);
                    this.a.h.a();
                }
                this.a.f();
                return;
            }
            this.a.g();
            return;
        }
        this.a.g();
    }
}
