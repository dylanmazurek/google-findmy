package defpackage;

import android.accounts.Account;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyo extends dxu {
    public static final jnk b = jnk.l("com/google/android/apps/adm/controllers/DeviceListController");
    public final ewc c;
    public final lqz d;
    public final dyx e;
    public pf f;
    public final ewf g;
    public final dyw h;
    public njz i;
    private final evy j;
    private final pk k;
    private final Map l;
    private ewk m;
    private ewk n;
    private ewk o;
    private ewk p;
    private ewk q;
    private final Executor r;
    private final eay s;
    private final ehr t;

    public dyo(evy evyVar, pk pkVar, ewc ewcVar, ewf ewfVar, Map map, lqz lqzVar, dyw dywVar, dyx dyxVar, ehr ehrVar, eay eayVar, Executor executor) {
        this.j = evyVar;
        this.k = pkVar;
        this.c = ewcVar;
        this.g = ewfVar;
        this.l = map;
        this.d = lqzVar;
        this.h = dywVar;
        this.e = dyxVar;
        this.t = ehrVar;
        this.s = eayVar;
        this.r = executor;
    }

    private final void i() {
        njz njzVar;
        a();
        dyw dywVar = this.h;
        Account b2 = this.j.b();
        dywVar.a();
        if (b2 != null && (njzVar = this.i) != null && !((dyq) njzVar.a).i()) {
            eay eayVar = this.s;
            ivc.N(mpd.r(eayVar.e, new eau(eayVar, (mmx) null, 0)), new dup(this, 2), this.r);
        } else {
            this.g.e(null);
        }
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void b() {
        super.b();
        int i = 1;
        this.m = new dyn(this, 1);
        int i2 = 2;
        this.n = new dyn(this, 2);
        this.o = new dyn(this, 0);
        this.p = new dym(this, 0);
        this.q = new dym(this, 2);
        if (this.f == null) {
            this.f = this.k.a("auth_error_resolution_request_key", new pq(), new dyd(this, i2));
        }
        this.j.d(this.m);
        this.c.g(this.n);
        this.c.e(this.o);
        this.g.b(this.p);
        this.g.c(this.q);
        ewc ewcVar = this.c;
        if (ewcVar.c != null && !ewcVar.h) {
            this.h.d(new dyl(this, i));
        } else {
            i();
        }
        f();
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void c() {
        this.j.h(this.m);
        this.c.n(this.n);
        this.c.l(this.o);
        this.g.f(this.p);
        this.g.g(this.q);
        this.h.a();
        pf pfVar = this.f;
        if (pfVar != null) {
            pfVar.a();
            this.f = null;
        }
        super.c();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, ehq] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, ehq] */
    public final jyz d(lor lorVar) {
        jis jisVar = this.c.c;
        final hzc hzcVar = lorVar.d;
        if (hzcVar instanceof los) {
            lqf lqfVar = ((los) hzcVar).c;
            eht ehtVar = (eht) this.l.get(lqfVar);
            if (ehtVar == null) {
                ((jni) ((jni) b.g()).j("com/google/android/apps/adm/controllers/DeviceListController", "onDeepLinkReady", 263, "DeviceListController.java")).u("No DeviceTypeHandler implementation for %s", lqfVar.name());
            } else {
                ehtVar.c(lorVar, (ebf) this.d.a());
            }
        } else if (hzcVar != null && jisVar != null) {
            jer a = jht.b(jisVar).a(new jet() { // from class: dyk
                @Override // defpackage.jet
                public final boolean a(Object obj) {
                    lqd lqdVar = ((lqc) obj).d;
                    if (lqdVar == null) {
                        lqdVar = lqd.d;
                    }
                    dyo dyoVar = dyo.this;
                    return dyoVar.e.a(lqdVar, hzcVar);
                }
            });
            if (a.g()) {
                this.g.h((lqc) a.c());
                jer g = this.t.g();
                if (g.g()) {
                    lqd j = g.c().j();
                    lqd lqdVar = ((lqc) a.c()).d;
                    if (lqdVar == null) {
                        lqdVar = lqd.d;
                    }
                    if (j.equals(lqdVar)) {
                        g.c().k(lorVar.b);
                    }
                }
                return ivc.D(new Exception("DeviceListController is not ready to process this deep link"));
            }
            ((jni) ((jni) b.g()).j("com/google/android/apps/adm/controllers/DeviceListController", "onDeepLinkReady", 291, "DeviceListController.java")).r("Ignoring a deep link with an unknown device");
        } else {
            return iuu.o(e(lorVar, jis.o(this.l.values()), 0), new emc(this, lorVar, 1, null), this.r);
        }
        return jyv.a;
    }

    public final jyz e(lor lorVar, jis jisVar, int i) {
        if (i >= jisVar.size()) {
            return ivc.E(jdl.a);
        }
        return iuu.p(((eht) jisVar.get(i)).a(lorVar), new enm(this, lorVar, jisVar, i, 1), jxv.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ehq] */
    public final void f() {
        a();
        if (h()) {
            jer g = this.t.g();
            if (g.g()) {
                g.c().f();
            }
        }
    }

    public final void g() {
        if (this.a) {
            i();
        } else {
            this.c.h = true;
        }
    }

    public final boolean h() {
        if (this.g.a() != null) {
            return true;
        }
        return false;
    }
}
