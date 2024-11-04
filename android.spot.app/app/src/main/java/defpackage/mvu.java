package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mvu implements mvy {
    public final mrq a;
    public final mrq b;
    public final mrr c;
    public final mrr d;
    private final int f;
    private final mrq g;
    private final mrq h;
    private final mrr i;
    private final mrr j;
    private final mrr k;

    public mvu(int i) {
        this.f = i;
        if (i >= 0) {
            long j = 0;
            this.a = new mrq(0L, mrs.a);
            this.b = new mrq(0L, mrs.a);
            mwd mwdVar = mvw.a;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            }
            this.g = new mrq(j, mrs.a);
            this.h = new mrq(E(), mrs.a);
            mwd mwdVar2 = new mwd(0L, null, this, 3);
            this.c = new mrr(mwdVar2, mrs.a);
            this.d = new mrr(mwdVar2, mrs.a);
            if (P()) {
                mwdVar2 = mvw.a;
                mwdVar2.getClass();
            }
            mrs mrsVar = mrs.a;
            this.i = new mrr(mwdVar2, mrsVar);
            this.j = new mrr(mvw.s, mrsVar);
            this.k = new mrr(null, mrsVar);
            return;
        }
        throw new IllegalArgumentException(a.am(i, "Invalid channel capacity: ", ", should be >=0"));
    }

    public static final void C(mvj mvjVar, mwd mwdVar, int i) {
        mvjVar.D(mwdVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int D(defpackage.mwd r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r6.d(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L35
            boolean r0 = r5.M(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L29
            nbj r0 = defpackage.mvw.d
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 != 0) goto L29
            if (r11 != 0) goto L21
            r6 = 3
            return r6
        L21:
            boolean r0 = r6.k(r7, r4, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L29:
            nbj r0 = defpackage.mvw.j
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.h(r7, r2)
            return r1
        L35:
            nbj r4 = defpackage.mvw.e
            if (r0 != r4) goto L42
            nbj r1 = defpackage.mvw.d
            boolean r0 = r6.k(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L42:
            nbj r9 = defpackage.mvw.k
            r10 = 5
            if (r0 == r9) goto L83
            nbj r9 = defpackage.mvw.h
            if (r0 == r9) goto L7f
            nbj r9 = defpackage.mvw.l
            if (r0 != r9) goto L56
            r6.g(r7)
            r5.x()
            return r1
        L56:
            boolean r9 = defpackage.msy.a
            r6.g(r7)
            boolean r9 = r0 instanceof defpackage.mwm
            if (r9 == 0) goto L63
            mwm r0 = (defpackage.mwm) r0
            mvj r0 = r0.a
        L63:
            boolean r8 = U(r0, r8)
            if (r8 == 0) goto L6f
            nbj r8 = defpackage.mvw.i
            r6.j(r7, r8)
            goto L7a
        L6f:
            nbj r8 = defpackage.mvw.k
            java.lang.Object r8 = r6.b(r7, r8)
            nbj r9 = defpackage.mvw.k
            if (r8 != r9) goto L7b
            r2 = 5
        L7a:
            return r2
        L7b:
            r6.h(r7, r3)
            return r10
        L7f:
            r6.g(r7)
            return r10
        L83:
            r6.g(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.D(mwd, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    private final long E() {
        return this.g.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00e8, code lost:            r1 = (defpackage.mwd) r1.o();     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007e, code lost:            r1 = (defpackage.mwd) r1.o();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.mwd F(long r13) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.F(long):mwd");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.G():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j) {
        if ((this.h.a(j) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((this.h.b & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I(long r6, defpackage.mwd r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.b
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            nai r0 = r8.n()
            mwd r0 = (defpackage.mwd) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.u()
            if (r6 == 0) goto L22
            nai r6 = r8.n()
            mwd r6 = (defpackage.mwd) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            mrr r6 = r5.i
        L24:
            java.lang.Object r7 = r6.a
            nai r7 = (defpackage.nai) r7
            long r0 = r7.b
            long r2 = r8.b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L31
            goto L46
        L31:
            boolean r0 = r8.v()
            if (r0 == 0) goto L11
            boolean r0 = r6.d(r7, r8)
            if (r0 == 0) goto L47
            boolean r6 = r7.t()
            if (r6 == 0) goto L46
            r7.q()
        L46:
            return
        L47:
            boolean r7 = r8.t()
            if (r7 == 0) goto L24
            r8.q()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.I(long, mwd):void");
    }

    private final void J(mvj mvjVar) {
        L(mvjVar, true);
    }

    private final void K(mvj mvjVar) {
        L(mvjVar, false);
    }

    private final void L(mvj mvjVar, boolean z) {
        Throwable n;
        if (!(mvjVar instanceof mvr)) {
            if (mvjVar instanceof msd) {
                mmx mmxVar = (mmx) mvjVar;
                if (z) {
                    n = m();
                } else {
                    n = n();
                }
                mmxVar.p(mjo.n(n));
                return;
            }
            if (mvjVar instanceof mwj) {
                ((mwj) mvjVar).a.p(new mwc(new mwa(l())));
                return;
            }
            if (mvjVar instanceof mvq) {
                mvq mvqVar = (mvq) mvjVar;
                mse mseVar = mvqVar.b;
                mseVar.getClass();
                mvqVar.b = null;
                mvqVar.a = mvw.l;
                Throwable l = mvqVar.c.l();
                if (l == null) {
                    mseVar.p(false);
                    return;
                }
                if (msy.b) {
                    l = nbi.a(l, mseVar);
                }
                mseVar.p(mjo.n(l));
                return;
            }
            if (mvjVar instanceof ncb) {
                mwd mwdVar = mvw.a;
                throw null;
            }
            Objects.toString(mvjVar);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(mvjVar)));
        }
        throw null;
    }

    private final boolean M(long j) {
        if (j >= E() && j >= b() + this.f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0109, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x009e, code lost:            r10 = (defpackage.mwd) r10.o();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean N(long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.N(long, boolean):boolean");
    }

    private final boolean O(long j) {
        return N(j, true);
    }

    private final boolean P() {
        long E = E();
        if (E != 0 && E != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    private static final void Q(mvj mvjVar, mwd mwdVar, int i) {
        mvjVar.D(mwdVar, i + mvw.b);
    }

    private static final boolean R(Object obj) {
        if (obj instanceof msd) {
            obj.getClass();
            return mvw.c((msd) obj, mlh.a);
        }
        if (!(obj instanceof ncb)) {
            if (obj instanceof mvr) {
                throw null;
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        throw null;
    }

    private final Object S(mmx mmxVar) {
        mse mseVar = new mse(mjo.w(mmxVar), 1);
        mseVar.z();
        Throwable n = n();
        if (msy.b) {
            n = nbi.a(n, mseVar);
        }
        mseVar.p(mjo.n(n));
        Object j = mseVar.j();
        if (j == mne.a) {
            return j;
        }
        return mlh.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T(msd msdVar) {
        Throwable n = n();
        if (msy.b) {
            n = nbi.a(n, msdVar);
        }
        msdVar.p(mjo.n(n));
    }

    private static final boolean U(Object obj, Object obj2) {
        if (!(obj instanceof ncb)) {
            if (obj instanceof mwj) {
                obj.getClass();
                return mvw.c(((mwj) obj).a, new mwc(obj2));
            }
            if (obj instanceof mvq) {
                obj.getClass();
                mvq mvqVar = (mvq) obj;
                mse mseVar = mvqVar.b;
                mseVar.getClass();
                mvqVar.b = null;
                mvqVar.a = obj2;
                return mvw.c(mseVar, true);
            }
            if (obj instanceof msd) {
                obj.getClass();
                return mvw.c((msd) obj, obj2);
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object f(defpackage.mvu r13, defpackage.mmx r14) {
        /*
            boolean r0 = r14 instanceof defpackage.mvs
            if (r0 == 0) goto L13
            r0 = r14
            mvs r0 = (defpackage.mvs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mvs r0 = new mvs
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            mne r0 = defpackage.mne.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            defpackage.mjo.o(r14)
            mwc r14 = (defpackage.mwc) r14
            java.lang.Object r13 = r14.b
            goto L9d
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            defpackage.mjo.o(r14)
            mrr r14 = r13.d
            java.lang.Object r14 = r14.a
            mwd r14 = (defpackage.mwd) r14
        L3e:
            boolean r1 = r13.w()
            if (r1 == 0) goto L4f
            java.lang.Throwable r13 = r13.l()
            mwa r14 = new mwa
            r14.<init>(r13)
            r13 = r14
            goto L9d
        L4f:
            mrq r1 = r13.b
            long r4 = r1.b()
            int r1 = defpackage.mvw.b
            long r7 = (long) r1
            long r7 = r4 / r7
            int r1 = defpackage.mvw.b
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.b
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L6d
            mwd r1 = r13.o(r7, r14)
            if (r1 == 0) goto L3e
            r14 = r1
        L6d:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.k(r8, r9, r10, r12)
            nbj r7 = defpackage.mvw.m
            if (r1 == r7) goto L9e
            nbj r7 = defpackage.mvw.o
            if (r1 != r7) goto L8a
            long r7 = r13.c()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L3e
            r14.p()
            goto L3e
        L8a:
            nbj r7 = defpackage.mvw.n
            if (r1 != r7) goto L99
            r6.c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.g(r2, r3, r4, r6)
            if (r13 != r0) goto L9d
            return r0
        L99:
            r14.p()
            r13 = r1
        L9d:
            return r13
        L9e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.f(mvu, mmx):java.lang.Object");
    }

    @Override // defpackage.mwk
    public final mvq A() {
        return new mvq(this);
    }

    public final int a(mwd mwdVar, int i, Object obj, long j, Object obj2, boolean z) {
        mwdVar.i(i, obj);
        if (z) {
            return D(mwdVar, i, obj, j, obj2, true);
        }
        Object d = mwdVar.d(i);
        if (d == null) {
            if (M(j)) {
                if (mwdVar.k(i, null, mvw.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mwdVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (d instanceof mvj) {
            mwdVar.g(i);
            if (U(d, obj)) {
                mwdVar.j(i, mvw.i);
                return 0;
            }
            if (mwdVar.b(i, mvw.k) == mvw.k) {
                return 5;
            }
            mwdVar.h(i, true);
            return 5;
        }
        return D(mwdVar, i, obj, j, obj2, false);
    }

    public final long b() {
        return this.b.b;
    }

    public final long c() {
        return this.a.b & 1152921504606846975L;
    }

    @Override // defpackage.mwk
    public final Object d(mmx mmxVar) {
        mwd mwdVar = (mwd) this.d.a;
        while (!w()) {
            long b = this.b.b();
            long j = b / mvw.b;
            int i = (int) (b % mvw.b);
            if (mwdVar.b != j) {
                mwd o = o(j, mwdVar);
                if (o != null) {
                    mwdVar = o;
                } else {
                    continue;
                }
            }
            Object k = k(mwdVar, i, b, null);
            if (k != mvw.m) {
                if (k == mvw.o) {
                    if (b < c()) {
                        mwdVar.p();
                    }
                } else {
                    if (k == mvw.n) {
                        mse u = msz.u(mjo.w(mmxVar));
                        try {
                            Object k2 = k(mwdVar, i, b, u);
                            if (k2 == mvw.m) {
                                C(u, mwdVar, i);
                            } else {
                                if (k2 == mvw.o) {
                                    if (b < c()) {
                                        mwdVar.p();
                                    }
                                    mwd mwdVar2 = (mwd) this.d.a;
                                    while (true) {
                                        if (w()) {
                                            u.p(mjo.n(m()));
                                            break;
                                        }
                                        long b2 = this.b.b();
                                        long j2 = mvw.b;
                                        long j3 = b2 / j2;
                                        int i2 = (int) (b2 % j2);
                                        if (mwdVar2.b != j3) {
                                            mwd o2 = o(j3, mwdVar2);
                                            if (o2 != null) {
                                                mwdVar2 = o2;
                                            } else {
                                                continue;
                                            }
                                        }
                                        k2 = k(mwdVar2, i2, b2, u);
                                        if (k2 == mvw.m) {
                                            C(u, mwdVar2, i2);
                                            break;
                                        }
                                        if (k2 == mvw.o) {
                                            if (b2 < c()) {
                                                mwdVar2.p();
                                            }
                                        } else if (k2 != mvw.n) {
                                            mwdVar2.p();
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    mwdVar.p();
                                }
                                u.e(k2, null);
                            }
                            k = u.j();
                            if (k == mne.a) {
                                return k;
                            }
                        } catch (Throwable th) {
                            u.B();
                            throw th;
                        }
                    } else {
                        mwdVar.p();
                    }
                    return k;
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw nbi.b(m());
    }

    @Override // defpackage.mwk
    public final Object e(mmx mmxVar) {
        return f(this, mmxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.mwd r10, int r11, long r12, defpackage.mmx r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.g(mwd, int, long, mmx):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x018d, code lost:            if (r0 == defpackage.mne.a) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x003a, code lost:            if (r0 == defpackage.mne.a) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:            if (r0 == defpackage.mne.a) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x019a, code lost:            return defpackage.mlh.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:            r7 = r21;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:            T(r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:            r1 = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:            if (r0 != r1) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e4, code lost:            r1 = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017c, code lost:            r1.B();     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017f, code lost:            throw r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010e, code lost:            if (r17 >= b()) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:            r0.p();     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0113, code lost:            r1 = r21;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Type inference failed for: r19v0, types: [mvu] */
    /* JADX WARN: Type inference failed for: r1v10, types: [mse] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v8, types: [mvu] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.mwl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.Object r20, defpackage.mmx r21) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.h(java.lang.Object, mmx):java.lang.Object");
    }

    @Override // defpackage.mwk
    public final Object i() {
        long j = this.b.b;
        long j2 = this.a.b;
        if (O(j2)) {
            return new mwa(l());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return mwc.a;
        }
        mrr mrrVar = this.d;
        nbj nbjVar = mvw.k;
        mwd mwdVar = (mwd) mrrVar.a;
        while (!w()) {
            long b = this.b.b();
            long j3 = mvw.b;
            long j4 = b / j3;
            int i = (int) (b % j3);
            if (mwdVar.b != j4) {
                mwd o = o(j4, mwdVar);
                if (o != null) {
                    mwdVar = o;
                } else {
                    continue;
                }
            }
            Object k = k(mwdVar, i, b, nbjVar);
            if (k == mvw.m) {
                t(b);
                mwdVar.s();
                return mwc.a;
            }
            if (k == mvw.o) {
                if (b < c()) {
                    mwdVar.p();
                }
            } else {
                if (k != mvw.n) {
                    mwdVar.p();
                    return k;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        return new mwa(l());
    }

    @Override // defpackage.mwl
    public Object j(Object obj) {
        mwd mwdVar;
        long j = this.a.b;
        if (!y(j) && !M(j & 1152921504606846975L)) {
            return mwc.a;
        }
        mrr mrrVar = this.c;
        nbj nbjVar = mvw.j;
        mwd mwdVar2 = (mwd) mrrVar.a;
        while (true) {
            long b = this.a.b();
            long j2 = b & 1152921504606846975L;
            boolean y = y(b);
            long j3 = mvw.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (mwdVar2.b != j4) {
                mwd p = p(j4, mwdVar2);
                if (p == null) {
                    if (y) {
                        return new mwa(n());
                    }
                } else {
                    mwdVar = p;
                }
            } else {
                mwdVar = mwdVar2;
            }
            int a = a(mwdVar, i, obj, j2, nbjVar, y);
            if (a != 0) {
                if (a != 1) {
                    if (a != 2) {
                        if (a != 3) {
                            if (a != 4) {
                                mwdVar.p();
                                mwdVar2 = mwdVar;
                            } else {
                                if (j2 < b()) {
                                    mwdVar.p();
                                }
                                return new mwa(n());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else {
                        if (y) {
                            mwdVar.s();
                            return new mwa(n());
                        }
                        mwdVar.s();
                        return mwc.a;
                    }
                } else {
                    return mlh.a;
                }
            } else {
                mwdVar.p();
                return mlh.a;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:            return defpackage.mvw.o;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.mwd r7, int r8, long r9, java.lang.Object r11) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.d(r8)
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 != 0) goto L27
            mrq r0 = r6.a
            long r3 = r0.b
            long r3 = r3 & r1
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L15
            goto L3b
        L15:
            if (r11 != 0) goto L1a
            nbj r7 = defpackage.mvw.n
            return r7
        L1a:
            r0 = 0
            boolean r0 = r7.k(r8, r0, r11)
            if (r0 == 0) goto L3b
            r6.G()
            nbj r7 = defpackage.mvw.m
            return r7
        L27:
            nbj r3 = defpackage.mvw.d
            if (r0 != r3) goto L3b
            nbj r3 = defpackage.mvw.i
            boolean r0 = r7.k(r8, r0, r3)
            if (r0 == 0) goto L3b
            r6.G()
            java.lang.Object r7 = r7.e(r8)
            return r7
        L3b:
            java.lang.Object r0 = r7.d(r8)
            if (r0 == 0) goto Laa
            nbj r3 = defpackage.mvw.e
            if (r0 != r3) goto L46
            goto Laa
        L46:
            nbj r3 = defpackage.mvw.d
            if (r0 != r3) goto L5b
            nbj r3 = defpackage.mvw.i
            boolean r0 = r7.k(r8, r0, r3)
            if (r0 == 0) goto L3b
            r6.G()
            java.lang.Object r7 = r7.e(r8)
            goto Ld1
        L5b:
            nbj r3 = defpackage.mvw.j
            if (r0 != r3) goto L63
        L5f:
            nbj r7 = defpackage.mvw.o
            goto Ld1
        L63:
            nbj r3 = defpackage.mvw.h
            if (r0 != r3) goto L68
            goto L5f
        L68:
            nbj r3 = defpackage.mvw.l
            if (r0 != r3) goto L72
            r6.G()
            nbj r7 = defpackage.mvw.o
            goto Ld1
        L72:
            nbj r3 = defpackage.mvw.g
            if (r0 == r3) goto L3b
            nbj r3 = defpackage.mvw.f
            boolean r3 = r7.k(r8, r0, r3)
            if (r3 == 0) goto L3b
            boolean r9 = r0 instanceof defpackage.mwm
            if (r9 == 0) goto L86
            mwm r0 = (defpackage.mwm) r0
            mvj r0 = r0.a
        L86:
            boolean r10 = R(r0)
            if (r10 == 0) goto L99
            nbj r9 = defpackage.mvw.i
            r7.j(r8, r9)
            r6.G()
            java.lang.Object r7 = r7.e(r8)
            goto Ld1
        L99:
            nbj r10 = defpackage.mvw.j
            r7.j(r8, r10)
            r10 = 0
            r7.h(r8, r10)
            if (r9 == 0) goto La7
            r6.G()
        La7:
            nbj r7 = defpackage.mvw.o
            goto Ld1
        Laa:
            mrq r3 = r6.a
            long r3 = r3.b
            long r3 = r3 & r1
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc1
            nbj r3 = defpackage.mvw.h
            boolean r0 = r7.k(r8, r0, r3)
            if (r0 == 0) goto L3b
            r6.G()
            nbj r7 = defpackage.mvw.o
            goto Ld1
        Lc1:
            if (r11 != 0) goto Lc6
            nbj r7 = defpackage.mvw.n
            goto Ld1
        Lc6:
            boolean r0 = r7.k(r8, r0, r11)
            if (r0 == 0) goto L3b
            r6.G()
            nbj r7 = defpackage.mvw.m
        Ld1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.k(mwd, int, long, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable l() {
        return (Throwable) this.j.a;
    }

    public final Throwable m() {
        Throwable l = l();
        if (l == null) {
            return new mwe();
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable n() {
        Throwable l = l();
        if (l == null) {
            return new mwf("Channel was closed");
        }
        return l;
    }

    public final mwd o(long j, mwd mwdVar) {
        Object a;
        long j2;
        long j3;
        mvv mvvVar = mvv.a;
        loop0: while (true) {
            a = nah.a(mwdVar, j, mvvVar);
            if (!nbh.a(a)) {
                nai b = nbh.b(a);
                while (true) {
                    mrr mrrVar = this.d;
                    nai naiVar = (nai) mrrVar.a;
                    if (naiVar.b >= b.b) {
                        break loop0;
                    }
                    if (b.v()) {
                        if (mrrVar.d(naiVar, b)) {
                            if (naiVar.t()) {
                                naiVar.q();
                            }
                        } else if (b.t()) {
                            b.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (nbh.a(a)) {
            x();
            if (mwdVar.b * mvw.b >= c()) {
                return null;
            }
            mwdVar.p();
            return null;
        }
        mwd mwdVar2 = (mwd) nbh.b(a);
        if (!P() && j <= E() / mvw.b) {
            mrr mrrVar2 = this.i;
            while (true) {
                nai naiVar2 = (nai) mrrVar2.a;
                if (naiVar2.b >= mwdVar2.b || !mwdVar2.v()) {
                    break;
                }
                if (mrrVar2.d(naiVar2, mwdVar2)) {
                    if (naiVar2.t()) {
                        naiVar2.q();
                    }
                } else if (mwdVar2.t()) {
                    mwdVar2.q();
                }
            }
        }
        long j4 = mwdVar2.b;
        if (j4 > j) {
            long j5 = mvw.b;
            mrq mrqVar = this.b;
            do {
                j2 = j4 * j5;
                j3 = mrqVar.b;
                if (j3 >= j2) {
                    break;
                }
            } while (!this.b.c(j3, j2));
            if (mwdVar2.b * mvw.b >= c()) {
                return null;
            }
            mwdVar2.p();
            return null;
        }
        boolean z = msy.a;
        return mwdVar2;
    }

    public final mwd p(long j, mwd mwdVar) {
        Object a;
        long j2;
        long j3;
        mvv mvvVar = mvv.a;
        loop0: while (true) {
            a = nah.a(mwdVar, j, mvvVar);
            if (!nbh.a(a)) {
                nai b = nbh.b(a);
                while (true) {
                    mrr mrrVar = this.c;
                    nai naiVar = (nai) mrrVar.a;
                    if (naiVar.b >= b.b) {
                        break loop0;
                    }
                    if (b.v()) {
                        if (mrrVar.d(naiVar, b)) {
                            if (naiVar.t()) {
                                naiVar.q();
                            }
                        } else if (b.t()) {
                            b.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (nbh.a(a)) {
            x();
            if (mwdVar.b * mvw.b >= b()) {
                return null;
            }
            mwdVar.p();
            return null;
        }
        mwd mwdVar2 = (mwd) nbh.b(a);
        long j4 = mwdVar2.b;
        if (j4 > j) {
            long j5 = mvw.b;
            mrq mrqVar = this.a;
            do {
                long j6 = j4 * j5;
                j2 = mrqVar.b;
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!this.a.c(j2, mvw.b(j3, (int) (j2 >> 60))));
            if (mwdVar2.b * mvw.b >= b()) {
                return null;
            }
            mwdVar2.p();
            return null;
        }
        boolean z = msy.a;
        return mwdVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(long j) {
        boolean z = msy.a;
        mwd mwdVar = (mwd) this.d.a;
        while (true) {
            mrq mrqVar = this.b;
            int i = this.f;
            long j2 = mrqVar.b;
            if (j < Math.max(i + j2, E())) {
                return;
            }
            if (this.b.c(j2, 1 + j2)) {
                long j3 = j2 / mvw.b;
                int i2 = (int) (j2 % mvw.b);
                if (mwdVar.b != j3) {
                    mwd o = o(j3, mwdVar);
                    if (o != null) {
                        mwdVar = o;
                    }
                }
                if (k(mwdVar, i2, j2, null) == mvw.o) {
                    if (j2 < c()) {
                        mwdVar.p();
                    }
                } else {
                    mwdVar.p();
                }
            }
        }
    }

    @Override // defpackage.mwl
    public final void r(moh mohVar) {
        if (this.k.d(null, mohVar)) {
            return;
        }
        mrr mrrVar = this.k;
        do {
            Object obj = mrrVar.a;
            if (obj != mvw.q) {
                if (obj == mvw.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!this.k.d(mvw.q, mvw.r));
        mohVar.a(l());
    }

    @Override // defpackage.mwk
    public final void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        v(cancellationException, true);
    }

    public final void t(long j) {
        long j2;
        long j3;
        if (P()) {
            return;
        }
        do {
        } while (E() <= j);
        int i = mvw.c;
        for (int i2 = 0; i2 < i; i2++) {
            long E = E();
            if (E == (4611686018427387903L & this.h.b) && E == E()) {
                return;
            }
        }
        mrq mrqVar = this.h;
        do {
            j2 = mrqVar.b;
        } while (!mrqVar.c(j2, mvw.a(j2 & 4611686018427387903L, true)));
        while (true) {
            long E2 = E();
            long j4 = this.h.b;
            long j5 = j4 & 4611686018427387903L;
            long j6 = 4611686018427387904L & j4;
            if (E2 == j5 && E2 == E()) {
                break;
            } else if (j6 == 0) {
                this.h.c(j4, mvw.a(j5, true));
            }
        }
        mrq mrqVar2 = this.h;
        do {
            j3 = mrqVar2.b;
        } while (!mrqVar2.c(j3, mvw.a(j3 & 4611686018427387903L, false)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x019b, code lost:            r4 = (defpackage.mwd) r4.n();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvu.toString():java.lang.String");
    }

    @Override // defpackage.mwl
    public final boolean u(Throwable th) {
        return v(th, false);
    }

    protected final boolean v(Throwable th, boolean z) {
        long j;
        long b;
        Object obj;
        nbj nbjVar;
        long j2;
        long j3;
        if (z) {
            mrq mrqVar = this.a;
            do {
                j3 = mrqVar.b;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!mrqVar.c(j3, mvw.b(j3 & 1152921504606846975L, 1)));
        }
        boolean d = this.j.d(mvw.s, th);
        if (z) {
            mrq mrqVar2 = this.a;
            do {
                j2 = mrqVar2.b;
            } while (!mrqVar2.c(j2, mvw.b(j2 & 1152921504606846975L, 3)));
        } else {
            mrq mrqVar3 = this.a;
            do {
                j = mrqVar3.b;
                int i = (int) (j >> 60);
                if (i != 0) {
                    if (i != 1) {
                        break;
                    }
                    b = mvw.b(j & 1152921504606846975L, 3);
                } else {
                    b = mvw.b(j & 1152921504606846975L, 2);
                }
            } while (!mrqVar3.c(j, b));
        }
        x();
        if (d) {
            mrr mrrVar = this.k;
            do {
                obj = mrrVar.a;
                if (obj == null) {
                    nbjVar = mvw.q;
                } else {
                    nbjVar = mvw.r;
                }
            } while (!mrrVar.d(obj, nbjVar));
            if (obj != null) {
                mpp.g(obj, 1);
                ((moh) obj).a(l());
                return true;
            }
        }
        return d;
    }

    public final boolean w() {
        return O(this.a.b);
    }

    @Override // defpackage.mwl
    public final boolean x() {
        return y(this.a.b);
    }

    public final boolean y(long j) {
        return N(j, false);
    }

    protected boolean z() {
        return false;
    }
}
