package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqh extends aow implements axv, axw, axk {
    public boolean a;
    public boolean b;
    public aqf c;

    private static final boolean h(aqh aqhVar) {
        if (aqhVar.c != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [aiu] */
    public final apy a() {
        azh azhVar;
        apz apzVar = new apz();
        aow aowVar = this.k;
        if (aowVar.t) {
            ayr f = qg.f(this);
            aow aowVar2 = aowVar;
            loop0: while (f != null) {
                if ((f.n.e.m & 3072) != 0) {
                    while (aowVar2 != null) {
                        int i = aowVar2.l;
                        if ((i & 3072) != 0) {
                            if (aowVar2 != aowVar && (i & 1024) != 0) {
                                break loop0;
                            }
                            if ((i & 2048) != 0) {
                                axx axxVar = aowVar2;
                                ?? r6 = 0;
                                while (axxVar != 0) {
                                    if (axxVar instanceof aqb) {
                                        ((aqb) axxVar).f(apzVar);
                                    } else if ((axxVar.l & 2048) != 0 && (axxVar instanceof axx)) {
                                        aow aowVar3 = axxVar.d;
                                        int i2 = 0;
                                        axxVar = axxVar;
                                        r6 = r6;
                                        while (aowVar3 != null) {
                                            if ((aowVar3.l & 2048) != 0) {
                                                i2++;
                                                r6 = r6;
                                                if (i2 == 1) {
                                                    axxVar = aowVar3;
                                                } else {
                                                    if (r6 == 0) {
                                                        r6 = new aiu(new aow[16]);
                                                    }
                                                    if (axxVar != 0) {
                                                        r6.o(axxVar);
                                                    }
                                                    r6.o(aowVar3);
                                                    axxVar = 0;
                                                }
                                            }
                                            aowVar3 = aowVar3.o;
                                            axxVar = axxVar;
                                            r6 = r6;
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    axxVar = qg.d(r6);
                                }
                            }
                        }
                        aowVar2 = aowVar2.n;
                    }
                }
                f = f.o();
                if (f != null && (azhVar = f.n) != null) {
                    aowVar2 = azhVar.d;
                } else {
                    aowVar2 = null;
                }
            }
            return apzVar;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public final aqf c() {
        aqf g;
        ayr ayrVar;
        baw bawVar;
        apx apxVar;
        azq azqVar = this.k.q;
        drz drzVar = null;
        if (azqVar != null && (ayrVar = azqVar.q) != null && (bawVar = ayrVar.t) != null && (apxVar = bawVar.A) != null) {
            drzVar = apxVar.f;
        }
        if (drzVar == null || (g = drzVar.g(this)) == null) {
            aqf aqfVar = this.c;
            if (aqfVar == null) {
                return aqf.Inactive;
            }
            return aqfVar;
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final avj d() {
        Object obj;
        azh azhVar;
        qg qgVar = avk.a;
        if (!this.k.t) {
            ll.f("ModifierLocal accessed from an unattached node");
        }
        aow aowVar = this.k;
        if (aowVar.t) {
            aow aowVar2 = aowVar.n;
            ayr f = qg.f(this);
            loop0: while (true) {
                obj = null;
                if (f == null) {
                    break;
                }
                if ((f.n.e.m & 32) != 0) {
                    while (aowVar2 != null) {
                        if ((aowVar2.l & 32) != 0) {
                            axx axxVar = aowVar2;
                            ?? r5 = 0;
                            while (axxVar != 0) {
                                if (axxVar instanceof axk) {
                                    axk axkVar = (axk) axxVar;
                                    if (axkVar.e().b(qgVar)) {
                                        obj = axkVar.e().a(qgVar);
                                        break loop0;
                                    }
                                } else if ((axxVar.l & 32) != 0 && (axxVar instanceof axx)) {
                                    aow aowVar3 = axxVar.d;
                                    int i = 0;
                                    axxVar = axxVar;
                                    r5 = r5;
                                    while (aowVar3 != null) {
                                        if ((aowVar3.l & 32) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                axxVar = aowVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new aiu(new aow[16]);
                                                }
                                                if (axxVar != 0) {
                                                    r5.o(axxVar);
                                                }
                                                r5.o(aowVar3);
                                                axxVar = 0;
                                            }
                                        }
                                        aowVar3 = aowVar3.o;
                                        axxVar = axxVar;
                                        r5 = r5;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                axxVar = qg.d(r5);
                            }
                        }
                        aowVar2 = aowVar2.n;
                    }
                }
                f = f.o();
                if (f != null && (azhVar = f.n) != null) {
                    aowVar2 = azhVar.d;
                } else {
                    aowVar2 = null;
                }
            }
            return (avj) obj;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    @Override // defpackage.axk
    public final /* synthetic */ axj e() {
        return axg.a;
    }

    public final void f() {
        aqf aqfVar;
        azh azhVar;
        apy apyVar = null;
        if (this.c == null) {
            if (!h(this)) {
                drz l = ij.l(this);
                try {
                    if (l.a) {
                        l.i();
                    }
                    l.h();
                    aow aowVar = this.k;
                    if (aowVar.t) {
                        aow aowVar2 = aowVar.n;
                        ayr f = qg.f(this);
                        while (true) {
                            if (f == null) {
                                break;
                            }
                            if ((f.n.e.m & 1024) != 0) {
                                while (aowVar2 != null) {
                                    if ((aowVar2.l & 1024) != 0) {
                                        aiu aiuVar = null;
                                        aow aowVar3 = aowVar2;
                                        while (aowVar3 != null) {
                                            if (aowVar3 instanceof aqh) {
                                                aqh aqhVar = (aqh) aowVar3;
                                                if (h(aqhVar)) {
                                                    int ordinal = aqhVar.c().ordinal();
                                                    if (ordinal != 0) {
                                                        if (ordinal != 1) {
                                                            if (ordinal != 2 && ordinal != 3) {
                                                                throw new mku();
                                                            }
                                                        } else {
                                                            if (!this.k.t) {
                                                                ll.g("visitSubtreeIf called on an unattached node");
                                                            }
                                                            aiu aiuVar2 = new aiu(new aow[16]);
                                                            aow aowVar4 = this.k;
                                                            aow aowVar5 = aowVar4.o;
                                                            if (aowVar5 == null) {
                                                                qg.h(aiuVar2, aowVar4);
                                                            } else {
                                                                aiuVar2.o(aowVar5);
                                                            }
                                                            while (true) {
                                                                if (!aiuVar2.m()) {
                                                                    break;
                                                                }
                                                                aow aowVar6 = (aow) aiuVar2.b(aiuVar2.b - 1);
                                                                if ((aowVar6.m & 1024) != 0) {
                                                                    for (aow aowVar7 = aowVar6; aowVar7 != null; aowVar7 = aowVar7.o) {
                                                                        if ((aowVar7.l & 1024) != 0) {
                                                                            aiu aiuVar3 = null;
                                                                            aow aowVar8 = aowVar7;
                                                                            while (aowVar8 != null) {
                                                                                if (aowVar8 instanceof aqh) {
                                                                                    aqh aqhVar2 = (aqh) aowVar8;
                                                                                    if (h(aqhVar2)) {
                                                                                        int ordinal2 = aqhVar2.c().ordinal();
                                                                                        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2) {
                                                                                            if (ordinal2 != 3) {
                                                                                                throw new mku();
                                                                                            }
                                                                                        } else {
                                                                                            aqfVar = aqf.ActiveParent;
                                                                                        }
                                                                                    }
                                                                                } else if ((aowVar8.l & 1024) != 0 && (aowVar8 instanceof axx)) {
                                                                                    int i = 0;
                                                                                    for (aow aowVar9 = ((axx) aowVar8).d; aowVar9 != null; aowVar9 = aowVar9.o) {
                                                                                        if ((aowVar9.l & 1024) != 0) {
                                                                                            i++;
                                                                                            if (i == 1) {
                                                                                                aowVar8 = aowVar9;
                                                                                            } else {
                                                                                                if (aiuVar3 == null) {
                                                                                                    aiuVar3 = new aiu(new aow[16]);
                                                                                                }
                                                                                                if (aowVar8 != null) {
                                                                                                    aiuVar3.o(aowVar8);
                                                                                                }
                                                                                                aiuVar3.o(aowVar9);
                                                                                                aowVar8 = null;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i != 1) {
                                                                                    }
                                                                                }
                                                                                aowVar8 = qg.d(aiuVar3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                qg.h(aiuVar2, aowVar6);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if ((aowVar3.l & 1024) != 0 && (aowVar3 instanceof axx)) {
                                                int i2 = 0;
                                                for (aow aowVar10 = ((axx) aowVar3).d; aowVar10 != null; aowVar10 = aowVar10.o) {
                                                    if ((aowVar10.l & 1024) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            aowVar3 = aowVar10;
                                                        } else {
                                                            if (aiuVar == null) {
                                                                aiuVar = new aiu(new aow[16]);
                                                            }
                                                            if (aowVar3 != null) {
                                                                aiuVar.o(aowVar3);
                                                            }
                                                            aiuVar.o(aowVar10);
                                                            aowVar3 = null;
                                                        }
                                                    }
                                                }
                                                if (i2 != 1) {
                                                }
                                            }
                                            aowVar3 = qg.d(aiuVar);
                                        }
                                    }
                                    aowVar2 = aowVar2.n;
                                }
                            }
                            f = f.o();
                            if (f != null && (azhVar = f.n) != null) {
                                aowVar2 = azhVar.d;
                            } else {
                                aowVar2 = null;
                            }
                        }
                        aqfVar = aqf.Inactive;
                        g(aqfVar);
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                } finally {
                    l.j();
                }
            } else {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
        }
        int ordinal3 = c().ordinal();
        if (ordinal3 == 0 || ordinal3 == 2) {
            mpn mpnVar = new mpn();
            qn.d(this, new aqg(mpnVar, this, 0));
            Object obj = mpnVar.a;
            if (obj == null) {
                mpd.b("focusProperties");
            } else {
                apyVar = (apy) obj;
            }
            if (!apyVar.a()) {
                qg.i(this).A.c(true, true, 8);
            }
        }
    }

    public final void g(aqf aqfVar) {
        Object obj = ij.l(this).c;
        if (aqfVar != null) {
            ((su) obj).e(this, aqfVar);
        } else {
            ll.h("requires a non-null focus state");
            throw new mks();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:            if (r0 != 2) goto L40;     */
    @Override // defpackage.aow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r4 = this;
            aqf r0 = r4.c()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L2d
            goto L3c
        L11:
            drz r0 = defpackage.ij.l(r4)
            boolean r1 = r0.a     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L1c
            r0.i()     // Catch: java.lang.Throwable -> L28
        L1c:
            r0.h()     // Catch: java.lang.Throwable -> L28
            aqf r1 = defpackage.aqf.Inactive     // Catch: java.lang.Throwable -> L28
            r4.g(r1)     // Catch: java.lang.Throwable -> L28
            r0.j()
            goto L3c
        L28:
            r1 = move-exception
            r0.j()
            throw r1
        L2d:
            baw r0 = defpackage.qg.i(r4)
            apx r0 = r0.A
            r2 = 0
            r3 = 8
            r0.c(r1, r2, r3)
            defpackage.ij.k(r4)
        L3c:
            r0 = 0
            r4.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqh.n():void");
    }

    @Override // defpackage.aow
    public final boolean t() {
        return false;
    }
}
