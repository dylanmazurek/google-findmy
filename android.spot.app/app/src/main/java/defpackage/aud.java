package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aud extends aue {
    public final aow a;
    private avs f;
    private auf g;
    private boolean h;
    public final fal c = new fal((char[]) null);
    private final sl e = new sl(2);
    public boolean b = true;
    private boolean i = true;

    public aud(aow aowVar) {
        this.a = aowVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [aow] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [aow] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [aiu] */
    public final void a() {
        aiu aiuVar = this.d;
        int i = aiuVar.b;
        if (i > 0) {
            Object[] objArr = aiuVar.a;
            int i2 = 0;
            do {
                ((aud) objArr[i2]).a();
                i2++;
            } while (i2 < i);
        }
        axx axxVar = this.a;
        ?? r4 = 0;
        while (axxVar != 0) {
            if (axxVar instanceof azz) {
                ((azz) axxVar).bR();
            } else if ((axxVar.l & 16) != 0 && (axxVar instanceof axx)) {
                aow aowVar = axxVar.d;
                int i3 = 0;
                axxVar = axxVar;
                r4 = r4;
                while (aowVar != null) {
                    if ((aowVar.l & 16) != 0) {
                        i3++;
                        r4 = r4;
                        if (i3 == 1) {
                            axxVar = aowVar;
                        } else {
                            if (r4 == 0) {
                                r4 = new aiu(new aow[16]);
                            }
                            if (axxVar != 0) {
                                r4.o(axxVar);
                            }
                            r4.o(aowVar);
                            axxVar = 0;
                        }
                    }
                    aowVar = aowVar.o;
                    axxVar = axxVar;
                    r4 = r4;
                }
                if (i3 != 1) {
                }
            }
            axxVar = qg.d(r4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:            if (r3 < 0) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r6, defpackage.st r8) {
        /*
            r5 = this;
            fal r0 = r5.c
            boolean r0 = r0.j(r6)
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.Object[] r0 = r8.a
            int r2 = r8.b
            r3 = 0
        Le:
            if (r3 >= r2) goto L1e
            r4 = r0[r3]
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L1b
            if (r3 >= 0) goto L28
            goto L1e
        L1b:
            int r3 = r3 + 1
            goto Le
        L1e:
            fal r0 = r5.c
            r0.l(r6)
            sl r0 = r5.e
            r0.k(r6)
        L28:
            aiu r0 = r5.d
            int r2 = r0.b
            if (r2 <= 0) goto L3b
            java.lang.Object[] r0 = r0.a
        L30:
            r3 = r0[r1]
            aud r3 = (defpackage.aud) r3
            r3.b(r6, r8)
            int r1 = r1 + 1
            if (r1 < r2) goto L30
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aud.b(long, st):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [aow] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [aow] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [aiu] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [aiu] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // defpackage.aue
    public final boolean c(sl slVar, avs avsVar, bfi bfiVar, boolean z) {
        Object obj;
        boolean z2;
        auf aufVar;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        sl slVar2 = slVar;
        boolean c = super.c(slVar, avsVar, bfiVar, z);
        axx axxVar = this.a;
        if (axxVar.t) {
            ?? r8 = 0;
            while (axxVar != 0) {
                if (axxVar instanceof azz) {
                    this.f = qg.g((azz) axxVar, 16);
                } else if ((axxVar.l & 16) != 0 && (axxVar instanceof axx)) {
                    aow aowVar = axxVar.d;
                    int i3 = 0;
                    axxVar = axxVar;
                    r8 = r8;
                    while (aowVar != null) {
                        if ((aowVar.l & 16) != 0) {
                            i3++;
                            r8 = r8;
                            if (i3 == 1) {
                                axxVar = aowVar;
                            } else {
                                if (r8 == 0) {
                                    r8 = new aiu(new aow[16]);
                                }
                                if (axxVar != 0) {
                                    r8.o(axxVar);
                                }
                                r8.o(aowVar);
                                axxVar = 0;
                            }
                        }
                        aowVar = aowVar.o;
                        axxVar = axxVar;
                        r8 = r8;
                    }
                    if (i3 != 1) {
                    }
                }
                axxVar = qg.d(r8);
            }
            int b = slVar.b();
            int i4 = 0;
            while (i4 < b) {
                long c2 = slVar2.c(i4);
                aum aumVar = (aum) slVar2.g(i4);
                if (this.c.j(c2)) {
                    long j = aumVar.g;
                    long j2 = aumVar.c;
                    if (aqk.h(j) && aqk.h(j2)) {
                        ArrayList arrayList = new ArrayList(aumVar.a().size());
                        List a = aumVar.a();
                        i = b;
                        int size = a.size();
                        z6 = c;
                        int i5 = 0;
                        while (i5 < size) {
                            int i6 = size;
                            aua auaVar = (aua) a.get(i5);
                            int i7 = i4;
                            List list = a;
                            long j3 = auaVar.b;
                            long j4 = c2;
                            if (aqk.h(j3)) {
                                long j5 = auaVar.a;
                                avs avsVar2 = this.f;
                                avsVar2.getClass();
                                arrayList.add(new aua(j5, avsVar2.e(avsVar, j3), auaVar.c));
                            }
                            i5++;
                            a = list;
                            size = i6;
                            i4 = i7;
                            c2 = j4;
                        }
                        i2 = i4;
                        sl slVar3 = this.e;
                        avs avsVar3 = this.f;
                        avsVar3.getClass();
                        long e = avsVar3.e(avsVar, j);
                        avs avsVar4 = this.f;
                        avsVar4.getClass();
                        aum aumVar2 = new aum(aumVar.a, aumVar.b, avsVar4.e(avsVar, j2), aumVar.d, aumVar.e, aumVar.f, e, aumVar.h, aumVar.i, arrayList, aumVar.j, aumVar.k);
                        aumVar2.l = aumVar.l;
                        slVar3.j(c2, aumVar2);
                        i4 = i2 + 1;
                        slVar2 = slVar;
                        b = i;
                        c = z6;
                    }
                }
                z6 = c;
                i = b;
                i2 = i4;
                i4 = i2 + 1;
                slVar2 = slVar;
                b = i;
                c = z6;
            }
            boolean z7 = c;
            if (this.e.m()) {
                this.c.a = 0;
                this.d.f();
                return true;
            }
            int i8 = this.c.a;
            while (true) {
                i8--;
                if (i8 < 0) {
                    break;
                }
                if (!slVar.l(this.c.i(i8))) {
                    this.c.m(i8);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.e.b());
            int b2 = this.e.b();
            for (int i9 = 0; i9 < b2; i9++) {
                arrayList2.add(this.e.g(i9));
            }
            auf aufVar2 = new auf(arrayList2, bfiVar);
            List list2 = aufVar2.a;
            int size2 = list2.size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    obj = list2.get(i10);
                    if (bfiVar.k(((aum) obj).a)) {
                        break;
                    }
                    i10++;
                } else {
                    obj = null;
                    break;
                }
            }
            aum aumVar3 = (aum) obj;
            if (aumVar3 != null) {
                if (!z) {
                    this.b = false;
                    z3 = false;
                    z4 = false;
                    z5 = false;
                } else {
                    z3 = this.b;
                    if (!z3 && (aumVar3.d || aumVar3.h)) {
                        avs avsVar5 = this.f;
                        avsVar5.getClass();
                        z3 = !lb.i(aumVar3, avsVar5.d());
                        this.b = z3;
                    }
                    z4 = z3;
                    z5 = z4;
                }
                boolean z8 = this.h;
                int i11 = 5;
                if (z3 != z8) {
                    int i12 = aufVar2.c;
                    if (a.m(i12, 3) || a.m(i12, 4) || a.m(i12, 5)) {
                        if (true == z5) {
                            i11 = 4;
                        }
                        aufVar2.c = i11;
                    }
                }
                int i13 = aufVar2.c;
                if ((a.m(i13, 4) && z8 && !this.i) || (a.m(i13, 5) && z4 && aumVar3.d)) {
                    aufVar2.c = 3;
                }
            }
            if (!z7 && a.m(aufVar2.c, 3) && (aufVar = this.g) != null) {
                if (aufVar.a.size() == aufVar2.a.size()) {
                    int size3 = aufVar2.a.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        if (a.n(((aum) aufVar.a.get(i14)).c, ((aum) aufVar2.a.get(i14)).c)) {
                        }
                    }
                    z2 = false;
                    this.g = aufVar2;
                    return z2;
                }
            }
            z2 = true;
            this.g = aufVar2;
            return z2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008c  */
    /* JADX WARN: Type inference failed for: r0v10, types: [aow] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [aow] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aow] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [aiu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.bfi r13) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aud.d(bfi):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [aow] */
    /* JADX WARN: Type inference failed for: r0v20, types: [aow] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3, types: [aow] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [aow] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [aow] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [aiu] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final boolean e(bfi bfiVar, boolean z) {
        aiu aiuVar;
        int i;
        if (this.e.m()) {
            return false;
        }
        axx axxVar = this.a;
        if (!axxVar.t) {
            return false;
        }
        auf aufVar = this.g;
        aufVar.getClass();
        avs avsVar = this.f;
        avsVar.getClass();
        long d = avsVar.d();
        ?? r6 = 0;
        while (axxVar != 0) {
            if (axxVar instanceof azz) {
                ((azz) axxVar).bU(aufVar, 1, d);
            } else if ((axxVar.l & 16) != 0 && (axxVar instanceof axx)) {
                aow aowVar = axxVar.d;
                int i2 = 0;
                axxVar = axxVar;
                r6 = r6;
                while (aowVar != null) {
                    if ((aowVar.l & 16) != 0) {
                        i2++;
                        r6 = r6;
                        if (i2 == 1) {
                            axxVar = aowVar;
                        } else {
                            if (r6 == 0) {
                                r6 = new aiu(new aow[16]);
                            }
                            if (axxVar != 0) {
                                r6.o(axxVar);
                            }
                            r6.o(aowVar);
                            axxVar = 0;
                        }
                    }
                    aowVar = aowVar.o;
                    axxVar = axxVar;
                    r6 = r6;
                }
                if (i2 != 1) {
                }
            }
            axxVar = qg.d(r6);
        }
        if (this.a.t && (i = (aiuVar = this.d).b) > 0) {
            Object[] objArr = aiuVar.a;
            int i3 = 0;
            do {
                aud audVar = (aud) objArr[i3];
                this.f.getClass();
                audVar.e(bfiVar, z);
                i3++;
            } while (i3 < i);
        }
        axx axxVar2 = this.a;
        if (axxVar2.t) {
            ?? r14 = 0;
            while (axxVar2 != 0) {
                if (axxVar2 instanceof azz) {
                    ((azz) axxVar2).bU(aufVar, 2, d);
                } else if ((axxVar2.l & 16) != 0 && (axxVar2 instanceof axx)) {
                    aow aowVar2 = axxVar2.d;
                    int i4 = 0;
                    axxVar2 = axxVar2;
                    r14 = r14;
                    while (aowVar2 != null) {
                        if ((aowVar2.l & 16) != 0) {
                            i4++;
                            r14 = r14;
                            if (i4 == 1) {
                                axxVar2 = aowVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new aiu(new aow[16]);
                                }
                                if (axxVar2 != 0) {
                                    r14.o(axxVar2);
                                }
                                r14.o(aowVar2);
                                axxVar2 = 0;
                            }
                        }
                        aowVar2 = aowVar2.o;
                        axxVar2 = axxVar2;
                        r14 = r14;
                    }
                    if (i4 != 1) {
                    }
                }
                axxVar2 = qg.d(r14);
            }
        }
        return true;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.a + ", children=" + this.d + ", pointerIds=" + this.c + ')';
    }
}
