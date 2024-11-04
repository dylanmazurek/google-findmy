package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efk implements eap {
    @Override // defpackage.eap
    public final lqc a(lqc lqcVar, lqc lqcVar2) {
        lpt lptVar;
        lpt lptVar2;
        lpt lptVar3;
        if (lqcVar2.b == 3) {
            ljh ljhVar = (ljh) lqcVar.z(5);
            ljhVar.w(lqcVar);
            if (lqcVar2.b == 3) {
                lptVar = (lpt) lqcVar2.c;
            } else {
                lptVar = lpt.C;
            }
            if (lqcVar.b == 3) {
                lptVar2 = (lpt) lqcVar.c;
            } else {
                lptVar2 = lpt.C;
            }
            ljh ljhVar2 = (ljh) lptVar2.z(5);
            ljhVar2.w(lptVar2);
            if ((lptVar.a & 1) != 0) {
                lqr lqrVar = lptVar.b;
                if (lqrVar == null) {
                    lqrVar = lqr.g;
                }
                if (!ljhVar2.b.y()) {
                    ljhVar2.t();
                }
                lpt lptVar4 = (lpt) ljhVar2.b;
                lqrVar.getClass();
                lptVar4.b = lqrVar;
                lptVar4.a |= 1;
            }
            if ((lptVar.a & 16777216) != 0) {
                lpq lpqVar = lptVar.r;
                if (lpqVar == null) {
                    lpqVar = lpq.c;
                }
                if (!ljhVar2.b.y()) {
                    ljhVar2.t();
                }
                lpt lptVar5 = (lpt) ljhVar2.b;
                lpqVar.getClass();
                lptVar5.r = lpqVar;
                lptVar5.a |= 16777216;
            }
            if ((lptVar.a & 8388608) != 0) {
                lpr lprVar = lptVar.q;
                if (lprVar == null) {
                    lprVar = lpr.c;
                }
                if (!ljhVar2.b.y()) {
                    ljhVar2.t();
                }
                lpt lptVar6 = (lpt) ljhVar2.b;
                lprVar.getClass();
                lptVar6.q = lprVar;
                lptVar6.a |= 8388608;
            }
            if ((lptVar.a & 32) != 0) {
                String str = lptVar.f;
                if (!ljhVar2.b.y()) {
                    ljhVar2.t();
                }
                lpt lptVar7 = (lpt) ljhVar2.b;
                str.getClass();
                lptVar7.a |= 32;
                lptVar7.f = str;
            }
            if ((lptVar.a & 4194304) != 0) {
                lqw lqwVar = lptVar.p;
                if (lqwVar == null) {
                    lqwVar = lqw.c;
                }
                if (!ljhVar2.b.y()) {
                    ljhVar2.t();
                }
                lpt lptVar8 = (lpt) ljhVar2.b;
                lqwVar.getClass();
                lptVar8.p = lqwVar;
                lptVar8.a |= 4194304;
            }
            if ((lptVar.a & 16384) != 0) {
                boolean z = lptVar.j;
                if (!ljhVar2.b.y()) {
                    ljhVar2.t();
                }
                lpt lptVar9 = (lpt) ljhVar2.b;
                lptVar9.a |= 16384;
                lptVar9.j = z;
            }
            if ((lptVar.a & 67108864) != 0) {
                if (lqcVar.b == 3) {
                    lptVar3 = (lpt) lqcVar.c;
                } else {
                    lptVar3 = lpt.C;
                }
                lpz lpzVar = lptVar3.u;
                if (lpzVar == null) {
                    lpzVar = lpz.e;
                }
                lpz lpzVar2 = lptVar.u;
                if (lpzVar2 == null) {
                    lpzVar2 = lpz.e;
                }
                lpz lpzVar3 = (lpz) bsh.f(lpzVar, lpzVar2).q();
                if (!ljhVar2.b.y()) {
                    ljhVar2.t();
                }
                lpt lptVar10 = (lpt) ljhVar2.b;
                lpzVar3.getClass();
                lptVar10.u = lpzVar3;
                lptVar10.a |= 67108864;
                ljv<lqi> ljvVar = lqcVar.e;
                ArrayList arrayList = new ArrayList();
                for (lqi lqiVar : ljvVar) {
                    jjr jjrVar = efj.a;
                    lpo lpoVar = lqiVar.b;
                    if (lpoVar == null) {
                        lpoVar = lpo.c;
                    }
                    if (!jjrVar.contains(lpk.a(lpoVar.a))) {
                        arrayList.add(lqiVar);
                    }
                }
                for (lqi lqiVar2 : lqcVar2.e) {
                    jjr jjrVar2 = efj.a;
                    lpo lpoVar2 = lqiVar2.b;
                    if (lpoVar2 == null) {
                        lpoVar2 = lpo.c;
                    }
                    if (jjrVar2.contains(lpk.a(lpoVar2.a))) {
                        arrayList.add(lqiVar2);
                    }
                }
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                ((lqc) ljhVar.b).e = lla.a;
                ljhVar.K(arrayList);
            }
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            lqc lqcVar3 = (lqc) ljhVar.b;
            lpt lptVar11 = (lpt) ljhVar2.q();
            lptVar11.getClass();
            lqcVar3.c = lptVar11;
            lqcVar3.b = 3;
            return (lqc) ljhVar.q();
        }
        return lqcVar;
    }
}
