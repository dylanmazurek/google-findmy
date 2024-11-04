package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etz extends cgk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel");
    public final cfn b = new cfn(ety.WAITING_FOR_USER_SELECTION);
    public final cfn c = new cfn(etd.c());
    public lqd d;
    public String e;
    public jyz f;
    public jyz g;
    public final ihk h;
    public final elo i;
    public final dhx j;
    private final ewg k;
    private final Executor l;
    private final dxf m;
    private final hnu n;

    public etz(dxf dxfVar, ewg ewgVar, dhx dhxVar, ihk ihkVar, hnu hnuVar, elo eloVar, Executor executor) {
        this.m = dxfVar;
        this.k = ewgVar;
        this.j = dhxVar;
        this.h = ihkVar;
        this.n = hnuVar;
        this.i = eloVar;
        this.l = executor;
    }

    public final jer a() {
        b();
        return eyf.b(this.k.c(), this.d);
    }

    public final void b() {
        boolean z = false;
        if (this.d != null && this.e != null) {
            z = true;
        }
        hwx.V(z, "ViewModel is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        jyz jyzVar = this.f;
        if (jyzVar != null) {
            jyzVar.cancel(false);
            this.f = null;
        }
        jyz jyzVar2 = this.g;
        if (jyzVar2 != null) {
            jyzVar2.cancel(false);
            this.g = null;
        }
    }

    public final void d(lnb lnbVar) {
        this.m.c(lnbVar, jdl.a, this.d);
    }

    public final void e() {
        lqu lquVar;
        b();
        if (this.g != null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "onApproveSharingApplication", 127, "SharingApplicationApprovalViewModel.java")).r("Sharing application approved while operation is unexpectedly in progress");
            return;
        }
        this.b.l(ety.APPROVING_APPLICATION);
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "onApproveSharingApplication", 132, "SharingApplicationApprovalViewModel.java")).r("Approving a sharing application...");
        d(lnb.SHARING_APPLICATION_APPROVAL_APPROVE_REQUESTED);
        final ihk ihkVar = this.h;
        lqd lqdVar = this.d;
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        final kxv kxvVar2 = kxvVar;
        final String str = this.e;
        hnu hnuVar = ihkVar.f;
        final jyz u = ihkVar.g.u();
        final jyz f = hnuVar.f(kxvVar2);
        this.g = jbx.d(ivc.F(iuu.F(u, f).h(new jxc() { // from class: ihf
            @Override // defpackage.jxc
            public final jyz a() {
                jer jerVar = (jer) ivc.M(u);
                hwx.V(jerVar.g(), "Cannot approve a sharing application without an owner key");
                lae laeVar = (lae) ivc.M(f);
                String str2 = str;
                kzq e = ihk.e(laeVar, str2);
                kyf kyfVar = laeVar.b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kyq kyqVar = kyfVar.f;
                if (kyqVar == null) {
                    kyqVar = kyq.g;
                }
                ihk ihkVar2 = ihk.this;
                iiy t = kuv.t(kyqVar, (ijf) jerVar.c());
                ijk b = ihkVar2.b(e, (ijf) jerVar.c(), true);
                lim limVar = b.a;
                kzr kzrVar = e.f;
                if (kzrVar == null) {
                    kzrVar = kzr.c;
                }
                lim g = ijm.g(limVar, kzrVar.b);
                lim limVar2 = b.b;
                kzr kzrVar2 = e.f;
                if (kzrVar2 == null) {
                    kzrVar2 = kzr.c;
                }
                lim i = ijm.i(limVar2.r(kzrVar2.b).r(g));
                ljh k = kyq.g.k();
                if (!k.b.y()) {
                    k.t();
                }
                kyq kyqVar2 = (kyq) k.b;
                kyqVar2.b = 10;
                kyqVar2.c = true;
                lim f2 = ijm.f(i, t.a);
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar = k.b;
                f2.getClass();
                ((kyq) ljnVar).d = f2;
                lln llnVar = t.c;
                if (!ljnVar.y()) {
                    k.t();
                }
                kyq kyqVar3 = (kyq) k.b;
                llnVar.getClass();
                kyqVar3.f = llnVar;
                kyqVar3.a = 1 | kyqVar3.a;
                if (t.b.g()) {
                    lim f3 = ijm.f(i, (lim) t.b.c());
                    if (!k.b.y()) {
                        k.t();
                    }
                    kyq kyqVar4 = (kyq) k.b;
                    f3.getClass();
                    kyqVar4.e = f3;
                }
                kxv kxvVar3 = kxvVar2;
                hnu hnuVar2 = ihkVar2.f;
                kyq kyqVar5 = (kyq) k.q();
                jer i2 = jer.i(str2);
                jer i3 = jer.i(kyqVar5);
                jdl jdlVar = jdl.a;
                return hnuVar2.k(12, kxvVar3, i2, i3, jdlVar, jdlVar);
            }
        }, ihkVar.d))).e(new ett(this, 6), this.l).a(Throwable.class, new ett(this, 7), jxv.a);
    }

    public final void f() {
        lqu lquVar;
        b();
        if (this.g != null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "onDeclineSharingApplication", 173, "SharingApplicationApprovalViewModel.java")).r("Sharing application declined while operation is unexpectedly in progress");
            return;
        }
        this.b.l(ety.DECLINING_APPLICATION);
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "onDeclineSharingApplication", 178, "SharingApplicationApprovalViewModel.java")).r("Declining a sharing application...");
        d(lnb.SHARING_APPLICATION_APPROVAL_DECLINE_REQUESTED);
        hnu hnuVar = this.n;
        lqd lqdVar = this.d;
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        this.g = jbx.d(ivc.F(hnuVar.h(kxvVar, this.e))).e(new ett(this, 10), this.l).a(Throwable.class, new ett(this, 11), jxv.a);
    }
}
