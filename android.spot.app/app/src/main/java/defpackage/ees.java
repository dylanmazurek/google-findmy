package defpackage;

import j$.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ees {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/AndroidActionDispatcherImpl");
    public final efy b;
    public final dvn c;
    public final jiy d;
    public final HashMap e = new HashMap();
    public final dhx f;
    private final dxf g;

    public ees(efy efyVar, dvn dvnVar, Map map, dxf dxfVar, dhx dhxVar) {
        this.b = efyVar;
        this.c = dvnVar;
        this.d = jiy.i(map);
        this.g = dxfVar;
        this.f = dhxVar;
    }

    private static final jer f(lpk lpkVar, int i) {
        lnb lnbVar;
        lnb lnbVar2;
        lnb lnbVar3;
        lnb lnbVar4;
        lnb lnbVar5;
        lnb lnbVar6;
        lnb lnbVar7;
        lnb lnbVar8;
        lnb lnbVar9;
        lnb lnbVar10;
        lnb lnbVar11;
        int ordinal = lpkVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal != 15) {
                        switch (ordinal) {
                            case 6:
                                if (i == 1) {
                                    lnbVar5 = lnb.ACTION_ANDROID_WIPE_REQUEST_ISSUED;
                                } else {
                                    lnbVar5 = lnb.ACTION_ANDROID_WIPE_REQUEST_FAILED;
                                }
                                return jer.i(lnbVar5);
                            case 7:
                                if (i == 1) {
                                    lnbVar6 = lnb.ACTION_ANDROID_RENAME_REQUEST_ISSUED;
                                } else {
                                    lnbVar6 = lnb.ACTION_ANDROID_RENAME_REQUEST_FAILED;
                                }
                                return jer.i(lnbVar6);
                            case 8:
                                if (i == 1) {
                                    lnbVar7 = lnb.ACTION_ANDROID_ENABLE_DEVICE_ADMIN_REQUEST_ISSUED;
                                } else {
                                    lnbVar7 = lnb.ACTION_ANDROID_ENABLE_DEVICE_ADMIN_REQUEST_FAILED;
                                }
                                return jer.i(lnbVar7);
                            case 9:
                                if (i == 1) {
                                    lnbVar8 = lnb.ACTION_ANDROID_REMIND_REQUEST_ISSUED;
                                } else {
                                    lnbVar8 = lnb.ACTION_ANDROID_REMIND_REQUEST_FAILED;
                                }
                                return jer.i(lnbVar8);
                            case 10:
                                if (i == 1) {
                                    lnbVar9 = lnb.ACTION_ANDROID_SETUP_PROMPT_REQUEST_ISSUED;
                                } else {
                                    lnbVar9 = lnb.ACTION_ANDROID_SETUP_PROMPT_REQUEST_FAILED;
                                }
                                return jer.i(lnbVar9);
                            case 11:
                                if (i == 1) {
                                    lnbVar10 = lnb.ACTION_FAST_PAIR_LOCATE_REQUEST_ISSUED;
                                } else {
                                    lnbVar10 = lnb.ACTION_FAST_PAIR_LOCATE_REQUEST_FAILED;
                                }
                                return jer.i(lnbVar10);
                            case 12:
                                if (i == 1) {
                                    lnbVar11 = lnb.ACTION_SPOT_LOCATE_REQUEST_ISSUED;
                                } else {
                                    lnbVar11 = lnb.ACTION_SPOT_LOCATE_REQUEST_FAILED;
                                }
                                return jer.i(lnbVar11);
                            default:
                                return jdl.a;
                        }
                    }
                    if (i == 1) {
                        lnbVar4 = lnb.ACTION_AUTO_DELETE_PROFILE_REQUEST_ISSUED;
                    } else {
                        lnbVar4 = lnb.ACTION_AUTO_DELETE_PROFILE_REQUEST_FAILED;
                    }
                    return jer.i(lnbVar4);
                }
                if (i == 1) {
                    lnbVar3 = lnb.ACTION_ANDROID_LOCATE_REQUEST_ISSUED;
                } else {
                    lnbVar3 = lnb.ACTION_ANDROID_LOCATE_REQUEST_FAILED;
                }
                return jer.i(lnbVar3);
            }
            if (i == 1) {
                lnbVar2 = lnb.ACTION_ANDROID_SET_LOCK_SCREEN_PASSWORD_REQUEST_ISSUED;
            } else {
                lnbVar2 = lnb.ACTION_ANDROID_SET_LOCK_SCREEN_PASSWORD_REQUEST_FAILED;
            }
            return jer.i(lnbVar2);
        }
        if (i == 1) {
            lnbVar = lnb.ACTION_ANDROID_LOCK_SCREEN_REQUEST_ISSUED;
        } else {
            lnbVar = lnb.ACTION_ANDROID_LOCK_SCREEN_REQUEST_FAILED;
        }
        return jer.i(lnbVar);
    }

    public final void a(lqd lqdVar, lpk lpkVar) {
        hwx.J(this.d.containsKey(lpkVar));
        jer f = f(lpkVar, 1);
        if (f.g()) {
            this.g.c((lnb) f.c(), jdl.a, lqdVar);
        }
        eho ehoVar = (eho) this.d.get(lpkVar);
        ehoVar.getClass();
        ehoVar.a(lqdVar);
    }

    public final void b(lqd lqdVar, lpo lpoVar) {
        lpk a2 = lpk.a(lpoVar.a);
        jer f = f(a2, 1);
        if (f.g()) {
            this.g.c((lnb) f.c(), jdl.a, lqdVar);
        }
        hwx.J(this.d.containsKey(a2));
        eho ehoVar = (eho) this.d.get(a2);
        ehoVar.getClass();
        ehoVar.b(lqdVar, lpoVar);
    }

    public final void c(lqj lqjVar) {
        lqd lqdVar = lqjVar.b;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lpo lpoVar = lqjVar.c;
        if (lpoVar == null) {
            lpoVar = lpo.c;
        }
        jer f = f(lpk.a(lpoVar.a), 2);
        if (f.g()) {
            this.g.c((lnb) f.c(), jdl.a, lqdVar);
        }
    }

    public final void d(lpk lpkVar, njz njzVar) {
        ((ArrayList) Map.EL.computeIfAbsent(this.e, lpkVar, new eff(1))).add(njzVar);
    }

    public final void e(lpk lpkVar, njz njzVar) {
        List list = (List) this.e.get(lpkVar);
        if (list != null) {
            list.remove(njzVar);
        }
    }
}
