package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awf implements avs {
    private final azd a;

    public awf(azd azdVar) {
        this.a = azdVar;
    }

    public final long a(avs avsVar, long j, boolean z) {
        long e;
        if (avsVar instanceof awf) {
            azd azdVar = ((awf) avsVar).a;
            azdVar.g.ac();
            azd w = b().U(azdVar.g).w();
            if (w != null) {
                long c = blk.c(blk.d(azdVar.B(w), bee.d(j)), this.a.B(w));
                return a.k(blk.a(c), blk.b(c));
            }
            azd d = nk.d(azdVar);
            long d2 = blk.d(blk.d(azdVar.B(d), d.h), bee.d(j));
            azd azdVar2 = this.a;
            azd d3 = nk.d(azdVar2);
            long d4 = blk.d(azdVar2.B(d3), d3.h);
            azq azqVar = d3.g;
            long c2 = blk.c(d2, d4);
            long k = a.k(blk.a(c2), blk.b(c2));
            azq azqVar2 = azqVar.u;
            azqVar2.getClass();
            azq azqVar3 = d.g.u;
            azqVar3.getClass();
            return azqVar2.P(azqVar3, k, z);
        }
        azd d5 = nk.d(this.a);
        long a = a(d5.l, j, z);
        if (z) {
            e = d5.g.k(avsVar);
        } else {
            e = d5.g.e(avsVar, 0L);
        }
        return aqk.e(a, e);
    }

    public final azq b() {
        return this.a.g;
    }

    @Override // defpackage.avs
    public final long d() {
        azd azdVar = this.a;
        return bef.m(azdVar.a, azdVar.b);
    }

    @Override // defpackage.avs
    public final long e(avs avsVar, long j) {
        throw null;
    }

    @Override // defpackage.avs
    public final long f(long j) {
        throw null;
    }

    @Override // defpackage.avs
    public final long g(long j) {
        azd azdVar = this.a;
        azq b = b();
        azd d = nk.d(azdVar);
        return b.g(aqk.e(j, aqk.d(a(d.l, 0L, false), b().e(d.g, 0L))));
    }

    @Override // defpackage.avs
    public final aql h(avs avsVar, boolean z) {
        return b().h(avsVar, z);
    }

    @Override // defpackage.avs
    public final avs i() {
        azd w;
        if (!j()) {
            ll.g("LayoutCoordinate operations are only valid when isAttached is true");
        }
        azq azqVar = b().q.t().u;
        if (azqVar == null || (w = azqVar.w()) == null) {
            return null;
        }
        return w.l;
    }

    @Override // defpackage.avs
    public final boolean j() {
        return b().j();
    }

    @Override // defpackage.avs
    public final long k(avs avsVar) {
        throw null;
    }
}
