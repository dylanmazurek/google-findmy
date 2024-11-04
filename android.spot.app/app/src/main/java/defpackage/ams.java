package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ams extends amz {
    private static final int[] k = new int[0];
    public final moh a;
    public final moh b;
    public anf c;
    public int[] d;
    public boolean e;
    public sy f;
    private int l;
    private List m;
    private int n;

    public ams(int i, anf anfVar, moh mohVar, moh mohVar2) {
        super(i, anfVar);
        this.a = mohVar;
        this.b = mohVar2;
        this.c = anf.a;
        this.d = k;
        this.n = 1;
    }

    private final void F() {
        if (this.e && this.j < 0) {
            ael.b("Unsupported operation on a disposed or applied snapshot");
        }
    }

    public ams a(moh mohVar, moh mohVar2) {
        amt amtVar;
        moh p;
        C();
        F();
        p(v());
        synchronized (anm.c) {
            int i = anm.e;
            anm.e = i + 1;
            anm.d = anm.d.d(i);
            anf x = x();
            B(x.d(i));
            anf d = anm.d(x, v() + 1, i);
            p = anm.p(mohVar, j(), true);
            amtVar = new amt(i, d, p, anm.q(mohVar2, l()), this);
        }
        if (!this.e && !this.i) {
            int v = v();
            synchronized (anm.c) {
                int i2 = anm.e;
                anm.e = i2 + 1;
                A(i2);
                anm.d = anm.d.d(v());
            }
            B(anm.d(x(), v + 1, v()));
        }
        return amtVar;
    }

    @Override // defpackage.amz
    public amz b(moh mohVar) {
        amu amuVar;
        moh p;
        C();
        F();
        int v = v();
        p(v());
        synchronized (anm.c) {
            int i = anm.e;
            anm.e = i + 1;
            anm.d = anm.d.d(i);
            anf d = anm.d(x(), v + 1, i);
            p = anm.p(mohVar, j(), true);
            amuVar = new amu(i, d, p, this);
        }
        if (!this.e && !this.i) {
            int v2 = v();
            synchronized (anm.c) {
                int i2 = anm.e;
                anm.e = i2 + 1;
                A(i2);
                anm.d = anm.d.d(v());
            }
            B(anm.d(x(), v2 + 1, v()));
        }
        return amuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[LOOP:1: B:31:0x00bc->B:32:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.anc c() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ams.c():anc");
    }

    @Override // defpackage.amz
    public void d() {
        if (!this.i) {
            super.d();
            g();
        }
    }

    @Override // defpackage.amz
    public void e() {
        if (!this.e && !this.i) {
            m();
        }
    }

    @Override // defpackage.amz
    public void f() {
        this.n++;
    }

    @Override // defpackage.amz
    public void g() {
        int i;
        if (this.n <= 0) {
            ael.a("no pending nested snapshots");
        }
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 == 0 && !this.e) {
            sy t = t();
            if (t != null) {
                if (this.e) {
                    ael.b("Unsupported operation on a snapshot that has been applied");
                }
                u(null);
                int v = v();
                Object[] objArr = t.b;
                long[] jArr = t.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = ~(i3 - length);
                            int i5 = 0;
                            while (true) {
                                i = 8 - (i4 >>> 31);
                                if (i5 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    for (aoe d = ((aoc) objArr[(i3 << 3) + i5]).d(); d != null; d = d.g) {
                                        int i6 = d.f;
                                        if (i6 == v || mkm.al(this.c, Integer.valueOf(i6))) {
                                            d.f = 0;
                                        }
                                    }
                                }
                                j >>= 8;
                                i5++;
                            }
                            if (i != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            y();
        }
    }

    @Override // defpackage.amz
    public int h() {
        return this.l;
    }

    public final anc i(int i, Map map, anf anfVar) {
        List list;
        anf anfVar2;
        Object[] objArr;
        long[] jArr;
        anf anfVar3;
        Object[] objArr2;
        long[] jArr2;
        int i2;
        aoe k2;
        aoe j;
        mkw mkwVar;
        anf c = x().d(v()).c(this.c);
        sy t = t();
        t.getClass();
        Object[] objArr3 = t.b;
        long[] jArr3 = t.a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        if (length >= 0) {
            list = null;
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 < i6) {
                            if ((j2 & 255) < 128) {
                                aoc aocVar = (aoc) objArr3[(i3 << 3) + i5];
                                aoe d = aocVar.d();
                                objArr2 = objArr3;
                                jArr2 = jArr3;
                                i2 = i4;
                                aoe k3 = anm.k(d, i, anfVar);
                                if (k3 != null && (k2 = anm.k(d, v(), c)) != null) {
                                    anfVar3 = c;
                                    if (k2.f != 1 && !amr.i(k3, k2)) {
                                        aoe k4 = anm.k(d, v(), x());
                                        if (k4 != null) {
                                            if (map == null || (j = (aoe) map.get(k3)) == null) {
                                                j = aocVar.j(k2, k3, k4);
                                            }
                                            if (j == null) {
                                                return new ana();
                                            }
                                            if (!amr.i(j, k4)) {
                                                if (amr.i(j, k3)) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(new mkw(aocVar, k3.a()));
                                                    if (list == null) {
                                                        list = new ArrayList();
                                                    }
                                                    list.add(aocVar);
                                                } else {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    if (!amr.i(j, k2)) {
                                                        mkwVar = new mkw(aocVar, j);
                                                    } else {
                                                        mkwVar = new mkw(aocVar, k2.a());
                                                    }
                                                    arrayList.add(mkwVar);
                                                }
                                            }
                                        } else {
                                            anm.z();
                                            throw new mks();
                                        }
                                    }
                                } else {
                                    anfVar3 = c;
                                }
                            } else {
                                anfVar3 = c;
                                objArr2 = objArr3;
                                jArr2 = jArr3;
                                i2 = i4;
                            }
                            j2 >>= 8;
                            i5++;
                            objArr3 = objArr2;
                            jArr3 = jArr2;
                            i4 = i2;
                            c = anfVar3;
                        } else {
                            anfVar2 = c;
                            objArr = objArr3;
                            jArr = jArr3;
                            if (i6 != 8) {
                                break;
                            }
                        }
                    }
                } else {
                    anfVar2 = c;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr3 = objArr;
                jArr3 = jArr;
                c = anfVar2;
            }
        } else {
            list = null;
        }
        if (arrayList != null) {
            m();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                mkw mkwVar2 = (mkw) arrayList.get(i7);
                aoc aocVar2 = (aoc) mkwVar2.a;
                aoe aoeVar = (aoe) mkwVar2.b;
                aoeVar.f = v();
                synchronized (anm.c) {
                    aoeVar.g = aocVar2.d();
                    aocVar2.e(aoeVar);
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                t.k((aoc) list.get(i8));
            }
            List list2 = this.m;
            if (list2 != null) {
                list = mkm.ac(list2, list);
            }
            this.m = list;
        }
        return anb.a;
    }

    @Override // defpackage.amz
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public moh j() {
        return this.a;
    }

    @Override // defpackage.amz
    public moh l() {
        return this.b;
    }

    public final void m() {
        p(v());
        if (!this.e && !this.i) {
            int v = v();
            synchronized (anm.c) {
                int i = anm.e;
                anm.e = i + 1;
                A(i);
                anm.d = anm.d.d(v());
            }
            B(anm.d(x(), v + 1, v()));
        }
    }

    @Override // defpackage.amz
    public final void n() {
        anm.d = anm.d.b(v()).a(this.c);
    }

    @Override // defpackage.amz
    public void o(aoc aocVar) {
        sy t = t();
        if (t == null) {
            t = new sy((byte[]) null);
            u(t);
        }
        t.i(aocVar);
    }

    public final void p(int i) {
        synchronized (anm.c) {
            this.c = this.c.d(i);
        }
    }

    @Override // defpackage.amz
    public final void q() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            anm.v(this.d[i]);
        }
        z();
    }

    @Override // defpackage.amz
    public void r(int i) {
        this.l = i;
    }

    @Override // defpackage.amz
    public boolean s() {
        return false;
    }

    public sy t() {
        return this.f;
    }

    public void u(sy syVar) {
        this.f = syVar;
    }
}
