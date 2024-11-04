package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gin implements gil {
    public static final jiy a = jiy.k(lct.DISMISSED_REMOTE, lcr.DROPPED_BY_STATE, lct.EXPIRED, lcr.DROPPED_EXPIRED);
    public static final jiy b = jiy.k(lct.DISMISSED_REMOTE, lde.DISMISSED_REMOTE, lct.EXPIRED, lde.EXPIRED);
    public final glu c;
    public final ghf d;
    public final lqz e;
    public final lqz f;
    public final gok g;
    private final Lock h;

    public gin(glu gluVar, lqz lqzVar, lqz lqzVar2, ghf ghfVar, gok gokVar, Lock lock) {
        this.c = gluVar;
        this.e = lqzVar;
        this.f = lqzVar2;
        this.d = ghfVar;
        this.g = gokVar;
        this.h = lock;
    }

    public static jis c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ggk) it.next()).a);
        }
        return jis.o(arrayList);
    }

    public static jis d(boolean z, List list, Set set) {
        jin jinVar = new jin();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ggk ggkVar = (ggk) it.next();
            if (z == set.contains(ggkVar.a)) {
                jinVar.h(ggkVar);
            }
        }
        return jinVar.g();
    }

    public static boolean g(ggk ggkVar) {
        if (ggkVar.s != 3 && ggkVar.q != 3) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gil
    public final void a(final goa goaVar, final List list, final gnd gndVar, final ghh ghhVar, final boolean z) {
        Runnable runnable = new Runnable() { // from class: gim
            /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 774
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gim.run():void");
            }
        };
        this.h.lock();
        try {
            runnable.run();
        } finally {
            this.h.unlock();
        }
    }

    @Override // defpackage.gil
    public final void b(goa goaVar, List list, lgz lgzVar, int i, ghr ghrVar) {
        int w;
        if (!list.isEmpty()) {
            int w2 = a.w(lgzVar.e);
            if ((w2 != 0 && w2 == 3) || ((w = a.w(lgzVar.c)) != 0 && w == 3)) {
                List a2 = this.c.a(goaVar, list, null, ghrVar);
                if (i == 4 && !a2.isEmpty()) {
                    f(lde.DISMISSED_REMOTE, goaVar, a2, null);
                }
            }
            lct lctVar = ghrVar.a;
            Iterator it = ((Set) this.e.a()).iterator();
            while (it.hasNext()) {
                ((gxb) it.next()).g();
            }
        }
    }

    public final void e(lcr lcrVar, goa goaVar, gxz gxzVar, List list, ghh ghhVar) {
        ghg a2 = this.d.a(lcrVar);
        a2.e(goaVar);
        a2.d(list);
        ghn ghnVar = (ghn) a2;
        ghnVar.G = 2;
        ghnVar.z = ghhVar;
        if (gxzVar != null) {
            ghnVar.n = gxzVar;
        }
        a2.a();
    }

    public final void f(lde ldeVar, goa goaVar, List list, ghh ghhVar) {
        ghg b2 = this.d.b(ldeVar);
        b2.e(goaVar);
        b2.d(list);
        ((ghn) b2).z = ghhVar;
        b2.a();
    }
}
