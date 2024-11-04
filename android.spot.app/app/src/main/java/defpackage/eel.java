package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eel implements eho {
    private static final jnk b = jnk.l("com/google/android/apps/adm/integrations/accessory/LocateActionHandler");
    public final ilv a;
    private final dvt c;
    private final dvn d;
    private final Random e;
    private final dxf f;

    public eel(ilv ilvVar, dvt dvtVar, dvn dvnVar, fma fmaVar, Random random, dxf dxfVar) {
        ilvVar.getClass();
        dvtVar.getClass();
        dvnVar.getClass();
        fmaVar.getClass();
        dxfVar.getClass();
        this.a = ilvVar;
        this.c = dvtVar;
        this.d = dvnVar;
        this.e = random;
        this.f = dxfVar;
    }

    private final void f(lqd lqdVar) {
        this.f.c(lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_FAILURE, jdl.a, lqdVar);
    }

    private final void g(lqc lqcVar, String str, lps lpsVar, boolean z) {
        lnb lnbVar;
        if (lpsVar == null) {
            lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_NO_LOCATION;
        } else {
            lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_LAST_KNOWN_LOCATION;
        }
        ljh k = lmu.i.k();
        k.getClass();
        ljh k2 = lmv.f.k();
        k2.getClass();
        if (!k2.b.y()) {
            k2.t();
        }
        lmv lmvVar = (lmv) k2.b;
        lmvVar.a |= 8;
        lmvVar.c = z;
        ljn q = k2.q();
        q.getClass();
        lmv lmvVar2 = (lmv) q;
        if (!k.b.y()) {
            k.t();
        }
        lmu lmuVar = (lmu) k.b;
        lmuVar.d = lmvVar2;
        lmuVar.a |= 4;
        lmu as = hzc.as(k);
        dxf dxfVar = this.f;
        jer h = jer.h(as);
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        dxfVar.c(lnbVar, h, lqdVar);
        if (lpsVar != null && !z) {
            dxf dxfVar2 = this.f;
            lnb lnbVar2 = lnb.LOCATION_UPDATE_DISPLAYED;
            lqd lqdVar2 = lqcVar.d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            dxfVar2.a(lnbVar2, lqdVar2, str);
        }
    }

    private final void h(lqc lqcVar, String str, lps lpsVar, boolean z) {
        lpw lpwVar;
        boolean z2;
        Long valueOf;
        if (lqcVar.b == 10) {
            lpwVar = (lpw) lqcVar.c;
        } else {
            lpwVar = lpw.i;
        }
        lqc u = this.a.u(lpwVar.b);
        if (u != null) {
            z2 = this.a.x(u);
        } else {
            z2 = false;
        }
        if (z) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        }
        Long l = valueOf;
        ilv ilvVar = this.a;
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqdVar.getClass();
        ilvVar.v(lqdVar, new eek(lpsVar, u, z2, l, 0));
        g(lqcVar, str, lpsVar, false);
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        lql lqlVar;
        lim limVar;
        lqdVar.getClass();
        lqc t = this.a.t(lqdVar);
        if (t == null) {
            jni jniVar = (jni) b.f().j("com/google/android/apps/adm/integrations/accessory/LocateActionHandler", "executeAction", 47, "LocateActionHandler.kt");
            if (lqdVar.a == 5) {
                lqlVar = (lql) lqdVar.b;
            } else {
                lqlVar = lql.c;
            }
            if (lqlVar.a == 1) {
                limVar = (lim) lqlVar.b;
            } else {
                limVar = lim.b;
            }
            jniVar.u("Locate action requested for a device that either does not exist or is not an accessory: %s", limVar);
            return;
        }
        c(t);
    }

    @Override // defpackage.eho
    public final /* synthetic */ void b(lqd lqdVar, lpo lpoVar) {
        bsg.h(this, lqdVar);
    }

    public final void c(lqc lqcVar) {
        String str;
        if (!eyf.k(lqcVar).containsKey(lpk.FAST_PAIR_LOCATE)) {
            ((jni) b.g().j("com/google/android/apps/adm/integrations/accessory/LocateActionHandler", "executeActionInternal", 59, "LocateActionHandler.kt")).r("Accessory device does not support locate action");
            return;
        }
        ilv ilvVar = this.a;
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqdVar.getClass();
        edy s = ilvVar.s(lqdVar);
        if (s != null && (str = s.a) != null) {
            this.d.d(str);
        }
        dvt dvtVar = this.c;
        Random random = this.e;
        ilv ilvVar2 = this.a;
        String b2 = dvtVar.b();
        lim b3 = eyg.b(random);
        lqd lqdVar2 = lqcVar.d;
        if (lqdVar2 == null) {
            lqdVar2 = lqd.d;
        }
        lqdVar2.getClass();
        ilvVar2.v(lqdVar2, new erg(b2, b3, 1));
        ljh k = lpo.c.k();
        k.getClass();
        ljh k2 = lpj.b.k();
        k2.getClass();
        if (!k2.b.y()) {
            k2.t();
        }
        ((lpj) k2.b).a = b3;
        ljn q = k2.q();
        q.getClass();
        lpj lpjVar = (lpj) q;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        lpoVar.b = lpjVar;
        lpoVar.a = 10;
        ljn q2 = k.q();
        q2.getClass();
        dvt dvtVar2 = this.c;
        lpo lpoVar2 = (lpo) q2;
        lqd lqdVar3 = lqcVar.d;
        if (lqdVar3 == null) {
            lqdVar3 = lqd.d;
        }
        dvtVar2.d(lqdVar3, lpoVar2, b2, lti.a.a().b());
        dxf dxfVar = this.f;
        lnb lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_ISSUED;
        jdl jdlVar = jdl.a;
        lqd lqdVar4 = lqcVar.d;
        if (lqdVar4 == null) {
            lqdVar4 = lqd.d;
        }
        dxfVar.d(lnbVar, jdlVar, lqdVar4, b2);
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        if (lqdVar == null) {
            return true;
        }
        this.a.v(lqdVar, cka.g);
        f(lqdVar);
        return true;
    }

    @Override // defpackage.eho
    public final boolean e(lqy lqyVar) {
        lpw lpwVar;
        lpw lpwVar2;
        lqyVar.getClass();
        lqc lqcVar = lqyVar.b;
        if (lqcVar == null) {
            lqcVar = lqc.j;
        }
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqdVar.getClass();
        if (this.a.t(lqdVar) == null) {
            ((jni) b.g().j("com/google/android/apps/adm/integrations/accessory/LocateActionHandler", "handleActionStateUpdate", 94, "LocateActionHandler.kt")).r("Got location state update for unknown device");
            lqc lqcVar2 = lqyVar.b;
            if (lqcVar2 == null) {
                lqcVar2 = lqc.j;
            }
            lqd lqdVar2 = lqcVar2.d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            lqdVar2.getClass();
            f(lqdVar2);
            return false;
        }
        edy s = this.a.s(lqdVar);
        if (s == null) {
            return false;
        }
        lqt lqtVar = lqyVar.a;
        if (lqtVar == null) {
            lqtVar = lqt.h;
        }
        String str = lqtVar.e;
        str.getClass();
        if (!amr.i(s.a, str)) {
            ((jni) b.f().j("com/google/android/apps/adm/integrations/accessory/LocateActionHandler", "handleActionStateUpdate", 102, "LocateActionHandler.kt")).r("Unexpected missing or mismatching currentLocateRequestId");
            lqc lqcVar3 = lqyVar.b;
            if (lqcVar3 == null) {
                lqcVar3 = lqc.j;
            }
            lqcVar3.getClass();
            g(lqcVar3, str, null, true);
            return false;
        }
        lqc lqcVar4 = lqyVar.b;
        if (lqcVar4 == null) {
            lqcVar4 = lqc.j;
        }
        if (lqcVar4.b == 10) {
            lpwVar = (lpw) lqcVar4.c;
        } else {
            lpwVar = lpw.i;
        }
        if ((lpwVar.a & 2) != 0) {
            if (s.f == null) {
                ((jni) b.f().j("com/google/android/apps/adm/integrations/accessory/LocateActionHandler", "handleActionStateUpdate", 124, "LocateActionHandler.kt")).r("Cannot decrypt location due to missing encryption key for the accessory");
                lqc lqcVar5 = lqyVar.b;
                if (lqcVar5 == null) {
                    lqcVar5 = lqc.j;
                }
                lqcVar5.getClass();
                h(lqcVar5, str, null, true);
                return true;
            }
            lqc lqcVar6 = lqyVar.b;
            if (lqcVar6 == null) {
                lqcVar6 = lqc.j;
            }
            if (lqcVar6.b == 10) {
                lpwVar2 = (lpw) lqcVar6.c;
            } else {
                lpwVar2 = lpw.i;
            }
            lqr lqrVar = lpwVar2.c;
            if (lqrVar == null) {
                lqrVar = lqr.g;
            }
            lqrVar.getClass();
            lps lpsVar = (lps) eyg.a(lqrVar, s.f).f();
            lqc lqcVar7 = lqyVar.b;
            if (lqcVar7 == null) {
                lqcVar7 = lqc.j;
            }
            lqcVar7.getClass();
            h(lqcVar7, str, lpsVar, false);
            return true;
        }
        ((jni) b.f().j("com/google/android/apps/adm/integrations/accessory/LocateActionHandler", "handleActionStateUpdate", 112, "LocateActionHandler.kt")).r("Missing location in update");
        lqc lqcVar8 = lqyVar.b;
        if (lqcVar8 == null) {
            lqcVar8 = lqc.j;
        }
        lqcVar8.getClass();
        h(lqcVar8, str, null, false);
        return true;
    }
}
