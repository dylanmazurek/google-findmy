package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddy {
    static final elo a = elo.J("k");

    public static List a(dep depVar, cyb cybVar, float f, dem demVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (depVar.p() == 6) {
            cybVar.e("Lottie doesn't support expressions.");
            return arrayList;
        }
        depVar.h();
        while (depVar.n()) {
            if (depVar.q(a) != 0) {
                depVar.m();
            } else if (depVar.p() == 1) {
                depVar.g();
                if (depVar.p() != 7) {
                    while (depVar.n()) {
                        arrayList.add(ddx.a(depVar, cybVar, f, demVar, true, z));
                    }
                } else {
                    arrayList.add(ddx.a(depVar, cybVar, f, demVar, false, z));
                }
                depVar.i();
            } else {
                arrayList.add(ddx.a(depVar, cybVar, f, demVar, false, z));
            }
        }
        depVar.j();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            dfc dfcVar = (dfc) list.get(i2);
            i2++;
            dfc dfcVar2 = (dfc) list.get(i2);
            dfcVar.h = Float.valueOf(dfcVar2.g);
            if (dfcVar.c == null && (obj = dfcVar2.b) != null) {
                dfcVar.c = obj;
                if (dfcVar instanceof dae) {
                    ((dae) dfcVar).a();
                }
            }
        }
        dfc dfcVar3 = (dfc) list.get(i);
        if ((dfcVar3.b == null || dfcVar3.c == null) && list.size() > 1) {
            list.remove(dfcVar3);
        }
    }
}
