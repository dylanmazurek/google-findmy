package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cso implements crf, ctl, cqs {
    Boolean a;
    private final Context b;
    private final csn d;
    private boolean e;
    private final crd g;
    private final csp i;
    private final hph j;
    private final eld k;
    private final bet l;
    private final elo m;
    private final Map c = new HashMap();
    private final Object f = new Object();
    private final elo n = new elo((char[]) null);
    private final Map h = new HashMap();

    static {
        cqc.a("GreedyScheduler");
    }

    public cso(Context context, hph hphVar, nca ncaVar, crd crdVar, elo eloVar, eld eldVar) {
        this.b = context;
        bet betVar = (bet) hphVar.c;
        this.d = new csn(this, betVar);
        this.i = new csp(betVar, eloVar);
        this.k = eldVar;
        this.l = new bet(ncaVar);
        this.j = hphVar;
        this.g = crdVar;
        this.m = eloVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(cxc.a(this.b, this.j));
    }

    private final void g() {
        if (!this.e) {
            this.g.c(this);
            this.e = true;
        }
    }

    @Override // defpackage.cqs
    public final void a(cvk cvkVar, boolean z) {
        muf mufVar;
        bet G = this.n.G(cvkVar);
        if (G != null) {
            this.i.a(G);
        }
        synchronized (this.f) {
            mufVar = (muf) this.c.remove(cvkVar);
        }
        if (mufVar != null) {
            cqc.b();
            Objects.toString(cvkVar);
            mufVar.s(null);
        }
        if (!z) {
            synchronized (this.f) {
                this.h.remove(cvkVar);
            }
        }
    }

    @Override // defpackage.crf
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            cqc.b();
            return;
        }
        g();
        cqc.b();
        csn csnVar = this.d;
        if (csnVar != null && (runnable = (Runnable) csnVar.b.remove(str)) != null) {
            csnVar.c.r(runnable);
        }
        for (bet betVar : this.n.y(str)) {
            this.i.a(betVar);
            bpi.f(this.m, betVar);
        }
    }

    @Override // defpackage.crf
    public final void c(cvu... cvuVarArr) {
        long max;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            cqc.b();
            return;
        }
        g();
        HashSet<cvu> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (cvu cvuVar : cvuVarArr) {
            if (!this.n.z(cuv.b(cvuVar))) {
                synchronized (this.f) {
                    cvk b = cuv.b(cvuVar);
                    noq noqVar = (noq) this.h.get(b);
                    if (noqVar == null) {
                        int i = cvuVar.k;
                        Object obj = this.j.b;
                        noqVar = new noq(i, System.currentTimeMillis());
                        this.h.put(b, noqVar);
                    }
                    max = noqVar.b + (Math.max((cvuVar.k - noqVar.a) - 5, 0) * 30000);
                }
                long max2 = Math.max(cvuVar.a(), max);
                Object obj2 = this.j.b;
                long currentTimeMillis = System.currentTimeMillis();
                if (cvuVar.w == 1) {
                    if (currentTimeMillis < max2) {
                        csn csnVar = this.d;
                        if (csnVar != null) {
                            Runnable runnable = (Runnable) csnVar.b.remove(cvuVar.b);
                            if (runnable != null) {
                                csnVar.c.r(runnable);
                            }
                            bx bxVar = new bx(csnVar, cvuVar, 20, (char[]) null);
                            csnVar.b.put(cvuVar.b, bxVar);
                            csnVar.c.s(max2 - System.currentTimeMillis(), bxVar);
                        }
                    } else if (cvuVar.b()) {
                        cpl cplVar = cvuVar.j;
                        if (Build.VERSION.SDK_INT >= 23 && cplVar.d) {
                            cqc.b();
                            Objects.toString(cvuVar);
                        } else if (Build.VERSION.SDK_INT >= 24 && cplVar.b()) {
                            cqc.b();
                            Objects.toString(cvuVar);
                        } else {
                            hashSet.add(cvuVar);
                            hashSet2.add(cvuVar.b);
                        }
                    } else if (!this.n.z(cuv.b(cvuVar))) {
                        cqc.b();
                        String str = cvuVar.b;
                        elo eloVar = this.n;
                        cvuVar.getClass();
                        bet H = eloVar.H(cuv.b(cvuVar));
                        this.i.b(H);
                        this.m.E(H);
                    }
                }
            }
        }
        synchronized (this.f) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                cqc.b();
                for (cvu cvuVar2 : hashSet) {
                    cvk b2 = cuv.b(cvuVar2);
                    if (!this.c.containsKey(b2)) {
                        this.c.put(b2, ctr.a(this.l, cvuVar2, (mst) this.k.d, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.crf
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ctl
    public final void e(cvu cvuVar, ctd ctdVar) {
        boolean z = ctdVar instanceof ctg;
        cvk b = cuv.b(cvuVar);
        if (z) {
            if (!this.n.z(b)) {
                cqc.b();
                Objects.toString(b);
                b.toString();
                bet H = this.n.H(b);
                this.i.b(H);
                this.m.E(H);
                return;
            }
            return;
        }
        cqc.b();
        Objects.toString(b);
        b.toString();
        bet G = this.n.G(b);
        if (G != null) {
            this.i.a(G);
            this.m.F(G, ((cth) ctdVar).a);
        }
    }
}
