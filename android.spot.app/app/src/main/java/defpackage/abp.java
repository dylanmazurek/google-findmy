package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abp implements abi {
    private final Set A;
    private aei C;
    private int D;
    private int E;
    private int F;
    private boolean H;
    private int K;
    private final abl L;
    private final ags M;
    private aav N;
    private ahb O;
    private sb P;
    public final aaw a;
    public final abt b;
    public final afx c;
    public final agz d;
    public final agz e;
    public final ach f;
    public int[] g;
    public boolean h;
    public boolean j;
    public boolean l;
    public int n;
    public boolean o;
    public boolean p;
    public afw q;
    public afx r;
    public agb s;
    public boolean t;
    public aek u;
    public agz v;
    public final aha w;
    public boolean x;
    public int y;
    public se z;
    private final ags B = new ags();
    private final acy G = new acy();
    public final List i = new ArrayList();
    private final acy I = new acy();
    private aek J = alk.d;
    public final acy k = new acy();
    public int m = -1;

    public abp(aaw aawVar, abt abtVar, afx afxVar, Set set, agz agzVar, agz agzVar2, ach achVar) {
        boolean z;
        this.a = aawVar;
        this.b = abtVar;
        this.c = afxVar;
        this.A = set;
        this.d = agzVar;
        this.e = agzVar2;
        this.f = achVar;
        if (!abtVar.s() && !abtVar.q()) {
            z = false;
        } else {
            z = true;
        }
        this.o = z;
        this.L = new abl(this);
        this.M = new ags();
        afw b = afxVar.b();
        b.r();
        this.q = b;
        afx afxVar2 = new afx();
        if (abtVar.s()) {
            afxVar2.e();
        }
        if (abtVar.q()) {
            afxVar2.d();
        }
        this.r = afxVar2;
        agb c = afxVar2.c();
        c.A(true);
        this.s = c;
        this.w = new aha(this, agzVar);
        afw b2 = this.r.b();
        try {
            aav g = b2.g(0);
            b2.r();
            this.N = g;
            this.O = new ahb();
        } catch (Throwable th) {
            b2.r();
            throw th;
        }
    }

    private final void aA() {
        if (!this.H) {
            return;
        }
        abr.i("A call to createNode(), emitNode() or useNode() expected");
    }

    private static final int aB(int i) {
        return (-2) - i;
    }

    public static final /* synthetic */ void af(abp abpVar, adm admVar, aek aekVar, Object obj) {
        boolean z;
        abpVar.t(126665345, admVar);
        abpVar.ay(obj);
        int i = abpVar.y;
        try {
            abpVar.y = 126665345;
            if (abpVar.x) {
                agb.Y(abpVar.s);
            }
            if (abpVar.x || amr.i(abpVar.q.h(), aekVar)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                abpVar.V(aekVar);
            }
            abpVar.X(202, abr.c, 0, aekVar);
            abpVar.u = null;
            boolean z2 = abpVar.j;
            abpVar.j = z;
            alr.a(abpVar, new alf(316014703, true, new abo()));
            abpVar.j = z2;
        } finally {
            abpVar.U();
            abpVar.u = null;
            abpVar.y = i;
            abpVar.U();
        }
    }

    private final int ah(int i, int i2, int i3, int i4) {
        int i5;
        if (i != i3) {
            afw afwVar = this.q;
            if (afwVar.x(i)) {
                Object m = afwVar.m(i);
                if (m != null) {
                    if (m instanceof Enum) {
                        i5 = ((Enum) m).ordinal();
                    } else if (m instanceof adm) {
                        i5 = 126665345;
                    } else {
                        i5 = m.hashCode();
                    }
                } else {
                    i5 = 0;
                }
            } else {
                int b = afwVar.b(i);
                if (b == 207) {
                    Object j = afwVar.j(i);
                    if (j != null && !amr.i(j, abh.a)) {
                        i5 = j.hashCode();
                    } else {
                        i5 = 207;
                    }
                } else {
                    i5 = b;
                }
            }
            if (i5 == 126665345) {
                return i5;
            }
            int e = this.q.e(i);
            if (e != i3) {
                i4 = ah(e, ai(e), i3, i4);
            }
            if (true == this.q.x(i)) {
                i2 = 0;
            }
            return Integer.rotateLeft(Integer.rotateLeft(i4, 3) ^ i5, 3) ^ i2;
        }
        return i4;
    }

    private final int ai(int i) {
        int e = this.q.e(i) + 1;
        int i2 = 0;
        while (e < i) {
            if (!this.q.x(e)) {
                i2++;
            }
            e += this.q.c(e);
        }
        return i2;
    }

    private static final int aj(abp abpVar, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        abj abjVar;
        afw afwVar = abpVar.q;
        int i4 = 1;
        if (afz.t(afwVar.b, i)) {
            int b = afwVar.b(i);
            Object m = afwVar.m(i);
            if (b == 126665345) {
                if (m instanceof adm) {
                    adm admVar = (adm) m;
                    Object l = afwVar.l(i, 0);
                    aav g = afwVar.g(i);
                    int c = afwVar.c(i) + i;
                    List list = abpVar.i;
                    ArrayList arrayList = new ArrayList();
                    for (int c2 = abr.c(list, i); c2 < list.size(); c2++) {
                        acz aczVar = (acz) list.get(c2);
                        if (aczVar.b >= c) {
                            break;
                        }
                        arrayList.add(aczVar);
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        acz aczVar2 = (acz) arrayList.get(i5);
                        arrayList2.add(new mkw(aczVar2.a, aczVar2.c));
                    }
                    ado adoVar = new ado(admVar, l, abpVar.f, abpVar.c, g, arrayList2, abpVar.ak(i));
                    abpVar.b.f(adoVar);
                    abpVar.w.k();
                    aha ahaVar = abpVar.w;
                    ach achVar = abpVar.f;
                    abt abtVar = abpVar.b;
                    aip aipVar = ahaVar.a.a;
                    ahv ahvVar = ahv.a;
                    aipVar.e(ahvVar);
                    aio.b(aipVar, 0, achVar);
                    aio.b(aipVar, 1, abtVar);
                    aio.b(aipVar, 2, adoVar);
                    if (aipVar.g != aip.h(ahvVar.b) || aipVar.h != aip.h(ahvVar.c)) {
                        StringBuilder sb = new StringBuilder();
                        int i6 = ahvVar.b;
                        int i7 = 0;
                        for (int i8 = 0; i8 < i6; i8++) {
                            if (((1 << i8) & aipVar.g) != 0) {
                                if (i7 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(ahvVar.a(i8));
                                i7++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder();
                        int i9 = ahvVar.c;
                        int i10 = 0;
                        for (int i11 = 0; i11 < i9; i11++) {
                            if (((1 << i11) & aipVar.h) != 0) {
                                if (i7 > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(ahvVar.c(i11));
                                i10++;
                            }
                        }
                        ael.b(a.al(new StringBuilder(), sb3.toString(), i10, sb2, i7, ahvVar));
                    }
                    if (z) {
                        aha ahaVar2 = abpVar.w;
                        ahaVar2.i();
                        ahaVar2.g();
                        if (!ahaVar2.a().z(i)) {
                            i4 = ahaVar2.a().d(i);
                        }
                        if (i4 <= 0) {
                            return 0;
                        }
                        ahaVar2.l(i2, i4);
                        return 0;
                    }
                    return afwVar.d(i);
                }
            } else if (b == 206 && amr.i(m, abr.e)) {
                Object l2 = afwVar.l(i, 0);
                if (l2 instanceof abj) {
                    abjVar = (abj) l2;
                } else {
                    abjVar = null;
                }
                if (abjVar != null) {
                    for (abp abpVar2 : abjVar.a.a) {
                        afx afxVar = abpVar2.c;
                        if (afxVar.b > 0 && afz.r(afxVar.a, 0)) {
                            ach achVar2 = abpVar2.f;
                            synchronized (((abw) achVar2).b) {
                                ((abw) achVar2).i();
                                su s = ((abw) achVar2).s();
                                try {
                                    ((abw) achVar2).i.ae(s);
                                } catch (Exception e) {
                                    ((abw) achVar2).m = s;
                                    throw e;
                                }
                            }
                            agz agzVar = new agz();
                            abpVar2.v = agzVar;
                            afw b2 = abpVar2.c.b();
                            try {
                                abpVar2.q = b2;
                                aha ahaVar3 = abpVar2.w;
                                agz agzVar2 = ahaVar3.a;
                                try {
                                    ahaVar3.a = agzVar;
                                    abpVar2.at(0);
                                    aha ahaVar4 = abpVar2.w;
                                    ahaVar4.g();
                                    if (ahaVar4.b) {
                                        ahaVar4.m();
                                        ahaVar4.b();
                                    }
                                    ahaVar3.a = agzVar2;
                                } catch (Throwable th) {
                                    ahaVar3.a = agzVar2;
                                    throw th;
                                }
                            } finally {
                                b2.r();
                            }
                        }
                        abpVar.b.m(abpVar2.f);
                    }
                }
                return afwVar.d(i);
            }
            if (!afwVar.z(i)) {
                return afwVar.d(i);
            }
        } else {
            if (afz.r(afwVar.b, i)) {
                int c3 = afwVar.c(i) + i;
                int i12 = 0;
                for (int i13 = i + 1; i13 < c3; i13 += afwVar.c(i13)) {
                    boolean z3 = afwVar.z(i13);
                    if (z3) {
                        abpVar.w.i();
                        abpVar.w.d(afwVar.o(i13));
                    }
                    if (!z3 && !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z3) {
                        i3 = 0;
                    } else {
                        i3 = i2 + i12;
                    }
                    i12 += aj(abpVar, i13, z2, i3);
                    if (z3) {
                        abpVar.w.i();
                        abpVar.w.f();
                    }
                }
                if (afwVar.z(i)) {
                    return 1;
                }
                return i12;
            }
            if (!afwVar.z(i)) {
                return afwVar.d(i);
            }
        }
        return 1;
    }

    private final aek ak(int i) {
        aek aekVar;
        if (this.x && this.t) {
            int i2 = this.s.q;
            while (i2 > 0) {
                if (this.s.i(i2) == 202 && amr.i(this.s.v(i2), abr.c)) {
                    Object u = this.s.u(i2);
                    u.getClass();
                    aek aekVar2 = (aek) u;
                    this.u = aekVar2;
                    return aekVar2;
                }
                i2 = this.s.l(i2);
            }
        }
        if (this.q.c > 0) {
            while (i > 0) {
                if (this.q.b(i) == 202 && amr.i(this.q.m(i), abr.c)) {
                    se seVar = this.z;
                    if (seVar == null || (aekVar = (aek) seVar.a(i)) == null) {
                        Object j = this.q.j(i);
                        j.getClass();
                        aekVar = (aek) j;
                    }
                    this.u = aekVar;
                    return aekVar;
                }
                i = this.q.e(i);
            }
        }
        aek aekVar3 = this.J;
        this.u = aekVar3;
        return aekVar3;
    }

    private final void al(int i, int i2) {
        if (i > 0 && i != i2) {
            al(this.q.e(i), i2);
            if (this.q.z(i)) {
                this.w.d(this.q.o(i));
            }
        }
    }

    private final void am(boolean z) {
        int hashCode;
        int i;
        int rotateRight;
        int i2;
        boolean z2;
        int i3;
        int i4;
        List list;
        List list2;
        HashSet hashSet;
        LinkedHashSet linkedHashSet;
        int i5;
        int i6;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i7;
        Object[] objArr3;
        Object[] objArr4;
        int i8;
        int hashCode2;
        int i9;
        int rotateRight2;
        abp abpVar = this;
        int i10 = abpVar.G.a[r1.b - 2] - 1;
        int i11 = 207;
        if (abpVar.x) {
            agb agbVar = abpVar.s;
            int i12 = agbVar.q;
            int i13 = agbVar.i(i12);
            Object v = abpVar.s.v(i12);
            Object u = abpVar.s.u(i12);
            if (v == null) {
                if (u != null && i13 == 207) {
                    if (!amr.i(u, abh.a)) {
                        rotateRight2 = Integer.rotateRight(i10 ^ abpVar.y, 3) ^ u.hashCode();
                    }
                } else {
                    i11 = i13;
                }
                rotateRight2 = Integer.rotateRight(i10 ^ abpVar.y, 3) ^ i11;
            } else {
                if (v instanceof Enum) {
                    hashCode2 = ((Enum) v).ordinal();
                    i9 = abpVar.y;
                } else {
                    hashCode2 = v.hashCode();
                    i9 = abpVar.y;
                }
                rotateRight2 = hashCode2 ^ Integer.rotateRight(i9, 3);
            }
            abpVar.y = Integer.rotateRight(rotateRight2, 3);
        } else {
            afw afwVar = abpVar.q;
            int i14 = afwVar.g;
            int b = afwVar.b(i14);
            Object m = abpVar.q.m(i14);
            Object j = abpVar.q.j(i14);
            if (m == null) {
                if (j != null && b == 207) {
                    if (!amr.i(j, abh.a)) {
                        rotateRight = Integer.rotateRight(i10 ^ abpVar.y, 3) ^ j.hashCode();
                    }
                } else {
                    i11 = b;
                }
                rotateRight = Integer.rotateRight(i10 ^ abpVar.y, 3) ^ i11;
            } else {
                if (m instanceof Enum) {
                    hashCode = ((Enum) m).ordinal();
                    i = abpVar.y;
                } else {
                    hashCode = m.hashCode();
                    i = abpVar.y;
                }
                rotateRight = hashCode ^ Integer.rotateRight(i, 3);
            }
            abpVar.y = Integer.rotateRight(rotateRight, 3);
        }
        int i15 = abpVar.E;
        aei aeiVar = abpVar.C;
        if (aeiVar != null && aeiVar.a.size() > 0) {
            List list3 = aeiVar.a;
            List list4 = aeiVar.d;
            HashSet hashSet2 = new HashSet(list4.size());
            int size = list4.size();
            for (int i16 = 0; i16 < size; i16++) {
                hashSet2.add(list4.get(i16));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int size2 = list4.size();
            int size3 = list3.size();
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i17 < size3) {
                adc adcVar = (adc) list3.get(i17);
                if (!hashSet2.contains(adcVar)) {
                    i17++;
                    abpVar.w.l(aeiVar.a(adcVar) + aeiVar.b, adcVar.d);
                    aeiVar.d(adcVar.c, 0);
                    abpVar.w.e(adcVar.c);
                    abpVar.q.t(adcVar.c);
                    ar();
                    abpVar.q.f();
                    List list5 = abpVar.i;
                    int i20 = adcVar.c;
                    abr.l(list5, i20, abpVar.q.c(i20) + i20);
                } else if (linkedHashSet2.contains(adcVar)) {
                    i17++;
                } else if (i18 < size2) {
                    adc adcVar2 = (adc) list4.get(i18);
                    if (adcVar2 != adcVar) {
                        int a = aeiVar.a(adcVar2);
                        linkedHashSet2.add(adcVar2);
                        if (a != i19) {
                            int b2 = aeiVar.b(adcVar2);
                            aha ahaVar = abpVar.w;
                            list2 = list4;
                            int i21 = aeiVar.b;
                            hashSet = hashSet2;
                            if (b2 > 0) {
                                int i22 = i19 + i21;
                                int i23 = i21 + a;
                                linkedHashSet = linkedHashSet2;
                                int i24 = ahaVar.h;
                                i5 = size2;
                                if (i24 > 0) {
                                    i6 = size3;
                                    if (ahaVar.f == i23 - i24 && ahaVar.g == i22 - i24) {
                                        ahaVar.h = i24 + b2;
                                    }
                                } else {
                                    i6 = size3;
                                }
                                ahaVar.i();
                                ahaVar.f = i23;
                                ahaVar.g = i22;
                                ahaVar.h = b2;
                            } else {
                                linkedHashSet = linkedHashSet2;
                                i5 = size2;
                                i6 = size3;
                            }
                            char c = 7;
                            if (a > i19) {
                                se seVar = aeiVar.f;
                                Object[] objArr5 = seVar.c;
                                long[] jArr3 = seVar.a;
                                int length = jArr3.length - 2;
                                i4 = i15;
                                if (length >= 0) {
                                    int i25 = 0;
                                    while (true) {
                                        long j2 = jArr3[i25];
                                        list = list3;
                                        long[] jArr4 = jArr3;
                                        if ((((~j2) << c) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i26 = 8 - ((~(i25 - length)) >>> 31);
                                            int i27 = 0;
                                            while (i27 < i26) {
                                                if ((j2 & 255) < 128) {
                                                    acv acvVar = (acv) objArr5[(i25 << 3) + i27];
                                                    int i28 = acvVar.b;
                                                    objArr4 = objArr5;
                                                    if (a <= i28 && i28 < a + b2) {
                                                        i8 = (i28 - a) + i19;
                                                    } else if (i19 <= i28 && i28 < a) {
                                                        i8 = i28 + b2;
                                                    }
                                                    acvVar.b = i8;
                                                } else {
                                                    objArr4 = objArr5;
                                                }
                                                j2 >>= 8;
                                                i27++;
                                                objArr5 = objArr4;
                                            }
                                            objArr3 = objArr5;
                                            if (i26 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr3 = objArr5;
                                        }
                                        if (i25 == length) {
                                            break;
                                        }
                                        i25++;
                                        list3 = list;
                                        jArr3 = jArr4;
                                        objArr5 = objArr3;
                                        c = 7;
                                    }
                                } else {
                                    list = list3;
                                }
                            } else {
                                i4 = i15;
                                list = list3;
                                if (i19 > a) {
                                    se seVar2 = aeiVar.f;
                                    Object[] objArr6 = seVar2.c;
                                    long[] jArr5 = seVar2.a;
                                    int length2 = jArr5.length - 2;
                                    if (length2 >= 0) {
                                        int i29 = 0;
                                        while (true) {
                                            long j3 = jArr5[i29];
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                int i31 = 0;
                                                while (i31 < i30) {
                                                    if ((j3 & 255) < 128) {
                                                        acv acvVar2 = (acv) objArr6[(i29 << 3) + i31];
                                                        jArr2 = jArr5;
                                                        int i32 = acvVar2.b;
                                                        objArr2 = objArr6;
                                                        if (a <= i32 && i32 < a + b2) {
                                                            i7 = (i32 - a) + i19;
                                                        } else if (a + 1 <= i32 && i32 < i19) {
                                                            i7 = i32 - b2;
                                                        }
                                                        acvVar2.b = i7;
                                                    } else {
                                                        jArr2 = jArr5;
                                                        objArr2 = objArr6;
                                                    }
                                                    j3 >>= 8;
                                                    i31++;
                                                    jArr5 = jArr2;
                                                    objArr6 = objArr2;
                                                }
                                                jArr = jArr5;
                                                objArr = objArr6;
                                                if (i30 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr = jArr5;
                                                objArr = objArr6;
                                            }
                                            if (i29 == length2) {
                                                break;
                                            }
                                            i29++;
                                            jArr5 = jArr;
                                            objArr6 = objArr;
                                        }
                                    }
                                }
                            }
                        } else {
                            i4 = i15;
                            list = list3;
                            list2 = list4;
                            hashSet = hashSet2;
                            linkedHashSet = linkedHashSet2;
                            i5 = size2;
                            i6 = size3;
                        }
                    } else {
                        i4 = i15;
                        list = list3;
                        list2 = list4;
                        hashSet = hashSet2;
                        linkedHashSet = linkedHashSet2;
                        i5 = size2;
                        i6 = size3;
                        i17++;
                    }
                    i18++;
                    i19 += aeiVar.b(adcVar2);
                    abpVar = this;
                    list4 = list2;
                    hashSet2 = hashSet;
                    linkedHashSet2 = linkedHashSet;
                    size2 = i5;
                    size3 = i6;
                    i15 = i4;
                    list3 = list;
                } else {
                    abpVar = this;
                }
            }
            i2 = i15;
            abpVar.w.i();
            if (list3.size() > 0) {
                abpVar.w.e(abpVar.q.f);
                abpVar.q.u();
            }
        } else {
            i2 = i15;
        }
        boolean z3 = abpVar.x;
        if (!z3) {
            afw afwVar2 = abpVar.q;
            int i33 = afwVar2.j - afwVar2.i;
            if (i33 > 0) {
                aha ahaVar2 = abpVar.w;
                ahaVar2.h();
                aip aipVar = ahaVar2.a.a;
                aic aicVar = aic.a;
                aipVar.e(aicVar);
                aio.a(aipVar, 0, i33);
                if (aipVar.g != aip.h(aicVar.b) || aipVar.h != aip.h(aicVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i34 = aicVar.b;
                    int i35 = 0;
                    for (int i36 = 0; i36 < i34; i36++) {
                        if (((1 << i36) & aipVar.g) != 0) {
                            if (i35 > 0) {
                                sb.append(", ");
                            }
                            sb.append(aicVar.a(i36));
                            i35++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i37 = aicVar.c;
                    int i38 = 0;
                    for (int i39 = 0; i39 < i37; i39++) {
                        if (((1 << i39) & aipVar.h) != 0) {
                            if (i35 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(aicVar.c(i39));
                            i38++;
                        }
                    }
                    ael.b(a.al(new StringBuilder(), sb3.toString(), i38, sb2, i35, aicVar));
                }
            }
        }
        int i40 = abpVar.D;
        while (!abpVar.q.y()) {
            int i41 = abpVar.q.e;
            ar();
            abpVar.w.l(i40, abpVar.q.f());
            abr.l(abpVar.i, i41, abpVar.q.e);
        }
        if (z3) {
            if (z) {
                ahb ahbVar = abpVar.O;
                if (!ahbVar.b.g()) {
                    abr.i("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                aip aipVar2 = ahbVar.b;
                aip aipVar3 = ahbVar.a;
                if (!aipVar2.f()) {
                    aij[] aijVarArr = aipVar2.a;
                    int i42 = aipVar2.b - 1;
                    aipVar2.b = i42;
                    aij aijVar = aijVarArr[i42];
                    aijVar.getClass();
                    aijVarArr[i42] = null;
                    aipVar3.e(aijVar);
                    int i43 = aipVar2.f;
                    int i44 = aipVar3.f;
                    for (int i45 = 0; i45 < aijVar.c; i45++) {
                        i44--;
                        i43--;
                        Object[] objArr7 = aipVar3.e;
                        Object[] objArr8 = aipVar2.e;
                        objArr7[i44] = objArr8[i43];
                        objArr8[i43] = null;
                    }
                    int i46 = aipVar2.d;
                    int i47 = aipVar3.d;
                    int i48 = aijVar.b;
                    for (int i49 = 0; i49 < i48; i49++) {
                        i47--;
                        i46--;
                        int[] iArr = aipVar3.c;
                        int[] iArr2 = aipVar2.c;
                        iArr[i47] = iArr2[i46];
                        iArr2[i46] = 0;
                    }
                    aipVar2.f -= aijVar.c;
                    aipVar2.d -= aijVar.b;
                    i3 = 1;
                } else {
                    throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                }
            } else {
                i3 = i2;
            }
            if (abpVar.q.h <= 0) {
                ael.a("Unbalanced begin/end empty");
            }
            r5.h--;
            agb agbVar2 = abpVar.s;
            int i50 = agbVar2.q;
            agbVar2.X();
            if (!abpVar.q.w()) {
                int aB = aB(i50);
                abpVar.s.B();
                abpVar.s.A(true);
                aav aavVar = abpVar.N;
                ahb ahbVar2 = abpVar.O;
                if (ahbVar2.a.f()) {
                    aha ahaVar3 = abpVar.w;
                    afx afxVar = abpVar.r;
                    ahaVar3.g();
                    ahaVar3.h();
                    ahaVar3.i();
                    aip aipVar4 = ahaVar3.a.a;
                    ahq ahqVar = ahq.a;
                    aipVar4.e(ahqVar);
                    aio.b(aipVar4, 0, aavVar);
                    aio.b(aipVar4, 1, afxVar);
                    if (aipVar4.g != aip.h(ahqVar.b) || aipVar4.h != aip.h(ahqVar.c)) {
                        StringBuilder sb4 = new StringBuilder();
                        int i51 = ahqVar.b;
                        int i52 = 0;
                        for (int i53 = 0; i53 < i51; i53++) {
                            if (((1 << i53) & aipVar4.g) != 0) {
                                if (i52 > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(ahqVar.a(i53));
                                i52++;
                            }
                        }
                        String sb5 = sb4.toString();
                        StringBuilder sb6 = new StringBuilder();
                        int i54 = ahqVar.c;
                        int i55 = 0;
                        for (int i56 = 0; i56 < i54; i56++) {
                            if (((1 << i56) & aipVar4.h) != 0) {
                                if (i52 > 0) {
                                    sb6.append(", ");
                                }
                                sb6.append(ahqVar.c(i56));
                                i55++;
                            }
                        }
                        ael.b(a.al(new StringBuilder(), sb6.toString(), i55, sb5, i52, ahqVar));
                    }
                } else {
                    aha ahaVar4 = abpVar.w;
                    afx afxVar2 = abpVar.r;
                    ahaVar4.g();
                    ahaVar4.h();
                    ahaVar4.i();
                    aip aipVar5 = ahaVar4.a.a;
                    ahr ahrVar = ahr.a;
                    aipVar5.e(ahrVar);
                    aio.b(aipVar5, 0, aavVar);
                    aio.b(aipVar5, 1, afxVar2);
                    aio.b(aipVar5, 2, ahbVar2);
                    if (aipVar5.g != aip.h(ahrVar.b) || aipVar5.h != aip.h(ahrVar.c)) {
                        StringBuilder sb7 = new StringBuilder();
                        int i57 = ahrVar.b;
                        int i58 = 0;
                        for (int i59 = 0; i59 < i57; i59++) {
                            if (((1 << i59) & aipVar5.g) != 0) {
                                if (i58 > 0) {
                                    sb7.append(", ");
                                }
                                sb7.append(ahrVar.a(i59));
                                i58++;
                            }
                        }
                        String sb8 = sb7.toString();
                        StringBuilder sb9 = new StringBuilder();
                        int i60 = ahrVar.c;
                        int i61 = 0;
                        for (int i62 = 0; i62 < i60; i62++) {
                            if (((1 << i62) & aipVar5.h) != 0) {
                                if (i58 > 0) {
                                    sb9.append(", ");
                                }
                                sb9.append(ahrVar.c(i62));
                                i61++;
                            }
                        }
                        ael.b(a.al(new StringBuilder(), sb9.toString(), i61, sb8, i58, ahrVar));
                    }
                    abpVar.O = new ahb();
                }
                abpVar.x = false;
                if (abpVar.c.b != 0) {
                    abpVar.aa(aB, 0);
                    abpVar.ax(aB, i3);
                }
            }
        } else {
            if (z) {
                abpVar.w.f();
                z2 = true;
            } else {
                z2 = false;
            }
            aha ahaVar5 = abpVar.w;
            int i63 = ahaVar5.a().g;
            if (ahaVar5.c.b(-1) > i63) {
                abr.i("Missed recording an endGroup");
            }
            if (ahaVar5.c.b(-1) == i63) {
                aha.n(ahaVar5);
                ahaVar5.c.c();
                ahaVar5.a.c();
            }
            int i64 = abpVar.q.g;
            int i65 = i2;
            if (i65 != abpVar.K(i64)) {
                abpVar.ax(i64, i65);
            }
            if (true == z2) {
                i65 = 1;
            }
            abpVar.q.s();
            abpVar.w.i();
            i3 = i65;
        }
        aei aeiVar2 = (aei) abpVar.B.b();
        if (aeiVar2 != null && !z3) {
            aeiVar2.c++;
        }
        abpVar.C = aeiVar2;
        abpVar.D = abpVar.G.c() + i3;
        abpVar.F = abpVar.G.c();
        abpVar.E = abpVar.G.c() + i3;
    }

    private final void an() {
        if (this.s.r) {
            agb c = this.r.c();
            this.s = c;
            c.K();
            this.t = false;
            this.u = null;
        }
    }

    private final void ao(boolean z, aei aeiVar) {
        this.B.f(this.C);
        this.C = aeiVar;
        this.G.e(this.E);
        this.G.e(this.F);
        this.G.e(this.D);
        if (z) {
            this.D = 0;
        }
        this.E = 0;
        this.F = 0;
    }

    private final void ap() {
        afx afxVar = new afx();
        if (this.o) {
            afxVar.e();
        }
        if (this.b.q()) {
            afxVar.d();
        }
        this.r = afxVar;
        agb c = afxVar.c();
        c.A(true);
        this.s = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0058, code lost:            if (defpackage.aeu.n((defpackage.acm) r13, r15) == false) goto L13;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aq() {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abp.aq():void");
    }

    private final void ar() {
        at(this.q.e);
        aha ahaVar = this.w;
        ahaVar.h();
        ahaVar.a.a.d(ahx.a);
        int i = ahaVar.e;
        afw a = ahaVar.a();
        ahaVar.e = i + afz.c(a.b, a.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void as(int r7, int r8, int r9) {
        /*
            r6 = this;
            afw r0 = r6.q
            if (r7 != r8) goto L5
            goto L17
        L5:
            if (r7 == r9) goto L55
            if (r8 == r9) goto L55
            int r1 = r0.e(r7)
            if (r1 != r8) goto L11
            r9 = r8
            goto L55
        L11:
            int r1 = r0.e(r8)
            if (r1 != r7) goto L19
        L17:
            r9 = r7
            goto L55
        L19:
            int r1 = r0.e(r7)
            int r2 = r0.e(r8)
            if (r1 != r2) goto L28
            int r9 = r0.e(r7)
            goto L55
        L28:
            int r1 = defpackage.abr.b(r0, r7, r9)
            int r9 = defpackage.abr.b(r0, r8, r9)
            int r2 = r1 - r9
            r3 = 0
            r5 = r7
            r4 = 0
        L35:
            if (r4 >= r2) goto L3e
            int r5 = r0.e(r5)
            int r4 = r4 + 1
            goto L35
        L3e:
            int r9 = r9 - r1
            r1 = r8
        L40:
            if (r3 >= r9) goto L49
            int r1 = r0.e(r1)
            int r3 = r3 + 1
            goto L40
        L49:
            if (r5 == r1) goto L54
            int r5 = r0.e(r5)
            int r1 = r0.e(r1)
            goto L49
        L54:
            r9 = r5
        L55:
            if (r7 <= 0) goto L69
            if (r7 == r9) goto L69
            boolean r1 = r0.z(r7)
            if (r1 == 0) goto L64
            aha r1 = r6.w
            r1.f()
        L64:
            int r7 = r0.e(r7)
            goto L55
        L69:
            r6.al(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abp.as(int, int, int):void");
    }

    private final void at(int i) {
        aj(this, i, false, 0);
        this.w.i();
    }

    private final void au() {
        int i;
        afw afwVar = this.q;
        int i2 = afwVar.g;
        if (i2 >= 0) {
            i = afz.f(afwVar.b, i2);
        } else {
            i = 0;
        }
        this.E = i;
        this.q.u();
    }

    private final void av(int i) {
        X(i, null, 0, null);
    }

    private final void aw(boolean z, Object obj) {
        if (z) {
            afw afwVar = this.q;
            if (afwVar.h <= 0) {
                if (!afz.v(afwVar.b, afwVar.e)) {
                    ael.a("Expected a node group");
                }
                afwVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.q.h() != obj) {
            aha ahaVar = this.w;
            aha.n(ahaVar);
            aip aipVar = ahaVar.a.a;
            aie aieVar = aie.a;
            aipVar.e(aieVar);
            aio.b(aipVar, 0, obj);
            if (aipVar.g != aip.h(aieVar.b) || aipVar.h != aip.h(aieVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i = aieVar.b;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    if (((1 << i3) & aipVar.g) != 0) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(aieVar.a(i3));
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i4 = aieVar.c;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    if (((1 << i6) & aipVar.h) != 0) {
                        if (i2 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(aieVar.c(i6));
                        i5++;
                    }
                }
                ael.b(a.al(new StringBuilder(), sb3.toString(), i5, sb2, i2, aieVar));
            }
        }
        this.q.v();
    }

    private final void ax(int i, int i2) {
        int K = K(i);
        if (K != i2) {
            int a = this.B.a() - 1;
            while (i != -1) {
                int K2 = K(i) + (i2 - K);
                aa(i, K2);
                int i3 = a;
                while (true) {
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    aei aeiVar = (aei) this.B.a.get(i3);
                    if (aeiVar != null && aeiVar.d(i, K2)) {
                        a = i4;
                        break;
                    }
                    i3 = i4;
                }
                if (i < 0) {
                    i = this.q.g;
                } else if (!this.q.z(i)) {
                    i = this.q.e(i);
                } else {
                    return;
                }
            }
        }
    }

    private final void ay(Object obj) {
        O();
        ab(obj);
    }

    private final void az() {
        if (!this.H) {
            abr.i("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.H = false;
    }

    @Override // defpackage.abi
    public final boolean A(long j) {
        Object O = O();
        if ((O instanceof Long) && j == ((Number) O).longValue()) {
            return false;
        }
        ab(Long.valueOf(j));
        return true;
    }

    @Override // defpackage.abi
    public final boolean B(Object obj) {
        if (!amr.i(O(), obj)) {
            ab(obj);
            return true;
        }
        return false;
    }

    @Override // defpackage.abi
    public final boolean C(boolean z) {
        Object O = O();
        if ((O instanceof Boolean) && z == ((Boolean) O).booleanValue()) {
            return false;
        }
        ab(Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.abi
    public final boolean D(Object obj) {
        if (O() != obj) {
            ab(obj);
            return true;
        }
        return false;
    }

    @Override // defpackage.abi
    public final boolean E() {
        if (!G() || this.j) {
            return true;
        }
        aeu N = N();
        if (N != null && (N.a & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.abi
    public final boolean F() {
        return this.x;
    }

    @Override // defpackage.abi
    public final boolean G() {
        aeu N;
        if (!this.x && !this.l && !this.j && (N = N()) != null && (N.a & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.abi
    public final void H() {
        X(1219399079, null, 0, null);
    }

    @Override // defpackage.abi
    public final void I(Object obj) {
        if (!this.x && this.q.a() == 207 && !amr.i(this.q.h(), obj) && this.m < 0) {
            this.m = this.q.e;
            this.l = true;
        }
        X(207, null, 0, obj);
    }

    public final int K(int i) {
        int i2;
        if (i < 0) {
            sb sbVar = this.P;
            if (sbVar == null || sbVar.a(i) < 0) {
                return 0;
            }
            return sbVar.b(i);
        }
        int[] iArr = this.g;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.q.d(i);
    }

    public final aek L() {
        aek aekVar = this.u;
        if (aekVar != null) {
            return aekVar;
        }
        return ak(this.q.g);
    }

    public final aek M(aek aekVar, aek aekVar2) {
        aej b = aekVar.b();
        b.putAll(aekVar2);
        alk b2 = ((alj) b).b();
        Y(204, abr.d);
        ay(b2);
        ay(aekVar2);
        U();
        return b2;
    }

    public final aeu N() {
        if (this.n == 0) {
            ags agsVar = this.M;
            if (agsVar.e()) {
                return (aeu) agsVar.a.get(agsVar.a() - 1);
            }
            return null;
        }
        return null;
    }

    public final Object O() {
        if (this.x) {
            aA();
            return abh.a;
        }
        Object n = this.q.n();
        if (this.l && !(n instanceof aft)) {
            return abh.a;
        }
        return n;
    }

    public final Object P() {
        if (this.x) {
            aA();
            return abh.a;
        }
        Object n = this.q.n();
        if (this.l && !(n instanceof aft)) {
            return abh.a;
        }
        if (n instanceof afr) {
            return ((afr) n).a;
        }
        return n;
    }

    public final void Q() {
        R();
        this.B.c();
        this.G.d();
        this.I.d();
        this.k.d();
        this.z = null;
        ahb ahbVar = this.O;
        ahbVar.b.b();
        ahbVar.a.b();
        this.y = 0;
        this.n = 0;
        this.H = false;
        this.x = false;
        this.l = false;
        this.p = false;
        this.m = -1;
        afw afwVar = this.q;
        if (!afwVar.d) {
            afwVar.r();
        }
        if (!this.s.r) {
            ap();
        }
    }

    public final void R() {
        this.C = null;
        this.D = 0;
        this.E = 0;
        this.y = 0;
        this.H = false;
        aha ahaVar = this.w;
        ahaVar.b = false;
        ahaVar.c.d();
        ahaVar.e = 0;
        this.M.c();
        this.g = null;
        this.P = null;
    }

    public final void S() {
        abr.m(this.s.r);
        ap();
    }

    public final void T() {
        this.M.c();
        this.i.clear();
        this.d.a();
        this.z = null;
    }

    public final void U() {
        am(false);
    }

    public final void V(aek aekVar) {
        se seVar = this.z;
        if (seVar == null) {
            seVar = new se((byte[]) null);
            this.z = seVar;
        }
        seVar.d(this.q.e, aekVar);
    }

    public final void W() {
        this.E += this.q.f();
    }

    public final void X(int i, Object obj, int i2, Object obj2) {
        int hashCode;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        aei aeiVar;
        Object valueOf;
        int i5;
        int i6;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        Object[] objArr3;
        int i7;
        Object[] objArr4;
        int i8;
        int f;
        int i9;
        int rotateLeft;
        Object obj3 = obj;
        aA();
        int i10 = this.F;
        if (obj3 == null) {
            if (obj2 != null) {
                i4 = 207;
                i9 = i;
                if (i9 == 207) {
                    if (!amr.i(obj2, abh.a)) {
                        rotateLeft = obj2.hashCode() ^ Integer.rotateLeft(this.y, 3);
                        this.y = i10 ^ Integer.rotateLeft(rotateLeft, 3);
                    }
                    rotateLeft = Integer.rotateLeft(this.y, 3) ^ i4;
                    this.y = i10 ^ Integer.rotateLeft(rotateLeft, 3);
                }
            } else {
                i9 = i;
            }
            i4 = i9;
            rotateLeft = Integer.rotateLeft(this.y, 3) ^ i4;
            this.y = i10 ^ Integer.rotateLeft(rotateLeft, 3);
        } else {
            if (obj3 instanceof Enum) {
                hashCode = ((Enum) obj3).ordinal();
                i3 = this.y;
            } else {
                hashCode = obj.hashCode();
                i3 = this.y;
            }
            this.y = Integer.rotateLeft(hashCode ^ Integer.rotateLeft(i3, 3), 3);
            i4 = i;
        }
        boolean z3 = true;
        if (obj3 == null) {
            this.F++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.x) {
            this.q.q();
            agb agbVar = this.s;
            int i11 = agbVar.o;
            if (z) {
                agbVar.O(i4, abh.a);
            } else {
                if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = abh.a;
                    }
                    agbVar.L(i4, obj3, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = abh.a;
                    }
                    agbVar.N(i4, obj3);
                }
                z3 = false;
            }
            aei aeiVar2 = this.C;
            if (aeiVar2 != null) {
                adc adcVar = new adc(i4, -1, aB(i11), -1);
                aeiVar2.c(adcVar, this.D - aeiVar2.b);
                aeiVar2.e(adcVar);
            }
            ao(z3, null);
            return;
        }
        if (i2 != 1 || !this.l) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.C == null) {
            int a = this.q.a();
            if (!z2 && a == i4 && amr.i(obj3, this.q.i())) {
                aw(z, obj2);
            } else {
                afw afwVar = this.q;
                ArrayList arrayList = new ArrayList();
                if (afwVar.h <= 0) {
                    for (int i12 = afwVar.e; i12 < afwVar.f; i12 += afz.c(afwVar.b, i12)) {
                        int d = afz.d(afwVar.b, i12);
                        Object p = afwVar.p(afwVar.b, i12);
                        if (afz.v(afwVar.b, i12)) {
                            f = 1;
                        } else {
                            f = afz.f(afwVar.b, i12);
                        }
                        arrayList.add(new adc(d, p, i12, f));
                    }
                }
                this.C = new aei(arrayList, this.D);
            }
        }
        aei aeiVar3 = this.C;
        if (aeiVar3 != null) {
            if (obj3 != null) {
                valueOf = new adb(Integer.valueOf(i4), obj3);
            } else {
                valueOf = Integer.valueOf(i4);
            }
            su suVar = ((ads) aeiVar3.e.a()).a;
            Object a2 = suVar.a(valueOf);
            if (a2 != null) {
                if (mpp.e(a2)) {
                    List b = mpp.b(a2);
                    Object remove = b.remove(0);
                    if (b.isEmpty()) {
                        suVar.f(valueOf);
                    }
                    a2 = remove;
                } else {
                    suVar.f(valueOf);
                }
                a2.getClass();
            } else {
                a2 = null;
            }
            adc adcVar2 = (adc) a2;
            if (!z2 && adcVar2 != null) {
                aeiVar3.e(adcVar2);
                this.D = aeiVar3.a(adcVar2) + aeiVar3.b;
                acv acvVar = (acv) aeiVar3.f.a(adcVar2.c);
                if (acvVar != null) {
                    i6 = acvVar.a;
                } else {
                    i6 = -1;
                }
                int i13 = aeiVar3.c;
                int i14 = i6 - i13;
                char c = 7;
                if (i6 > i13) {
                    se seVar = aeiVar3.f;
                    Object[] objArr5 = seVar.c;
                    long[] jArr3 = seVar.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j = jArr3[i15];
                            int i16 = i6;
                            if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i15 - length)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((j & 255) < 128) {
                                        acv acvVar2 = (acv) objArr5[(i15 << 3) + i18];
                                        int i19 = acvVar2.a;
                                        objArr4 = objArr5;
                                        i8 = i16;
                                        if (i19 == i8) {
                                            acvVar2.a = i13;
                                        } else if (i13 <= i19 && i19 < i8) {
                                            acvVar2.a = i19 + 1;
                                        }
                                    } else {
                                        objArr4 = objArr5;
                                        i8 = i16;
                                    }
                                    j >>= 8;
                                    i18++;
                                    i16 = i8;
                                    objArr5 = objArr4;
                                }
                                objArr3 = objArr5;
                                i7 = i16;
                                if (i17 != 8) {
                                    break;
                                }
                            } else {
                                objArr3 = objArr5;
                                i7 = i16;
                            }
                            if (i15 == length) {
                                break;
                            }
                            i15++;
                            i6 = i7;
                            objArr5 = objArr3;
                            c = 7;
                        }
                    }
                } else {
                    int i20 = i6;
                    if (i13 > i20) {
                        se seVar2 = aeiVar3.f;
                        Object[] objArr6 = seVar2.c;
                        long[] jArr4 = seVar2.a;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i21 = 0;
                            while (true) {
                                long j2 = jArr4[i21];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        if ((j2 & 255) < 128) {
                                            acv acvVar3 = (acv) objArr6[(i21 << 3) + i23];
                                            jArr2 = jArr4;
                                            int i24 = acvVar3.a;
                                            if (i24 == i20) {
                                                acvVar3.a = i13;
                                            } else {
                                                objArr2 = objArr6;
                                                if (i20 + 1 <= i24 && i24 < i13) {
                                                    acvVar3.a = i24 - 1;
                                                }
                                                j2 >>= 8;
                                                i23++;
                                                jArr4 = jArr2;
                                                objArr6 = objArr2;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                        }
                                        objArr2 = objArr6;
                                        j2 >>= 8;
                                        i23++;
                                        jArr4 = jArr2;
                                        objArr6 = objArr2;
                                    }
                                    jArr = jArr4;
                                    objArr = objArr6;
                                    if (i22 != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr4;
                                    objArr = objArr6;
                                }
                                if (i21 == length2) {
                                    break;
                                }
                                i21++;
                                jArr4 = jArr;
                                objArr6 = objArr;
                            }
                        }
                    }
                }
                int i25 = adcVar2.c;
                this.w.e(i25);
                this.q.t(i25);
                if (i14 > 0) {
                    aha ahaVar = this.w;
                    ahaVar.h();
                    aip aipVar = ahaVar.a.a;
                    ahs ahsVar = ahs.a;
                    aipVar.e(ahsVar);
                    aio.a(aipVar, 0, i14);
                    if (aipVar.g != aip.h(ahsVar.b) || aipVar.h != aip.h(ahsVar.c)) {
                        StringBuilder sb = new StringBuilder();
                        int i26 = ahsVar.b;
                        int i27 = 0;
                        for (int i28 = 0; i28 < i26; i28++) {
                            if ((aipVar.g & (1 << i28)) != 0) {
                                if (i27 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(ahsVar.a(i28));
                                i27++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder();
                        int i29 = ahsVar.c;
                        int i30 = 0;
                        for (int i31 = 0; i31 < i29; i31++) {
                            if ((aipVar.h & (1 << i31)) != 0) {
                                if (i27 > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(ahsVar.c(i31));
                                i30++;
                            }
                        }
                        ael.b(a.al(new StringBuilder(), sb3.toString(), i30, sb2, i27, ahsVar));
                    }
                }
                aw(z, obj2);
                aeiVar = null;
            } else {
                this.q.q();
                boolean z4 = true;
                this.x = true;
                this.u = null;
                an();
                this.s.z();
                agb agbVar2 = this.s;
                int i32 = agbVar2.o;
                if (z) {
                    agbVar2.O(i4, abh.a);
                } else {
                    if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = abh.a;
                        }
                        agbVar2.L(i4, obj3, obj2);
                    } else {
                        if (obj3 == null) {
                            obj3 = abh.a;
                        }
                        agbVar2.N(i4, obj3);
                    }
                    z4 = false;
                }
                this.N = this.s.r(i32);
                adc adcVar3 = new adc(i4, -1, aB(i32), -1);
                aeiVar3.c(adcVar3, this.D - aeiVar3.b);
                aeiVar3.e(adcVar3);
                ArrayList arrayList2 = new ArrayList();
                if (z4) {
                    i5 = 0;
                } else {
                    i5 = this.D;
                }
                aeiVar = new aei(arrayList2, i5);
                z = z4;
            }
        } else {
            aeiVar = null;
        }
        ao(z, aeiVar);
    }

    public final void Y(int i, Object obj) {
        X(i, obj, 0, null);
    }

    public final void Z(Object obj) {
        int i;
        afw afwVar;
        int i2;
        agb agbVar;
        if (obj instanceof afq) {
            if (this.x) {
                aip aipVar = this.w.a.a;
                ahw ahwVar = ahw.a;
                aipVar.e(ahwVar);
                aio.b(aipVar, 0, (afq) obj);
                if (aipVar.g != aip.h(ahwVar.b) || aipVar.h != aip.h(ahwVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = ahwVar.b;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (((1 << i5) & aipVar.g) != 0) {
                            if (i4 > 0) {
                                sb.append(", ");
                            }
                            sb.append(ahwVar.a(i5));
                            i4++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i6 = ahwVar.c;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        if (((1 << i8) & aipVar.h) != 0) {
                            if (i4 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(ahwVar.c(i8));
                            i7++;
                        }
                    }
                    ael.b(a.al(new StringBuilder(), sb3.toString(), i7, sb2, i4, ahwVar));
                }
            }
            this.A.add(obj);
            afq afqVar = (afq) obj;
            aav aavVar = null;
            if (this.x) {
                agb agbVar2 = this.s;
                int i9 = agbVar2.o;
                if (i9 > agbVar2.q + 1) {
                    int i10 = i9 - 1;
                    int l = agbVar2.l(i10);
                    while (true) {
                        i2 = i10;
                        i10 = l;
                        agbVar = this.s;
                        if (i10 == agbVar.q || i10 < 0) {
                            break;
                        } else {
                            l = agbVar.l(i10);
                        }
                    }
                    aavVar = agbVar.r(i2);
                }
            } else {
                afw afwVar2 = this.q;
                int i11 = afwVar2.e;
                if (i11 > afwVar2.g + 1) {
                    int i12 = i11 - 1;
                    int e = afwVar2.e(i12);
                    while (true) {
                        i = i12;
                        i12 = e;
                        afwVar = this.q;
                        if (i12 == afwVar.g || i12 < 0) {
                            break;
                        } else {
                            e = afwVar.e(i12);
                        }
                    }
                    aavVar = afwVar.g(i);
                }
            }
            obj = new afr(afqVar, aavVar);
        }
        ab(obj);
    }

    @Override // defpackage.abi
    public final int a() {
        return this.y;
    }

    public final void aa(int i, int i2) {
        if (K(i) != i2) {
            if (i < 0) {
                sb sbVar = this.P;
                if (sbVar == null) {
                    sbVar = new sb(null);
                    this.P = sbVar;
                }
                sbVar.d(i, i2);
                return;
            }
            int[] iArr = this.g;
            if (iArr == null) {
                int i3 = this.q.c;
                int[] iArr2 = new int[i3];
                mkm.u(iArr2, -1, i3);
                this.g = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void ab(Object obj) {
        if (this.x) {
            this.s.aa(obj);
            return;
        }
        afw afwVar = this.q;
        int i = 0;
        if (afwVar.k) {
            int j = afwVar.i - afz.j(afwVar.b, afwVar.g);
            aha ahaVar = this.w;
            int i2 = j - 1;
            if (ahaVar.a().g - ahaVar.e < 0) {
                aha ahaVar2 = this.w;
                afw afwVar2 = this.q;
                aav g = afwVar2.g(afwVar2.g);
                aip aipVar = ahaVar2.a.a;
                aid aidVar = aid.a;
                aipVar.e(aidVar);
                aio.b(aipVar, 0, obj);
                aio.b(aipVar, 1, g);
                aio.a(aipVar, 0, i2);
                if (aipVar.g != aip.h(aidVar.b) || aipVar.h != aip.h(aidVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = aidVar.b;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (((1 << i5) & aipVar.g) != 0) {
                            if (i4 > 0) {
                                sb.append(", ");
                            }
                            sb.append(aidVar.a(i5));
                            i4++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i6 = aidVar.c;
                    int i7 = 0;
                    while (i < i6) {
                        if (((1 << i) & aipVar.h) != 0) {
                            if (i4 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(aidVar.c(i));
                            i7++;
                        }
                        i++;
                    }
                    ael.b(a.al(new StringBuilder(), sb3.toString(), i7, sb2, i4, aidVar));
                    return;
                }
                return;
            }
            aha ahaVar3 = this.w;
            ahaVar3.j(true);
            aip aipVar2 = ahaVar3.a.a;
            aig aigVar = aig.a;
            aipVar2.e(aigVar);
            aio.b(aipVar2, 0, obj);
            aio.a(aipVar2, 0, i2);
            if (aipVar2.g != aip.h(aigVar.b) || aipVar2.h != aip.h(aigVar.c)) {
                StringBuilder sb4 = new StringBuilder();
                int i8 = aigVar.b;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    if (((1 << i10) & aipVar2.g) != 0) {
                        if (i9 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(aigVar.a(i10));
                        i9++;
                    }
                }
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                int i11 = aigVar.c;
                int i12 = 0;
                while (i < i11) {
                    if (((1 << i) & aipVar2.h) != 0) {
                        if (i9 > 0) {
                            sb6.append(", ");
                        }
                        sb6.append(aigVar.c(i));
                        i12++;
                    }
                    i++;
                }
                ael.b(a.al(new StringBuilder(), sb6.toString(), i12, sb5, i9, aigVar));
                return;
            }
            return;
        }
        aha ahaVar4 = this.w;
        aav g2 = afwVar.g(afwVar.g);
        aip aipVar3 = ahaVar4.a.a;
        ahd ahdVar = ahd.a;
        aipVar3.e(ahdVar);
        aio.b(aipVar3, 0, g2);
        aio.b(aipVar3, 1, obj);
        if (aipVar3.g == aip.h(ahdVar.b) && aipVar3.h == aip.h(ahdVar.c)) {
            return;
        }
        StringBuilder sb7 = new StringBuilder();
        int i13 = ahdVar.b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            if (((1 << i15) & aipVar3.g) != 0) {
                if (i14 > 0) {
                    sb7.append(", ");
                }
                sb7.append(ahdVar.a(i15));
                i14++;
            }
        }
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder();
        int i16 = ahdVar.c;
        int i17 = 0;
        while (i < i16) {
            if (((1 << i) & aipVar3.h) != 0) {
                if (i14 > 0) {
                    sb9.append(", ");
                }
                sb9.append(ahdVar.c(i));
                i17++;
            }
            i++;
        }
        ael.b(a.al(new StringBuilder(), sb9.toString(), i17, sb8, i14, ahdVar));
    }

    public final boolean ac(aeu aeuVar, Object obj) {
        aav aavVar = aeuVar.c;
        if (aavVar == null) {
            return false;
        }
        int a = this.q.a.a(aavVar);
        if (!this.p || a < this.q.e) {
            return false;
        }
        List list = this.i;
        int d = abr.d(list, a);
        if (d < 0) {
            int i = d + 1;
            if (true != (obj instanceof acm)) {
                obj = null;
            }
            list.add(-i, new acz(aeuVar, a, obj));
        } else {
            acz aczVar = (acz) list.get(d);
            if (obj instanceof acm) {
                Object obj2 = aczVar.c;
                if (obj2 == null) {
                    aczVar.c = obj;
                } else if (obj2 instanceof sy) {
                    ((sy) obj2).i(obj);
                } else {
                    sy syVar = new sy(2);
                    syVar.g(obj2);
                    syVar.g(obj);
                    aczVar.c = syVar;
                }
            } else {
                aczVar.c = null;
            }
        }
        return true;
    }

    public final void ad(su suVar, mol molVar) {
        int rotateLeft;
        int rotateRight;
        if (this.p) {
            abr.i("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.K = anm.b().v();
            this.z = null;
            ae(suVar);
            this.D = 0;
            this.p = true;
            try {
                this.F = 0;
                this.q = this.c.b();
                av(100);
                this.b.n();
                this.J = this.b.c();
                this.k.e(abr.a(this.j));
                this.j = B(this.J);
                this.u = null;
                if (!this.h) {
                    this.h = this.b.r();
                }
                if (!this.o) {
                    this.o = this.b.s();
                }
                Set set = (Set) ace.b(this.J, aol.a);
                if (set != null) {
                    set.add(this.c);
                    this.b.k(set);
                }
                av(this.b.a());
                Object O = O();
                if (O != molVar && molVar != null) {
                    ab(molVar);
                }
                abl ablVar = this.L;
                aiu a = agl.a();
                try {
                    a.o(ablVar);
                    if (molVar != null) {
                        Y(200, abr.a);
                        alr.a(this, molVar);
                        U();
                    } else if (this.j && O != null && !amr.i(O, abh.a)) {
                        Y(200, abr.a);
                        mpp.g(O, 2);
                        alr.a(this, (mol) O);
                        U();
                    } else if (this.i.isEmpty()) {
                        W();
                    } else {
                        afw afwVar = this.q;
                        int a2 = afwVar.a();
                        Object i = afwVar.i();
                        Object h = afwVar.h();
                        int i2 = this.F;
                        int i3 = 207;
                        if (i == null) {
                            if (h != null && a2 == 207) {
                                if (!amr.i(h, abh.a)) {
                                    this.y = Integer.rotateLeft(h.hashCode() ^ Integer.rotateLeft(this.y, 3), 3) ^ i2;
                                    a2 = 207;
                                } else {
                                    a2 = 207;
                                }
                            }
                            this.y = Integer.rotateLeft(Integer.rotateLeft(this.y, 3) ^ a2, 3) ^ i2;
                        } else {
                            if (i instanceof Enum) {
                                rotateLeft = Integer.rotateLeft(((Enum) i).ordinal() ^ Integer.rotateLeft(this.y, 3), 3);
                            } else {
                                rotateLeft = Integer.rotateLeft(i.hashCode() ^ Integer.rotateLeft(this.y, 3), 3);
                            }
                            this.y = rotateLeft;
                        }
                        aw(afz.v(afwVar.b, afwVar.e), null);
                        aq();
                        afwVar.s();
                        if (i == null) {
                            if (h != null && a2 == 207) {
                                if (!amr.i(h, abh.a)) {
                                    rotateRight = Integer.rotateRight(h.hashCode() ^ Integer.rotateRight(this.y ^ i2, 3), 3);
                                }
                            } else {
                                i3 = a2;
                            }
                            rotateRight = Integer.rotateRight(Integer.rotateRight(this.y ^ i2, 3) ^ i3, 3);
                        } else if (i instanceof Enum) {
                            rotateRight = Integer.rotateRight(((Enum) i).ordinal() ^ Integer.rotateRight(this.y, 3), 3);
                        } else {
                            rotateRight = Integer.rotateRight(i.hashCode() ^ Integer.rotateRight(this.y, 3), 3);
                        }
                        this.y = rotateRight;
                    }
                    a.b(a.b - 1);
                    U();
                    this.b.h();
                    U();
                    this.w.b();
                    aha ahaVar = this.w;
                    ahaVar.g();
                    if (!ahaVar.c.f()) {
                        abr.i("Missed recording an endGroup()");
                    }
                    if (!this.B.d()) {
                        abr.i("Start/end imbalance");
                    }
                    R();
                    this.q.r();
                    this.j = abr.n(this.k.c());
                    this.p = false;
                    this.i.clear();
                    S();
                } catch (Throwable th) {
                    a.b(a.b - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.p = false;
                this.i.clear();
                Q();
                S();
                throw th2;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void ae(su suVar) {
        int i;
        Object[] objArr = suVar.b;
        Object[] objArr2 = suVar.c;
        long[] jArr = suVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            obj.getClass();
                            aeu aeuVar = (aeu) obj;
                            aav aavVar = aeuVar.c;
                            if (aavVar != null) {
                                List list = this.i;
                                int i6 = aavVar.a;
                                if (obj2 == afu.a) {
                                    obj2 = null;
                                }
                                list.add(new acz(aeuVar, i6, obj2));
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        mkm.T(this.i, abr.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:            if (r10 == null) goto L27;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ag(defpackage.ach r9, defpackage.ach r10, java.lang.Integer r11, java.util.List r12, defpackage.mnw r13) {
        /*
            r8 = this;
            boolean r0 = r8.p
            int r1 = r8.D
            r2 = 1
            r8.p = r2     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r8.D = r2     // Catch: java.lang.Throwable -> L71
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L71
            r4 = 0
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2a
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L71
            mkw r6 = (defpackage.mkw) r6     // Catch: java.lang.Throwable -> L71
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L71
            aeu r7 = (defpackage.aeu) r7     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L24
            r8.ac(r7, r6)     // Catch: java.lang.Throwable -> L71
            goto L27
        L24:
            r8.ac(r7, r5)     // Catch: java.lang.Throwable -> L71
        L27:
            int r4 = r4 + 1
            goto Lf
        L2a:
            if (r9 == 0) goto L69
            if (r11 == 0) goto L33
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L71
            goto L34
        L33:
            r11 = -1
        L34:
            if (r10 == 0) goto L63
            boolean r12 = defpackage.amr.i(r10, r9)     // Catch: java.lang.Throwable -> L71
            if (r12 != 0) goto L63
            if (r11 < 0) goto L63
            abw r10 = (defpackage.abw) r10     // Catch: java.lang.Throwable -> L71
            r12 = r9
            abw r12 = (defpackage.abw) r12     // Catch: java.lang.Throwable -> L71
            r12.g = r10     // Catch: java.lang.Throwable -> L71
            r10 = r9
            abw r10 = (defpackage.abw) r10     // Catch: java.lang.Throwable -> L71
            r10.h = r11     // Catch: java.lang.Throwable -> L71
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L58
            r11 = r9
            abw r11 = (defpackage.abw) r11     // Catch: java.lang.Throwable -> L71
            r11.g = r5     // Catch: java.lang.Throwable -> L71
            abw r9 = (defpackage.abw) r9     // Catch: java.lang.Throwable -> L71
            r9.h = r2     // Catch: java.lang.Throwable -> L71
            goto L67
        L58:
            r10 = move-exception
            r11 = r9
            abw r11 = (defpackage.abw) r11     // Catch: java.lang.Throwable -> L71
            r11.g = r5     // Catch: java.lang.Throwable -> L71
            abw r9 = (defpackage.abw) r9     // Catch: java.lang.Throwable -> L71
            r9.h = r2     // Catch: java.lang.Throwable -> L71
            throw r10     // Catch: java.lang.Throwable -> L71
        L63:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L71
        L67:
            if (r10 != 0) goto L6c
        L69:
            r13.a()     // Catch: java.lang.Throwable -> L71
        L6c:
            r8.p = r0
            r8.D = r1
            return
        L71:
            r9 = move-exception
            r8.p = r0
            r8.D = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abp.ag(ach, ach, java.lang.Integer, java.util.List, mnw):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aew, ach] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aew, ach] */
    @Override // defpackage.abi
    public final abi b(int i) {
        aeu aeuVar;
        boolean z;
        u(i);
        if (this.x) {
            aeu aeuVar2 = new aeu(this.f);
            this.M.f(aeuVar2);
            ab(aeuVar2);
            aeuVar2.h(this.K);
        } else {
            acz f = abr.f(this.i, this.q.g);
            Object n = this.q.n();
            if (amr.i(n, abh.a)) {
                aeuVar = new aeu(this.f);
                ab(aeuVar);
            } else {
                n.getClass();
                aeuVar = (aeu) n;
            }
            if (f == null) {
                z = false;
            } else {
                z = true;
            }
            aeuVar.e(z);
            this.M.f(aeuVar);
            aeuVar.h(this.K);
        }
        return this;
    }

    @Override // defpackage.abi
    public final acd c() {
        return L();
    }

    @Override // defpackage.abi
    public final afv d() {
        aeu aeuVar;
        aeu aeuVar2;
        aav g;
        aet aetVar;
        if (this.M.e()) {
            aeuVar = (aeu) this.M.b();
        } else {
            aeuVar = null;
        }
        if (aeuVar != null) {
            aeuVar.e(false);
        }
        if (aeuVar != null) {
            int i = this.K;
            sr srVar = aeuVar.f;
            if (srVar != null && !aeuVar.i()) {
                Object[] objArr = srVar.b;
                int[] iArr = srVar.c;
                long[] jArr = srVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                int i5 = 8 - ((~i3) >>> 31);
                                if (i4 < i5) {
                                    if ((j & 255) < 128) {
                                        int i6 = (i2 << 3) + i4;
                                        Object obj = objArr[i6];
                                        if (iArr[i6] != i) {
                                            aetVar = new aet(aeuVar, i, srVar);
                                            break loop0;
                                        }
                                    }
                                    j >>= 8;
                                    i4++;
                                } else if (i5 != 8) {
                                    break;
                                }
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            aetVar = null;
            if (aetVar != null) {
                aha ahaVar = this.w;
                ach achVar = this.f;
                aip aipVar = ahaVar.a.a;
                ahk ahkVar = ahk.a;
                aipVar.e(ahkVar);
                aio.b(aipVar, 0, aetVar);
                aio.b(aipVar, 1, achVar);
                if (aipVar.g != aip.h(ahkVar.b) || aipVar.h != aip.h(ahkVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i7 = ahkVar.b;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        if (((1 << i9) & aipVar.g) != 0) {
                            if (i8 > 0) {
                                sb.append(", ");
                            }
                            sb.append(ahkVar.a(i9));
                            i8++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i10 = ahkVar.c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        if (((1 << i12) & aipVar.h) != 0) {
                            if (i8 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(ahkVar.c(i12));
                            i11++;
                        }
                    }
                    ael.b(a.al(new StringBuilder(), sb3.toString(), i11, sb2, i8, ahkVar));
                }
            }
        }
        if (aeuVar != null && !aeuVar.i() && (aeuVar.j() || this.h)) {
            if (aeuVar.c == null) {
                if (this.x) {
                    agb agbVar = this.s;
                    g = agbVar.r(agbVar.q);
                } else {
                    afw afwVar = this.q;
                    g = afwVar.g(afwVar.g);
                }
                aeuVar.c = g;
            }
            aeuVar.d(false);
            aeuVar2 = aeuVar;
        } else {
            aeuVar2 = null;
        }
        am(false);
        return aeuVar2;
    }

    @Override // defpackage.abi
    public final aoj e() {
        return this.c;
    }

    @Override // defpackage.abi
    public final Object f(aby abyVar) {
        return ace.b(L(), abyVar);
    }

    @Override // defpackage.abi
    public final Object g() {
        return P();
    }

    @Override // defpackage.abi
    public final mnb h() {
        return this.b.d();
    }

    @Override // defpackage.abi
    public final void i(Object obj, mol molVar) {
        int i = 0;
        if (this.x) {
            aip aipVar = this.O.a;
            aif aifVar = aif.a;
            aipVar.e(aifVar);
            aio.b(aipVar, 0, obj);
            molVar.getClass();
            mpp.g(molVar, 2);
            aio.b(aipVar, 1, molVar);
            if (aipVar.g != aip.h(aifVar.b) || aipVar.h != aip.h(aifVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i2 = aifVar.b;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (((1 << i4) & aipVar.g) != 0) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(aifVar.a(i4));
                        i3++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i5 = aifVar.c;
                int i6 = 0;
                while (i < i5) {
                    if (((1 << i) & aipVar.h) != 0) {
                        if (i3 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(aifVar.c(i));
                        i6++;
                    }
                    i++;
                }
                ael.b(a.al(new StringBuilder(), sb3.toString(), i6, sb2, i3, aifVar));
                return;
            }
            return;
        }
        aha ahaVar = this.w;
        ahaVar.g();
        aip aipVar2 = ahaVar.a.a;
        aif aifVar2 = aif.a;
        aipVar2.e(aifVar2);
        aio.b(aipVar2, 0, obj);
        molVar.getClass();
        mpp.g(molVar, 2);
        aio.b(aipVar2, 1, molVar);
        if (aipVar2.g == aip.h(aifVar2.b) && aipVar2.h == aip.h(aifVar2.c)) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        int i7 = aifVar2.b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            if (((1 << i9) & aipVar2.g) != 0) {
                if (i8 > 0) {
                    sb4.append(", ");
                }
                sb4.append(aifVar2.a(i9));
                i8++;
            }
        }
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        int i10 = aifVar2.c;
        int i11 = 0;
        while (i < i10) {
            if (((1 << i) & aipVar2.h) != 0) {
                if (i8 > 0) {
                    sb6.append(", ");
                }
                sb6.append(aifVar2.c(i));
                i11++;
            }
            i++;
        }
        ael.b(a.al(new StringBuilder(), sb6.toString(), i11, sb5, i8, aifVar2));
    }

    @Override // defpackage.abi
    public final void j() {
        this.h = true;
        this.o = true;
        this.c.e();
        this.r.e();
        agb agbVar = this.s;
        afx afxVar = agbVar.a;
        agbVar.e = afxVar.i;
        agbVar.s = afxVar.j;
    }

    @Override // defpackage.abi
    public final void k(mnw mnwVar) {
        az();
        if (!this.x) {
            abr.i("createNode() can only be called when inserting");
        }
        int a = this.G.a();
        agb agbVar = this.s;
        aav r = agbVar.r(agbVar.q);
        int i = 1;
        this.E++;
        ahb ahbVar = this.O;
        aip aipVar = ahbVar.a;
        ahp ahpVar = ahp.a;
        aipVar.e(ahpVar);
        aio.b(aipVar, 0, mnwVar);
        aio.a(aipVar, 0, a);
        aio.b(aipVar, 1, r);
        if (aipVar.g != aip.h(ahpVar.b) || aipVar.h != aip.h(ahpVar.c)) {
            StringBuilder sb = new StringBuilder();
            int i2 = ahpVar.b;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                if (((1 << i4) & aipVar.g) != 0) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(ahpVar.a(i4));
                    i3++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            int i5 = ahpVar.c;
            int i6 = 0;
            int i7 = 0;
            while (i7 < i5) {
                if ((aipVar.h & (i << i7)) != 0) {
                    if (i3 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(ahpVar.c(i7));
                    i6++;
                }
                i7++;
                i = 1;
            }
            ael.b(a.al(new StringBuilder(), sb3.toString(), i6, sb2, i3, ahpVar));
        }
        aip aipVar2 = ahbVar.b;
        ahu ahuVar = ahu.a;
        aipVar2.e(ahuVar);
        aio.a(aipVar2, 0, a);
        aio.b(aipVar2, 0, r);
        if (aipVar2.g == aip.h(ahuVar.b) && aipVar2.h == aip.h(ahuVar.c)) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        int i8 = ahuVar.b;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if ((aipVar2.g & (1 << i10)) != 0) {
                if (i9 > 0) {
                    sb4.append(", ");
                }
                sb4.append(ahuVar.a(i10));
                i9++;
            }
        }
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        int i11 = ahuVar.c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((1 << i13) & aipVar2.h) != 0) {
                if (i9 > 0) {
                    sb6.append(", ");
                }
                sb6.append(ahuVar.c(i13));
                i12++;
            }
        }
        ael.b(a.al(new StringBuilder(), sb6.toString(), i12, sb5, i9, ahuVar));
    }

    @Override // defpackage.abi
    public final void l(boolean z) {
        if (this.E != 0) {
            abr.i("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (!this.x) {
            if (!z) {
                au();
                return;
            }
            afw afwVar = this.q;
            int i = afwVar.e;
            int i2 = afwVar.f;
            aha ahaVar = this.w;
            aha.n(ahaVar);
            ahaVar.a.a.d(ahh.a);
            abr.l(this.i, i, i2);
            this.q.u();
        }
    }

    @Override // defpackage.abi
    public final void m() {
        U();
        aeu N = N();
        if (N != null && N.j()) {
            N.a |= 2;
        }
    }

    @Override // defpackage.abi
    public final void n() {
        am(true);
    }

    @Override // defpackage.abi
    public final void o() {
        U();
    }

    @Override // defpackage.abi
    public final void p() {
        U();
    }

    @Override // defpackage.abi
    public final void q() {
        if (this.l && this.q.g == this.m) {
            this.m = -1;
            this.l = false;
        }
        am(false);
    }

    @Override // defpackage.abi
    public final void r() {
        if (this.E != 0) {
            abr.i("No nodes can be emitted before calling skipAndEndGroup");
        }
        aeu N = N();
        if (N != null) {
            N.g(true);
        }
        if (this.i.isEmpty()) {
            au();
        } else {
            aq();
        }
    }

    @Override // defpackage.abi
    public final void s() {
        X(-127, null, 0, null);
    }

    @Override // defpackage.abi
    public final void t(int i, Object obj) {
        X(i, obj, 0, null);
    }

    @Override // defpackage.abi
    public final void u(int i) {
        int i2;
        if (this.C != null) {
            X(i, null, 0, null);
            return;
        }
        aA();
        this.y = this.F ^ Integer.rotateLeft(Integer.rotateLeft(this.y, 3) ^ i, 3);
        this.F++;
        afw afwVar = this.q;
        if (this.x) {
            afwVar.q();
            this.s.N(i, abh.a);
            ao(false, null);
            return;
        }
        if (afwVar.a() == i && ((i2 = afwVar.e) >= afwVar.f || !afz.u(afwVar.b, i2))) {
            afwVar.v();
            ao(false, null);
            return;
        }
        if (!afwVar.y()) {
            int i3 = this.D;
            int i4 = afwVar.e;
            ar();
            this.w.l(i3, afwVar.f());
            abr.l(this.i, i4, afwVar.e);
        }
        afwVar.q();
        this.x = true;
        this.u = null;
        an();
        agb agbVar = this.s;
        agbVar.z();
        int i5 = agbVar.o;
        agbVar.N(i, abh.a);
        this.N = agbVar.r(i5);
        ao(false, null);
    }

    @Override // defpackage.abi
    public final void v() {
        X(125, null, 2, null);
        this.H = true;
    }

    @Override // defpackage.abi
    public final void w(Object obj) {
        Z(obj);
    }

    @Override // defpackage.abi
    public final void x() {
        az();
        if (this.x) {
            abr.i("useNode() called while inserting");
        }
        afw afwVar = this.q;
        Object o = afwVar.o(afwVar.g);
        this.w.d(o);
        if (this.l && (o instanceof abe)) {
            aha ahaVar = this.w;
            ahaVar.g();
            ahaVar.a.a.d(aii.a);
        }
    }

    @Override // defpackage.abi
    public final boolean y(float f) {
        Object O = O();
        if ((O instanceof Float) && f == ((Number) O).floatValue()) {
            return false;
        }
        ab(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.abi
    public final boolean z(int i) {
        Object O = O();
        if ((O instanceof Integer) && i == ((Number) O).intValue()) {
            return false;
        }
        ab(Integer.valueOf(i));
        return true;
    }

    @Override // defpackage.abi
    public final void J() {
    }
}
