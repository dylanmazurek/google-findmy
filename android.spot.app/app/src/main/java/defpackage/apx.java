package defpackage;

import androidx.compose.ui.focus.FocusPropertiesElement;
import defpackage.aow;
import defpackage.apx;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apx {
    public final mol a;
    public final mnw b;
    public final apv d;
    public final aox e;
    private final mnw g;
    private sj h;
    public final aqh c = new aqh();
    public final drz f = new drz();

    public apx(moh mohVar, mol molVar, mnw mnwVar, mnw mnwVar2) {
        this.a = molVar;
        this.b = mnwVar;
        this.g = mnwVar2;
        this.d = new apv(mohVar, new ow((Object) this, 2, (char[]) null));
        aou aouVar = aox.d;
        this.e = aot.a(new FocusPropertiesElement(new aqa(wo.n)), new azf() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
            @Override // defpackage.azf
            public final /* bridge */ /* synthetic */ aow d() {
                return apx.this.c;
            }

            @Override // defpackage.azf
            public final /* bridge */ /* synthetic */ void e(aow aowVar) {
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return apx.this.c.hashCode();
            }
        });
    }

    public final Boolean a(int i, aql aqlVar, moh mohVar) {
        aqh aqhVar;
        aqh aqhVar2;
        azh azhVar;
        boolean c;
        Object a;
        aqh e = in.e(this.c);
        int i2 = 4;
        if (e != null) {
            mnw mnwVar = this.g;
            boolean m = a.m(i, 1);
            Object b = ((mpf) mnwVar).b();
            apy a2 = e.a();
            if (m) {
                a = ((apz) a2).b;
            } else if (a.m(i, 2)) {
                a = ((apz) a2).c;
            } else if (a.m(i, 5)) {
                a = ((apz) a2).d;
            } else if (a.m(i, 6)) {
                a = ((apz) a2).e;
            } else if (a.m(i, 3)) {
                int ordinal = ((bln) b).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        a = ((apz) a2).i;
                    } else {
                        throw new mku();
                    }
                } else {
                    a = ((apz) a2).h;
                }
                if (a == aqd.a) {
                    a = null;
                }
                if (a == null) {
                    a = ((apz) a2).f;
                }
            } else if (a.m(i, 4)) {
                int ordinal2 = ((bln) b).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        a = ((apz) a2).h;
                    } else {
                        throw new mku();
                    }
                } else {
                    a = ((apz) a2).i;
                }
                if (a == aqd.a) {
                    a = null;
                }
                if (a == null) {
                    a = ((apz) a2).g;
                }
            } else if (a.m(i, 7)) {
                a = ((apz) a2).j.a(new apr(i));
            } else if (a.m(i, 8)) {
                a = ((apz) a2).k.a(new apr(i));
            } else {
                throw new IllegalStateException("invalid FocusDirection");
            }
            if (amr.i(a, aqd.b)) {
                return null;
            }
            if (amr.i(a, aqd.a)) {
                aqhVar = e;
            } else {
                return Boolean.valueOf(((aqd) a).a(mohVar));
            }
        } else {
            aqhVar = null;
        }
        aqh aqhVar3 = this.c;
        Object b2 = ((mpf) this.g).b();
        ud udVar = new ud(aqhVar, this, mohVar, 8, null);
        if (!a.m(i, 1) && !a.m(i, 2)) {
            if (!a.m(i, 3) && !a.m(i, 4) && !a.m(i, 5) && !a.m(i, 6)) {
                if (a.m(i, 7)) {
                    int ordinal3 = ((bln) b2).ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 == 1) {
                            i2 = 3;
                        } else {
                            throw new mku();
                        }
                    }
                    aqh e2 = in.e(aqhVar3);
                    if (e2 == null) {
                        return null;
                    }
                    return iv.e(e2, i2, aqlVar, udVar);
                }
                if (a.m(i, 8)) {
                    aqh e3 = in.e(aqhVar3);
                    boolean z = false;
                    if (e3 != null) {
                        aow aowVar = e3.k;
                        if (aowVar.t) {
                            aow aowVar2 = aowVar.n;
                            ayr f = qg.f(e3);
                            loop0: while (f != null) {
                                if ((f.n.e.m & 1024) != 0) {
                                    while (aowVar2 != null) {
                                        if ((aowVar2.l & 1024) != 0) {
                                            aow aowVar3 = aowVar2;
                                            aiu aiuVar = null;
                                            while (aowVar3 != null) {
                                                if (aowVar3 instanceof aqh) {
                                                    aqhVar2 = (aqh) aowVar3;
                                                    if (((apz) aqhVar2.a()).a) {
                                                        break loop0;
                                                    }
                                                } else if ((aowVar3.l & 1024) != 0 && (aowVar3 instanceof axx)) {
                                                    int i3 = 0;
                                                    for (aow aowVar4 = ((axx) aowVar3).d; aowVar4 != null; aowVar4 = aowVar4.o) {
                                                        if ((aowVar4.l & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                aowVar3 = aowVar4;
                                                            } else {
                                                                if (aiuVar == null) {
                                                                    aiuVar = new aiu(new aow[16]);
                                                                }
                                                                if (aowVar3 != null) {
                                                                    aiuVar.o(aowVar3);
                                                                }
                                                                aiuVar.o(aowVar4);
                                                                aowVar3 = null;
                                                            }
                                                        }
                                                    }
                                                    if (i3 != 1) {
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
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                    }
                    aqhVar2 = null;
                    if (aqhVar2 != null && !amr.i(aqhVar2, aqhVar3)) {
                        z = ((Boolean) udVar.a(aqhVar2)).booleanValue();
                    }
                    return Boolean.valueOf(z);
                }
                String a3 = apr.a(i);
                Objects.toString(a3);
                throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(a3));
            }
            return iv.e(aqhVar3, i, aqlVar, udVar);
        }
        if (a.m(i, 1)) {
            c = in.d(aqhVar3, udVar);
        } else if (a.m(i, 2)) {
            c = in.c(aqhVar3, udVar);
        } else {
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        return Boolean.valueOf(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:343:0x00a6, code lost:            if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00a8, code lost:            r6 = r5.b(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00ae, code lost:            if (r5.e != 0) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x00c1, code lost:            if (((r5.a[r6 >> 3] >> ((r6 & 7) << 3)) & 255) != 254) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x00c4, code lost:            r6 = r5.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00c8, code lost:            if (r6 <= 8) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x00e0, code lost:            if (java.lang.Long.compare((r5.d * 32) ^ Long.MIN_VALUE, (r6 * 25) ^ Long.MIN_VALUE) > 0) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x00e2, code lost:            r5.c(defpackage.sv.b(r5.c));     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x00f5, code lost:            r10 = r5.b(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x00fc, code lost:            r5.d++;        r4 = r5.e;        r6 = r5.a;        r7 = r10 >> 3;        r8 = r6[r7];        r11 = (r10 & 7) << 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0115, code lost:            if (((r8 >> r11) & 255) != 128) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0117, code lost:            r12 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x011a, code lost:            r5.e = r4 - r12;        r6[r7] = ((~(255 << r11)) & r8) | (r13 << r11);        r0 = r5.c;        r1 = ((r10 - 7) & r0) + (r0 & 7);        r0 = r1 >> 3;        r1 = (r1 & 7) << 3;        r6[r0] = (r6[r0] & (~(255 << r1))) | (r13 << r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x025c, code lost:            if (r6 == null) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0119, code lost:            r12 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x00ec, code lost:            r5.c(defpackage.sv.b(r5.c));     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x00fb, code lost:            r10 = r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x01d9, code lost:            if (((r2 & ((~r2) << 6)) & (-9187201950435737472L)) == 0) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01db, code lost:            r26 = -1;     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.KeyEvent r35, defpackage.mnw r36) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apx.b(android.view.KeyEvent, mnw):boolean");
    }

    public final boolean c(boolean z, boolean z2, int i) {
        boolean j;
        ph phVar = ph.q;
        drz drzVar = this.f;
        try {
            if (drzVar.a) {
                drzVar.i();
            }
            drzVar.h();
            ((aiu) drzVar.b).o(phVar);
            if (!z) {
                int g = ij.g(this.c, i);
                int i2 = g - 1;
                if (g != 0) {
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        j = false;
                        if (!j && z2) {
                            this.b.a();
                            return true;
                        }
                        return j;
                    }
                } else {
                    throw null;
                }
            }
            j = ij.j(this.c, z);
            if (!j) {
            }
            return j;
        } finally {
            drzVar.j();
        }
    }
}
