package defpackage;

import j$.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejv implements eht {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/SpotDeepLinkDeviceTypeHandler");
    private final Executor b;
    private final Executor c;
    private final ewc d;
    private final ewf e;
    private final ihk f;
    private final kuv g;

    public ejv(ewf ewfVar, ihk ihkVar, ewc ewcVar, kuv kuvVar, Executor executor, Executor executor2) {
        this.e = ewfVar;
        this.f = ihkVar;
        this.d = ewcVar;
        this.g = kuvVar;
        this.b = executor;
        this.c = executor2;
    }

    @Override // defpackage.eht
    public final jyz a(lor lorVar) {
        jis jisVar = this.d.c;
        lim ao = hzc.ao(lorVar);
        if (ao != null && jisVar != null) {
            return b(ao, (jis) Collection.EL.stream(jisVar).filter(new eju(0)).collect(jgr.a), 0);
        }
        return ivc.E(jdl.a);
    }

    public final jyz b(lim limVar, jis jisVar, int i) {
        lpz lpzVar;
        if (i >= jisVar.size()) {
            return ivc.E(jdl.a);
        }
        lqc lqcVar = (lqc) jisVar.get(i);
        kuv kuvVar = this.g;
        if (lqcVar.b == 4) {
            lpzVar = (lpz) lqcVar.c;
        } else {
            lpzVar = lpz.e;
        }
        kyf kyfVar = lpzVar.b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyq kyqVar = kyfVar.f;
        if (kyqVar == null) {
            kyqVar = kyq.g;
        }
        return iuu.p(kuvVar.s(kyqVar), new enl(this, limVar, lqcVar, jisVar, i, 1), this.c);
    }

    @Override // defpackage.eht
    public final void c(lor lorVar, ebf ebfVar) {
        jer jerVar;
        lqu lquVar;
        if (!"token".equals(lorVar.b.get("sharingInvitation"))) {
            jerVar = jdl.a;
        } else {
            String str = lorVar.c;
            if (str == null) {
                ((jni) ((jni) etc.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/SharingInvitationUtils", "decodeInvitationTokenFromDeepLink", 74, "SharingInvitationUtils.java")).r("Missing sharing invitation token in deep link");
                jerVar = jdl.a;
            } else {
                try {
                    jerVar = jer.i(new ihd(lim.t(jtf.e.l(str))));
                } catch (IllegalArgumentException e) {
                    ((jni) ((jni) ((jni) etc.a.f()).i(e)).j("com/google/android/apps/adm/integrations/spot/sharing/SharingInvitationUtils", "decodeInvitationTokenFromDeepLink", 'P', "SharingInvitationUtils.java")).r("Failed to parse sharing invitation token from deep link");
                    jerVar = jdl.a;
                }
            }
        }
        if (jerVar.g()) {
            jnk jnkVar = a;
            ((jni) ((jni) jnkVar.c()).j("com/google/android/apps/adm/integrations/spot/SpotDeepLinkDeviceTypeHandler", "handleDevicelessDeepLink", 64, "SpotDeepLinkDeviceTypeHandler.java")).r("Handling sharing invitation deep link");
            try {
                kxv d = this.f.d((ihd) jerVar.c());
                jis jisVar = this.d.c;
                if (jisVar == null) {
                    ((jni) ((jni) jnkVar.g()).j("com/google/android/apps/adm/integrations/spot/SpotDeepLinkDeviceTypeHandler", "handleDevicelessDeepLink", 76, "SpotDeepLinkDeviceTypeHandler.java")).r("List of devices is unexpectedly null while handling deviceless deep link");
                    return;
                }
                int size = jisVar.size();
                int i = 0;
                while (i < size) {
                    lqc lqcVar = (lqc) jisVar.get(i);
                    lqd lqdVar = lqcVar.d;
                    if (lqdVar == null) {
                        lqdVar = lqd.d;
                    }
                    if (lqdVar.a == 3) {
                        lquVar = (lqu) lqdVar.b;
                    } else {
                        lquVar = lqu.c;
                    }
                    kxv kxvVar = lquVar.b;
                    if (kxvVar == null) {
                        kxvVar = kxv.b;
                    }
                    i++;
                    if (kxvVar.equals(d)) {
                        ((jni) ((jni) a.c()).j("com/google/android/apps/adm/integrations/spot/SpotDeepLinkDeviceTypeHandler", "handleDevicelessDeepLink", 86, "SpotDeepLinkDeviceTypeHandler.java")).r("Found an invitation link to an owned device");
                        this.e.h(lqcVar);
                        return;
                    }
                }
                this.b.execute(new cui(ebfVar, jerVar, 11, (byte[]) null));
                return;
            } catch (ihe e2) {
                ((jni) ((jni) ((jni) a.f()).i(e2)).j("com/google/android/apps/adm/integrations/spot/SpotDeepLinkDeviceTypeHandler", "handleDevicelessDeepLink", 'F', "SpotDeepLinkDeviceTypeHandler.java")).r("Failed processing sharing invitation deep link");
                return;
            }
        }
        ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/SpotDeepLinkDeviceTypeHandler", "handleDevicelessDeepLink", 98, "SpotDeepLinkDeviceTypeHandler.java")).r("Ignoring unhandled deep link.");
    }
}
