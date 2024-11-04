package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgy {
    public final buf b;
    public final ddh c;
    public final dhx d;
    public final ddh e;
    public final elo f;
    public final elo h;
    private final djj i;
    private final dhx j;
    public final elo g = new elo((byte[]) null);
    public final dse a = new dse();

    public dgy() {
        dtu dtuVar = new dtu(new buh(20), new dmh(2), new dts());
        this.b = dtuVar;
        this.h = new elo(dtuVar);
        this.c = new ddh((byte[]) null);
        this.f = new elo();
        this.d = new dhx((char[]) null);
        this.i = new djj();
        this.e = new ddh((char[]) null);
        this.j = new dhx((byte[]) null, (byte[]) null);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f.m(arrayList);
    }

    public final djg a(Object obj) {
        return this.i.a(obj);
    }

    public final List b() {
        List d = this.j.d();
        if (!d.isEmpty()) {
            return d;
        }
        throw new dgu();
    }

    public final List c(Object obj) {
        List t = this.h.t(obj.getClass());
        if (!t.isEmpty()) {
            int size = t.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                dnp dnpVar = (dnp) t.get(i);
                if (dnpVar.a(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i);
                    }
                    emptyList.add(dnpVar);
                    z = false;
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new dgv(obj, t);
        }
        throw new dgv(obj);
    }

    public final void d(Class cls, dij dijVar) {
        this.c.d(cls, dijVar);
    }

    public final void e(Class cls, diy diyVar) {
        this.d.c(cls, diyVar);
    }

    public final void f(Class cls, Class cls2, dix dixVar) {
        h("legacy_append", cls, cls2, dixVar);
    }

    public final void g(Class cls, Class cls2, dnq dnqVar) {
        this.h.u(cls, cls2, dnqVar);
    }

    public final void h(String str, Class cls, Class cls2, dix dixVar) {
        this.f.l(str, dixVar, cls, cls2);
    }

    public final void i(Class cls, Class cls2, dnq dnqVar) {
        this.h.v(cls, cls2, dnqVar);
    }

    public final void j(dil dilVar) {
        this.j.e(dilVar);
    }

    public final void k(djf djfVar) {
        this.i.b(djfVar);
    }

    public final void l(Class cls, Class cls2, dqz dqzVar) {
        this.e.h(cls, cls2, dqzVar);
    }
}
