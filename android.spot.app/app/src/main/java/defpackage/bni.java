package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bni {
    public final bmx a;
    public final bmx d;
    final ArrayList f;
    public bny g;
    private final bnf h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public bni(bmx bmxVar) {
        new ArrayList();
        this.g = null;
        this.h = new bnf();
        this.f = new ArrayList();
        this.a = bmxVar;
        this.d = bmxVar;
    }

    private final void e(bns bnsVar, int i, ArrayList arrayList) {
        for (bnh bnhVar : bnsVar.i.j) {
            if (bnhVar instanceof bnj) {
                g((bnj) bnhVar, i, bnsVar.j, arrayList, null);
            } else if (bnhVar instanceof bns) {
                g(((bns) bnhVar).i, i, bnsVar.j, arrayList, null);
            }
        }
        for (bnh bnhVar2 : bnsVar.j.j) {
            if (bnhVar2 instanceof bnj) {
                g((bnj) bnhVar2, i, bnsVar.i, arrayList, null);
            } else if (bnhVar2 instanceof bns) {
                g(((bns) bnhVar2).j, i, bnsVar.i, arrayList, null);
            }
        }
        if (i == 1) {
            for (bnh bnhVar3 : ((bnq) bnsVar).a.j) {
                if (bnhVar3 instanceof bnj) {
                    g((bnj) bnhVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(bmw bmwVar, int i, int i2, int i3, int i4) {
        bnf bnfVar = this.h;
        bnfVar.i = i;
        bnfVar.j = i3;
        bnfVar.a = i2;
        bnfVar.b = i4;
        this.g.a(bmwVar, bnfVar);
        bmwVar.E(this.h.c);
        bmwVar.z(this.h.d);
        bnf bnfVar2 = this.h;
        bmwVar.G = bnfVar2.f;
        bmwVar.w(bnfVar2.e);
    }

    private final void g(bnj bnjVar, int i, bnj bnjVar2, ArrayList arrayList, bnp bnpVar) {
        bns bnsVar = bnjVar.d;
        if (bnsVar.e == null) {
            bmx bmxVar = this.a;
            if (bnsVar != bmxVar.h && bnsVar != bmxVar.i) {
                if (bnpVar == null) {
                    bnpVar = new bnp(bnsVar);
                    arrayList.add(bnpVar);
                }
                bnsVar.e = bnpVar;
                ((ArrayList) bnpVar.c).add(bnsVar);
                for (bnh bnhVar : bnsVar.i.j) {
                    if (bnhVar instanceof bnj) {
                        g((bnj) bnhVar, i, bnjVar2, arrayList, bnpVar);
                    }
                }
                for (bnh bnhVar2 : bnsVar.j.j) {
                    if (bnhVar2 instanceof bnj) {
                        g((bnj) bnhVar2, i, bnjVar2, arrayList, bnpVar);
                    }
                }
                if (i == 1 && (bnsVar instanceof bnq)) {
                    for (bnh bnhVar3 : ((bnq) bnsVar).a.j) {
                        if (bnhVar3 instanceof bnj) {
                            g((bnj) bnhVar3, 1, bnjVar2, arrayList, bnpVar);
                        }
                    }
                }
                Iterator it = bnsVar.i.k.iterator();
                while (it.hasNext()) {
                    g((bnj) it.next(), i, bnjVar2, arrayList, bnpVar);
                }
                Iterator it2 = bnsVar.j.k.iterator();
                while (it2.hasNext()) {
                    g((bnj) it2.next(), i, bnjVar2, arrayList, bnpVar);
                }
                if (i == 1 && (bnsVar instanceof bnq)) {
                    Iterator it3 = ((bnq) bnsVar).a.k.iterator();
                    while (it3.hasNext()) {
                        g((bnj) it3.next(), 1, bnjVar2, arrayList, bnpVar);
                    }
                }
            }
        }
    }

    public final int a(bmx bmxVar, int i) {
        bnj bnjVar;
        bnj bnjVar2;
        long a;
        float f;
        long j;
        bni bniVar = this;
        bmx bmxVar2 = bmxVar;
        int size = bniVar.f.size();
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        while (i2 < size) {
            bnp bnpVar = (bnp) bniVar.f.get(i2);
            Object obj = bnpVar.b;
            if (!(obj instanceof bng) ? !(i != 0 ? (obj instanceof bnq) : (obj instanceof bno)) : ((bng) obj).g != i) {
                a = j2;
            } else {
                if (i == 0) {
                    bnjVar = bmxVar2.h.i;
                } else {
                    bnjVar = bmxVar2.i.i;
                }
                if (i == 0) {
                    bnjVar2 = bmxVar2.h.j;
                } else {
                    bnjVar2 = bmxVar2.i.j;
                }
                boolean contains = ((bns) obj).i.k.contains(bnjVar);
                boolean contains2 = ((bns) bnpVar.b).j.k.contains(bnjVar2);
                long a2 = ((bns) bnpVar.b).a();
                if (contains && contains2) {
                    long b = bnpVar.b(((bns) bnpVar.b).i, j2);
                    long a3 = bnpVar.a(((bns) bnpVar.b).j, j2);
                    long j4 = b - a2;
                    bns bnsVar = (bns) bnpVar.b;
                    long j5 = bnsVar.j.e;
                    if (j4 >= (-r5)) {
                        j4 += j5;
                    }
                    long j6 = (-a3) - a2;
                    long j7 = bnsVar.i.e;
                    long j8 = j6 - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    bmw bmwVar = bnsVar.d;
                    if (i == 0) {
                        f = bmwVar.af;
                    } else {
                        f = bmwVar.ag;
                    }
                    float f2 = 1.0f - f;
                    if (f > 0.0f) {
                        j = (((float) j8) / f) + (((float) j4) / f2);
                    } else {
                        j = 0;
                    }
                    float f3 = (float) j;
                    a = (j7 + ((((f * f3) + 0.5f) + a2) + ((f3 * f2) + 0.5f))) - j5;
                } else if (contains) {
                    a = Math.max(bnpVar.b(((bns) bnpVar.b).i, r0.e), ((bns) bnpVar.b).i.e + a2);
                } else if (contains2) {
                    a = Math.max(-bnpVar.a(((bns) bnpVar.b).j, r0.e), (-((bns) bnpVar.b).j.e) + a2);
                } else {
                    a = (r0.i.e + ((bns) bnpVar.b).a()) - ((bns) bnpVar.b).j.e;
                }
            }
            j3 = Math.max(j3, a);
            i2++;
            bniVar = this;
            bmxVar2 = bmxVar;
            j2 = 0;
        }
        return (int) j3;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.h.d();
        this.d.i.d();
        arrayList.add(this.d.h);
        arrayList.add(this.d.i);
        ArrayList arrayList2 = this.d.aJ;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            bmw bmwVar = (bmw) arrayList2.get(i);
            if (bmwVar instanceof bna) {
                arrayList.add(new bnm(bmwVar));
            } else {
                if (bmwVar.J()) {
                    if (bmwVar.f == null) {
                        bmwVar.f = new bng(bmwVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(bmwVar.f);
                } else {
                    arrayList.add(bmwVar.h);
                }
                if (bmwVar.K()) {
                    if (bmwVar.g == null) {
                        bmwVar.g = new bng(bmwVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(bmwVar.g);
                } else {
                    arrayList.add(bmwVar.i);
                }
                if (bmwVar instanceof bnb) {
                    arrayList.add(new bnn(bmwVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bns) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            bns bnsVar = (bns) arrayList.get(i3);
            if (bnsVar.d != this.d) {
                bnsVar.b();
            }
        }
        this.f.clear();
        bnp.a = 0;
        bmx bmxVar = this.a;
        e(bmxVar.h, 0, this.f);
        bmx bmxVar2 = this.a;
        e(bmxVar2.i, 1, this.f);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        bnk bnkVar;
        ArrayList arrayList = this.a.aJ;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            bmw bmwVar = (bmw) arrayList.get(i3);
            if (!bmwVar.e) {
                int[] iArr = bmwVar.ar;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = bmwVar.t;
                int i7 = bmwVar.u;
                if (i4 != 2) {
                    if (i4 == 3) {
                        if (i6 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i = 3;
                    } else {
                        i = i4;
                        z = false;
                    }
                } else {
                    i = i4;
                    z = true;
                }
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (i7 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i2 = 3;
                    } else {
                        i2 = i5;
                        z2 = false;
                    }
                } else {
                    i2 = i5;
                    z2 = true;
                }
                bnk bnkVar2 = bmwVar.h.f;
                boolean z3 = bnkVar2.i;
                bnk bnkVar3 = bmwVar.i.f;
                boolean z4 = bnkVar3.i;
                if (z3 && z4) {
                    f(bmwVar, 1, bnkVar2.f, 1, bnkVar3.f);
                    bmwVar.e = true;
                } else if (z3 && z2) {
                    f(bmwVar, 1, bnkVar2.f, 2, bnkVar3.f);
                    if (i2 == 3) {
                        bmwVar.i.f.m = bmwVar.h();
                    } else {
                        bmwVar.i.f.c(bmwVar.h());
                        bmwVar.e = true;
                    }
                } else if (z4 && z) {
                    f(bmwVar, 2, bnkVar2.f, 1, bnkVar3.f);
                    if (i == 3) {
                        bmwVar.h.f.m = bmwVar.j();
                    } else {
                        bmwVar.h.f.c(bmwVar.j());
                        bmwVar.e = true;
                    }
                }
                if (bmwVar.e && (bnkVar = bmwVar.i.b) != null) {
                    bnkVar.c(bmwVar.ac);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.bmx r18) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bni.d(bmx):void");
    }
}
