package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axp extends aow implements ayj, aya, baa, azz, axk, azx, ayc, aqb, azv, axw {
    public aov a;
    public boolean b;
    public final HashSet c;
    public avs d;
    private axf e;

    public axp(aov aovVar) {
        this.l = azr.a(aovVar);
        this.a = aovVar;
        this.b = true;
        this.c = new HashSet();
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        long j2;
        awi cd;
        aov aovVar = this.a;
        aovVar.getClass();
        uj ujVar = (uj) aovVar;
        to toVar = ujVar.b;
        awr l = awgVar.l(j);
        agt b = ujVar.c.b(new tn(toVar, ujVar, 0), new oq(toVar, 5));
        if (awjVar.n()) {
            j2 = bef.m(l.a, l.b);
        } else {
            j2 = ((blm) b.a()).a;
        }
        cd = awjVar.cd(blm.b(j2), blm.a(j2), mly.a, new tm(ujVar.b, l, j2));
        return cd;
    }

    @Override // defpackage.azz
    public final void bR() {
        aov aovVar = this.a;
        aovVar.getClass();
        ((auq) aovVar).d().a();
    }

    @Override // defpackage.azz
    public final /* synthetic */ void bS() {
        qo.c(this);
    }

    @Override // defpackage.azz
    public final /* synthetic */ void bT() {
        qo.d(this);
    }

    @Override // defpackage.azz
    public final void bU(auf aufVar, int i, long j) {
        aov aovVar = this.a;
        aovVar.getClass();
        ((auq) aovVar).d().b();
    }

    @Override // defpackage.azz
    public final void bV() {
        aov aovVar = this.a;
        aovVar.getClass();
        ((auq) aovVar).d();
        throw null;
    }

    @Override // defpackage.azz
    public final void bW() {
        aov aovVar = this.a;
        aovVar.getClass();
        ((auq) aovVar).d();
        throw null;
    }

    @Override // defpackage.aow
    public final void bZ() {
        u(true);
    }

    @Override // defpackage.ayc
    public final void c(avs avsVar) {
        aov aovVar = this.a;
        aovVar.getClass();
        ((awl) aovVar).d();
    }

    @Override // defpackage.aya
    public final void ca(ayt aytVar) {
        aov aovVar = this.a;
        aovVar.getClass();
        app appVar = (app) aovVar;
        if (this.b && (aovVar instanceof apo)) {
            qg.i(this).l.d(this, axq.a, new ob(aovVar, 17));
            this.b = false;
        }
        appVar.e();
    }

    @Override // defpackage.azx
    public final Object cb() {
        aov aovVar = this.a;
        aovVar.getClass();
        return (tl) aovVar;
    }

    @Override // defpackage.aya
    public final void d() {
        this.b = true;
        qh.e(this);
    }

    @Override // defpackage.axk
    public final axj e() {
        axf axfVar = this.e;
        if (axfVar != null) {
            return axfVar;
        }
        return axg.a;
    }

    @Override // defpackage.aqb
    public final void f(apy apyVar) {
        aov aovVar = this.a;
        if (!(aovVar instanceof apw)) {
            ll.g("applyFocusProperties called on wrong node");
        }
        ((apw) aovVar).d();
    }

    @Override // defpackage.baa
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.baa
    public final void i(bfe bfeVar) {
        aov aovVar = this.a;
        aovVar.getClass();
        bfe bfeVar2 = new bfe();
        bfeVar2.b = false;
        ((AppendedSemanticsElement) aovVar).a.a(bfeVar2);
        bfeVar.getClass();
        if (bfeVar2.b) {
            bfeVar.b = true;
        }
        if (bfeVar2.c) {
            bfeVar.c = true;
        }
        for (Map.Entry entry : bfeVar2.a.entrySet()) {
            bfn bfnVar = (bfn) entry.getKey();
            Object value = entry.getValue();
            if (!bfeVar.a.containsKey(bfnVar)) {
                bfeVar.a.put(bfnVar, value);
            } else if (value instanceof bev) {
                Object obj = bfeVar.a.get(bfnVar);
                obj.getClass();
                bfeVar.a.put(bfnVar, new bev(((bev) obj).a));
            }
        }
    }

    @Override // defpackage.aow
    public final void n() {
        w();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void u(boolean z) {
        if (!this.t) {
            ll.g("initializeModifier called on unattached node");
        }
        aov aovVar = this.a;
        if ((this.l & 32) != 0) {
            if (aovVar instanceof axh) {
                qg.i(this).x(new ob(this, 16));
            }
            if (aovVar instanceof axl) {
                axl axlVar = (axl) aovVar;
                axf axfVar = this.e;
                if (axfVar != null && axfVar.b(axlVar.e())) {
                    axfVar.a = axlVar;
                    axi axiVar = qg.i(this).v;
                    qg e = axlVar.e();
                    axiVar.a.o(this);
                    axiVar.b.o(e);
                    axiVar.a();
                } else {
                    this.e = new axf(axlVar);
                    if (axq.a(this)) {
                        axi axiVar2 = qg.i(this).v;
                        qg e2 = axlVar.e();
                        axiVar2.a.o(this);
                        axiVar2.b.o(e2);
                        axiVar2.a();
                    }
                }
            }
        }
        if ((this.l & 4) != 0) {
            if (aovVar instanceof apo) {
                this.b = true;
            }
            if (!z) {
                qi.c(this);
            }
        }
        if ((this.l & 2) != 0) {
            if (axq.a(this)) {
                azq azqVar = this.q;
                azqVar.getClass();
                ((aym) azqVar).C(this);
                azqVar.ad();
            }
            if (!z) {
                qi.c(this);
                qg.f(this).J();
            }
        }
        if (aovVar instanceof awt) {
            qg.f(this);
            ((awt) aovVar).d();
        }
        if ((this.l & 128) != 0) {
            if ((aovVar instanceof awo) && axq.a(this)) {
                qg.f(this).J();
            }
            if (aovVar instanceof awn) {
                this.d = null;
                if (axq.a(this)) {
                    baw i = qg.i(this);
                    i.o.d.o(new axo(this));
                    baw.F(i);
                }
            }
        }
        if ((this.l & 256) != 0 && (aovVar instanceof awl) && axq.a(this)) {
            qg.f(this).J();
        }
        if (aovVar instanceof aqe) {
            ((aqe) aovVar).d().c.o(this);
        }
        int i2 = this.l;
        if ((i2 & 16) != 0 && (aovVar instanceof auq)) {
            ((auq) aovVar).d();
            throw null;
        }
        if ((i2 & 8) != 0) {
            qg.i(this).v();
        }
    }

    public final void v(avs avsVar) {
        this.d = avsVar;
        aov aovVar = this.a;
        if (aovVar instanceof awn) {
            ((awn) aovVar).d();
        }
    }

    public final void w() {
        if (!this.t) {
            ll.g("unInitializeModifier called on unattached node");
        }
        aov aovVar = this.a;
        if ((this.l & 32) != 0) {
            if (aovVar instanceof axl) {
                axi axiVar = qg.i(this).v;
                qg e = ((axl) aovVar).e();
                axiVar.c.o(qg.f(this));
                axiVar.d.o(e);
                axiVar.a();
            }
            if (aovVar instanceof axh) {
                ((axh) aovVar).d();
            }
        }
        if ((this.l & 8) != 0) {
            qg.i(this).v();
        }
        if (aovVar instanceof aqe) {
            ((aqe) aovVar).d().c.n(this);
        }
    }

    public final void x() {
        if (this.t) {
            this.c.clear();
            qg.i(this).l.d(this, axq.b, new ob(this, 18));
        }
    }

    @Override // defpackage.azv
    public final boolean y() {
        return this.t;
    }

    public final void z() {
        aov aovVar = this.a;
        if (!(aovVar instanceof aps)) {
            ll.g("onFocusEvent called on wrong node");
        }
        ((aps) aovVar).d();
    }
}
