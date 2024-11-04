package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbb {
    public static final nbj a = new nbj("REMOVE_FROZEN");
    private final int c;
    private final boolean d;
    private final int e;
    private final ktf g;
    private final mrr f = new mrr(null, mrs.a);
    public final mrq b = new mrq(0, mrs.a);

    public nbb(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        this.g = new ktf(i, (byte[]) null);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object obj) {
        while (true) {
            long j = this.b.b;
            if ((3458764513820540928L & j) != 0) {
                if ((j & 2305843009213693952L) == 0) {
                    return 1;
                }
                return 2;
            }
            int i = this.e;
            int i2 = (int) ((j & 1152921503533105152L) >> 30);
            int i3 = (int) (1073741823 & j);
            if (((i2 + 2) & i) == (i3 & i)) {
                return 1;
            }
            if (!this.d) {
                if (this.g.u(i2 & i).a != null) {
                    int i4 = this.c;
                    if (i4 < 1024 || ((i2 - i3) & 1073741823) > (i4 >> 1)) {
                        break;
                    }
                }
            }
            if (this.b.c(j, mpp.C(j, 1152921503533105152L) | (((i2 + 1) & 1073741823) << 30))) {
                this.g.u(i2 & i).c(obj);
                nbb nbbVar = this;
                while ((nbbVar.b.b & 1152921504606846976L) != 0) {
                    nbbVar = nbbVar.c();
                    Object obj2 = nbbVar.g.u(nbbVar.e & i2).a;
                    if ((obj2 instanceof nba) && ((nba) obj2).a == i2) {
                        nbbVar.g.u(nbbVar.e & i2).c(obj);
                    } else {
                        nbbVar = null;
                    }
                    if (nbbVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    public final Object b() {
        while (true) {
            long j = this.b.b;
            long j2 = 1152921504606846976L;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            Object obj = this.g.u(i3).a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof nba) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (this.b.c(j, mpp.D(j, i4))) {
                    this.g.u(this.e & i2).c(null);
                    return obj;
                }
                if (this.d) {
                    nbb nbbVar = this;
                    while (true) {
                        mrq mrqVar = nbbVar.b;
                        while (true) {
                            long j3 = mrqVar.b;
                            long j4 = j3 & 1073741823;
                            boolean z = msy.a;
                            if ((j3 & j2) != 0) {
                                nbbVar = nbbVar.c();
                                break;
                            }
                            if (nbbVar.b.c(j3, mpp.D(j3, i4))) {
                                nbbVar.g.u(nbbVar.e & ((int) j4)).c(null);
                                nbbVar = null;
                                break;
                            }
                            j2 = 1152921504606846976L;
                        }
                        if (nbbVar == null) {
                            return obj;
                        }
                        j2 = 1152921504606846976L;
                    }
                }
            }
        }
    }

    public final nbb c() {
        long j;
        while (true) {
            mrq mrqVar = this.b;
            j = mrqVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (mrqVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        mrr mrrVar = this.f;
        while (true) {
            nbb nbbVar = (nbb) mrrVar.a;
            if (nbbVar != null) {
                return nbbVar;
            }
            mrr mrrVar2 = this.f;
            int i = this.c;
            nbb nbbVar2 = new nbb(i + i, this.d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object obj = this.g.u(i4).a;
                    if (obj == null) {
                        obj = new nba(i2);
                    }
                    nbbVar2.g.u(nbbVar2.e & i2).c(obj);
                    i2++;
                }
            }
            nbbVar2.b.b = mpp.C(j, 1152921504606846976L);
            mrrVar2.d(null, nbbVar2);
        }
    }

    public final boolean d() {
        mrq mrqVar;
        long j;
        do {
            mrqVar = this.b;
            j = mrqVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!mrqVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }
}
