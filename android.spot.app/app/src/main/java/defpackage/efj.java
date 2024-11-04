package defpackage;

import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efj extends ehw {
    static final jjr a = jql.l(lpk.SPOT_MAKE_SOUND, lpk.SPOT_STOP_SOUND);
    private final dvn d;
    private final ejt e;
    private final ees f;

    public efj(dvn dvnVar, ees eesVar, ejt ejtVar) {
        this.d = dvnVar;
        this.f = eesVar;
        this.e = ejtVar;
    }

    private final boolean a(String str) {
        jer b = this.d.a(str).b(new dvh(14));
        if (b.g()) {
            jjr jjrVar = a;
            lpo lpoVar = ((lqj) b.c()).c;
            if (lpoVar == null) {
                lpoVar = lpo.c;
            }
            if (jjrVar.contains(lpk.a(lpoVar.a))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ehw, defpackage.edc
    public final void b(String str, dfy dfyVar) {
        int i;
        if (a(str)) {
            this.e.b(str, dfyVar);
            return;
        }
        ees eesVar = this.f;
        jer b = eesVar.c.a(str).b(new dvh(12));
        if (!b.g()) {
            ((jni) ((jni) ees.a.f()).j("com/google/android/apps/adm/integrations/android/AndroidActionDispatcherImpl", "handleDeviceExecuteActionError", 158, "AndroidActionDispatcherImpl.java")).u("Received an execute action error not in the actions-in-progress map[requestTrackingId: %s].", str);
            return;
        }
        jiy jiyVar = eesVar.d;
        lpo lpoVar = ((lqj) b.c()).c;
        if (lpoVar == null) {
            lpoVar = lpo.c;
        }
        eho ehoVar = (eho) jiyVar.get(lpk.a(lpoVar.a));
        if (ehoVar == null) {
            ((jni) ((jni) ees.a.f()).j("com/google/android/apps/adm/integrations/android/AndroidActionDispatcherImpl", "handleDeviceExecuteActionError", 166, "AndroidActionDispatcherImpl.java")).r("Received an error or timeout update with unexpected action type ");
            return;
        }
        lqd lqdVar = ((lqj) b.c()).b;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        boolean d = ehoVar.d(lqdVar, false);
        eesVar.c((lqj) b.c());
        if (d) {
            efy efyVar = eesVar.b;
            lqd lqdVar2 = ((lqj) b.c()).b;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            if (efyVar.h(lqdVar2)) {
                dhx dhxVar = eesVar.f;
                if (true != (dfyVar instanceof dfn)) {
                    i = R.string.action_server_error;
                } else {
                    i = R.string.network_error;
                }
                dhxVar.m(i);
            }
        }
    }

    @Override // defpackage.ehw, defpackage.edc
    public final void c(String str) {
        if (a(str)) {
            this.e.c(str);
            return;
        }
        ees eesVar = this.f;
        jer b = eesVar.c.a(str).b(new dvh(12));
        if (!b.g()) {
            ((jni) ((jni) ees.a.f()).j("com/google/android/apps/adm/integrations/android/AndroidActionDispatcherImpl", "handleDeviceExecuteActionTimeout", 187, "AndroidActionDispatcherImpl.java")).u("Received an execute action timeout not in the actions-in-progress map [requestTrackingId: %s].", str);
            return;
        }
        jiy jiyVar = eesVar.d;
        lpo lpoVar = ((lqj) b.c()).c;
        if (lpoVar == null) {
            lpoVar = lpo.c;
        }
        eho ehoVar = (eho) jiyVar.get(lpk.a(lpoVar.a));
        if (ehoVar == null) {
            return;
        }
        lqd lqdVar = ((lqj) b.c()).b;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (ehoVar.d(lqdVar, true)) {
            efy efyVar = eesVar.b;
            lqd lqdVar2 = ((lqj) b.c()).b;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            if (efyVar.h(lqdVar2)) {
                eesVar.f.m(R.string.action_server_error);
            }
        }
        eesVar.c((lqj) b.c());
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, eez] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, eez] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, eez] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, eez] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, eez] */
    @Override // defpackage.ehw, defpackage.edc
    public final void d(lqy lqyVar) {
        lpt lptVar;
        lnb lnbVar;
        lqt lqtVar = lqyVar.a;
        if (lqtVar == null) {
            lqtVar = lqt.h;
        }
        if (a(lqtVar.e)) {
            this.e.d(lqyVar);
            return;
        }
        ees eesVar = this.f;
        lqt lqtVar2 = lqyVar.a;
        if (lqtVar2 == null) {
            lqtVar2 = lqt.h;
        }
        dvn dvnVar = eesVar.c;
        String str = lqtVar2.e;
        jer b = dvnVar.a(str).b(new dvh(12));
        if (!b.g()) {
            ((jni) ((jni) ees.a.f()).j("com/google/android/apps/adm/integrations/android/AndroidActionDispatcherImpl", "handleDeviceUpdated", 118, "AndroidActionDispatcherImpl.java")).u("Received a device update not in the actions-in-progress map [requestTrackingId: %s].", str);
            return;
        }
        lpo lpoVar = ((lqj) b.c()).c;
        if (lpoVar == null) {
            lpoVar = lpo.c;
        }
        lpk a2 = lpk.a(lpoVar.a);
        eho ehoVar = (eho) eesVar.d.get(a2);
        if (ehoVar == null) {
            ((jni) ((jni) ees.a.f()).j("com/google/android/apps/adm/integrations/android/AndroidActionDispatcherImpl", "handleDeviceUpdated", 126, "AndroidActionDispatcherImpl.java")).y("Received update for unknown Android action %s [requestTrackingId: %s]", a2, str);
            return;
        }
        ((jni) ((jni) ees.a.e()).j("com/google/android/apps/adm/integrations/android/AndroidActionDispatcherImpl", "handleDeviceUpdated", 131, "AndroidActionDispatcherImpl.java")).y("Received update for action %s [requestTrackingId: %s]", a2, str);
        if (ehoVar.e(lqyVar)) {
            eesVar.c.d(str);
        }
        ArrayList arrayList = (ArrayList) eesVar.e.get(a2);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                njz njzVar = (njz) arrayList.get(i);
                lqd lqdVar = ((lqj) b.c()).b;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                lqc lqcVar = lqyVar.b;
                if (lqcVar == null) {
                    lqcVar = lqc.j;
                }
                if (lqcVar.b == 3) {
                    lptVar = (lpt) lqcVar.c;
                } else {
                    lptVar = lpt.C;
                }
                lqe b2 = lqe.b(lptVar.t);
                if (b2 == null) {
                    b2 = lqe.UNRECOGNIZED;
                }
                if (lqdVar.equals(((ehp) njzVar.a).q)) {
                    dxf dxfVar = ((efa) njzVar.a).l;
                    int ordinal = b2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 8) {
                            if (ordinal != 9) {
                                lnbVar = lnb.LOCK_REMOTE_INSTRUCTION_ERROR;
                            } else {
                                lnbVar = lnb.LOCK_REMOTE_INSTRUCTION_RESULT_UNLOCKED;
                            }
                        } else {
                            lnbVar = lnb.LOCK_REMOTE_INSTRUCTION_RESULT_ERROR_LOCKSCREEN_ALREADY_ENABLED;
                        }
                    } else {
                        lnbVar = lnb.LOCK_REMOTE_INSTRUCTION_RESULT_SUCCESS;
                    }
                    Object obj = njzVar.a;
                    jdl jdlVar = jdl.a;
                    lqd lqdVar2 = ((ehp) obj).i().d;
                    if (lqdVar2 == null) {
                        lqdVar2 = lqd.d;
                    }
                    dxfVar.c(lnbVar, jdlVar, lqdVar2);
                    if (((efa) njzVar.a).d.g()) {
                        int ordinal2 = b2.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 8) {
                                    if (ordinal2 != 9) {
                                        ((efa) njzVar.a).d.c().b(6);
                                        ((jni) ((jni) efa.b.c()).j("com/google/android/apps/adm/integrations/android/AndroidDeviceController$LockScreenActionCallback", "onUpdateReceived", 451, "AndroidDeviceController.java")).u("Unexpected response code for lock: %s", b2);
                                    } else {
                                        ((efa) njzVar.a).d.c().b(8);
                                    }
                                } else {
                                    ((efa) njzVar.a).d.c().b(7);
                                    efa efaVar = (efa) njzVar.a;
                                    if (efaVar.r.b() != null) {
                                        efaVar.j.n();
                                    }
                                }
                            } else {
                                ((efa) njzVar.a).d.c().b(6);
                            }
                        } else {
                            ((efa) njzVar.a).d.c().b(5);
                            efa efaVar2 = (efa) njzVar.a;
                            if (efaVar2.r.b() != null) {
                                efaVar2.j.n();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ehw
    public final boolean e() {
        return true;
    }
}
