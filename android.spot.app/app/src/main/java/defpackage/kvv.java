package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvv extends mbs {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public mca d;
    public mbc e;
    private final jis g;
    private final Queue h;
    private final Set i;
    private int j;
    private boolean k;
    private boolean l;
    private mbc m;

    public kvv(mjo mjoVar, jis jisVar, Set set) {
        super(mjoVar);
        this.a = new LinkedHashMap();
        this.h = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.g = jisVar;
        this.j = jisVar.size();
        this.i = set;
    }

    private final void Q() {
        if (!j() && this.h.isEmpty() && this.l && !this.c) {
            i();
        }
    }

    @Override // defpackage.mbs, defpackage.mjo
    public final void S(mbc mbcVar) {
        this.m = mbcVar;
        mbcVar.getClass();
        Iterator it = hzc.J(this.g.subList(0, this.j)).iterator();
        while (it.hasNext()) {
            this.j--;
            for (kvm kvmVar : hzc.J((List) it.next())) {
                if (this.i.contains(kvmVar)) {
                    try {
                        kvmVar.c();
                    } catch (Throwable th) {
                        this.d = mca.b(th);
                        this.e = new mbc();
                        i();
                        return;
                    }
                }
            }
            if (j()) {
                return;
            }
        }
        this.f.S(this.m);
        this.k = true;
        h();
    }

    @Override // defpackage.mjo
    public final void a(mca mcaVar, mbc mbcVar) {
        this.d = mcaVar;
        this.e = mbcVar;
        this.l = true;
        Q();
    }

    @Override // defpackage.mbs, defpackage.mjo
    public final void f(Object obj) {
        this.h.add(new kvu(obj, this.g.size()));
        h();
    }

    public final void h() {
        if (this.k) {
            for (kvu kvuVar : this.h) {
                Iterator it = hzc.J(this.g.subList(0, kvuVar.b)).iterator();
                while (it.hasNext()) {
                    for (kvm kvmVar : hzc.J((List) it.next())) {
                        if (this.i.contains(kvmVar)) {
                            kvuVar.a.getClass();
                            try {
                                kvmVar.d();
                            } catch (Throwable th) {
                                this.d = mca.b(th);
                                this.e = new mbc();
                                i();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (kvuVar.a()) {
                        return;
                    } else {
                        kvuVar.b--;
                    }
                }
            }
            while (!this.h.isEmpty()) {
                kvu kvuVar2 = (kvu) this.h.peek();
                if (kvuVar2.a() || kvuVar2.b != 0) {
                    break;
                } else {
                    this.f.f(((kvu) this.h.poll()).a);
                }
            }
            Q();
        }
    }

    public final void i() {
        Iterator it = hzc.J(this.g).iterator();
        while (it.hasNext()) {
            for (kvm kvmVar : hzc.J((List) it.next())) {
                ktf ktfVar = new ktf(this.d, this.e);
                if (this.i.contains(kvmVar)) {
                    try {
                        kvmVar.e(ktfVar);
                    } catch (Throwable th) {
                        this.d = mca.b(th);
                        this.e = new mbc();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            this.f.a(this.d, this.e);
        }
    }

    public final boolean j() {
        if (!this.a.isEmpty()) {
            return true;
        }
        return false;
    }
}
