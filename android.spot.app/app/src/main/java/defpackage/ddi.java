package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddi {
    private static final elo a = elo.J("k", "x", "y");

    public static dbv a(dep depVar, cyb cybVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (depVar.p() == 1) {
            depVar.g();
            while (depVar.n()) {
                if (depVar.p() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new dae(cybVar, ddx.a(depVar, cybVar, dfb.a(), ddq.d, z, false)));
            }
            depVar.i();
            ddy.b(arrayList);
        } else {
            arrayList.add(new dfc(ddw.c(depVar, dfb.a())));
        }
        return new dbv(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcc b(dep depVar, cyb cybVar) {
        depVar.h();
        boolean z = false;
        dbv dbvVar = null;
        dbs dbsVar = null;
        dbs dbsVar2 = null;
        while (depVar.p() != 4) {
            int q = depVar.q(a);
            if (q != 0) {
                if (q != 1) {
                    if (q != 2) {
                        depVar.l();
                        depVar.m();
                    } else if (depVar.p() == 6) {
                        depVar.m();
                        z = true;
                    } else {
                        dbsVar2 = bpv.h(depVar, cybVar);
                    }
                } else if (depVar.p() == 6) {
                    depVar.m();
                    z = true;
                } else {
                    dbsVar = bpv.h(depVar, cybVar);
                }
            } else {
                dbvVar = a(depVar, cybVar);
            }
        }
        depVar.j();
        if (z) {
            cybVar.e("Lottie doesn't support expressions.");
        }
        if (dbvVar != null) {
            return dbvVar;
        }
        return new dbz(dbsVar, dbsVar2);
    }
}
