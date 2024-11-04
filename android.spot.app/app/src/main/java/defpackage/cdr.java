package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdr {
    public static final /* synthetic */ int a = 0;
    private static final cdq b = cdq.a;

    public static final void a(ag agVar, String str) {
        agVar.getClass();
        cdo cdoVar = new cdo(agVar, str);
        d(cdoVar);
        cdq b2 = b(agVar);
        if (b2.b.contains(cdp.DETECT_FRAGMENT_REUSE) && e(b2, agVar.getClass(), cdoVar.getClass())) {
            c(b2, cdoVar);
        }
    }

    public static final cdq b(ag agVar) {
        while (agVar != null) {
            if (agVar.au()) {
                agVar.H();
            }
            agVar = agVar.D;
        }
        return b;
    }

    public static final void c(cdq cdqVar, cdy cdyVar) {
        ag agVar = cdyVar.a;
        String name = agVar.getClass().getName();
        cdqVar.b.contains(cdp.PENALTY_LOG);
        if (cdqVar.b.contains(cdp.PENALTY_DEATH)) {
            bx bxVar = new bx(name, cdyVar, 16);
            if (agVar.au()) {
                Handler handler = agVar.H().m.d;
                if (amr.i(handler.getLooper(), Looper.myLooper())) {
                    bxVar.run();
                    return;
                } else {
                    handler.post(bxVar);
                    return;
                }
            }
            bxVar.run();
        }
    }

    public static final void d(cdy cdyVar) {
        if (be.Z(3)) {
            cdyVar.a.getClass().getName();
        }
    }

    public static final boolean e(cdq cdqVar, Class cls, Class cls2) {
        Set set = (Set) cdqVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        if ((amr.i(cls2.getSuperclass(), cdy.class) || !mkm.al(set, cls2.getSuperclass())) && !set.contains(cls2)) {
            return true;
        }
        return false;
    }
}
