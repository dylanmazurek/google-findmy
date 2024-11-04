package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfh {
    public final aow a;
    public final ayr b;
    public final bfe c;
    public boolean d;
    public final int e;
    private final boolean f;
    private bfh g;

    public bfh(aow aowVar, boolean z, ayr ayrVar, bfe bfeVar) {
        this.a = aowVar;
        this.f = z;
        this.b = ayrVar;
        this.c = bfeVar;
        this.e = ayrVar.d;
    }

    public static /* synthetic */ List l(bfh bfhVar, boolean z, int i) {
        boolean z2;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z2 = !bfhVar.f;
        } else {
            z2 = false;
        }
        if ((i & 2) == 0) {
            z3 = true;
        }
        return bfhVar.k(z2, z & z3);
    }

    private final bfh o(bfb bfbVar, moh mohVar) {
        int i;
        int i2;
        bfe bfeVar = new bfe();
        bfeVar.b = false;
        bfeVar.c = false;
        mohVar.a(bfeVar);
        bfg bfgVar = new bfg(mohVar);
        if (bfbVar != null) {
            i = this.e;
            i2 = 1000000000;
        } else {
            i = this.e;
            i2 = 2000000000;
        }
        bfh bfhVar = new bfh(bfgVar, false, new ayr(true, i + i2), bfeVar);
        bfhVar.d = true;
        bfhVar.g = this;
        return bfhVar;
    }

    private final void p(bfe bfeVar) {
        if (!this.c.c) {
            List m = m(false);
            int size = m.size();
            for (int i = 0; i < size; i++) {
                bfh bfhVar = (bfh) m.get(i);
                if (!bfhVar.q()) {
                    for (Map.Entry entry : bfhVar.c.a.entrySet()) {
                        bfn bfnVar = (bfn) entry.getKey();
                        Object value = entry.getValue();
                        Object obj = bfeVar.a.get(bfnVar);
                        bfnVar.getClass();
                        Object a = bfnVar.b.a(obj, value);
                        if (a != null) {
                            bfeVar.a.put(bfnVar, a);
                        }
                    }
                    bfhVar.p(bfeVar);
                }
            }
        }
    }

    private final boolean q() {
        if (this.f && this.c.b) {
            return true;
        }
        return false;
    }

    private final void r(ayr ayrVar, List list) {
        aiu m = ayrVar.m();
        int i = m.b;
        if (i > 0) {
            Object[] objArr = m.a;
            int i2 = 0;
            do {
                ayr ayrVar2 = (ayr) objArr[i2];
                if (ayrVar2.ad() && !ayrVar2.r) {
                    if (ayrVar2.n.j(8)) {
                        list.add(bek.g(ayrVar2, this.f));
                    } else {
                        r(ayrVar2, list);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void s(List list) {
        List m = m(false);
        int size = m.size();
        for (int i = 0; i < size; i++) {
            bfh bfhVar = (bfh) m.get(i);
            if (bfhVar.q()) {
                list.add(bfhVar);
            } else if (!bfhVar.c.c) {
                bfhVar.s(list);
            }
        }
    }

    public final long a() {
        azq d = d();
        if (d != null) {
            if (true != d.j()) {
                d = null;
            }
            if (d != null) {
                return nd.e(d);
            }
        }
        return 0L;
    }

    public final aql b() {
        azq d = d();
        if (d != null) {
            if (true != d.j()) {
                d = null;
            }
            if (d != null) {
                return nd.g(d);
            }
        }
        return aql.a;
    }

    public final aql c() {
        azq d = d();
        if (d != null) {
            if (true != d.j()) {
                d = null;
            }
            if (d != null) {
                return nd.h(d);
            }
        }
        return aql.a;
    }

    public final azq d() {
        if (this.d) {
            bfh g = g();
            if (g != null) {
                return g.d();
            }
            return null;
        }
        bek.h(this.b);
        return qg.g(this.a, 8);
    }

    public final bfe e() {
        if (q()) {
            bfe bfeVar = this.c;
            bfe bfeVar2 = new bfe();
            bfeVar2.b = bfeVar.b;
            bfeVar2.c = bfeVar.c;
            bfeVar2.a.putAll(bfeVar.a);
            p(bfeVar2);
            return bfeVar2;
        }
        return this.c;
    }

    public final bfh f() {
        return new bfh(this.a, true, this.b, this.c);
    }

    public final bfh g() {
        ayr ayrVar;
        bfh bfhVar = this.g;
        if (bfhVar != null) {
            return bfhVar;
        }
        if (this.f) {
            ayrVar = amr.c(this.b, bas.m);
        } else {
            ayrVar = null;
        }
        if (ayrVar == null) {
            ayrVar = amr.c(this.b, bas.n);
        }
        if (ayrVar == null) {
            return null;
        }
        return bek.g(ayrVar, this.f);
    }

    public final List h() {
        return l(this, false, 7);
    }

    public final List i() {
        return l(this, true, 4);
    }

    public final boolean j() {
        azq d = d();
        if (d != null) {
            return d.am();
        }
        return false;
    }

    public final List k(boolean z, boolean z2) {
        if (!z && this.c.c) {
            return mlx.a;
        }
        if (q()) {
            ArrayList arrayList = new ArrayList();
            s(arrayList);
            return arrayList;
        }
        return m(z2);
    }

    public final List m(boolean z) {
        String str;
        if (this.d) {
            return mlx.a;
        }
        ArrayList arrayList = new ArrayList();
        r(this.b, arrayList);
        if (z) {
            bfe bfeVar = this.c;
            bfn bfnVar = bfj.a;
            bfb bfbVar = (bfb) bej.b(bfeVar, bfj.q);
            if (bfbVar != null && this.c.b && !arrayList.isEmpty()) {
                arrayList.add(o(bfbVar, new bas(11)));
            }
            if (this.c.d(bfj.a) && !arrayList.isEmpty()) {
                bfe bfeVar2 = this.c;
                if (bfeVar2.b) {
                    List list = (List) bej.b(bfeVar2, bfj.a);
                    if (list != null) {
                        str = (String) mkm.X(list);
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(0, o(null, new bco(str, 5)));
                    }
                }
            }
        }
        return arrayList;
    }
}
