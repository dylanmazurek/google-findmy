package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anm {
    public static anf d;
    public static int e;
    public static List g;
    public static List h;
    public static final AtomicReference i;
    private static final amz k;
    private static final ala l;
    public static final moh a = ani.a;
    public static final alm b = new alm();
    public static final Object c = new Object();
    public static final and f = new and();
    private static final aoa j = new aoa();

    static {
        d = anf.a;
        e = 2;
        mlx mlxVar = mlx.a;
        g = mlxVar;
        h = mlxVar;
        int i2 = e;
        e = i2 + 1;
        amq amqVar = new amq(i2, anf.a);
        d = d.d(amqVar.h);
        AtomicReference atomicReference = new AtomicReference(amqVar);
        i = atomicReference;
        k = (amz) atomicReference.get();
        l = new ala();
    }

    public static final void A() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean B(aoc aocVar) {
        aoe aoeVar;
        int a2 = f.a(e);
        aoe aoeVar2 = null;
        aoe aoeVar3 = null;
        int i2 = 0;
        for (aoe d2 = aocVar.d(); d2 != null; d2 = d2.g) {
            int i3 = d2.f;
            if (i3 != 0) {
                if (i3 < a2) {
                    if (aoeVar2 == null) {
                        i2++;
                        aoeVar2 = d2;
                    } else {
                        int i4 = aoeVar2.f;
                        if (i3 < i4) {
                            aoeVar = d2;
                        } else {
                            aoeVar = aoeVar2;
                        }
                        if (i3 >= i4) {
                            aoeVar2 = d2;
                        }
                        if (aoeVar3 == null) {
                            aoeVar3 = aocVar.d();
                            aoe aoeVar4 = aoeVar3;
                            while (true) {
                                if (aoeVar3 != null) {
                                    int i5 = aoeVar3.f;
                                    if (i5 >= a2) {
                                        break;
                                    }
                                    if (aoeVar4.f < i5) {
                                        aoeVar4 = aoeVar3;
                                    }
                                    aoeVar3 = aoeVar3.g;
                                } else {
                                    aoeVar3 = aoeVar4;
                                    break;
                                }
                            }
                        }
                        aoeVar.f = 0;
                        aoeVar.b(aoeVar3);
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    private static final boolean C(aoe aoeVar, int i2, anf anfVar) {
        int i3 = aoeVar.f;
        if (i3 != 0 && i3 <= i2 && !anfVar.e(i3)) {
            return true;
        }
        return false;
    }

    public static final amz a(amz amzVar, moh mohVar, boolean z) {
        ams amsVar;
        boolean z2 = amzVar instanceof ams;
        if (!z2 && amzVar != null) {
            return new aoi(amzVar, mohVar, z);
        }
        if (z2) {
            amsVar = (ams) amzVar;
        } else {
            amsVar = null;
        }
        return new aoh(amsVar, mohVar, null, false, z);
    }

    public static final amz b() {
        amz amzVar = (amz) b.a();
        if (amzVar == null) {
            return (amz) i.get();
        }
        return amzVar;
    }

    public static final amz c(moh mohVar) {
        return (amz) m(new anl(mohVar));
    }

    public static final anf d(anf anfVar, int i2, int i3) {
        while (i2 < i3) {
            anfVar = anfVar.d(i2);
            i2++;
        }
        return anfVar;
    }

    public static final aoe e(aoe aoeVar) {
        aoe k2;
        amz b2 = b();
        aoe k3 = k(aoeVar, b2.v(), b2.x());
        if (k3 == null) {
            synchronized (c) {
                amz b3 = b();
                k2 = k(aoeVar, b3.v(), b3.x());
            }
            if (k2 != null) {
                return k2;
            }
            z();
            throw new mks();
        }
        return k3;
    }

    public static final aoe f(aoe aoeVar, amz amzVar) {
        aoe k2 = k(aoeVar, amzVar.v(), amzVar.x());
        if (k2 != null) {
            return k2;
        }
        z();
        throw new mks();
    }

    public static final aoe g(aoe aoeVar, aoc aocVar) {
        aoe d2 = aocVar.d();
        int a2 = f.a(e) - 1;
        anf anfVar = anf.a;
        aoe aoeVar2 = null;
        aoe aoeVar3 = null;
        while (true) {
            if (d2 == null) {
                break;
            }
            if (d2.f == 0) {
                break;
            }
            if (C(d2, a2, anfVar)) {
                if (aoeVar3 == null) {
                    aoeVar3 = d2;
                } else if (d2.f >= aoeVar3.f) {
                    aoeVar2 = aoeVar3;
                }
            }
            d2 = d2.g;
        }
        aoeVar2 = d2;
        if (aoeVar2 != null) {
            aoeVar2.f = Integer.MAX_VALUE;
            return aoeVar2;
        }
        aoe a3 = aoeVar.a();
        a3.f = Integer.MAX_VALUE;
        a3.g = aocVar.d();
        aocVar.e(a3);
        return a3;
    }

    public static final aoe h(aoe aoeVar, aoc aocVar, amz amzVar) {
        aoe g2 = g(aoeVar, aocVar);
        g2.b(aoeVar);
        g2.f = amzVar.v();
        return g2;
    }

    public static final aoe i(aoe aoeVar, aoc aocVar, amz amzVar, aoe aoeVar2) {
        aoe g2;
        if (amzVar.s()) {
            amzVar.o(aocVar);
        }
        int v = amzVar.v();
        if (aoeVar2.f != v) {
            synchronized (c) {
                g2 = g(aoeVar, aocVar);
            }
            g2.f = v;
            if (aoeVar2.f != 1) {
                amzVar.o(aocVar);
            }
            return g2;
        }
        return aoeVar2;
    }

    public static final aoe j(aoe aoeVar, aoc aocVar) {
        aoe k2;
        amz b2 = b();
        moh j2 = b2.j();
        if (j2 != null) {
            j2.a(aocVar);
        }
        aoe k3 = k(aoeVar, b2.v(), b2.x());
        if (k3 == null) {
            synchronized (c) {
                amz b3 = b();
                aoe d2 = aocVar.d();
                d2.getClass();
                k2 = k(d2, b3.v(), b3.x());
                if (k2 == null) {
                    z();
                    throw new mks();
                }
            }
            return k2;
        }
        return k3;
    }

    public static final aoe k(aoe aoeVar, int i2, anf anfVar) {
        aoe aoeVar2 = null;
        while (aoeVar != null) {
            if (C(aoeVar, i2, anfVar) && (aoeVar2 == null || aoeVar2.f < aoeVar.f)) {
                aoeVar2 = aoeVar;
            }
            aoeVar = aoeVar.g;
        }
        if (aoeVar2 == null) {
            return null;
        }
        return aoeVar2;
    }

    public static final aoe l(aoe aoeVar, aoc aocVar, amz amzVar) {
        aoe k2;
        if (amzVar.s()) {
            amzVar.o(aocVar);
        }
        int v = amzVar.v();
        aoe k3 = k(aoeVar, v, amzVar.x());
        if (k3 != null) {
            if (k3.f != amzVar.v()) {
                synchronized (c) {
                    k2 = k(((anr) aocVar).a, v, amzVar.x());
                    if (k2 != null) {
                        if (k2.f != v) {
                            k2 = h(k2, aocVar, amzVar);
                        }
                    } else {
                        z();
                        throw new mks();
                    }
                }
                if (k3.f != 1) {
                    amzVar.o(aocVar);
                }
                return k2;
            }
            return k3;
        }
        z();
        throw new mks();
    }

    public static final Object m(moh mohVar) {
        Object obj;
        sy syVar;
        Object n;
        int i2;
        amz amzVar = k;
        amzVar.getClass();
        synchronized (c) {
            obj = i.get();
            syVar = ((amq) obj).f;
            if (syVar != null) {
                l.addAndGet(1);
            }
            n = n((amz) obj, mohVar);
        }
        if (syVar != null) {
            try {
                List list = g;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((mol) list.get(i3)).a(new aix(syVar), obj);
                }
            } finally {
                l.addAndGet(-1);
            }
        }
        synchronized (c) {
            s();
            if (syVar != null) {
                Object[] objArr = syVar.b;
                long[] jArr = syVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j2 = jArr[i4];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = ~(i4 - length);
                            int i6 = 0;
                            while (true) {
                                i2 = 8 - (i5 >>> 31);
                                if (i6 >= i2) {
                                    break;
                                }
                                if ((255 & j2) < 128) {
                                    u((aoc) objArr[(i4 << 3) + i6]);
                                }
                                j2 >>= 8;
                                i6++;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return n;
    }

    public static final Object n(amz amzVar, moh mohVar) {
        Object a2 = mohVar.a(d.b(amzVar.v()));
        synchronized (c) {
            int i2 = e;
            e = i2 + 1;
            d = d.b(amzVar.v());
            i.set(new amq(i2, d));
            amzVar.d();
            d = d.d(i2);
        }
        return a2;
    }

    public static final Map o(ams amsVar, ams amsVar2, anf anfVar) {
        long[] jArr;
        int i2;
        Object obj;
        anf anfVar2;
        long[] jArr2;
        int i3;
        Object obj2;
        anf anfVar3;
        aoe k2;
        sy t = amsVar2.t();
        int v = amsVar.v();
        Object obj3 = null;
        if (t == null) {
            return null;
        }
        anf c2 = amsVar2.x().d(amsVar2.v()).c(amsVar2.c);
        Object[] objArr = t.b;
        long[] jArr3 = t.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap hashMap = null;
        int i4 = 0;
        while (true) {
            long j2 = jArr3[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length;
                int i6 = 0;
                while (true) {
                    int i7 = 8 - ((~i5) >>> 31);
                    if (i6 < i7) {
                        if ((j2 & 255) < 128) {
                            aoc aocVar = (aoc) objArr[(i4 << 3) + i6];
                            aoe d2 = aocVar.d();
                            aoe k3 = k(d2, v, anfVar);
                            jArr2 = jArr3;
                            if (k3 != null && (k2 = k(d2, v, c2)) != null && !amr.i(k3, k2)) {
                                i3 = v;
                                anfVar3 = c2;
                                aoe k4 = k(d2, amsVar2.v(), amsVar2.x());
                                if (k4 != null) {
                                    aoe j3 = aocVar.j(k2, k3, k4);
                                    if (j3 != null) {
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(k3, j3);
                                    } else {
                                        return null;
                                    }
                                } else {
                                    z();
                                    throw new mks();
                                }
                            } else {
                                i3 = v;
                                anfVar3 = c2;
                            }
                            obj2 = null;
                        } else {
                            jArr2 = jArr3;
                            i3 = v;
                            obj2 = obj3;
                            anfVar3 = c2;
                        }
                        j2 >>= 8;
                        i6++;
                        obj3 = obj2;
                        jArr3 = jArr2;
                        v = i3;
                        c2 = anfVar3;
                    } else {
                        jArr = jArr3;
                        i2 = v;
                        obj = obj3;
                        anfVar2 = c2;
                        if (i7 != 8) {
                            break;
                        }
                    }
                }
            } else {
                jArr = jArr3;
                i2 = v;
                obj = obj3;
                anfVar2 = c2;
            }
            if (i4 == length) {
                break;
            }
            i4++;
            obj3 = obj;
            jArr3 = jArr;
            v = i2;
            c2 = anfVar2;
        }
        return hashMap;
    }

    public static final moh p(moh mohVar, moh mohVar2, boolean z) {
        if (true != z) {
            mohVar2 = null;
        }
        if (mohVar != null && mohVar2 != null && mohVar != mohVar2) {
            return new anj(mohVar, mohVar2);
        }
        if (mohVar == null) {
            return mohVar2;
        }
        return mohVar;
    }

    public static final moh q(moh mohVar, moh mohVar2) {
        if (mohVar != null && mohVar2 != null && mohVar != mohVar2) {
            return new ank(mohVar, mohVar2);
        }
        if (mohVar == null) {
            return mohVar2;
        }
        return mohVar;
    }

    public static final void r() {
        m(anh.a);
    }

    public static final void s() {
        aoa aoaVar = j;
        int i2 = aoaVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            als alsVar = aoaVar.c[i3];
            if (alsVar != null) {
                obj = alsVar.get();
            }
            if (obj != null && B((aoc) obj)) {
                if (i4 != i3) {
                    aoaVar.c[i4] = alsVar;
                    int[] iArr = aoaVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            aoaVar.c[i5] = null;
            aoaVar.b[i5] = 0;
        }
        if (i4 != i2) {
            aoaVar.a = i4;
        }
    }

    public static final void t(amz amzVar, aoc aocVar) {
        amzVar.r(amzVar.h() + 1);
        moh l2 = amzVar.l();
        if (l2 != null) {
            l2.a(aocVar);
        }
    }

    public static final void u(aoc aocVar) {
        Object obj;
        Object obj2;
        Object obj3;
        if (B(aocVar)) {
            aoa aoaVar = j;
            int i2 = aoaVar.a;
            int identityHashCode = System.identityHashCode(aocVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = aoaVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = aoaVar.b[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            als alsVar = aoaVar.c[i6];
                            if (alsVar != null) {
                                obj = alsVar.get();
                            } else {
                                obj = null;
                            }
                            if (aocVar != obj) {
                                i3 = i6 - 1;
                                while (i3 >= 0 && aoaVar.b[i3] == identityHashCode) {
                                    als alsVar2 = aoaVar.c[i3];
                                    if (alsVar2 != null) {
                                        obj3 = alsVar2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == aocVar) {
                                        break;
                                    } else {
                                        i3--;
                                    }
                                }
                                i6++;
                                int i8 = aoaVar.a;
                                while (i6 < i8) {
                                    if (aoaVar.b[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    als alsVar3 = aoaVar.c[i6];
                                    if (alsVar3 != null) {
                                        obj2 = alsVar3.get();
                                    } else {
                                        obj2 = null;
                                    }
                                    if (obj2 != aocVar) {
                                        i6++;
                                    }
                                }
                                i5 = aoaVar.a;
                            }
                            i3 = i6;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3 = -(i5 + 1);
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            als[] alsVarArr = aoaVar.c;
            int length = alsVarArr.length;
            if (i2 == length) {
                int i11 = length + length;
                als[] alsVarArr2 = new als[i11];
                int[] iArr = new int[i11];
                mkm.q(alsVarArr, alsVarArr2, i10, i9, i2);
                mkm.y(aoaVar.c, alsVarArr2, 0, i9, 6);
                mkm.p(aoaVar.b, iArr, i10, i9, i2);
                mkm.s(aoaVar.b, iArr, 0, i9, 6);
                aoaVar.c = alsVarArr2;
                aoaVar.b = iArr;
            } else {
                mkm.q(alsVarArr, alsVarArr, i10, i9, i2);
                int[] iArr2 = aoaVar.b;
                mkm.p(iArr2, iArr2, i10, i9, i2);
            }
            aoaVar.c[i9] = new als(aocVar);
            aoaVar.b[i9] = identityHashCode;
            aoaVar.a++;
        }
    }

    public static final void v(int i2) {
        int i3;
        and andVar = f;
        int i4 = andVar.d[i2];
        andVar.c(i4, andVar.a - 1);
        andVar.a--;
        andVar.b(i4);
        int[] iArr = andVar.b;
        int i5 = andVar.a >> 1;
        while (i4 < i5) {
            int i6 = i4 + 1;
            int i7 = i6 + i6;
            int i8 = i7 - 1;
            if (i7 < andVar.a && (i3 = iArr[i7]) < iArr[i8]) {
                if (i3 >= iArr[i4]) {
                    break;
                }
                andVar.c(i7, i4);
                i4 = i7;
            } else {
                if (iArr[i8] >= iArr[i4]) {
                    break;
                }
                andVar.c(i8, i4);
                i4 = i8;
            }
        }
        andVar.d[i2] = andVar.e;
        andVar.e = i2;
    }

    public static final void w(amz amzVar) {
        ams amsVar;
        Object obj;
        int a2;
        if (!d.e(amzVar.v())) {
            StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
            sb.append(amzVar.v());
            sb.append(", disposed=");
            sb.append(amzVar.i);
            sb.append(", applied=");
            if (amzVar instanceof ams) {
                amsVar = (ams) amzVar;
            } else {
                amsVar = null;
            }
            if (amsVar != null) {
                obj = Boolean.valueOf(amsVar.e);
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (c) {
                a2 = f.a(-1);
            }
            sb.append(a2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final void z() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }
}
