package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvt extends lyv {
    public final Executor a;
    public int d;
    public kvs e;
    public final kvr g;
    public lyv i;
    public mjo j;
    private final lyt k;
    private final mbg l;
    private final jis m;
    private lys q;
    private int s;
    private mbc t;
    public final Set b = jql.n();
    private final LinkedHashMap n = new LinkedHashMap();
    private final Set o = jql.n();
    public boolean f = false;
    public boolean h = false;
    public final Deque c = new ArrayDeque();
    private final Queue r = new ArrayDeque();
    private final Queue p = new ArrayDeque();

    public kvt(lyt lytVar, mbg mbgVar, lys lysVar, jis jisVar) {
        this.k = lytVar;
        this.l = mbgVar;
        this.q = lysVar;
        this.m = jisVar;
        this.e = new kvs(((jmi) jisVar).c, 1, 0, 0);
        Executor executor = lysVar.c;
        kvr kvrVar = new kvr(executor == null ? jxv.a : executor);
        this.g = kvrVar;
        this.a = new jze(this, (Executor) new jzl(kvrVar), 2);
    }

    private final void k() {
        while (!this.c.isEmpty()) {
            kvq kvqVar = (kvq) this.c.peek();
            if (kvqVar.b.isEmpty() && kvqVar.c == kvqVar.d.e.a) {
                Object obj = ((kvq) this.c.poll()).a;
                if (this.e.e == 4) {
                    this.i.f(obj);
                } else {
                    this.p.add(obj);
                }
            } else {
                return;
            }
        }
    }

    private final void l(kvq kvqVar, int i, int i2) {
        hwx hwxVar = new hwx(kvqVar.a);
        for (int i3 = i; i3 < i2; i3++) {
            jis jisVar = (jis) this.m.get(i3);
            int size = jisVar.size();
            int i4 = 0;
            while (i4 < size) {
                kvm kvmVar = (kvm) jisVar.get(i4);
                kvy b = kvmVar.b();
                if (b.c == 4) {
                    jyz a = b.a();
                    kvqVar.b.put(kvmVar, a);
                    a.c(jbn.f(new hlt(this, hwxVar, kvqVar, 19, (char[]) null)), this.a);
                }
                i4++;
                if (n(b)) {
                    return;
                }
            }
        }
        kvqVar.c = i2;
        if (kvqVar.b.isEmpty()) {
            k();
            b();
        }
    }

    private final void m() {
        boolean z;
        kvs kvsVar;
        kvs kvsVar2 = this.e;
        if (kvsVar2.e != 4) {
            z = false;
        } else {
            z = true;
        }
        hwx.V(!z, "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        int i = kvsVar2.e;
        if (i == 3) {
            kvsVar = new kvs(kvsVar2.a, 4, kvsVar2.b, kvsVar2.c);
        } else {
            if (i == 1) {
                boolean z2 = kvsVar2.d;
            }
            int i2 = kvsVar2.b;
            int i3 = i2 + 1;
            int i4 = kvsVar2.a;
            int i5 = kvsVar2.c;
            if (i3 < i4) {
                kvsVar = new kvs(i4, 1, i3, i5);
            } else {
                kvsVar = new kvs(i4, 3, i2, i5);
            }
        }
        this.e = kvsVar;
        int i6 = kvsVar.e - 1;
        if (i6 != 0) {
            if (i6 != 2) {
                g();
                return;
            }
            lyv a = this.k.a(this.l, this.q);
            this.i = a;
            a.a(this.j, this.t);
            int i7 = this.d;
            if (i7 > 0) {
                this.i.e(i7);
            }
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                this.i.f(it.next());
            }
            if (this.f && this.c.isEmpty()) {
                this.i.d();
            }
            m();
            return;
        }
        h(this.t);
    }

    private final boolean n(kvy kvyVar) {
        int i = kvyVar.c - 1;
        if (i != 0) {
            if (i != 1) {
                if (i == 3) {
                    jyz a = kvyVar.a();
                    this.b.add(a);
                    a.c(jbn.f(new koq(this, a, 13, null)), this.a);
                    return false;
                }
                throw null;
            }
            kuv kuvVar = kvyVar.d;
            this.j.a((mca) kuvVar.b, (mbc) kuvVar.a);
            if (this.e.e == 4) {
                this.i.c("Aborted RPC with exception", ((mca) kuvVar.b).n);
            }
            this.h = true;
            return true;
        }
        lys lysVar = kvyVar.b;
        if (lysVar != null) {
            if (this.e.e != 1) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot return proceedWithCallOptions() from message processing methods");
                this.j.a(mca.b(illegalStateException), new mbc());
                if (this.e.e == 4) {
                    this.i.c("Interceptor returned invalid outcome", illegalStateException);
                }
                return true;
            }
            this.q = lysVar;
        }
        return false;
    }

    private final nqe o(lys lysVar, mbc mbcVar, String str) {
        lysVar.getClass();
        mbcVar.getClass();
        str.getClass();
        return new nqe(this.l, lysVar, mbcVar, str);
    }

    private final nqe p(nqe nqeVar) {
        lys lysVar = this.q;
        if (lysVar == nqeVar.d) {
            return nqeVar;
        }
        return o(lysVar, (mbc) nqeVar.c, (String) nqeVar.a);
    }

    @Override // defpackage.lyv
    public final void a(mjo mjoVar, mbc mbcVar) {
        this.j = new kvp(this, new kwa(new kvv(mjoVar, this.m, this.o)));
        this.t = mbcVar;
        this.a.execute(jbn.f(new koq(this, mbcVar, 14)));
    }

    public final void b() {
        if (this.f) {
            kvq kvqVar = (kvq) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && kvqVar == null) {
                    this.i.d();
                    return;
                }
                return;
            }
            if (kvqVar == null || (kvqVar.b.isEmpty() && kvqVar.c == kvqVar.d.e.c + 1)) {
                m();
            }
        }
    }

    @Override // defpackage.lyv
    public final void c(String str, Throwable th) {
        this.a.execute(jbn.f(new hlt(this, str, th, 20)));
    }

    @Override // defpackage.lyv
    public final void d() {
        this.a.execute(jbn.f(new jxe(this, 14)));
    }

    @Override // defpackage.lyv
    public final void e(int i) {
        synchronized (this.r) {
            this.s += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        synchronized (this.r) {
            if (!this.r.isEmpty()) {
                int i2 = this.s;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object poll = this.r.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.s--;
                    }
                }
                boolean isEmpty = this.r.isEmpty();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.j.f(it.next());
                }
                if (isEmpty) {
                    this.j.a(mca.b, null);
                }
            }
        }
        this.a.execute(jbn.f(new bth(this, i, 7)));
    }

    @Override // defpackage.lyv
    public final void f(Object obj) {
        this.a.execute(jbn.f(new koq(this, obj, 15)));
    }

    public final void g() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i == 3) {
                for (kvq kvqVar : this.c) {
                    l(kvqVar, kvqVar.c, this.e.a);
                }
                return;
            }
            return;
        }
        for (kvq kvqVar2 : this.c) {
            int i2 = kvqVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                l(kvqVar2, i2, i3 + 1);
            }
        }
    }

    public final void h(mbc mbcVar) {
        nqe o = o(this.q, mbcVar, this.k.b());
        jis jisVar = (jis) this.m.get(this.e.b);
        int size = jisVar.size();
        for (int i = 0; i < size; i++) {
            kvm kvmVar = (kvm) jisVar.get(i);
            kvy g = kvmVar.g(p(o));
            if (g.c == 4) {
                jyz a = g.a();
                this.n.put(kvmVar, a);
                a.c(jbn.f(new koq(this, o, 17, null)), this.a);
            }
            if (!n(g)) {
                this.o.add(kvmVar);
            } else {
                return;
            }
        }
        if (this.n.isEmpty()) {
            m();
        }
    }

    public final void i(nqe nqeVar) {
        if (!this.n.isEmpty()) {
            Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((jyz) entry.getValue()).isDone()) {
                    break;
                }
                it.remove();
                kvm kvmVar = (kvm) entry.getKey();
                kvy f = kvmVar.f(p(nqeVar));
                if (f.c == 4) {
                    jyz a = f.a();
                    this.n.put(kvmVar, a);
                    a.c(jbn.f(new koq(this, nqeVar, 18, null)), this.a);
                }
                if (n(f)) {
                    return;
                }
            }
            if (this.n.isEmpty() && !this.h) {
                m();
            }
        }
    }

    public final void j(hwx hwxVar, kvq kvqVar) {
        Iterator it = kvqVar.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((jyz) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            kvm kvmVar = (kvm) entry.getKey();
            kvy a = kvmVar.a();
            if (a.c == 4) {
                jyz a2 = a.a();
                kvqVar.b.put(kvmVar, a2);
                a2.c(jbn.f(new kvo(this, hwxVar, kvqVar, 1, null)), this.a);
            }
            if (n(a)) {
                return;
            }
        }
        if (kvqVar.b.isEmpty()) {
            k();
            b();
        }
    }
}
