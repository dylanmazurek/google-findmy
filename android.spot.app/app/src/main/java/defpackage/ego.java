package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ego implements eho {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/StopSoundActionHandler");
    private final efy b;
    private final dvt c;
    private final dvn d;
    private final dxf e;
    private final dhx f;

    public ego(efy efyVar, dvt dvtVar, dxf dxfVar, dhx dhxVar, dvn dvnVar) {
        this.b = efyVar;
        this.c = dvtVar;
        this.e = dxfVar;
        this.d = dvnVar;
        this.f = dhxVar;
    }

    private final void c(lqd lqdVar) {
        this.b.i(lqdVar, new egj(3), 2);
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        lpp lppVar;
        jer c = this.b.c(lqdVar);
        if (!c.g()) {
            jni jniVar = (jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/StopSoundActionHandler", "executeAction", 56, "StopSoundActionHandler.java");
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            jniVar.t("Stop Sound action requested for a device that either does not exist or is not an Android: %d", lppVar.b);
            return;
        }
        if (!eyf.k((lqc) c.c()).containsKey(lpk.ANDROID_STOP_SOUND)) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/StopSoundActionHandler", "executeAction", 66, "StopSoundActionHandler.java")).r("Android device does not support stop sound action");
            return;
        }
        efp a2 = this.b.a(lqdVar);
        if (a2 == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/StopSoundActionHandler", "executeAction", 72, "StopSoundActionHandler.java")).r("Android device has no local state");
            return;
        }
        jer t = a2.t();
        if (t.g()) {
            this.d.d((String) t.c());
        }
        dvt dvtVar = this.c;
        efy efyVar = this.b;
        String b = dvtVar.b();
        efyVar.i(lqdVar, new egc(b, 4), 2);
        this.e.c(lnb.STOP_RINGING_REMOTE_INSTRUCTION_ISSUED, jdl.a, lqdVar);
        ljh k = lpo.c.k();
        lpg lpgVar = lpg.a;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        lpgVar.getClass();
        lpoVar.b = lpgVar;
        lpoVar.a = 5;
        this.c.e(lqdVar, (lpo) k.q(), b, jdl.a);
    }

    @Override // defpackage.eho
    public final /* synthetic */ void b(lqd lqdVar, lpo lpoVar) {
        bsg.h(this, lqdVar);
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        c(lqdVar);
        return true;
    }

    @Override // defpackage.eho
    public final boolean e(lqy lqyVar) {
        lpt lptVar;
        lpt lptVar2;
        lnb lnbVar;
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
        if (this.b.h(lqdVar) && !ltu.e() && !ltu.f() && !ltu.g()) {
            dhx dhxVar = this.f;
            if (b == lqe.RESPONSE_NO_ERROR) {
                i = R.string.stop_ring_result_success;
            } else {
                i = R.string.stop_ring_result_fail;
            }
            dhxVar.m(i);
        }
        lqc lqcVar2 = lqyVar.b;
        if (lqcVar2 == null) {
            lqcVar2 = lqc.j;
        }
        if (lqcVar2.b == 3) {
            lptVar2 = (lpt) lqcVar2.c;
        } else {
            lptVar2 = lpt.C;
        }
        lqe b2 = lqe.b(lptVar2.t);
        if (b2 == null) {
            b2 = lqe.UNRECOGNIZED;
        }
        if (b2.ordinal() != 0) {
            lnbVar = lnb.STOP_RINGING_REMOTE_INSTRUCTION_RESULT_ERROR;
        } else {
            lnbVar = lnb.STOP_RINGING_REMOTE_INSTRUCTION_RESULT_SUCCESS;
        }
        this.e.c(lnbVar, jdl.a, lqdVar);
        if (b == lqe.RESPONSE_NO_ERROR) {
            this.b.i(lqdVar, new egj(4), 2);
            this.b.e();
            return true;
        }
        c(lqdVar);
        return true;
    }
}
