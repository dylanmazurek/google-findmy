package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.adm.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.findmydevice.spot.SyncOwnerKeyRequest;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etu extends cgk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel");
    public final ewg b;
    public final cfn c;
    public ihd d;
    public lqd e;
    public jer f;
    jer g;
    jer h;
    public final ihk i;
    private final Executor j;
    private final dxf k;
    private final dhx l;

    public etu(dxf dxfVar, ewg ewgVar, dhx dhxVar, ihk ihkVar, Executor executor) {
        jdl jdlVar = jdl.a;
        this.f = jdlVar;
        this.g = jdlVar;
        this.h = jdlVar;
        this.k = dxfVar;
        this.b = ewgVar;
        this.l = dhxVar;
        this.i = ihkVar;
        this.j = executor;
        this.c = new cfn(new ets(1, jdlVar, jdlVar));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [jfe, java.lang.Object] */
    public final void a(etr etrVar) {
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "applyToShareDevice", 205, "SharingApplicationViewModel.java")).r("Applying to share a device");
        d(lnb.SHARING_APPLICATION_USER_APPLY_REQUESTED);
        ihk ihkVar = this.i;
        ihd ihdVar = this.d;
        kuv kuvVar = ihkVar.h;
        jer jerVar = (jer) kuvVar.a.a();
        SyncOwnerKeyRequest syncOwnerKeyRequest = new SyncOwnerKeyRequest();
        syncOwnerKeyRequest.a = (Account) jerVar.c();
        syncOwnerKeyRequest.b = 3;
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fnv.a};
        fjyVar.a = new fep(syncOwnerKeyRequest, 9);
        fjyVar.c = 33315;
        this.h = jer.i(jbx.d(jbx.d(jbx.d(jbx.d(fzo.b(((fhq) kuvVar.b).f(fjyVar.a()))).e(new ihq(4), jxv.a)).f(new ifl(ihkVar, 6), ihkVar.d).b(Throwable.class, new igw(3), ihkVar.d)).f(new ibz(ihkVar, ihdVar, 7, null), ihkVar.d).f(new igw(2), ihkVar.d)).e(new ett(this, 3), this.j).b(fhy.class, new ejc(this, etrVar, 12, null), jxv.a).a(igz.class, new ett(this, 4), jxv.a).a(Throwable.class, new ett(this, 5), jxv.a));
    }

    public final void b() {
        boolean z = false;
        if (this.d != null && this.f.g()) {
            z = true;
        }
        hwx.V(z, "ViewModel is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, jyz] */
    @Override // defpackage.cgk
    public final void c() {
        if (this.g.g()) {
            this.g.c().cancel(false);
            this.g = jdl.a;
        }
        if (this.h.g()) {
            this.h.c().cancel(false);
            this.h = jdl.a;
        }
    }

    public final void d(lnb lnbVar) {
        this.k.c(lnbVar, this.f, this.e);
    }

    public final void e() {
        ets etsVar = (ets) this.c.d();
        etsVar.getClass();
        jer jerVar = etsVar.a;
        if (!jerVar.g()) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "onFailedApplying", 336, "SharingApplicationViewModel.java")).r("Unexpectedly failed applying without device details");
            return;
        }
        this.c.i(ets.c((etr) jerVar.c()));
        Bundle bundle = new Bundle();
        bundle.putString("SharingApplicationViewModelTryAgain", "FailedApplying");
        dhx dhxVar = this.l;
        exu a2 = evj.a();
        a2.b = evc.a;
        dhxVar.l(R.string.sharing_application_accepting_failure, bundle, a2.e());
    }
}
