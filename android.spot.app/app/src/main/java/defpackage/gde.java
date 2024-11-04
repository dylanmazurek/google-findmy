package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gde implements gbe {
    public final gcr a;
    public final gbj b;
    public boolean c = false;
    private final apc d;

    public gde(gcr gcrVar, gbj gbjVar, apc apcVar) {
        this.a = gcrVar;
        this.b = gbjVar;
        this.d = apcVar;
    }

    @Override // defpackage.gbe
    public final Set a() {
        return new jms(gcq.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jyz] */
    @Override // defpackage.gbe
    public final jyz b(final gok gokVar) {
        String f;
        jyz a;
        final jyz jyzVar;
        jer jerVar;
        final gcq gcqVar = (gcq) gokVar.b;
        gbs w = frx.w(gcqVar);
        nqe nqeVar = gdg.a;
        w.h(nqeVar);
        if (w.l.m((ljm) nqeVar.d)) {
            gbs w2 = frx.w(gcqVar);
            nqe nqeVar2 = gdg.a;
            w2.h(nqeVar2);
            Object k = w2.l.k((ljm) nqeVar2.d);
            if (k == null) {
                k = nqeVar2.a;
            } else {
                nqeVar2.h(k);
            }
            f = ((gdf) k).a;
        } else {
            f = this.a.f(gcqVar);
        }
        final String str = f;
        if (str.isEmpty()) {
            return ivc.E(null);
        }
        final ffh ffhVar = (ffh) this.a.c(gcqVar).f();
        final jyz d = this.a.d(gcqVar, gokVar.a);
        gcr gcrVar = this.a;
        Object obj = gokVar.a;
        gcr gcrVar2 = this.a;
        final jyz g = gcrVar.g();
        final jyz e = gcrVar2.e(gcqVar, gokVar.a);
        apc apcVar = this.d;
        boolean z = this.c;
        List list = gcqVar.b;
        if (!z) {
            jyzVar = ivc.E(null);
        } else {
            int size = list.size();
            ljj[] ljjVarArr = new ljj[size];
            ArrayList arrayList = new ArrayList();
            int i = size - 1;
            while (i >= 0) {
                gbs gbsVar = (gbs) list.get(i);
                ljj ljjVar = (ljj) juu.k.k();
                juv juvVar = gbsVar.c;
                if (juvVar == null) {
                    juvVar = juv.e;
                }
                int i2 = juvVar.c;
                List list2 = list;
                if (!ljjVar.b.y()) {
                    ljjVar.t();
                }
                juu juuVar = (juu) ljjVar.b;
                juuVar.a |= 1;
                juuVar.b = i2;
                ljjVarArr[i] = ljjVar;
                if (gbsVar.b.size() > 0) {
                    ((gok) apcVar.c).l(gbsVar, gbsVar.b, ljjVarArr[i], arrayList);
                }
                i--;
                list = list2;
            }
            if (arrayList.isEmpty()) {
                a = ivc.E(ljjVarArr);
            } else {
                a = ivc.S(arrayList).a(new eyh(arrayList, ljjVarArr, 5), jxv.a);
            }
            jyzVar = a;
        }
        final gbr gbrVar = gcqVar.c.a;
        final ArrayList arrayList2 = new ArrayList();
        ((gok) apcVar.b).l(gbrVar, gbrVar.c, null, arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        ((gok) apcVar.a).l(gbrVar, gbrVar.c, null, arrayList3);
        Iterable[] iterableArr = {arrayList2, arrayList3};
        for (int i3 = 0; i3 < 2; i3++) {
            iterableArr[i3].getClass();
        }
        final jyz a2 = ivc.S(new jhs(iterableArr)).a(new Callable() { // from class: gds
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z2;
                ljh k2 = jue.h.k();
                if (!k2.b.y()) {
                    k2.t();
                }
                gcq gcqVar2 = gcq.this;
                juw juwVar = gcqVar2.a;
                jue jueVar = (jue) k2.b;
                juwVar.getClass();
                jueVar.b = juwVar;
                jueVar.a |= 1;
                juw q = frx.q(gcqVar2, true);
                if (q != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hwx.V(z2, "No Parent Event");
                if (!k2.b.y()) {
                    k2.t();
                }
                jue jueVar2 = (jue) k2.b;
                q.getClass();
                jueVar2.d = q;
                jueVar2.a |= 2;
                gbs w3 = frx.w(gcqVar2);
                nqe nqeVar3 = gdw.a;
                w3.h(nqeVar3);
                if (w3.l.m((ljm) nqeVar3.d)) {
                    ljh k3 = juf.c.k();
                    juv juvVar2 = w3.c;
                    if (juvVar2 == null) {
                        juvVar2 = juv.e;
                    }
                    juw juwVar2 = juvVar2.d;
                    if (juwVar2 == null) {
                        juwVar2 = juw.d;
                    }
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    juf jufVar = (juf) k3.b;
                    juwVar2.getClass();
                    jufVar.b = juwVar2;
                    jufVar.a |= 1;
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    jue jueVar3 = (jue) k2.b;
                    juf jufVar2 = (juf) k3.q();
                    jufVar2.getClass();
                    jueVar3.g = jufVar2;
                    jueVar3.a |= 128;
                }
                juv juvVar3 = frx.x(gcqVar2).c;
                if (juvVar3 == null) {
                    juvVar3 = juv.e;
                }
                ljj ljjVar2 = (ljj) jut.j.k();
                if (!ljjVar2.b.y()) {
                    ljjVar2.t();
                }
                gbr gbrVar2 = gbrVar;
                jut jutVar = (jut) ljjVar2.b;
                juvVar3.getClass();
                jutVar.b = juvVar3;
                jutVar.a |= 1;
                int s = iqg.s(gbrVar2.b);
                if (s == 0) {
                    s = 1;
                }
                if (!ljjVar2.b.y()) {
                    ljjVar2.t();
                }
                jut jutVar2 = (jut) ljjVar2.b;
                jutVar2.a |= 16;
                jutVar2.d = s - 1;
                int s2 = iqg.s(gbrVar2.b);
                if (s2 == 0) {
                    s2 = 1;
                }
                if (!ljjVar2.b.y()) {
                    ljjVar2.t();
                }
                jut jutVar3 = (jut) ljjVar2.b;
                jutVar3.a |= 16;
                jutVar3.d = s2 - 1;
                Iterator it = gbrVar2.c.iterator();
                while (it.hasNext()) {
                    switch (((Integer) it.next()).intValue()) {
                        case 100000001:
                            nqe nqeVar4 = gck.a;
                            gbrVar2.h(nqeVar4);
                            Object k4 = gbrVar2.l.k((ljm) nqeVar4.d);
                            if (k4 == null) {
                                k4 = nqeVar4.a;
                            } else {
                                nqeVar4.h(k4);
                            }
                            int D = a.D(((gcl) k4).b);
                            if (D == 0) {
                                D = 1;
                            }
                            if (!ljjVar2.b.y()) {
                                ljjVar2.t();
                            }
                            jut jutVar4 = (jut) ljjVar2.b;
                            jutVar4.a |= 32;
                            jutVar4.e = D - 1;
                            break;
                        case 100000002:
                            nqe nqeVar5 = gck.b;
                            gbrVar2.h(nqeVar5);
                            Object k5 = gbrVar2.l.k((ljm) nqeVar5.d);
                            if (k5 == null) {
                                k5 = nqeVar5.a;
                            } else {
                                nqeVar5.h(k5);
                            }
                            int w4 = a.w(((jvf) k5).a);
                            if (w4 == 0) {
                                w4 = 1;
                            }
                            if (!ljjVar2.b.y()) {
                                ljjVar2.t();
                            }
                            jut jutVar5 = (jut) ljjVar2.b;
                            jutVar5.a |= 64;
                            jutVar5.f = w4 - 1;
                            break;
                        case 100000003:
                            nqe nqeVar6 = gdt.b;
                            gbrVar2.h(nqeVar6);
                            Object k6 = gbrVar2.l.k((ljm) nqeVar6.d);
                            if (k6 == null) {
                                k6 = nqeVar6.a;
                            } else {
                                nqeVar6.h(k6);
                            }
                            int i4 = ((gdc) k6).a;
                            if (!ljjVar2.b.y()) {
                                ljjVar2.t();
                            }
                            jut jutVar6 = (jut) ljjVar2.b;
                            jutVar6.a |= 128;
                            jutVar6.g = i4;
                            break;
                    }
                }
                ljj ljjVar3 = (ljj) jud.a.k();
                long j = gcqVar2.d;
                if (j != -1) {
                    nqe nqeVar7 = jui.b;
                    ljh k7 = jug.c.k();
                    ljh k8 = juh.c.k();
                    if (!k8.b.y()) {
                        k8.t();
                    }
                    juh juhVar = (juh) k8.b;
                    juhVar.a |= 1;
                    juhVar.b = j;
                    juh juhVar2 = (juh) k8.q();
                    if (!k7.b.y()) {
                        k7.t();
                    }
                    jug jugVar = (jug) k7.b;
                    juhVar2.getClass();
                    jugVar.b = juhVar2;
                    jugVar.a = 1 | jugVar.a;
                    ljjVar3.ap(nqeVar7, (jug) k7.q());
                }
                List list3 = arrayList2;
                if (!list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        ((gcu) ivc.M((jyz) it2.next())).a(ljjVar3);
                    }
                }
                if (!ljjVar2.b.y()) {
                    ljjVar2.t();
                }
                List list4 = arrayList3;
                jut jutVar7 = (jut) ljjVar2.b;
                jud judVar = (jud) ljjVar3.q();
                judVar.getClass();
                jutVar7.i = judVar;
                jutVar7.a |= 16384;
                if (!list4.isEmpty()) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        ((gcu) ivc.M((jyz) it3.next())).a(ljjVar2);
                    }
                }
                ljj[] ljjVarArr2 = (ljj[]) ivc.M(jyzVar);
                if (ljjVarArr2 != null) {
                    for (ljj ljjVar4 : ljjVarArr2) {
                        if (!ljjVar2.b.y()) {
                            ljjVar2.t();
                        }
                        jut jutVar8 = (jut) ljjVar2.b;
                        juu juuVar2 = (juu) ljjVar4.q();
                        juuVar2.getClass();
                        ljv ljvVar = jutVar8.h;
                        if (!ljvVar.c()) {
                            jutVar8.h = ljn.p(ljvVar);
                        }
                        jutVar8.h.add(juuVar2);
                    }
                }
                jut jutVar9 = (jut) ljjVar2.q();
                if (!k2.b.y()) {
                    k2.t();
                }
                jue jueVar4 = (jue) k2.b;
                jutVar9.getClass();
                jueVar4.e = jutVar9;
                jueVar4.a |= 16;
                return (jue) k2.q();
            }
        }, jxv.a);
        gbs w3 = frx.w(gcqVar);
        nqe nqeVar3 = gcy.a;
        w3.h(nqeVar3);
        if (w3.l.m((ljm) nqeVar3.d)) {
            nqe nqeVar4 = gcy.a;
            w3.h(nqeVar4);
            Object k2 = w3.l.k((ljm) nqeVar4.d);
            if (k2 == null) {
                k2 = nqeVar4.a;
            } else {
                nqeVar4.h(k2);
            }
            jerVar = jer.i(Integer.valueOf(((gcx) k2).a));
        } else {
            this.a.a(gcqVar);
            jerVar = jdl.a;
        }
        final jer jerVar2 = jerVar;
        return ivc.T(d, a2, g, e).b(jbn.b(new jxc() { // from class: gdd
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, jyz] */
            @Override // defpackage.jxc
            public final jyz a() {
                gbh a3 = gbi.a();
                a3.b(str);
                a3.e = ffhVar;
                a3.c((lkq) ivc.M(d));
                a3.a = (jue) ivc.M(a2);
                a3.b = (Integer) jerVar2.f();
                a3.c = (int[]) ivc.M(g);
                gde gdeVar = gde.this;
                gcr gcrVar3 = gdeVar.a;
                gcq gcqVar2 = gcqVar;
                gcrVar3.h(gcqVar2);
                a3.d();
                gdeVar.a.b(gcqVar2);
                int[] iArr = (int[]) ivc.M(e);
                gbs x = frx.x(gcqVar2);
                nqe nqeVar5 = geh.a;
                x.h(nqeVar5);
                if (x.l.m((ljm) nqeVar5.d) || iArr != null) {
                    gbs x2 = frx.x(gcqVar2);
                    nqe nqeVar6 = geh.a;
                    x2.h(nqeVar6);
                    Object k3 = x2.l.k((ljm) nqeVar6.d);
                    if (k3 == null) {
                        k3 = nqeVar6.a;
                    } else {
                        nqeVar6.h(k3);
                    }
                    HashSet hashSet = new HashSet(((geg) k3).a);
                    if (iArr != null) {
                        hashSet.addAll(iqh.p(iArr));
                    }
                    a3.d = iqh.q(hashSet);
                }
                return gdeVar.b.b(a3.a(), gokVar.a);
            }
        }), jxv.a);
    }
}
