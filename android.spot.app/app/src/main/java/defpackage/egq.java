package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egq implements eib, lrz, ewk {
    private final lqd a;
    private final ewg b;
    private final cfn c = new cfn(c());
    private final ewf d;

    public egq(cfz cfzVar, lra lraVar, ewf ewfVar, ewg ewgVar) {
        this.a = eyf.h(cfzVar);
        this.d = ewfVar;
        this.b = ewgVar;
        ewfVar.b(this);
        lraVar.a(this);
    }

    private final ehx c() {
        lpt lptVar;
        lqc lqcVar = (lqc) eyf.b(this.b.c(), this.a).e(lqc.j);
        if (lqcVar.b == 3) {
            lptVar = (lpt) lqcVar.c;
        } else {
            lptVar = lpt.C;
        }
        gip b = ehx.b();
        b.b = lqcVar;
        b.i(lptVar.d);
        b.c = jer.i(lptVar.g);
        lln llnVar = lptVar.c;
        if (llnVar == null) {
            llnVar = lln.c;
        }
        b.j(llnVar.a);
        b.h(true);
        return b.g();
    }

    @Override // defpackage.eib
    public final cfk a() {
        return this.c;
    }

    @Override // defpackage.lrz
    public final void b() {
        this.d.f(this);
    }

    @Override // defpackage.ewk
    public final void cx() {
        this.c.i(c());
    }
}
