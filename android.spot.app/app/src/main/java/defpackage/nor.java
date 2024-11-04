package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nor extends non {
    public static final nnq A;
    public static final nnq B;
    public static final nnq C;
    public static final nnq D;
    public static final nnq E;
    public static final nnq F;
    public static final nnx o;
    public static final nnx p;
    public static final nnx q;
    public static final nnx r;
    public static final nnx s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final nnx t;
    public static final nnx u;
    public static final nnq v;
    public static final nnq w;
    public static final nnq x;
    public static final nnq y;
    public static final nnq z;
    public final int G;
    private final transient noq[] H;

    static {
        nnx nnxVar = npt.a;
        o = nnxVar;
        npx npxVar = new npx(nnz.k, 1000L);
        p = npxVar;
        npx npxVar2 = new npx(nnz.j, 60000L);
        q = npxVar2;
        npx npxVar3 = new npx(nnz.i, 3600000L);
        r = npxVar3;
        npx npxVar4 = new npx(nnz.h, 43200000L);
        s = npxVar4;
        npx npxVar5 = new npx(nnz.g, 86400000L);
        t = npxVar5;
        u = new npx(nnz.f, 604800000L);
        v = new npv(nns.x, nnxVar, npxVar);
        w = new npv(nns.w, nnxVar, npxVar5);
        x = new npv(nns.v, npxVar, npxVar2);
        y = new npv(nns.u, npxVar, npxVar5);
        z = new npv(nns.t, npxVar2, npxVar3);
        A = new npv(nns.s, npxVar2, npxVar5);
        npv npvVar = new npv(nns.r, npxVar3, npxVar5);
        B = npvVar;
        npv npvVar2 = new npv(nns.o, npxVar3, npxVar4);
        C = npvVar2;
        D = new nqc(npvVar, nns.q);
        E = new nqc(npvVar2, nns.p);
        F = new nop();
    }

    public nor(nno nnoVar, int i) {
        super(nnoVar, null);
        this.H = new noq[1024];
        this.G = i;
    }

    @Override // defpackage.non
    protected void N(nom nomVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(long j, int i, int i2) {
        return ((int) ((j - (ad(i) + ac(i, i2))) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int P(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Q(long j, int i) {
        return ((int) ((j - ad(i)) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int R(long j) {
        int Z = Z(j);
        return S(Z, U(j, Z));
    }

    public abstract int S(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int T(long j) {
        if (j >= 0) {
            return (int) (j % 86400000);
        }
        return ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int U(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int V(long j) {
        return W(j, Z(j));
    }

    final int W(long j, int i) {
        long ab = ab(i);
        if (j < ab) {
            return X(i - 1);
        }
        if (j >= ab(i + 1)) {
            return 1;
        }
        return ((int) ((j - ab) / 604800000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int X(int i) {
        return (int) ((ab(i + 1) - ab(i)) / 604800000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Y(long j) {
        int Z = Z(j);
        int W = W(j, Z);
        if (W == 1) {
            return Z(j + 604800000);
        }
        if (W > 51) {
            return Z(j - 1209600000);
        }
        return Z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Z(long j) {
        long j2 = j >> 1;
        long j3 = 31083597720000L + j2;
        if (j3 < 0) {
            j3 = 31067819244001L + j2;
        }
        int i = (int) (j3 / 15778476000L);
        long ad = ad(i);
        long j4 = j - ad;
        if (j4 < 0) {
            return i - 1;
        }
        long j5 = 31536000000L;
        if (j4 >= 31536000000L) {
            if (true == ah(i)) {
                j5 = 31622400000L;
            }
            if (ad + j5 <= j) {
                return i + 1;
            }
            return i;
        }
        return i;
    }

    public abstract long aa(int i);

    final long ab(int i) {
        long ad = ad(i);
        if (P(ad) > 8 - this.G) {
            return ad + ((8 - r8) * 86400000);
        }
        return ad - ((r8 - 1) * 86400000);
    }

    public abstract long ac(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ad(int i) {
        noq[] noqVarArr = this.H;
        int i2 = i & 1023;
        noq noqVar = noqVarArr[i2];
        if (noqVar == null || noqVar.a != i) {
            noq noqVar2 = new noq(i, aa(i));
            noqVarArr[i2] = noqVar2;
            noqVar = noqVar2;
        }
        return noqVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ae(int i, int i2, int i3) {
        return ad(i) + ac(i, i2) + ((i3 - 1) * 86400000);
    }

    public abstract long af(long j, int i);

    public boolean ag(long j) {
        throw null;
    }

    public abstract boolean ah(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nor norVar = (nor) obj;
            if (this.G == norVar.G && z().equals(norVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        nnw z2 = z();
        if (z2 != null) {
            sb.append(z2.c);
        }
        if (this.G != 4) {
            sb.append(",mdfw=");
            sb.append(this.G);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.non, defpackage.nno
    public final nnw z() {
        nno nnoVar = this.a;
        if (nnoVar != null) {
            return nnoVar.z();
        }
        return nnw.a;
    }
}
