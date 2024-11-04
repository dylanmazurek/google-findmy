package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijb {
    private static final long d;
    public final jrl a;
    public final double b;
    public final int c;
    private final double e;
    private final jrl f;
    private final lix g;

    static {
        int i = lmg.a;
        ljh k = lix.c.k();
        long y = iqh.y(20L, 60L);
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        ((lix) ljnVar).a = y;
        if (!ljnVar.y()) {
            k.t();
        }
        ((lix) k.b).b = 0;
        lix lixVar = (lix) k.q();
        lmg.c(lixVar);
        d = lixVar.a;
    }

    public ijb(hot hotVar) {
        double ag = hwx.ag(hotVar.f());
        this.e = ag;
        this.a = jrl.a(ag + ag);
        this.f = jrl.a(hwx.ag(hotVar.f() + 2));
        this.b = Math.cos(ag);
        this.g = lmg.a(Math.max((int) lyk.a.a().b((Context) hotVar.a), d));
        this.c = (int) lyk.a.a().d((Context) hotVar.a);
    }

    public final jis a(jro jroVar, jis jisVar, int i, lln llnVar) {
        jin jinVar = new jin();
        for (int i2 = 0; i2 < ((jmi) jisVar).c; i2++) {
            ija ijaVar = (ija) jisVar.get(i2);
            if (new jrl(jroVar, ijaVar.c).e < this.f.e) {
                jinVar.h(ijaVar);
            }
        }
        jis g = jinVar.g();
        jmi jmiVar = (jmi) g;
        if (jmiVar.c >= i && lmi.a(((ija) g.get(0)).b, llnVar) >= 0) {
            jmx it = g.iterator();
            ija ijaVar2 = (ija) it.next();
            jmx it2 = g.iterator();
            ija ijaVar3 = (ija) it2.next();
            while (true) {
                if (b(ijaVar3, ijaVar2) && it2.hasNext()) {
                    ijaVar3 = (ija) it2.next();
                    if (it2.b - it.previousIndex() == i && b(ijaVar3, ijaVar2)) {
                        return g.subList(it.previousIndex(), it2.b);
                    }
                } else {
                    if (it2.b > jmiVar.c) {
                        break;
                    }
                    ijaVar2 = (ija) it.next();
                    if (lmi.a(ijaVar2.b, llnVar) < 0 || jmiVar.c - it.previousIndex() < i) {
                        break;
                    }
                }
            }
        }
        return jmi.a;
    }

    public final boolean b(ija ijaVar, ija ijaVar2) {
        boolean z;
        lln llnVar = ijaVar.b;
        lmi.f(llnVar);
        lln llnVar2 = ijaVar2.b;
        lmi.f(llnVar2);
        long z2 = iqh.z(llnVar2.a, llnVar.a);
        int i = llnVar2.b;
        int i2 = llnVar.b;
        long j = i - i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        iqh.u(z, "checkedSubtract", i, i2);
        lix b = lmg.b(z2, i3);
        lmg.c(b);
        lix lixVar = this.g;
        lmg.c(lixVar);
        int compare = Long.compare(b.a, lixVar.a);
        if (compare == 0) {
            compare = Integer.compare(b.b, lixVar.b);
        }
        if (compare <= 0) {
            return true;
        }
        return false;
    }
}
