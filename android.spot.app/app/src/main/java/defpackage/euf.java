package defpackage;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euf extends cgk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/invitationexplanation/SharingInvitationExplanationViewModel");
    public lqd d;
    public final dxf e;
    public final ihk f;
    public final bym g;
    public final dhx h;
    private final ewg i;
    private final Executor j;
    private jer k = jdl.a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final cfn c = new cfn(eue.a(false));

    public euf(dxf dxfVar, ewg ewgVar, dhx dhxVar, ihk ihkVar, bym bymVar, Executor executor) {
        this.e = dxfVar;
        this.i = ewgVar;
        this.h = dhxVar;
        this.f = ihkVar;
        this.g = bymVar;
        this.j = executor;
    }

    public final jer a() {
        b();
        return eyf.b(this.i.c(), this.d);
    }

    public final void b() {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "ViewModel is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jyz] */
    @Override // defpackage.cgk
    public final void c() {
        if (this.k.g()) {
            this.k.c().cancel(false);
            this.k = jdl.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, jyz] */
    public final void d() {
        lqu lquVar;
        b();
        eue eueVar = (eue) this.c.d();
        eueVar.getClass();
        if (eueVar.c != 1) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/invitationexplanation/SharingInvitationExplanationViewModel", "onExplanationConfirmed", 124, "SharingInvitationExplanationViewModel.java")).r("Explanation can only be confirmed when the explanation is being shown");
            return;
        }
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/invitationexplanation/SharingInvitationExplanationViewModel", "onExplanationConfirmed", 128, "SharingInvitationExplanationViewModel.java")).r("Issuing a sharing invitation...");
        this.e.c(lnb.SHARING_INVITATION_REQUESTED, jdl.a, this.d);
        this.c.l(new eue(2, false, jdl.a));
        AtomicReference atomicReference = new AtomicReference(jdl.a);
        final ihk ihkVar = this.f;
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
        Random random = ihkVar.c;
        kuv kuvVar = ihkVar.g;
        final long nextLong = random.nextLong();
        final ijk k = ijm.k();
        jer i = jer.i(iuu.p(jbx.d(kuvVar.u()).f(new jxd() { // from class: ihi
            @Override // defpackage.jxd
            public final jyz a(Object obj) {
                jer jerVar = (jer) obj;
                hwx.V(jerVar.g(), "Cannot issue a sharing invitation without an owner key");
                jer i2 = jer.i(ijm.f(((ijf) jerVar.c()).b, k.a().e()));
                return ihk.this.f.i(9, kxvVar2, nextLong, i2);
            }
        }, ihkVar.d).e(new jei() { // from class: ihj
            @Override // defpackage.jei
            public final Object a(Object obj) {
                ljh k2 = ije.e.k();
                lim e = iji.e(kxv.this);
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar = k2.b;
                ije ijeVar = (ije) ljnVar;
                e.getClass();
                ijeVar.a |= 1;
                ijeVar.b = e;
                if (!ljnVar.y()) {
                    k2.t();
                }
                ijk ijkVar = k;
                long j = nextLong;
                ljn ljnVar2 = k2.b;
                ije ijeVar2 = (ije) ljnVar2;
                ijeVar2.a |= 2;
                ijeVar2.c = j;
                if (!ljnVar2.y()) {
                    k2.t();
                }
                lim limVar = ijkVar.b;
                ije ijeVar3 = (ije) k2.b;
                limVar.getClass();
                ijeVar3.a |= 4;
                ijeVar3.d = limVar;
                return new ihd(((ije) k2.q()).e());
            }
        }, jxv.a), new ejc(this, atomicReference, 13), this.j));
        this.k = i;
        iuu.q(i.c(), new elj(this, atomicReference, 3), jxv.a);
    }
}
