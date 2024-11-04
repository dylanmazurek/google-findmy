package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egn implements eho {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/SetScreenLockPasswordActionHandler");
    private final efy b;
    private final dvt c;

    public egn(efy efyVar, dvt dvtVar) {
        this.b = efyVar;
        this.c = dvtVar;
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        ljh k = lpo.c.k();
        lpe lpeVar = lpe.d;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        lpeVar.getClass();
        lpoVar.b = lpeVar;
        lpoVar.a = 3;
        b(lqdVar, (lpo) k.q());
    }

    @Override // defpackage.eho
    public final void b(lqd lqdVar, lpo lpoVar) {
        lpp lppVar;
        jer c = this.b.c(lqdVar);
        if (!c.g()) {
            jni jniVar = (jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/SetScreenLockPasswordActionHandler", "executeAction", 49, "SetScreenLockPasswordActionHandler.java");
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            jniVar.t("SET_SCREEN_LOCK_PASSWORD action requested for a device that either does not exist or is not an Android: %d", lppVar.b);
            return;
        }
        if (!eyf.k((lqc) c.c()).containsKey(lpk.ANDROID_SET_SCREEN_LOCK_PASSWORD)) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/SetScreenLockPasswordActionHandler", "executeAction", 58, "SetScreenLockPasswordActionHandler.java")).r("Android device does not support SET_SCREEN_LOCK_PASSWORD screen action");
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
