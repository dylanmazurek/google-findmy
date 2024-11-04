package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejr {
    public final ele a;
    public final ejo b;
    public final cfm c;
    public kyh d;
    public final emx e;
    public final ewf f;
    public final ilv g;
    public final apc h;
    private final mkt i;

    public ejr(ele eleVar, emx emxVar, apc apcVar, ilv ilvVar, ejo ejoVar, ewf ewfVar) {
        eleVar.getClass();
        emxVar.getClass();
        apcVar.getClass();
        ilvVar.getClass();
        ejoVar.getClass();
        ewfVar.getClass();
        this.a = eleVar;
        this.e = emxVar;
        this.h = apcVar;
        this.g = ilvVar;
        this.b = ejoVar;
        this.f = ewfVar;
        this.c = new cfm(mlh.a);
        this.i = new mla(new ctm(this, 11));
        this.d = kyh.DEVICE_COMPONENT_UNSPECIFIED;
    }

    public final cfk a() {
        return (cfk) this.i.a();
    }

    public final kyf b(lqc lqcVar) {
        kyf kyfVar = this.a.a(lqcVar).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyfVar.getClass();
        return kyfVar;
    }

    public final void c(kyh kyhVar) {
        kyhVar.getClass();
        this.d = kyhVar;
        this.c.i(mlh.a);
    }

    public final boolean d(lqc lqcVar) {
        kzc kzcVar = b(lqcVar).d;
        if (kzcVar == null) {
            kzcVar = kzc.c;
        }
        kzcVar.getClass();
        return eku.k(kzcVar);
    }
}
