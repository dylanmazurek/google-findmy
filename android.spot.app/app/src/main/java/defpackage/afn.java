package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afn extends abt {
    public static final myu n = myv.a(akv.a);
    private static final AtomicReference q = new AtomicReference(false);
    public long a;
    public final aaz b;
    public final Object c;
    public muf d;
    public Throwable e;
    public final aiu f;
    public final List g;
    public final Map h;
    public final Map i;
    public Set j;
    public msd k;
    public boolean l;
    public final aez m;
    public final myu o;
    public sy p;
    private final List r;
    private List s;
    private final List t;
    private List u;
    private aey v;
    private final mnb w;
    private final mui x;

    public afn(mnb mnbVar) {
        aaz aazVar = new aaz(new afb(this));
        this.b = aazVar;
        this.c = new Object();
        this.r = new ArrayList();
        this.p = new sy((byte[]) null);
        this.f = new aiu(new ach[16]);
        this.t = new ArrayList();
        this.g = new ArrayList();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.o = myv.a(afa.Inactive);
        mui muiVar = new mui((muf) mnbVar.get(muf.c));
        muiVar.w(new afd(this));
        this.x = muiVar;
        this.w = mnbVar.plus(aazVar).plus(muiVar);
        this.m = new aez();
    }

    public static final void C(ams amsVar) {
        try {
            if (!(amsVar.c() instanceof ana)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            amsVar.d();
        }
    }

    private static final void E(List list, afn afnVar, ach achVar) {
        list.clear();
        synchronized (afnVar.c) {
            Iterator it = afnVar.g.iterator();
            while (it.hasNext()) {
                ado adoVar = (ado) it.next();
                if (amr.i(adoVar.c, achVar)) {
                    list.add(adoVar);
                    it.remove();
                }
            }
        }
    }

    private final void F(ach achVar) {
        this.r.remove(achVar);
        this.s = null;
    }

    private final boolean G() {
        if (!this.f.m() && !x()) {
            return false;
        }
        return true;
    }

    public final void H(Exception exc, ach achVar) {
        if (((Boolean) q.get()).booleanValue() && !(exc instanceof abf)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.t.clear();
                this.f.f();
                this.p = new sy((byte[]) null);
                this.g.clear();
                this.h.clear();
                this.i.clear();
                this.v = new aey(exc);
                if (achVar != null) {
                    w(achVar);
                }
                t();
            }
            return;
        }
        synchronized (this.c) {
            aey aeyVar = this.v;
            if (aeyVar == null) {
                this.v = new aey(exc);
            } else {
                throw aeyVar.a;
            }
        }
        throw exc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:            r3 = r10.size();        r4 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:            if (r4 >= r3) goto L195;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:            if (((defpackage.mkw) r10.get(r4)).b == null) goto L194;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:            r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:            r3 = new java.util.ArrayList(r10.size());        r4 = r10.size();        r9 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:            if (r9 >= r4) goto L196;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:            r11 = (defpackage.mkw) r10.get(r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:            if (r11.b != null) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:            r11 = (defpackage.ado) r11.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:            if (r11 == null) goto L198;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:            r3.add(r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:            r9 = r9 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:            r11 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:            r4 = r18.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:            monitor-enter(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0120, code lost:            defpackage.mkm.an(r18.g, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0125, code lost:            monitor-exit(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0126, code lost:            r3 = new java.util.ArrayList(r10.size());        r4 = r10.size();        r9 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:            if (r9 >= r4) goto L199;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0136, code lost:            r11 = r10.get(r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013f, code lost:            if (((defpackage.mkw) r11).b == null) goto L201;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0141, code lost:            r3.add(r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0144, code lost:            r9 = r9 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:            r10 = r3;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A(java.util.List r19, defpackage.sy r20) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afn.A(java.util.List, sy):java.util.List");
    }

    @Override // defpackage.abt
    public final int a() {
        return 1000;
    }

    @Override // defpackage.abt
    public final adn b(ado adoVar) {
        adn adnVar;
        synchronized (this.c) {
            adnVar = (adn) this.i.remove(adoVar);
        }
        return adnVar;
    }

    @Override // defpackage.abt
    public final mnb d() {
        return this.w;
    }

    @Override // defpackage.abt
    public final void e(ach achVar, mol molVar) {
        boolean p = achVar.p();
        try {
            ams i = amy.i(new afg(achVar), new afm(achVar, null));
            try {
                amz w = i.w();
                try {
                    synchronized (((abw) achVar).b) {
                        ((abw) achVar).i();
                        su s = ((abw) achVar).s();
                        try {
                            abw.u();
                            abp abpVar = ((abw) achVar).i;
                            if (!abpVar.d.d()) {
                                abr.i("Expected applyChanges() to have been called");
                            }
                            abpVar.ad(s, molVar);
                        } catch (Exception e) {
                            ((abw) achVar).m = s;
                            throw e;
                        }
                    }
                    if (!p) {
                        amy.d();
                    }
                    synchronized (this.c) {
                        if (((afa) this.o.c()).compareTo(afa.ShuttingDown) > 0 && !g().contains(achVar)) {
                            this.r.add(achVar);
                            this.s = null;
                        }
                    }
                    try {
                        synchronized (this.c) {
                            List list = this.g;
                            int size = list.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                if (amr.i(((ado) list.get(i2)).c, achVar)) {
                                    ArrayList arrayList = new ArrayList();
                                    E(arrayList, this, achVar);
                                    while (!arrayList.isEmpty()) {
                                        A(arrayList, null);
                                        E(arrayList, this, achVar);
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                        try {
                            achVar.e();
                            achVar.f();
                            if (!p) {
                                amy.d();
                            }
                        } catch (Exception e2) {
                            H(e2, null);
                        }
                    } catch (Exception e3) {
                        H(e3, achVar);
                    }
                } catch (Throwable th) {
                    try {
                        try {
                            Set set = ((abw) achVar).c;
                            if (!set.isEmpty()) {
                                new abv(set).a();
                            }
                            throw th;
                        } catch (Exception e4) {
                            ((abw) achVar).d();
                            throw e4;
                        }
                    } finally {
                        amz.E(w);
                    }
                }
            } finally {
                C(i);
            }
        } catch (Exception e5) {
            H(e5, achVar);
        }
    }

    @Override // defpackage.abt
    public final void f(ado adoVar) {
        synchronized (this.c) {
            Map map = this.h;
            adm admVar = adoVar.a;
            Object obj = map.get(admVar);
            if (obj == null) {
                obj = new ArrayList();
                map.put(admVar, obj);
            }
            ((List) obj).add(adoVar);
        }
    }

    public final List g() {
        List list = this.s;
        if (list == null) {
            List list2 = this.r;
            if (list2.isEmpty()) {
                list = mlx.a;
            } else {
                list = new ArrayList(list2);
            }
            this.s = list;
        }
        return list;
    }

    @Override // defpackage.abt
    public final void i(ach achVar) {
        msd msdVar;
        synchronized (this.c) {
            if (!this.f.k(achVar)) {
                this.f.o(achVar);
                msdVar = t();
            } else {
                msdVar = null;
            }
        }
        if (msdVar != null) {
            msdVar.p(mlh.a);
        }
    }

    @Override // defpackage.abt
    public final void j(ado adoVar, adn adnVar) {
        synchronized (this.c) {
            this.i.put(adoVar, adnVar);
        }
    }

    @Override // defpackage.abt
    public final void m(ach achVar) {
        synchronized (this.c) {
            Set set = this.j;
            if (set == null) {
                set = new LinkedHashSet();
                this.j = set;
            }
            set.add(achVar);
        }
    }

    @Override // defpackage.abt
    public final void p(ach achVar) {
        synchronized (this.c) {
            F(achVar);
            this.f.n(achVar);
            this.t.remove(achVar);
        }
    }

    @Override // defpackage.abt
    public final boolean q() {
        return ((Boolean) q.get()).booleanValue();
    }

    @Override // defpackage.abt
    public final boolean r() {
        return false;
    }

    @Override // defpackage.abt
    public final boolean s() {
        return false;
    }

    public final msd t() {
        afa afaVar;
        if (((afa) this.o.c()).compareTo(afa.ShuttingDown) <= 0) {
            this.r.clear();
            this.s = mlx.a;
            this.p = new sy((byte[]) null);
            this.f.f();
            this.t.clear();
            this.g.clear();
            this.u = null;
            msd msdVar = this.k;
            if (msdVar != null) {
                msdVar.i(null);
            }
            this.k = null;
            this.v = null;
            return null;
        }
        if (this.v != null) {
            afaVar = afa.Inactive;
        } else if (this.d == null) {
            this.p = new sy((byte[]) null);
            this.f.f();
            if (x()) {
                afaVar = afa.InactivePendingWork;
            } else {
                afaVar = afa.Inactive;
            }
        } else if (!this.f.m() && !this.p.c() && this.t.isEmpty() && this.g.isEmpty() && !x()) {
            afaVar = afa.Idle;
        } else {
            afaVar = afa.PendingWork;
        }
        this.o.e(afaVar);
        if (afaVar != afa.PendingWork) {
            return null;
        }
        msd msdVar2 = this.k;
        this.k = null;
        return msdVar2;
    }

    public final void u() {
        synchronized (this.c) {
            if (((afa) this.o.c()).compareTo(afa.Idle) >= 0) {
                this.o.e(afa.ShuttingDown);
            }
        }
        this.x.s(null);
    }

    public final void v() {
        synchronized (this.c) {
            this.l = true;
        }
    }

    public final void w(ach achVar) {
        List list = this.u;
        if (list == null) {
            list = new ArrayList();
            this.u = list;
        }
        if (!list.contains(achVar)) {
            list.add(achVar);
        }
        F(achVar);
    }

    public final boolean x() {
        if (!this.l && this.b.d.get() != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.p.c() && !this.f.m()) {
                if (!x()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final boolean z() {
        List g;
        boolean G;
        synchronized (this.c) {
            if (this.p.b()) {
                return G();
            }
            aix aixVar = new aix(this.p);
            this.p = new sy((byte[]) null);
            synchronized (this.c) {
                g = g();
            }
            try {
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    ((ach) g.get(i)).m(aixVar);
                    if (((afa) this.o.c()).compareTo(afa.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    this.p = new sy((byte[]) null);
                }
                synchronized (this.c) {
                    if (t() == null) {
                        G = G();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return G;
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.p.j(aixVar);
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.abt
    public final void k(Set set) {
    }
}
