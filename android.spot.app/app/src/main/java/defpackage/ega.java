package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ega implements eho {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/EnableDeviceAdminActionHandler");
    private final efy b;
    private final dvt c;
    private final dhx d;

    public ega(efy efyVar, dvt dvtVar, dhx dhxVar) {
        this.b = efyVar;
        this.c = dvtVar;
        this.d = dhxVar;
    }

    private final void c(lqc lqcVar) {
        int i;
        if (true != eyf.w(lqcVar)) {
            i = R.string.enable_result_fail_for_profile;
        } else {
            i = R.string.enable_result_fail;
        }
        this.d.m(i);
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        lpp lppVar;
        jer c = this.b.c(lqdVar);
        if (!c.g()) {
            jni jniVar = (jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/EnableDeviceAdminActionHandler", "executeAction", 44, "EnableDeviceAdminActionHandler.java");
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            jniVar.t("Enable Device Admin action requested for a device that either does not exist or is not an Android: %d", lppVar.b);
            return;
        }
        if (!eyf.k((lqc) c.c()).containsKey(lpk.ANDROID_ENABLE_DEVICE_ADMIN)) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/EnableDeviceAdminActionHandler", "executeAction", 54, "EnableDeviceAdminActionHandler.java")).r("Android device does not support Enable Device Admin action");
            return;
        }
        ljh k = lpo.c.k();
        lox loxVar = lox.a;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        loxVar.getClass();
        lpoVar.b = loxVar;
        lpoVar.a = 8;
        this.c.c(lqdVar, (lpo) k.q());
    }

    @Override // defpackage.eho
    public final /* synthetic */ void b(lqd lqdVar, lpo lpoVar) {
        bsg.h(this, lqdVar);
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        jer b = this.b.b();
        if (b.g()) {
            lqd lqdVar2 = ((lqc) b.c()).d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            if (lqdVar2.equals(lqdVar)) {
                c((lqc) b.c());
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.eho
    public final boolean e(lqy lqyVar) {
        lpt lptVar;
        int i;
        lqc lqcVar = lqyVar.b;
        if (lqcVar == null) {
            lqcVar = lqc.j;
        }
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (lqcVar.b == 3) {
            lptVar = (lpt) lqcVar.c;
        } else {
            lptVar = lpt.C;
        }
        lqe b = lqe.b(lptVar.t);
        if (b == null) {
            b = lqe.UNRECOGNIZED;
        }
        if (this.b.h(lqdVar)) {
            if (b == lqe.RESPONSE_NO_ERROR) {
                dhx dhxVar = this.d;
                if (true != eyf.w(lqcVar)) {
                    i = R.string.enable_result_success_for_profile;
                } else {
                    i = R.string.enable_result_success;
                }
                dhxVar.m(i);
                return false;
            }
            c(lqcVar);
            return false;
        }
        return false;
    }
}