package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egl implements eho {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/RemindActionHandler");
    private final efy b;
    private final dvt c;
    private final dhx d;

    public egl(efy efyVar, dvt dvtVar, dhx dhxVar) {
        this.b = efyVar;
        this.c = dvtVar;
        this.d = dhxVar;
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        lpp lppVar;
        jer c = this.b.c(lqdVar);
        if (!c.g()) {
            jni jniVar = (jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/RemindActionHandler", "executeAction", 45, "RemindActionHandler.java");
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            jniVar.t("Remind action requested for a device that either does not exist or is not an Android: %d", lppVar.b);
            return;
        }
        if (!eyf.k((lqc) c.c()).containsKey(lpk.ANDROID_REMIND)) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/RemindActionHandler", "executeAction", 55, "RemindActionHandler.java")).r("Android device does not support remind action");
            return;
        }
        ljh k = lpo.c.k();
        lpc lpcVar = lpc.a;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        lpcVar.getClass();
        lpoVar.b = lpcVar;
        lpoVar.a = 9;
        this.c.c(lqdVar, (lpo) k.q());
    }

    @Override // defpackage.eho
    public final /* synthetic */ void b(lqd lqdVar, lpo lpoVar) {
        bsg.h(this, lqdVar);
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        if (this.b.h(lqdVar)) {
            this.d.m(R.string.setup_result_fail);
            return false;
        }
        return false;
    }

    @Override // defpackage.eho
    public final boolean e(lqy lqyVar) {
        lpt lptVar;
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
                this.d.m(R.string.setup_result_success);
                return true;
            }
            this.d.m(R.string.setup_result_fail);
            return true;
        }
        return true;
    }
}
