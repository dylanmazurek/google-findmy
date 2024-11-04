package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ela implements ewk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ela(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ewk
    public final void cx() {
        Object obj;
        switch (this.b) {
            case 0:
                ((elc) this.a).f();
                return;
            case 1:
                ?? r0 = this.a;
                r0.getClass();
                r0.a();
                return;
            case 2:
                Object obj2 = this.a;
                ((elh) obj2).b.execute(new dzw(obj2, 7));
                return;
            case 3:
                elq elqVar = (elq) this.a;
                cfn cfnVar = elqVar.b;
                cfnVar.getClass();
                cfnVar.l(elqVar.c());
                return;
            case 4:
                ilv ilvVar = (ilv) this.a;
                boolean p = ilvVar.p();
                jer e = ilvVar.e();
                if (p && e.g() && !ilvVar.f().g()) {
                    ilvVar.c((lqc) e.c());
                }
                Iterator it = ilvVar.b.iterator();
                while (it.hasNext()) {
                    ((buc) it.next()).a(Boolean.valueOf(p));
                }
                ((dhx) ilvVar.a).i();
                return;
            case 5:
                Object obj3 = this.a;
                synchronized (((emz) obj3).h) {
                    if (((emz) obj3).g) {
                        ((emz) obj3).a();
                    }
                }
                return;
            case 6:
                ((eod) this.a).d();
                eod eodVar = (eod) this.a;
                eodVar.g = eyf.b(eodVar.b.c(), eodVar.f);
                if (!((eod) this.a).g.g()) {
                    ((jni) ((jni) eod.a.f()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel$DevicesStateListener", "onStateChanged", 415, "SharingManagementViewModel.java")).r("Device is missing in device list");
                    return;
                } else {
                    eod eodVar2 = (eod) this.a;
                    eodVar2.l((ejn) eodVar2.d.d());
                    return;
                }
            case 7:
                ((etb) this.a).c();
                return;
            case 8:
                ((eui) this.a).d();
                jer a = ((eui) this.a).a();
                if (a.g()) {
                    Object obj4 = this.a;
                    kyf kyfVar = ((eui) obj4).c.a((lqc) a.c()).b;
                    if (kyfVar == null) {
                        kyfVar = kyf.r;
                    }
                    if (!eku.l(kyfVar)) {
                        ((eui) this.a).g.i(a);
                        return;
                    }
                }
                eui euiVar = (eui) this.a;
                euiVar.e.i((etd) euiVar.k.a().getOrDefault(euiVar.h, etd.a()));
                return;
            case 9:
                ((ewf) this.a).j();
                return;
            default:
                Object obj5 = this.a;
                obj = ((ewh) obj5).a.get();
                ((cfk) obj5).i(obj);
                return;
        }
    }

    public ela(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
