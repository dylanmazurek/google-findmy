package defpackage;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eev {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/AndroidDeviceActionHelper");
    private final ewg b;
    private final efy c;
    private final ees d;
    private final ehm e;
    private final elo f;
    private final dxf g;
    private final ebf h;
    private final bym i;
    private final dhx j;

    public eev(ebf ebfVar, ees eesVar, ehm ehmVar, elo eloVar, ewg ewgVar, dxf dxfVar, efy efyVar, bym bymVar, dhx dhxVar) {
        this.h = ebfVar;
        this.e = ehmVar;
        this.d = eesVar;
        this.f = eloVar;
        this.b = ewgVar;
        this.g = dxfVar;
        this.c = efyVar;
        this.i = bymVar;
        this.j = dhxVar;
    }

    private final lqc b(lqd lqdVar) {
        jer b = eyf.b(this.b.c(), lqdVar);
        if (!b.g()) {
            ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/AndroidDeviceActionHelper", "getDevice", 219, "AndroidDeviceActionHelper.java")).r("No device found.");
            return lqc.j;
        }
        return (lqc) b.c();
    }

    private final void c(lqd lqdVar) {
        this.g.c(lnb.NAVIGATE_REQUESTED, jdl.a, lqdVar);
        efp a2 = this.c.a(lqdVar);
        a2.getClass();
        jer h = a2.h();
        if (!h.g()) {
            ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/AndroidDeviceActionHelper", "onNavigationRequested", 121, "AndroidDeviceActionHelper.java")).r("Unexpected NAVIGATE action without location");
            return;
        }
        lnr lnrVar = ((lps) h.c()).b;
        if (lnrVar == null) {
            lnrVar = lnr.c;
        }
        try {
            this.h.a.startActivity(fma.bK(lnrVar.a, lnrVar.b));
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/integrations/android/AndroidDeviceActionHelper", "onNavigationRequested", (char) 131, "AndroidDeviceActionHelper.java")).r("Could not find an appropriate activity for navigation");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dyj dyjVar, lqd lqdVar) {
        jnk jnkVar = a;
        ((jni) ((jni) jnkVar.e()).j("com/google/android/apps/adm/integrations/android/AndroidDeviceActionHelper", "onActionRequested", 70, "AndroidDeviceActionHelper.java")).u("[FMD] Action requested: %s", dyjVar);
        switch (dyjVar) {
            case LOCATE:
                this.d.a(lqdVar, lpk.ANDROID_LOCATE);
                return;
            case DEVICE_INFO:
                lqf b = lqf.b(lqdVar.c);
                if (b == null) {
                    b = lqf.UNRECOGNIZED;
                }
                if (b == lqf.SUPERVISED_ANDROID_DEVICE) {
                    this.e.a(b(lqdVar));
                    return;
                } else {
                    this.h.i(lqdVar);
                    return;
                }
            case MAKE_SOUND:
                if (!bsf.f(b(lqdVar))) {
                    if (!ltu.e() && !ltu.g()) {
                        this.h.l(ecw.d(lqdVar));
                    } else {
                        this.j.m(R.string.ring_requested);
                    }
                    this.d.a(lqdVar, lpk.ANDROID_MAKE_SOUND);
                    return;
                }
                this.f.a(lqdVar, kyh.DEVICE_COMPONENT_UNSPECIFIED, this.h);
                return;
            case STOP_SOUND:
                ((jni) ((jni) jnkVar.f()).j("com/google/android/apps/adm/integrations/android/AndroidDeviceActionHelper", "onActionRequested", 91, "AndroidDeviceActionHelper.java")).r("Unexpected STOP_SOUND action");
                return;
            case LOCK:
                if (!bsf.i(b(lqdVar)) && !bsf.j(b(lqdVar))) {
                    lqc b2 = b(lqdVar);
                    if (bsf.i(b(lqdVar))) {
                        ebf ebfVar = this.h;
                        boolean u = eyf.u(b2);
                        boolean v = eyf.v(b2);
                        boolean e = bsf.e(b(lqdVar));
                        if (ebfVar.a().f("lock_device_fragment") == null) {
                            eca.aG(lqdVar, null, u, v, e).q(ebfVar.a(), "lock_device_fragment");
                            ebfVar.a().ag();
                            return;
                        }
                        return;
                    }
                    if (bsf.j(b(lqdVar))) {
                        ebf ebfVar2 = this.h;
                        boolean e2 = bsf.e(b(lqdVar));
                        if (ebfVar2.a().f("set_password_fragment") == null) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("hasCarKey", e2);
                            ecl eclVar = new ecl();
                            eyf.m(lqdVar, bundle);
                            eclVar.ak(bundle);
                            ebb a2 = ebc.a();
                            a2.a = "set_password_fragment";
                            ebfVar2.k(eclVar, a2.a());
                        }
                        this.i.k(dxp.SET_PASSWORD);
                        return;
                    }
                    return;
                }
                this.h.m(lqdVar, bsf.e(b(lqdVar)), false);
                return;
            case RENAME:
                if (bsf.h(b(lqdVar), lpk.ANDROID_RENAME)) {
                    this.i.l(dxq.RENAME);
                    ebf ebfVar3 = this.h;
                    String str = b(lqdVar).g;
                    if (ebfVar3.a().f("rename_device_dialog") == null) {
                        ech.aG(str).q(ebfVar3.a(), "rename_device_dialog");
                        ebfVar3.a().ag();
                    }
                    this.i.k(dxp.RENAME);
                    return;
                }
                return;
            case ENABLE_DEVICE_ADMIN_OR_REMIND:
                lqc b3 = b(lqdVar);
                if (eyf.o(b3)) {
                    if (bsf.h(b(lqdVar), lpk.ANDROID_ENABLE_DEVICE_ADMIN)) {
                        ees eesVar = this.d;
                        lqd lqdVar2 = b3.d;
                        if (lqdVar2 == null) {
                            lqdVar2 = lqd.d;
                        }
                        eesVar.a(lqdVar2, lpk.ANDROID_ENABLE_DEVICE_ADMIN);
                        return;
                    }
                    return;
                }
                if (bsf.h(b(lqdVar), lpk.ANDROID_REMIND)) {
                    ebf ebfVar4 = this.h;
                    boolean s = eyf.s(b3);
                    if (ebfVar4.a().f("setup_device_dialog") == null) {
                        ecm ecmVar = new ecm();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("is_managed_profile", s);
                        ecmVar.ak(bundle2);
                        ecmVar.q(ebfVar4.a(), "setup_device_dialog");
                        ebfVar4.a().ag();
                    }
                    this.i.k(dxp.SETUP_CONFIRMATION);
                    return;
                }
                return;
            case MARK_AS_LOST:
            case UNMARK_AS_LOST:
                this.h.m(lqdVar, bsf.e(b(lqdVar)), true);
                return;
            case WIPE:
                this.i.l(dxq.WIPE);
                ebf ebfVar5 = this.h;
                boolean e3 = bsf.e(b(lqdVar));
                if (ebfVar5.a().f("wipe_device") == null) {
                    ebm ebmVar = new ebm();
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("hasCarKey", e3);
                    ebmVar.ak(bundle3);
                    ebmVar.q(ebfVar5.a(), "wipe_device");
                    ebfVar5.a().ag();
                }
                this.i.k(dxp.WIPE_CONFIRMATION);
                return;
            case NAVIGATE:
                c(lqdVar);
                return;
            default:
                return;
        }
    }
}
