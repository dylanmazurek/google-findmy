package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egi implements eho {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/LockScreenActionHandler");
    private final efy b;
    private final dvt c;

    public egi(efy efyVar, dvt dvtVar) {
        this.b = efyVar;
        this.c = dvtVar;
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        ljh k = lpo.c.k();
        loz lozVar = loz.c;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        lozVar.getClass();
        lpoVar.b = lozVar;
        lpoVar.a = 2;
        b(lqdVar, (lpo) k.q());
    }

    @Override // defpackage.eho
    public final void b(lqd lqdVar, lpo lpoVar) {
        lpp lppVar;
        jer c = this.b.c(lqdVar);
        if (!c.g()) {
            jni jniVar = (jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/LockScreenActionHandler", "executeAction", 48, "LockScreenActionHandler.java");
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            jniVar.t("Lock Screen action requested for a device that either does not exist or is not an Android: %d", lppVar.b);
            return;
        }
        if (!eyf.k((lqc) c.c()).containsKey(lpk.ANDROID_LOCK_SCREEN)) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/LockScreenActionHandler", "executeAction", 57, "LockScreenActionHandler.java")).r("Android device does not support lock screen action");
        } else {
            dvt dvtVar = this.c;
            dvtVar.d(lqdVar, lpoVar, dvtVar.b(), ltl.b());
        }
    }

    @Override // defpackage.eho
    public final /* synthetic */ boolean d(lqd lqdVar, boolean z) {
        return true;
    }

    @Override // defpackage.eho
    public final boolean e(lqy lqyVar) {
        return eeq.c(lqyVar);
    }
}
