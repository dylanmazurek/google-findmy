package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnl {
    public static final bnf a = new bnf();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, bmw bmwVar, bny bnyVar, boolean z) {
        boolean z2;
        bmv bmvVar;
        bmv bmvVar2;
        boolean z3;
        bmv bmvVar3;
        bmv bmvVar4;
        if (!bmwVar.o) {
            b++;
            if (!(bmwVar instanceof bmx) && bmwVar.L() && c(bmwVar)) {
                bmx.aa(bmwVar, bnyVar, new bnf());
            }
            bmv M = bmwVar.M(2);
            bmv M2 = bmwVar.M(4);
            int a2 = M.a();
            int a3 = M2.a();
            HashSet hashSet = M.a;
            if (hashSet != null && M.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int i2 = i + 1;
                    bmv bmvVar5 = (bmv) it.next();
                    bmw bmwVar2 = bmvVar5.d;
                    boolean c2 = c(bmwVar2);
                    if (bmwVar2.L() && c2) {
                        bmx.aa(bmwVar2, bnyVar, new bnf());
                    }
                    bmv bmvVar6 = bmwVar2.K;
                    if ((bmvVar5 == bmvVar6 && (bmvVar4 = bmwVar2.M.e) != null && bmvVar4.c) || (bmvVar5 == bmwVar2.M && (bmvVar3 = bmvVar6.e) != null && bmvVar3.c)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bmwVar2.O() == 3 && !c2) {
                        if (bmwVar2.O() == 3 && bmwVar2.x >= 0 && bmwVar2.w >= 0 && ((bmwVar2.ai == 8 || (bmwVar2.t == 0 && bmwVar2.Y == 0.0f)) && !bmwVar2.J() && !bmwVar2.H && z3 && !bmwVar2.J())) {
                            f(i2, bmwVar, bnyVar, bmwVar2, z);
                        }
                    } else if (!bmwVar2.L()) {
                        bmv bmvVar7 = bmwVar2.K;
                        if (bmvVar5 == bmvVar7 && bmwVar2.M.e == null) {
                            int b2 = bmvVar7.b() + a2;
                            bmwVar2.x(b2, bmwVar2.j() + b2);
                            a(i2, bmwVar2, bnyVar, z);
                        } else {
                            bmv bmvVar8 = bmwVar2.M;
                            if (bmvVar5 == bmvVar8 && bmvVar7.e == null) {
                                int b3 = a2 - bmvVar8.b();
                                bmwVar2.x(b3 - bmwVar2.j(), b3);
                                a(i2, bmwVar2, bnyVar, z);
                            } else if (z3 && !bmwVar2.J()) {
                                e(i2, bnyVar, bmwVar2, z);
                            }
                        }
                    }
                }
            }
            if (!(bmwVar instanceof bna)) {
                HashSet hashSet2 = M2.a;
                if (hashSet2 != null && M2.c) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        int i3 = i + 1;
                        bmv bmvVar9 = (bmv) it2.next();
                        bmw bmwVar3 = bmvVar9.d;
                        boolean c3 = c(bmwVar3);
                        if (bmwVar3.L() && c3) {
                            bmx.aa(bmwVar3, bnyVar, new bnf());
                        }
                        bmv bmvVar10 = bmwVar3.K;
                        if ((bmvVar9 == bmvVar10 && (bmvVar2 = bmwVar3.M.e) != null && bmvVar2.c) || (bmvVar9 == bmwVar3.M && (bmvVar = bmvVar10.e) != null && bmvVar.c)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (bmwVar3.O() == 3 && !c3) {
                            if (bmwVar3.O() == 3 && bmwVar3.x >= 0 && bmwVar3.w >= 0 && (bmwVar3.ai == 8 || (bmwVar3.t == 0 && bmwVar3.Y == 0.0f))) {
                                if (!bmwVar3.J() && !bmwVar3.H && z2 && !bmwVar3.J()) {
                                    f(i3, bmwVar, bnyVar, bmwVar3, z);
                                }
                            }
                        } else if (!bmwVar3.L()) {
                            bmv bmvVar11 = bmwVar3.K;
                            if (bmvVar9 == bmvVar11 && bmwVar3.M.e == null) {
                                int b4 = bmvVar11.b() + a3;
                                bmwVar3.x(b4, bmwVar3.j() + b4);
                                a(i3, bmwVar3, bnyVar, z);
                            } else {
                                bmv bmvVar12 = bmwVar3.M;
                                if (bmvVar9 == bmvVar12 && bmvVar11.e == null) {
                                    int b5 = a3 - bmvVar12.b();
                                    bmwVar3.x(b5 - bmwVar3.j(), b5);
                                    a(i3, bmwVar3, bnyVar, z);
                                } else if (z2 && !bmwVar3.J()) {
                                    e(i3, bnyVar, bmwVar3, z);
                                }
                            }
                        }
                    }
                }
                bmwVar.o = true;
            }
        }
    }

    public static void b(int i, bmw bmwVar, bny bnyVar) {
        boolean z;
        bmv bmvVar;
        bmv bmvVar2;
        boolean z2;
        bmv bmvVar3;
        bmv bmvVar4;
        if (!bmwVar.p) {
            c++;
            if (!(bmwVar instanceof bmx) && bmwVar.L() && c(bmwVar)) {
                bmx.aa(bmwVar, bnyVar, new bnf());
            }
            bmv M = bmwVar.M(3);
            bmv M2 = bmwVar.M(5);
            int a2 = M.a();
            int a3 = M2.a();
            HashSet hashSet = M.a;
            if (hashSet != null && M.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int i2 = i + 1;
                    bmv bmvVar5 = (bmv) it.next();
                    bmw bmwVar2 = bmvVar5.d;
                    boolean c2 = c(bmwVar2);
                    if (bmwVar2.L() && c2) {
                        bmx.aa(bmwVar2, bnyVar, new bnf());
                    }
                    bmv bmvVar6 = bmwVar2.L;
                    if ((bmvVar5 == bmvVar6 && (bmvVar4 = bmwVar2.N.e) != null && bmvVar4.c) || (bmvVar5 == bmwVar2.N && (bmvVar3 = bmvVar6.e) != null && bmvVar3.c)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bmwVar2.P() == 3 && !c2) {
                        if (bmwVar2.P() == 3 && bmwVar2.A >= 0 && bmwVar2.z >= 0 && (bmwVar2.ai == 8 || (bmwVar2.u == 0 && bmwVar2.Y == 0.0f))) {
                            if (!bmwVar2.K() && !bmwVar2.H && z2 && !bmwVar2.K()) {
                                h(i2, bmwVar, bnyVar, bmwVar2);
                            }
                        }
                    } else if (!bmwVar2.L()) {
                        bmv bmvVar7 = bmwVar2.L;
                        if (bmvVar5 == bmvVar7 && bmwVar2.N.e == null) {
                            int b2 = bmvVar7.b() + a2;
                            bmwVar2.y(b2, bmwVar2.h() + b2);
                            b(i2, bmwVar2, bnyVar);
                        } else {
                            bmv bmvVar8 = bmwVar2.N;
                            if (bmvVar5 == bmvVar8 && bmvVar7.e == null) {
                                int b3 = a2 - bmvVar8.b();
                                bmwVar2.y(b3 - bmwVar2.h(), b3);
                                b(i2, bmwVar2, bnyVar);
                            } else if (z2 && !bmwVar2.K()) {
                                g(i2, bnyVar, bmwVar2);
                            }
                        }
                    }
                }
            }
            if (!(bmwVar instanceof bna)) {
                HashSet hashSet2 = M2.a;
                if (hashSet2 != null && M2.c) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        int i3 = i + 1;
                        bmv bmvVar9 = (bmv) it2.next();
                        bmw bmwVar3 = bmvVar9.d;
                        boolean c3 = c(bmwVar3);
                        if (bmwVar3.L() && c3) {
                            bmx.aa(bmwVar3, bnyVar, new bnf());
                        }
                        bmv bmvVar10 = bmwVar3.L;
                        if ((bmvVar9 == bmvVar10 && (bmvVar2 = bmwVar3.N.e) != null && bmvVar2.c) || (bmvVar9 == bmwVar3.N && (bmvVar = bmvVar10.e) != null && bmvVar.c)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bmwVar3.P() == 3 && !c3) {
                            if (bmwVar3.P() == 3 && bmwVar3.A >= 0 && bmwVar3.z >= 0 && (bmwVar3.ai == 8 || (bmwVar3.u == 0 && bmwVar3.Y == 0.0f))) {
                                if (!bmwVar3.K() && !bmwVar3.H && z && !bmwVar3.K()) {
                                    h(i3, bmwVar, bnyVar, bmwVar3);
                                }
                            }
                        } else if (bmwVar3.L()) {
                            continue;
                        } else {
                            bmv bmvVar11 = bmwVar3.L;
                            if (bmvVar9 == bmvVar11 && bmwVar3.N.e == null) {
                                int b4 = bmvVar11.b() + a3;
                                bmwVar3.y(b4, bmwVar3.h() + b4);
                                b(i3, bmwVar3, bnyVar);
                            } else {
                                bmv bmvVar12 = bmwVar3.N;
                                if (bmvVar9 == bmvVar12 && bmvVar11.e == null) {
                                    int b5 = a3 - bmvVar12.b();
                                    bmwVar3.y(b5 - bmwVar3.h(), b5);
                                    b(i3, bmwVar3, bnyVar);
                                } else if (z && !bmwVar3.K()) {
                                    g(i3, bnyVar, bmwVar3);
                                }
                            }
                        }
                    }
                }
                bmv M3 = bmwVar.M(6);
                if (M3.a != null && M3.c) {
                    int a4 = M3.a();
                    Iterator it3 = M3.a.iterator();
                    while (it3.hasNext()) {
                        int i4 = i + 1;
                        bmv bmvVar13 = (bmv) it3.next();
                        bmw bmwVar4 = bmvVar13.d;
                        boolean c4 = c(bmwVar4);
                        if (bmwVar4.L() && c4) {
                            bmx.aa(bmwVar4, bnyVar, new bnf());
                        }
                        if (bmwVar4.P() != 3 || c4) {
                            if (!bmwVar4.L() && bmvVar13 == bmwVar4.O) {
                                int b6 = bmvVar13.b() + a4;
                                if (bmwVar4.G) {
                                    int i5 = b6 - bmwVar4.ac;
                                    int i6 = bmwVar4.X + i5;
                                    bmwVar4.ab = i5;
                                    bmwVar4.L.f(i5);
                                    bmwVar4.N.f(i6);
                                    bmwVar4.O.f(b6);
                                    bmwVar4.n = true;
                                }
                                b(i4, bmwVar4, bnyVar);
                            }
                        }
                    }
                }
                bmwVar.p = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:            if (r8.H(0) != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:            if (r8.H(1) != false) goto L47;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0079, code lost:            if (r8.I(1, r8.h()) != false) goto L47;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0069, code lost:            if (r1 != 3) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0049, code lost:            if (r8.I(0, r8.j()) != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0039, code lost:            if (r0 != 3) goto L23;     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.bmw r8) {
        /*
            int r0 = r8.O()
            int r1 = r8.P()
            bmw r2 = r8.V
            if (r2 != 0) goto Ld
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            r2.O()
        L12:
            if (r2 == 0) goto L17
            r2.P()
        L17:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4b
            boolean r7 = r8.e()
            if (r7 != 0) goto L4b
            if (r0 == r2) goto L4b
            if (r0 != r4) goto L39
            int r0 = r8.t
            if (r0 != 0) goto L3d
            float r0 = r8.Y
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3d
            boolean r0 = r8.H(r5)
            if (r0 != 0) goto L4b
            goto L3d
        L39:
            if (r0 == r4) goto L3d
        L3b:
            r0 = 0
            goto L4c
        L3d:
            int r0 = r8.t
            if (r0 != r6) goto L3b
            int r0 = r8.j()
            boolean r0 = r8.I(r5, r0)
            if (r0 == 0) goto L3b
        L4b:
            r0 = 1
        L4c:
            if (r1 == r6) goto L7b
            boolean r7 = r8.f()
            if (r7 != 0) goto L7b
            if (r1 == r2) goto L7b
            if (r1 != r4) goto L69
            int r1 = r8.u
            if (r1 != 0) goto L6d
            float r1 = r8.Y
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L6d
            boolean r1 = r8.H(r6)
            if (r1 != 0) goto L7b
            goto L6d
        L69:
            if (r1 == r4) goto L6d
        L6b:
            r1 = 0
            goto L7c
        L6d:
            int r1 = r8.u
            if (r1 != r6) goto L6b
            int r1 = r8.h()
            boolean r1 = r8.I(r6, r1)
            if (r1 == 0) goto L6b
        L7b:
            r1 = 1
        L7c:
            float r8 = r8.Y
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8a
            if (r0 != 0) goto L89
            if (r1 != 0) goto L89
            r0 = 0
            r1 = 0
            goto L8a
        L89:
            return r6
        L8a:
            if (r0 == 0) goto L8f
            if (r1 == 0) goto L8f
            return r6
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnl.c(bmw):boolean");
    }

    public static void d(bmt bmtVar, bny bnyVar, int i, boolean z) {
        if (bmtVar.c()) {
            if (i == 0) {
                a(1, bmtVar, bnyVar, z);
            } else {
                b(1, bmtVar, bnyVar);
            }
        }
    }

    private static void e(int i, bny bnyVar, bmw bmwVar, boolean z) {
        float f;
        float f2 = bmwVar.af;
        int a2 = bmwVar.K.e.a();
        int a3 = bmwVar.M.e.a();
        int b2 = bmwVar.K.b() + a2;
        int b3 = a3 - bmwVar.M.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f2 = 0.5f;
        }
        int j = bmwVar.j();
        int i2 = (b3 - b2) - j;
        if (b2 > b3) {
            i2 = (b2 - b3) - j;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = ((int) f) + b2;
        int i4 = i3 + j;
        if (b2 > b3) {
            i4 = i3 - j;
        }
        bmwVar.x(i3, i4);
        a(i + 1, bmwVar, bnyVar, z);
    }

    private static void f(int i, bmw bmwVar, bny bnyVar, bmw bmwVar2, boolean z) {
        int j;
        float f = bmwVar2.af;
        int a2 = bmwVar2.K.e.a() + bmwVar2.K.b();
        int a3 = bmwVar2.M.e.a() - bmwVar2.M.b();
        if (a3 >= a2) {
            int j2 = bmwVar2.j();
            int i2 = a3 - a2;
            if (bmwVar2.ai != 8) {
                int i3 = bmwVar2.t;
                if (i3 == 2) {
                    if (bmwVar instanceof bmx) {
                        j = bmwVar.j();
                    } else {
                        j = bmwVar.V.j();
                    }
                    j2 = (int) (bmwVar2.af * 0.5f * j);
                } else if (i3 == 0) {
                    j2 = i2;
                }
                j2 = Math.max(bmwVar2.w, j2);
                int i4 = bmwVar2.x;
                if (i4 > 0) {
                    j2 = Math.min(i4, j2);
                }
            }
            int i5 = a2 + ((int) ((f * (i2 - j2)) + 0.5f));
            bmwVar2.x(i5, j2 + i5);
            a(i + 1, bmwVar2, bnyVar, z);
        }
    }

    private static void g(int i, bny bnyVar, bmw bmwVar) {
        float f;
        float f2 = bmwVar.ag;
        int a2 = bmwVar.L.e.a();
        int a3 = bmwVar.N.e.a();
        int b2 = bmwVar.L.b() + a2;
        int b3 = a3 - bmwVar.N.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f2 = 0.5f;
        }
        int h = bmwVar.h();
        int i2 = (b3 - b2) - h;
        if (b2 > b3) {
            i2 = (b2 - b3) - h;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = (int) f;
        int i4 = b2 + i3;
        int i5 = i4 + h;
        if (b2 > b3) {
            i4 = b2 - i3;
            i5 = i4 - h;
        }
        bmwVar.y(i4, i5);
        b(i + 1, bmwVar, bnyVar);
    }

    private static void h(int i, bmw bmwVar, bny bnyVar, bmw bmwVar2) {
        int h;
        float f = bmwVar2.ag;
        int a2 = bmwVar2.L.e.a() + bmwVar2.L.b();
        int a3 = bmwVar2.N.e.a() - bmwVar2.N.b();
        if (a3 >= a2) {
            int h2 = bmwVar2.h();
            int i2 = a3 - a2;
            if (bmwVar2.ai != 8) {
                int i3 = bmwVar2.u;
                if (i3 == 2) {
                    if (bmwVar instanceof bmx) {
                        h = bmwVar.h();
                    } else {
                        h = bmwVar.V.h();
                    }
                    h2 = (int) (f * 0.5f * h);
                } else if (i3 == 0) {
                    h2 = i2;
                }
                h2 = Math.max(bmwVar2.z, h2);
                int i4 = bmwVar2.A;
                if (i4 > 0) {
                    h2 = Math.min(i4, h2);
                }
            }
            int i5 = a2 + ((int) ((f * (i2 - h2)) + 0.5f));
            bmwVar2.y(i5, h2 + i5);
            b(i + 1, bmwVar2, bnyVar);
        }
    }
}
