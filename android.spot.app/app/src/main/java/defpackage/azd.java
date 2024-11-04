package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class azd extends azc implements awg {
    private Map f;
    public final azq g;
    public long h = 0;
    public final awf l = new awf(this);
    public final Map m = new LinkedHashMap();
    private awi n;

    public azd(azq azqVar) {
        this.g = azqVar;
    }

    public final void A(awi awiVar) {
        mlh mlhVar;
        Map map;
        if (awiVar != null) {
            s(bef.m(awiVar.b(), awiVar.a()));
            mlhVar = mlh.a;
        } else {
            mlhVar = null;
        }
        if (mlhVar == null) {
            s(0L);
        }
        if (!amr.i(this.n, awiVar) && awiVar != null && ((((map = this.f) != null && !map.isEmpty()) || !awiVar.c().isEmpty()) && !amr.i(awiVar.c(), this.f))) {
            ((ayw) x()).n.e();
            Map map2 = this.f;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.f = map2;
            }
            map2.clear();
            map2.putAll(awiVar.c());
        }
        this.n = awiVar;
    }

    public final long B(azd azdVar) {
        long j = 0;
        azd azdVar2 = this;
        while (!amr.i(azdVar2, azdVar)) {
            j = blk.d(j, azdVar2.h);
            azq azqVar = azdVar2.g.u;
            azqVar.getClass();
            azdVar2 = azqVar.w();
            azdVar2.getClass();
        }
        return j;
    }

    @Override // defpackage.azc
    public final long E() {
        return this.h;
    }

    @Override // defpackage.azc
    public final avs F() {
        return this.l;
    }

    @Override // defpackage.azc
    public final awi G() {
        awi awiVar = this.n;
        if (awiVar != null) {
            return awiVar;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.azc
    public final azc H() {
        azq azqVar = this.g.t;
        if (azqVar != null) {
            return azqVar.w();
        }
        return null;
    }

    @Override // defpackage.azc
    public final void J() {
        r(this.h, 0.0f, null);
    }

    @Override // defpackage.azc
    public final boolean K() {
        if (this.n != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ble
    public final float a() {
        return this.g.a();
    }

    @Override // defpackage.blj
    public final float b() {
        return this.g.b();
    }

    @Override // defpackage.awr, defpackage.avq
    public final Object c() {
        return this.g.c();
    }

    @Override // defpackage.avr
    public final bln m() {
        return this.g.m();
    }

    @Override // defpackage.azc, defpackage.avr
    public final boolean n() {
        return true;
    }

    @Override // defpackage.awr
    public final void r(long j, float f, moh mohVar) {
        z(j);
        if (this.i) {
            return;
        }
        v();
    }

    protected void v() {
        G().d();
    }

    public final long w() {
        return bef.m(this.a, this.b);
    }

    public final axn x() {
        ayw aywVar = this.g.q.o.r;
        aywVar.getClass();
        return aywVar;
    }

    public final ayr y() {
        return this.g.q;
    }

    public final void z(long j) {
        if (!a.n(this.h, j)) {
            this.h = j;
            ayw aywVar = y().o.r;
            if (aywVar != null) {
                aywVar.k();
            }
            L(this.g);
        }
        if (!this.j) {
            I(G());
        }
    }
}
