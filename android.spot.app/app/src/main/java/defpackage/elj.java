package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.adm.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elj implements jyj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public elj(eei eeiVar, lqd lqdVar, int i) {
        this.c = i;
        this.b = eeiVar;
        this.a = lqdVar;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        lnb lnbVar;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((kvi) this.b).c = true;
                            ((mjo) this.a).a(mca.b(th), new mbc());
                            return;
                        }
                        ((hgz) this.a).a();
                        return;
                    }
                    ((jni) ((jni) ((jni) euf.a.f()).i(th)).j("com/google/android/apps/adm/integrations/spot/sharing/invitationexplanation/SharingInvitationExplanationViewModel$1", "onFailure", (char) 170, "SharingInvitationExplanationViewModel.java")).r("Failed issuing a device sharing invitation");
                    jer jerVar = (jer) ((AtomicReference) this.a).get();
                    if (jerVar.g()) {
                        lnbVar = lnb.SHARING_INVITATION_LINK_GENERATION_FAILURE;
                    } else {
                        lnbVar = lnb.SHARING_INVITATION_FAILURE;
                    }
                    euf eufVar = (euf) this.b;
                    eufVar.e.c(lnbVar, jerVar, eufVar.d);
                    euf eufVar2 = (euf) this.b;
                    eufVar2.c.i(eue.a(eufVar2.b.get()));
                    Bundle bundle = new Bundle();
                    bundle.putString("SharingInvitationExplanationViewModelTryAgain", "FailedToIssueSharingInvitation");
                    Object obj = this.b;
                    exu a = evj.a();
                    a.b = evc.a;
                    ((euf) obj).h.l(R.string.sharing_invitation_creation_failure, bundle, a.e());
                    return;
                }
                ((jni) ((jni) ((jni) emt.a.f()).i(th)).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothProximityImpl$1", "onFailure", (char) 185, "BluetoothProximityImpl.java")).r("Failed updating device in proximity");
                return;
            }
            th.getClass();
            ((jni) ((jni) eei.a.f()).i(th).j("com/google/android/apps/adm/integrations/accessory/DeleteHandler$delete$1", "onFailure", 47, "DeleteHandler.kt")).r("Failed to delete accessory");
            ((eei) this.b).e.m(R.string.accessories_remove_device_failure);
            return;
        }
        ((jni) ((jni) ((jni) elk.a.f()).i(th)).j("com/google/android/apps/adm/integrations/spot/SpotRenameDeviceHandler$1", "onFailure", (char) 134, "SpotRenameDeviceHandler.java")).r("Failed renaming device");
        Object obj2 = this.a;
        ((elk) this.b).b((lqc) obj2, jdl.a);
    }

    /* JADX WARN: Type inference failed for: r7v30, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.jyj
    public final /* synthetic */ void b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            lyv lyvVar = (lyv) obj;
                            try {
                                Object obj2 = this.b;
                                ((kvi) obj2).b = lyvVar;
                                Iterator it = ((kvi) obj2).a.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            } catch (Throwable th) {
                                a(th);
                                return;
                            }
                        }
                        if (((Boolean) obj).booleanValue()) {
                            ((hgz) this.a).b.a.onClick((View) this.b);
                        }
                        ((hgz) this.a).a();
                        return;
                    }
                    ((jni) ((jni) euf.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/invitationexplanation/SharingInvitationExplanationViewModel$1", "onSuccess", 162, "SharingInvitationExplanationViewModel.java")).r("Successfully issued a device sharing invitation");
                    Object obj3 = this.a;
                    lnb lnbVar = lnb.SHARING_INVITATION_SUCCESS;
                    jer jerVar = (jer) ((AtomicReference) obj3).get();
                    euf eufVar = (euf) this.b;
                    eufVar.e.c(lnbVar, jerVar, eufVar.d);
                    ((euf) this.b).c.i(new eue(3, false, jer.i((String) obj)));
                    return;
                }
                if (!((emt) this.b).c.o((lqd) this.a)) {
                    return;
                }
                ((emt) this.b).c(r7.e.j() + lua.d());
                return;
            }
            ((eei) this.b).b.k((lqd) this.a);
            ((jni) eei.a.e().j("com/google/android/apps/adm/integrations/accessory/DeleteHandler$delete$1", "onSuccess", 40, "DeleteHandler.kt")).r("Accessory removed");
            ((eei) this.b).e.m(R.string.accessories_remove_device_success);
            return;
        }
        ((elk) this.b).b((lqc) this.a, (jer) obj);
    }

    public elj(hgz hgzVar, View view, int i) {
        this.c = i;
        this.b = view;
        this.a = hgzVar;
    }

    public elj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
