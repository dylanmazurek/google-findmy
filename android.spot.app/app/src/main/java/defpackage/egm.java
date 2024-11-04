package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egm implements eho {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/RenameDeviceActionHandler");
    private final efy b;
    private final dvt c;
    private final ewg d;
    private final dhx e;

    public egm(efy efyVar, dvt dvtVar, dhx dhxVar, ewg ewgVar) {
        this.b = efyVar;
        this.c = dvtVar;
        this.e = dhxVar;
        this.d = ewgVar;
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/RenameDeviceActionHandler", "executeAction", 43, "RenameDeviceActionHandler.java")).r("Unexpected call to executeAction");
    }

    @Override // defpackage.eho
    public final void b(lqd lqdVar, lpo lpoVar) {
        lpp lppVar;
        jer c = this.b.c(lqdVar);
        if (!c.g()) {
            jni jniVar = (jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/RenameDeviceActionHandler", "executeAction", 51, "RenameDeviceActionHandler.java");
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            jniVar.t("ANDROID_RENAME action requested for a device that either does not exist or is not an Android: %d", lppVar.b);
            return;
        }
        if (!eyf.k((lqc) c.c()).containsKey(lpk.ANDROID_RENAME)) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/RenameDeviceActionHandler", "executeAction", 60, "RenameDeviceActionHandler.java")).r("Android device does not support ANDROID_RENAME action");
        } else {
            this.c.c(lqdVar, lpoVar);
        }
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        if (!this.b.h(lqdVar)) {
            return false;
        }
        this.e.m(R.string.rename_result_fail);
        this.d.p();
        return false;
    }

    @Override // defpackage.eho
    public final /* synthetic */ boolean e(lqy lqyVar) {
        return true;
    }
}
