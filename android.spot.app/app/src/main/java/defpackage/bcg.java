package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcg {
    private static final aep g = new agu(bbi.j);
    private static final aep h = new agu(bbi.k);
    private static final aep i = new agu(bbi.l);
    private static final aep j = new agu(bbi.m);
    private static final aep k = new agu(bbi.r);
    public static final aep a = new agu(bbi.n);
    private static final aep l = new agu(bbi.o);
    private static final aep m = new agu(bbi.q);
    public static final aep b = new agu(bbi.p);
    private static final aep n = new agu(bbi.s);
    private static final aep o = new agu(bbi.t);
    public static final aep c = new agu(bbi.u);
    private static final aep p = new agu(bcf.d);
    private static final aep q = new agu(bcf.c);
    private static final aep r = new agu(bcf.e);
    private static final aep s = new agu(bcf.f);
    public static final aep d = new agu(bcf.g);
    private static final aep t = new agu(bcf.h);
    public static final aep e = new agu(bcf.b);
    public static final aep f = new acr(agw.a, bcf.a);

    public static final void a(String str) {
        throw new IllegalStateException(a.ag(str, "CompositionLocal ", " not present"));
    }

    public static final void b(baw bawVar, qz qzVar, mol molVar, abi abiVar, int i2) {
        int i3;
        int i4;
        boolean D;
        int i5;
        boolean D2;
        int i6;
        int i7 = i2 & 6;
        abi b2 = abiVar.b(874662829);
        if (i7 == 0) {
            if ((i2 & 8) == 0) {
                D2 = b2.B(bawVar);
            } else {
                D2 = b2.D(bawVar);
            }
            if (true != D2) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                D = b2.B(qzVar);
            } else {
                D = b2.D(qzVar);
            }
            if (true != D) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (true != b2.D(molVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i3 |= i4;
        }
        if ((i3 & 147) == 146 && b2.G()) {
            b2.r();
        } else {
            acb.b(new aeq[]{g.b(bawVar.H), h.b(bawVar.k), i.b(bawVar.N), j.b(bawVar.L), a.b(bawVar.l()), l.b(bawVar.A), m.c(bawVar.G), b.c(bawVar.H()), n.b(bawVar.K), o.b(bawVar.M), c.b(bawVar.m()), p.b(bawVar.u), q.b(bawVar.J), r.b(bawVar.F), s.b(qzVar), d.b(bawVar.p), t.b(bawVar.e), e.b(bawVar.D), k.b(bawVar.C)}, molVar, b2, ((i3 >> 3) & 112) | 8);
        }
        afv d2 = b2.d();
        if (d2 != null) {
            ((aeu) d2).d = new awy(bawVar, qzVar, molVar, i2, 2, null);
        }
    }
}
