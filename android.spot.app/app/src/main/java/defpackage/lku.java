package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lku implements llg {
    private final lkq a;
    private final boolean b;
    private final kzy c;

    public lku(kzy kzyVar, lkq lkqVar) {
        this.c = kzyVar;
        this.b = lkqVar instanceof ljk;
        this.a = lkqVar;
    }

    @Override // defpackage.llg
    public final int a(Object obj) {
        llp C = kzy.C(obj);
        int i = C.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < C.b; i2++) {
                int a = llz.a(C.c[i2]);
                lim limVar = (lim) C.d[i2];
                int Y = liv.Y(1);
                i += Y + Y + liv.Z(2, a) + liv.G(3, limVar);
            }
            C.e = i;
        }
        if (this.b) {
            ljd k = kzv.k(obj);
            int i3 = 0;
            for (int i4 = 0; i4 < k.b.a(); i4++) {
                i3 += k.b(k.b.e(i4));
            }
            Iterator it = k.b.b().iterator();
            while (it.hasNext()) {
                i3 += k.b((Map.Entry) it.next());
            }
            return i + i3;
        }
        return i;
    }

    @Override // defpackage.llg
    public final int b(Object obj) {
        int hashCode = kzy.C(obj).hashCode();
        if (this.b) {
            return (hashCode * 53) + kzv.k(obj).hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.llg
    public final Object e() {
        lkq lkqVar = this.a;
        if (lkqVar instanceof ljn) {
            return ((ljn) lkqVar).l();
        }
        return lkqVar.cz().r();
    }

    @Override // defpackage.llg
    public final void g(Object obj) {
        kzy.F(obj);
        kzv.n(obj);
    }

    @Override // defpackage.llg
    public final void h(Object obj, Object obj2) {
        llh.l(obj, obj2);
        if (this.b) {
            llh.k(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[EDGE_INSN: B:24:0x00bc->B:25:0x00bc BREAK  A[LOOP:1: B:10:0x0065->B:18:0x0065], SYNTHETIC] */
    @Override // defpackage.llg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.lib r15) {
        /*
            r10 = this;
            r0 = r11
            ljn r0 = (defpackage.ljn) r0
            llp r1 = r0.B
            llp r2 = defpackage.llp.a
            if (r1 != r2) goto L10
            llp r1 = new llp
            r1.<init>()
            r0.B = r1
        L10:
            ljk r11 = (defpackage.ljk) r11
            ljd r11 = r11.c()
            r0 = 0
            r2 = r0
        L18:
            if (r13 >= r14) goto Lc8
            int r4 = defpackage.kzv.A(r12, r13, r15)
            int r13 = r15.a
            int r3 = defpackage.llz.a
            r5 = 2
            if (r13 == r3) goto L63
            int r3 = defpackage.llz.b(r13)
            if (r3 != r5) goto L5e
            lja r2 = r15.d
            lkq r3 = r10.a
            int r5 = defpackage.llz.a(r13)
            nqe r8 = r2.b(r3, r5)
            if (r8 == 0) goto L53
            java.lang.Object r13 = r8.b
            lkz r2 = defpackage.lkz.a
            java.lang.Class r13 = r13.getClass()
            llg r13 = r2.a(r13)
            int r13 = defpackage.kzv.u(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.c
            java.lang.Object r3 = r8.d
            ljm r3 = (defpackage.ljm) r3
            r11.l(r3, r2)
            goto L5c
        L53:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.kzv.z(r2, r3, r4, r5, r6, r7)
        L5c:
            r2 = r8
            goto L18
        L5e:
            int r13 = defpackage.kzv.G(r13, r12, r4, r14, r15)
            goto L18
        L63:
            r13 = 0
            r3 = r0
        L65:
            if (r4 >= r14) goto Lbc
            int r4 = defpackage.kzv.A(r12, r4, r15)
            int r6 = r15.a
            int r7 = defpackage.llz.a(r6)
            int r8 = defpackage.llz.b(r6)
            if (r7 == r5) goto La2
            r9 = 3
            if (r7 == r9) goto L7b
            goto Lb3
        L7b:
            if (r2 == 0) goto L97
            java.lang.Object r6 = r2.b
            lkz r7 = defpackage.lkz.a
            java.lang.Class r6 = r6.getClass()
            llg r6 = r7.a(r6)
            int r4 = defpackage.kzv.u(r6, r12, r4, r14, r15)
            java.lang.Object r6 = r15.c
            java.lang.Object r7 = r2.d
            ljm r7 = (defpackage.ljm) r7
            r11.l(r7, r6)
            goto L65
        L97:
            if (r8 != r5) goto Lb3
            int r4 = defpackage.kzv.r(r12, r4, r15)
            java.lang.Object r3 = r15.c
            lim r3 = (defpackage.lim) r3
            goto L65
        La2:
            if (r8 != 0) goto Lb3
            int r4 = defpackage.kzv.A(r12, r4, r15)
            int r13 = r15.a
            lja r2 = r15.d
            lkq r6 = r10.a
            nqe r2 = r2.b(r6, r13)
            goto L65
        Lb3:
            int r7 = defpackage.llz.b
            if (r6 == r7) goto Lbc
            int r4 = defpackage.kzv.G(r6, r12, r4, r14, r15)
            goto L65
        Lbc:
            if (r3 == 0) goto Lc5
            int r13 = defpackage.llz.c(r13, r5)
            r1.e(r13, r3)
        Lc5:
            r13 = r4
            goto L18
        Lc8:
            if (r13 != r14) goto Lcb
            return
        Lcb:
            ljy r11 = new ljy
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lku.i(java.lang.Object, byte[], int, int, lib):void");
    }

    @Override // defpackage.llg
    public final boolean j(Object obj, Object obj2) {
        if (!kzy.C(obj).equals(kzy.C(obj2))) {
            return false;
        }
        if (this.b) {
            return kzv.k(obj).equals(kzv.k(obj2));
        }
        return true;
    }

    @Override // defpackage.llg
    public final boolean k(Object obj) {
        return kzv.k(obj).i();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [lkq, java.lang.Object] */
    @Override // defpackage.llg
    public final void l(Object obj, lir lirVar, lja ljaVar) {
        boolean P;
        kzy kzyVar = this.c;
        Object E = kzy.E(obj);
        ljd l = kzv.l(obj);
        while (lirVar.c() != Integer.MAX_VALUE) {
            try {
                int i = lirVar.a;
                if (i != llz.a) {
                    if (llz.b(i) == 2) {
                        nqe b = ljaVar.b(this.a, llz.a(i));
                        if (b != null) {
                            kzv.m(lirVar, b, ljaVar, l);
                        } else {
                            P = kzyVar.z(E, lirVar);
                        }
                    } else {
                        P = lirVar.P();
                    }
                    if (!P) {
                        break;
                    }
                } else {
                    nqe nqeVar = null;
                    lim limVar = null;
                    int i2 = 0;
                    while (lirVar.c() != Integer.MAX_VALUE) {
                        int i3 = lirVar.a;
                        if (i3 == llz.c) {
                            i2 = lirVar.i();
                            nqeVar = ljaVar.b(this.a, i2);
                        } else if (i3 == llz.d) {
                            if (nqeVar != null) {
                                kzv.m(lirVar, nqeVar, ljaVar, l);
                            } else {
                                limVar = lirVar.o();
                            }
                        } else if (!lirVar.P()) {
                            break;
                        }
                    }
                    if (lirVar.a == llz.b) {
                        if (limVar != null) {
                            if (nqeVar != null) {
                                lkp cz = nqeVar.b.cz();
                                liq k = limVar.k();
                                cz.i(k, ljaVar);
                                l.l((ljm) nqeVar.d, cz.r());
                                k.z(0);
                            } else {
                                kzy.A(E, i2, limVar);
                            }
                        }
                    } else {
                        throw new ljy("Protocol message end-group tag did not match expected tag.");
                    }
                }
            } finally {
                kzy.D(obj, (llp) E);
            }
        }
    }

    @Override // defpackage.llg
    public final void m(Object obj, ktd ktdVar) {
        Iterator d = kzv.k(obj).d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            ljm ljmVar = (ljm) entry.getKey();
            if (ljmVar.a() == lly.MESSAGE) {
                if (entry instanceof lkb) {
                    ktdVar.y(ljmVar.a, ((lkd) ((lkb) entry).a.getValue()).a());
                } else {
                    ktdVar.y(ljmVar.a, entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        llp C = kzy.C(obj);
        for (int i = 0; i < C.b; i++) {
            ktdVar.y(llz.a(C.c[i]), C.d[i]);
        }
    }
}
