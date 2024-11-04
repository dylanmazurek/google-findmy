package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekx extends cgk {
    private static final jnk k = jnk.l("com/google/android/apps/adm/integrations/spot/SpotDeviceViewModel");
    public final ele a;
    public final lqd b;
    public final cfk c;
    public final cfm d;
    public kyh e;
    public final cfk f;
    public final cfk g;
    public final ewf h;
    public final ilv i;
    public final apc j;
    private final cfn l;
    private final mnw m;
    private final ejr n;

    public ekx(ejr ejrVar, ewf ewfVar, apc apcVar, ele eleVar, ilv ilvVar, fma fmaVar, cfn cfnVar, eim eimVar, cfz cfzVar) {
        kyh kyhVar;
        ejrVar.getClass();
        ewfVar.getClass();
        apcVar.getClass();
        eleVar.getClass();
        ilvVar.getClass();
        fmaVar.getClass();
        cfnVar.getClass();
        eimVar.getClass();
        cfzVar.getClass();
        this.n = ejrVar;
        this.h = ewfVar;
        this.j = apcVar;
        this.a = eleVar;
        this.i = ilvVar;
        this.l = cfnVar;
        lqd h = eyf.h(cfzVar);
        h.getClass();
        this.b = h;
        this.c = ejrVar.a();
        cfm cfmVar = new cfm(mlh.a);
        this.d = cfmVar;
        ctm ctmVar = new ctm(this, 13);
        this.m = ctmVar;
        lqc a = ewfVar.a();
        if (a == null) {
            ((jni) k.g().j("com/google/android/apps/adm/integrations/spot/SpotDeviceViewModel", "getDefaultSelectedComponent", 172, "SpotDeviceViewModel.kt")).r("BUG: Current device is unexpectedly null");
            kyhVar = kyh.DEVICE_COMPONENT_UNSPECIFIED;
        } else {
            kyf kyfVar = eleVar.a(a).b;
            kyfVar = kyfVar == null ? kyf.r : kyfVar;
            kyfVar.getClass();
            jnk jnkVar = eku.a;
            kyg kygVar = kyfVar.g;
            int I = a.I((kygVar == null ? kyg.d : kygVar).c);
            int i = (I == 0 ? 1 : I) - 2;
            if (i != 2) {
                if (i != 3) {
                    kyhVar = kyh.DEVICE_COMPONENT_UNSPECIFIED;
                } else {
                    kyhVar = kyh.DEVICE_COMPONENT_CASE;
                }
            } else {
                kyhVar = kyh.DEVICE_COMPONENT_RIGHT;
            }
            kyhVar.getClass();
        }
        this.e = kyhVar;
        ilvVar.g(new dym(ctmVar, 20, null));
        ewfVar.b(new ela(ctmVar, 1));
        cfmVar.o((cfk) apcVar.b, new edk(new eeo(this, 6), 4));
        ijp.a(eimVar.d(), "Failed to update FMDN status", new Object[0]);
        ejrVar.c(this.e);
        cfnVar.l(this.e);
        cfk d = btv.d(btv.e(cfmVar, new eeo(this, 8)));
        this.f = d;
        this.g = btv.d(btv.e(d, new eeo(this, 7)));
    }

    public final void a(kyh kyhVar) {
        kyhVar.getClass();
        this.e = kyhVar;
        this.d.l(mlh.a);
        this.n.c(kyhVar);
        this.l.l(kyhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        byte[] bArr = null;
        this.i.l(new dym(this.m, 18, bArr));
        this.h.f(new dym(this.m, 19, bArr));
        this.n.c(kyh.DEVICE_COMPONENT_UNSPECIFIED);
        this.l.l(kyh.DEVICE_COMPONENT_UNSPECIFIED);
    }
}
