package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eop implements eib, lrz, ewk {
    public final cfm a;
    private final lqd b;
    private final ewg c;
    private final elk d;
    private final ele e;
    private final ewf f;

    public eop(cfz cfzVar, lra lraVar, ewf ewfVar, ewg ewgVar, elk elkVar, ele eleVar) {
        lqd h = eyf.h(cfzVar);
        this.b = h;
        this.f = ewfVar;
        this.c = ewgVar;
        this.d = elkVar;
        this.e = eleVar;
        cfk a = elkVar.a(h);
        cfm cfmVar = new cfm(c((Boolean) a.d()));
        this.a = cfmVar;
        cfmVar.o(a, new eqn(this, a, 1));
        ewfVar.b(this);
        lraVar.a(this);
    }

    @Override // defpackage.eib
    public final cfk a() {
        return this.a;
    }

    @Override // defpackage.lrz
    public final void b() {
        this.f.f(this);
    }

    public final ehx c(Boolean bool) {
        String trim;
        lqc lqcVar = (lqc) eyf.b(this.c.c(), this.b).e(lqc.j);
        kyf kyfVar = this.e.a(lqcVar).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        gip b = ehx.b();
        b.b = lqcVar;
        jnk jnkVar = eku.a;
        if (!kyfVar.j.isEmpty()) {
            trim = kyfVar.j;
        } else {
            trim = (kyfVar.h + " " + kyfVar.i).trim();
        }
        b.i(trim);
        lln llnVar = kyfVar.q;
        if (llnVar == null) {
            llnVar = lln.c;
        }
        b.j(llnVar.a);
        b.h(eku.m(kyfVar));
        boolean z = false;
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        b.k(z);
        return b.g();
    }

    @Override // defpackage.ewk
    public final void cx() {
        this.a.i(c((Boolean) this.d.a(this.b).d()));
    }
}
