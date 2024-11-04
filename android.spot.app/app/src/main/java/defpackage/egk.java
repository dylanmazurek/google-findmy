package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egk implements eho {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/MakeSoundActionHandler");
    private final efy b;
    private final dvt c;
    private final dvn d;
    private final dxf e;
    private final dhx f;

    public egk(efy efyVar, dvt dvtVar, dvn dvnVar, dxf dxfVar, dhx dhxVar) {
        this.b = efyVar;
        this.c = dvtVar;
        this.d = dvnVar;
        this.e = dxfVar;
        this.f = dhxVar;
    }

    private final void c(lqy lqyVar, lqd lqdVar) {
        lpt lptVar;
        lnb lnbVar;
        lqc lqcVar = lqyVar.b;
        if (lqcVar == null) {
            lqcVar = lqc.j;
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
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 11) {
                lnbVar = lnb.RING_REMOTE_INSTRUCTION_RESULT_ERROR;
            } else {
                lnbVar = lnb.RING_REMOTE_INSTRUCTION_RESULT_DEVICE_INTERRUPTED;
            }
        } else {
            lnbVar = lnb.RING_REMOTE_INSTRUCTION_RESULT_SUCCESS;
        }
        this.e.c(lnbVar, jdl.a, lqdVar);
    }

    private final void f(lqd lqdVar) {
        this.b.i(lqdVar, new egj(0), 2);
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        lpp lppVar;
        jer c = this.b.c(lqdVar);
        if (!c.g()) {
            jni jniVar = (jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/MakeSoundActionHandler", "executeAction", 61, "MakeSoundActionHandler.java");
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            jniVar.t("Make Sound action requested for a device that either does not exist or is not an Android: %d", lppVar.b);
            return;
        }
        if (!eyf.k((lqc) c.c()).containsKey(lpk.ANDROID_MAKE_SOUND)) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/MakeSoundActionHandler", "executeAction", 71, "MakeSoundActionHandler.java")).r("Android device does not support make sound action");
            return;
        }
        efp a2 = this.b.a(lqdVar);
        if (a2 == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/MakeSoundActionHandler", "executeAction", 77, "MakeSoundActionHandler.java")).r("Android device has no local state");
            return;
        }
        String b = this.c.b();
        jer t = a2.t();
        if (t.g()) {
            this.d.d((String) t.c());
        }
        this.b.i(lqdVar, new egc(b, 3), 2);
        ljh k = lpo.c.k();
        lpa lpaVar = lpa.a;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        lpaVar.getClass();
        lpoVar.b = lpaVar;
        lpoVar.a = 1;
        lpo lpoVar2 = (lpo) k.q();
        this.e.c(lnb.RING_REMOTE_INSTRUCTION_ISSUED, jdl.a, lqdVar);
        this.c.e(lqdVar, lpoVar2, b, jdl.a);
    }

    @Override // defpackage.eho
    public final /* synthetic */ void b(lqd lqdVar, lpo lpoVar) {
        bsg.h(this, lqdVar);
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        f(lqdVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.lang.Runnable] */
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
        if (this.b.h(lqdVar) && !ltu.e() && !ltu.f() && !ltu.g()) {
            int ordinal = b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 11) {
                    this.f.m(R.string.ring_result_fail);
                } else {
                    this.f.m(R.string.stop_ring_result_success);
                }
            } else {
                this.f.m(R.string.ring_result_success);
            }
        }
        if (b == lqe.RESPONSE_NO_ERROR) {
            this.b.i(lqdVar, new egj(2), 2);
            efy efyVar = this.b;
            long c = ltl.c();
            if (efyVar.c.g()) {
                efyVar.e.n(efyVar.c.c());
            }
            efyVar.c = jer.i(new cui(efyVar, lqdVar, 8, (byte[]) null));
            efyVar.e.m(efyVar.c.c(), c);
            c(lqyVar, lqdVar);
            return false;
        }
        if (b == lqe.RESPONSE_RING_DEVICE_INTERRUPTED) {
            this.b.i(lqdVar, new egj(0), 2);
            this.b.e();
            c(lqyVar, lqdVar);
            return true;
        }
        c(lqyVar, lqdVar);
        f(lqdVar);
        return true;
    }
}
