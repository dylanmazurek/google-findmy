package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eui extends cgk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationViewModel");
    public final ewg b;
    public final ele c;
    public final ewk d = new ela(this, 8, null);
    public final cfn e = new cfn(etd.c());
    public final cfn f = new cfn(false);
    public final cfn g = new cfn(jdl.a);
    public lqd h;
    public jyz i;
    public final dxf j;
    public final etb k;
    public final dhx l;
    private final Executor m;
    private final hnu n;

    public eui(dxf dxfVar, ewg ewgVar, dhx dhxVar, etb etbVar, hnu hnuVar, ele eleVar, Executor executor) {
        this.j = dxfVar;
        this.b = ewgVar;
        this.l = dhxVar;
        this.k = etbVar;
        this.n = hnuVar;
        this.c = eleVar;
        this.m = executor;
    }

    public final jer a() {
        d();
        return eyf.b(this.b.c(), this.h);
    }

    public final void b() {
        lqu lquVar;
        d();
        if (this.i != null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationViewModel", "cancelSharing", 145, "PendingSharingApplicationInformationViewModel.java")).r("Sharing application is already being cancelled; ignoring");
            return;
        }
        this.f.l(true);
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationViewModel", "cancelSharing", 149, "PendingSharingApplicationInformationViewModel.java")).r("Cancelling a pending sharing application");
        this.j.c(lnb.SHARING_PENDING_WITHDRAW_REQUESTED, jdl.a, this.h);
        hnu hnuVar = this.n;
        lqd lqdVar = this.h;
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        this.i = jbx.d(ivc.F(hnuVar.g(kxvVar))).e(new ett(this, 12), this.m).a(Throwable.class, new ett(this, 13), this.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        this.b.n(this.d);
        this.k.d(this.d);
        jyz jyzVar = this.i;
        if (jyzVar != null) {
            jyzVar.cancel(false);
            this.i = null;
        }
    }

    public final void d() {
        boolean z;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "ViewModel is not initialized");
    }
}
