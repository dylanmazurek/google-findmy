package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbq extends Thread {
    public final nca a;
    public final mrp b;
    public boolean c;
    final /* synthetic */ nbr d;
    public int e;
    private final mpn f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public nbq(nbr nbrVar, int i) {
        this.d = nbrVar;
        setDaemon(true);
        setContextClassLoader(nbrVar.getClass().getClassLoader());
        this.a = new nca();
        this.f = new mpn();
        this.e = 4;
        this.b = new mrp(0, mrs.a);
        this.nextParkedWorker = nbr.a;
        int nanoTime = (int) System.nanoTime();
        this.i = nanoTime == 0 ? 42 : nanoTime;
        c(i);
    }

    private final nbv e() {
        if (a(2) == 0) {
            nbv nbvVar = (nbv) this.d.i.r();
            if (nbvVar != null) {
                return nbvVar;
            }
            return (nbv) this.d.j.r();
        }
        nbv nbvVar2 = (nbv) this.d.j.r();
        if (nbvVar2 != null) {
            return nbvVar2;
        }
        return (nbv) this.d.i.r();
    }

    private final nbv f(int i) {
        nbv nbvVar;
        boolean z;
        long j;
        long j2;
        long j3;
        int i2;
        int i3 = (int) (this.d.h.b & 2097151);
        if (i3 < 2) {
            return null;
        }
        int a = a(i3);
        nbr nbrVar = this.d;
        long j4 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            a++;
            if (a > i3) {
                a = 1;
            }
            nbq nbqVar = (nbq) nbrVar.g.a(a);
            if (nbqVar != null && nbqVar != this) {
                nca ncaVar = nbqVar.a;
                mpn mpnVar = this.f;
                if (i == 3) {
                    nbvVar = ncaVar.c();
                } else {
                    int i5 = ((mrp) ncaVar.d).b;
                    int i6 = ((mrp) ncaVar.c).b;
                    while (i5 != i6) {
                        if (i == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && ((mrp) ncaVar.e).b == 0) {
                            break;
                        }
                        int i7 = i5 + 1;
                        nbvVar = ncaVar.d(i5, z);
                        if (nbvVar != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    nbvVar = null;
                }
                if (nbvVar != null) {
                    mpnVar.a = nbvVar;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        nbv nbvVar2 = (nbv) ((mrr) ncaVar.b).a;
                        j = -2;
                        if (nbvVar2 == null) {
                            break;
                        }
                        if (1 != nbvVar2.h.a) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        if ((i2 & i) == 0) {
                            break;
                        }
                        String str = nby.a;
                        long nanoTime = System.nanoTime() - nbvVar2.g;
                        long j5 = nby.b;
                        if (nanoTime < j5) {
                            j = j5 - nanoTime;
                            break;
                        }
                        if (((mrr) ncaVar.b).d(nbvVar2, null)) {
                            mpnVar.a = nbvVar2;
                            j = -1;
                            break;
                        }
                    }
                    j2 = j;
                    j3 = -1;
                }
                if (j2 == j3) {
                    mpn mpnVar2 = this.f;
                    nbv nbvVar3 = (nbv) mpnVar2.a;
                    mpnVar2.a = null;
                    return nbvVar3;
                }
                if (j2 > 0) {
                    j4 = Math.min(j4, j2);
                }
            }
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.h = j4;
        return null;
    }

    private final boolean g() {
        if (this.nextParkedWorker != nbr.a) {
            return true;
        }
        return false;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i5 & i6;
        }
        return (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.nbv b(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            goto L7d
        L8:
            nbr r0 = r8.d
        La:
            mrq r3 = r0.h
            long r3 = r3.b
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r7 = 42
            long r5 = r5 >> r7
            int r6 = (int) r5
            if (r6 != 0) goto L6d
            nca r9 = r8.a
        L1c:
            java.lang.Object r0 = r9.b
            mrr r0 = (defpackage.mrr) r0
            java.lang.Object r0 = r0.a
            nbv r0 = (defpackage.nbv) r0
            if (r0 != 0) goto L27
            goto L39
        L27:
            nbw r3 = r0.h
            int r3 = r3.a
            if (r3 != r2) goto L39
            java.lang.Object r3 = r9.b
            mrr r3 = (defpackage.mrr) r3
            boolean r3 = r3.d(r0, r1)
            if (r3 == 0) goto L1c
            r1 = r0
            goto L59
        L39:
            java.lang.Object r0 = r9.d
            mrp r0 = (defpackage.mrp) r0
            int r0 = r0.b
            java.lang.Object r3 = r9.c
            mrp r3 = (defpackage.mrp) r3
            int r3 = r3.b
        L45:
            if (r0 == r3) goto L59
            java.lang.Object r4 = r9.e
            mrp r4 = (defpackage.mrp) r4
            int r4 = r4.b
            if (r4 != 0) goto L50
            goto L59
        L50:
            int r3 = r3 + (-1)
            nbv r4 = r9.d(r3, r2)
            if (r4 == 0) goto L45
            r1 = r4
        L59:
            if (r1 != 0) goto Lbd
            nbr r9 = r8.d
            ktf r9 = r9.j
            java.lang.Object r9 = r9.r()
            r1 = r9
            nbv r1 = (defpackage.nbv) r1
            if (r1 != 0) goto Lbd
            nbv r1 = r8.f(r2)
            goto Lbd
        L6d:
            r5 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r5 = r5 + r3
            mrq r7 = r0.h
            boolean r3 = r7.c(r3, r5)
            if (r3 == 0) goto La
            r8.e = r2
        L7d:
            if (r9 == 0) goto Lb7
            nbr r9 = r8.d
            int r9 = r9.b
            int r9 = r9 + r9
            int r9 = r8.a(r9)
            if (r9 != 0) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            if (r2 == 0) goto L96
            nbv r9 = r8.e()
            if (r9 == 0) goto L96
            r1 = r9
            goto Lbd
        L96:
            nca r9 = r8.a
            java.lang.Object r0 = r9.b
            mrr r0 = (defpackage.mrr) r0
            java.lang.Object r0 = r0.a(r1)
            nbv r0 = (defpackage.nbv) r0
            if (r0 != 0) goto Laa
            nbv r9 = r9.c()
            r1 = r9
            goto Lab
        Laa:
            r1 = r0
        Lab:
            if (r1 == 0) goto Lae
            goto Lbd
        Lae:
            if (r2 != 0) goto Lbe
            nbv r1 = r8.e()
            if (r1 == 0) goto Lbe
            goto Lbd
        Lb7:
            nbv r1 = r8.e()
            if (r1 == 0) goto Lbe
        Lbd:
            return r1
        Lbe:
            r9 = 3
            nbv r9 = r8.f(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbq.b(boolean):nbv");
    }

    public final void c(int i) {
        String valueOf;
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        setName(this.d.e + "-worker-" + valueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z) {
            this.d.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        int i;
        boolean z = false;
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                int i2 = 5;
                if (this.d.c() || this.e == 5) {
                    break loop0;
                }
                nbv b = b(this.c);
                if (b != null) {
                    this.h = 0L;
                    int i3 = b.h.a;
                    this.g = 0L;
                    if (this.e == 3) {
                        boolean z3 = msy.a;
                        this.e = 2;
                    }
                    if (i3 != 0 && d(2)) {
                        this.d.b();
                    }
                    nbr.f(b);
                    if (i3 != 0) {
                        this.d.h.a(-2097152L);
                        if (this.e != 5) {
                            boolean z4 = msy.a;
                            this.e = 4;
                        }
                    }
                } else {
                    this.c = z;
                    if (this.h != 0) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                            break;
                        }
                    } else {
                        if (!g()) {
                            nbr nbrVar = this.d;
                            if (this.nextParkedWorker == nbr.a) {
                                mrq mrqVar = nbrVar.f;
                                do {
                                    j = mrqVar.b;
                                    i = this.indexInArray;
                                    boolean z5 = msy.a;
                                    this.nextParkedWorker = nbrVar.g.a((int) (j & 2097151));
                                } while (!nbrVar.f.c(j, ((2097152 + j) & (-2097152)) | i));
                            }
                        } else {
                            int i4 = -1;
                            this.b.b = -1;
                            while (g() && this.b.b == i4 && !this.d.c() && this.e != i2) {
                                d(3);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    this.g = System.nanoTime() + this.d.d;
                                }
                                LockSupport.parkNanos(this.d.d);
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    nbr nbrVar2 = this.d;
                                    synchronized (nbrVar2.g) {
                                        if (!nbrVar2.c()) {
                                            if (((int) (nbrVar2.h.b & 2097151)) > nbrVar2.b) {
                                                if (this.b.c(i4, 1)) {
                                                    int i5 = this.indexInArray;
                                                    c(0);
                                                    nbrVar2.a(this, i5, 0);
                                                    int andDecrement = (int) (mrq.a.getAndDecrement(nbrVar2.h) & 2097151);
                                                    if (andDecrement != i5) {
                                                        Object a = nbrVar2.g.a(andDecrement);
                                                        a.getClass();
                                                        nbq nbqVar = (nbq) a;
                                                        nbrVar2.g.b(i5, nbqVar);
                                                        nbqVar.c(i5);
                                                        nbrVar2.a(nbqVar, andDecrement, i5);
                                                    }
                                                    nbrVar2.g.b(andDecrement, null);
                                                    this.e = 5;
                                                    i2 = 5;
                                                    i4 = -1;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = 5;
                            }
                        }
                        z = false;
                    }
                }
            }
        }
        d(5);
    }
}
