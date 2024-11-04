package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aze {
    public final ayr a;
    public boolean b;
    public boolean c;
    public bld f;
    public final bfi i = new bfi((char[]) null);
    public final bnp h = new bnp();
    public final aiu d = new aiu(new azu[16]);
    public final aiu e = new aiu(new mcn[16]);
    public final qm g = null;

    public aze(ayr ayrVar) {
        this.a = ayrVar;
    }

    public static final boolean g(ayr ayrVar) {
        if (ayrVar.ac() && n(ayrVar)) {
            return true;
        }
        return false;
    }

    public static final boolean h(ayr ayrVar) {
        if (ayrVar.ab() && o(ayrVar)) {
            return true;
        }
        return false;
    }

    private final void i(ayr ayrVar, boolean z) {
        aiu n = ayrVar.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar2 = (ayr) objArr[i2];
                if ((!z && n(ayrVar2)) || (z && o(ayrVar2))) {
                    if (ql.c(ayrVar2) && !z) {
                        if (ayrVar2.ab() && this.i.h(ayrVar2, true)) {
                            k(ayrVar2, true, false);
                        } else {
                            b(ayrVar2, true);
                        }
                    }
                    j(ayrVar2, z);
                    if (!p(ayrVar2, z)) {
                        i(ayrVar2, z);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        j(ayrVar, z);
    }

    private final void j(ayr ayrVar, boolean z) {
        if (p(ayrVar, z) && this.i.h(ayrVar, z)) {
            k(ayrVar, z, false);
        }
    }

    private final boolean k(ayr ayrVar, boolean z, boolean z2) {
        bld bldVar;
        boolean z3;
        ayr o;
        awq awpVar;
        ayr o2;
        ayr o3;
        ayw aywVar;
        axm axmVar;
        int i = 0;
        if (ayrVar.r) {
            return false;
        }
        if (!ayrVar.d() && !ayrVar.ae() && !g(ayrVar) && !amr.i(ayrVar.v(), true) && !h(ayrVar)) {
            ayz ayzVar = ayrVar.o;
            if (!ayzVar.q.r.j() && ((aywVar = ayzVar.r) == null || (axmVar = aywVar.n) == null || !axmVar.j())) {
                return false;
            }
        }
        if (ayrVar == this.a) {
            bldVar = this.f;
            bldVar.getClass();
        } else {
            bldVar = null;
        }
        if (z) {
            if (ayrVar.ab()) {
                z3 = l(ayrVar, bldVar);
            } else {
                z3 = false;
            }
            if (z2 && ((z3 || ayrVar.aa()) && amr.i(ayrVar.v(), true))) {
                if (ayrVar.s == 3) {
                    ayrVar.C();
                }
                ayw q = ayrVar.q();
                q.getClass();
                try {
                    q.f = true;
                    if (!q.i) {
                        ll.g("replace() called on item that was not placed");
                    }
                    q.t = false;
                    boolean z4 = q.m;
                    q.o(q.k, q.l);
                    if (z4 && !q.t && (o3 = q.u.a.o()) != null) {
                        ayr.an(o3);
                    }
                } finally {
                    q.f = false;
                }
            }
        } else {
            if (ayrVar.ac()) {
                z3 = m(ayrVar, bldVar);
            } else {
                z3 = false;
            }
            if (z2 && ayrVar.Z() && (ayrVar == this.a || ((o2 = ayrVar.o()) != null && o2.d() && ayrVar.ae()))) {
                if (ayrVar == this.a) {
                    if (ayrVar.s == 3) {
                        ayrVar.C();
                    }
                    ayr o4 = ayrVar.o();
                    if (o4 == null || (awpVar = o4.s().k) == null) {
                        awpVar = new awp(ayu.a(ayrVar));
                    }
                    awq.d(awpVar, ayrVar.r(), 0, 0);
                } else {
                    if (ayrVar.s == 3) {
                        ayrVar.C();
                    }
                    ayx r = ayrVar.r();
                    try {
                        r.f = true;
                        if (!r.j) {
                            ll.g("replace called on unplaced item");
                        }
                        boolean z5 = r.p;
                        r.u(r.k, r.m, r.l);
                        if (z5 && !r.v && (o = r.z.a.o()) != null) {
                            ayr.ap(o);
                        }
                    } finally {
                        r.f = false;
                    }
                }
                this.h.e(ayrVar);
            }
        }
        aiu aiuVar = this.e;
        if (aiuVar.m()) {
            int i2 = aiuVar.b;
            if (i2 > 0) {
                Object[] objArr = aiuVar.a;
                do {
                    mcn mcnVar = (mcn) objArr[i];
                    if (((ayr) mcnVar.c).ad()) {
                        if (!mcnVar.b) {
                            ayr.aq((ayr) mcnVar.c, mcnVar.a, 2);
                        } else {
                            ayr.ao((ayr) mcnVar.c, mcnVar.a, 2);
                        }
                    }
                    i++;
                } while (i < i2);
            }
            this.e.f();
        }
        return z3;
    }

    private static final boolean l(ayr ayrVar, bld bldVar) {
        boolean af;
        if (ayrVar.e == null) {
            return false;
        }
        if (bldVar != null) {
            af = ayrVar.af(bldVar);
        } else {
            af = ayrVar.af(ayrVar.o.b());
        }
        ayr o = ayrVar.o();
        if (af && o != null) {
            if (o.e == null) {
                ayr.aq(o, false, 3);
            } else if (ayrVar.aj() == 1) {
                ayr.ao(o, false, 3);
            } else if (ayrVar.aj() == 2) {
                ayr.an(o);
                return true;
            }
        }
        return af;
    }

    private static final boolean m(ayr ayrVar, bld bldVar) {
        boolean am;
        if (bldVar != null) {
            am = ayrVar.ag(bldVar);
        } else {
            am = ayr.am(ayrVar);
        }
        ayr o = ayrVar.o();
        if (am && o != null) {
            if (ayrVar.ai() == 1) {
                ayr.aq(o, false, 3);
            } else if (ayrVar.ai() == 2) {
                ayr.ap(o);
                return true;
            }
        }
        return am;
    }

    private static final boolean n(ayr ayrVar) {
        if (ayrVar.ai() == 1 || ayrVar.o.q.r.j()) {
            return true;
        }
        return false;
    }

    private static final boolean o(ayr ayrVar) {
        axm axmVar;
        if (ayrVar.aj() == 1) {
            return true;
        }
        ayw aywVar = ayrVar.o.r;
        if (aywVar != null && (axmVar = aywVar.n) != null && axmVar.j()) {
            return true;
        }
        return false;
    }

    private static final boolean p(ayr ayrVar, boolean z) {
        if (z) {
            return ayrVar.ab();
        }
        return ayrVar.ac();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:            if (r2 < r0) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L17
            bnp r6 = r5.h
            ayr r0 = r5.a
            java.lang.Object r1 = r6.c
            aiu r1 = (defpackage.aiu) r1
            r1.f()
            java.lang.Object r6 = r6.c
            aiu r6 = (defpackage.aiu) r6
            r6.o(r0)
            r6 = 1
            r0.q = r6
        L17:
            bnp r6 = r5.h
            java.lang.Object r0 = r6.c
            kg r1 = defpackage.kg.b
            aiu r0 = (defpackage.aiu) r0
            r0.i(r1)
            java.lang.Object r0 = r6.c
            aiu r0 = (defpackage.aiu) r0
            int r0 = r0.b
            java.lang.Object r1 = r6.b
            if (r1 == 0) goto L32
            r2 = r1
            ayr[] r2 = (defpackage.ayr[]) r2
            int r2 = r2.length
            if (r2 >= r0) goto L3a
        L32:
            r1 = 16
            int r1 = java.lang.Math.max(r1, r0)
            ayr[] r1 = new defpackage.ayr[r1]
        L3a:
            r2 = 0
            r6.b = r2
            r2 = 0
        L3e:
            if (r2 >= r0) goto L52
            java.lang.Object r3 = r6.c
            aiu r3 = (defpackage.aiu) r3
            java.lang.Object[] r3 = r3.a
            r3 = r3[r2]
            ayr r3 = (defpackage.ayr) r3
            r4 = r1
            ayr[] r4 = (defpackage.ayr[]) r4
            r4[r2] = r3
            int r2 = r2 + 1
            goto L3e
        L52:
            java.lang.Object r2 = r6.c
            aiu r2 = (defpackage.aiu) r2
            r2.f()
        L59:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L6d
            r2 = r1
            ayr[] r2 = (defpackage.ayr[]) r2
            r2 = r2[r0]
            r2.getClass()
            boolean r3 = r2.q
            if (r3 == 0) goto L59
            r6.d(r2)
            goto L59
        L6d:
            r6.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aze.a(boolean):void");
    }

    public final void b(ayr ayrVar, boolean z) {
        if (this.i.i(z)) {
            return;
        }
        if (!this.b) {
            ll.g("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (p(ayrVar, z)) {
            ll.f("node not yet measured");
        }
        i(ayrVar, z);
    }

    public final void c(ayr ayrVar) {
        aiu n = ayrVar.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar2 = (ayr) objArr[i2];
                if (n(ayrVar2)) {
                    if (ql.c(ayrVar2)) {
                        d(ayrVar2, true);
                    } else {
                        c(ayrVar2);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void d(ayr ayrVar, boolean z) {
        bld bldVar;
        if (ayrVar.r) {
            return;
        }
        if (ayrVar == this.a) {
            bldVar = this.f;
            bldVar.getClass();
        } else {
            bldVar = null;
        }
        if (z) {
            l(ayrVar, bldVar);
        } else {
            m(ayrVar, bldVar);
        }
    }

    public final boolean e(mnw mnwVar) {
        boolean z;
        axy axyVar;
        if (!this.a.ad()) {
            ll.f("performMeasureAndLayout called with unattached root");
        }
        if (!this.a.d()) {
            ll.f("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            ll.f("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        if (this.f != null) {
            this.b = true;
            this.c = true;
            try {
                if (this.i.j()) {
                    bfi bfiVar = this.i;
                    z = false;
                    while (bfiVar.j()) {
                        boolean d = ((axy) bfiVar.a).d();
                        boolean z2 = !d;
                        if (!d) {
                            axyVar = (axy) bfiVar.a;
                        } else {
                            axyVar = (axy) bfiVar.b;
                        }
                        ayr a = axyVar.a();
                        boolean k = k(a, z2, true);
                        if (a == this.a && k) {
                            z = true;
                        }
                    }
                    if (mnwVar != null) {
                        mnwVar.a();
                    }
                } else {
                    z = false;
                }
            } finally {
                this.b = false;
                this.c = false;
            }
        } else {
            z = false;
        }
        aiu aiuVar = this.d;
        int i2 = aiuVar.b;
        if (i2 > 0) {
            Object[] objArr = aiuVar.a;
            do {
                ((azu) objArr[i]).cn();
                i++;
            } while (i < i2);
        }
        this.d.f();
        return z;
    }

    public final boolean f(ayr ayrVar, boolean z) {
        int ah = ayrVar.ah();
        int i = ah - 1;
        if (ah != 0) {
            if (i != 0 && i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        if (!ayrVar.ac() || z) {
                            ayrVar.N();
                            if (!ayrVar.r && (ayrVar.d() || g(ayrVar))) {
                                ayr o = ayrVar.o();
                                if (o == null || !o.ac()) {
                                    this.i.g(ayrVar, false);
                                }
                                if (!this.c) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        throw new mku();
                    }
                } else {
                    this.e.o(new mcn(ayrVar, false, z));
                }
            }
            return false;
        }
        throw null;
    }
}
