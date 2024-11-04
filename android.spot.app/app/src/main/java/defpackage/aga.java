package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aga {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List a(agb agbVar, int i, agb agbVar2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        mlx mlxVar;
        int f;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int j = agbVar.j(i);
        int i5 = i + j;
        int b = agbVar.b(i);
        int b2 = agbVar.b(i5);
        int i6 = b2 - b;
        if (i >= 0 && afz.q(agbVar.b, agbVar.h(i))) {
            z4 = true;
        } else {
            z4 = false;
        }
        agbVar2.E(j);
        agbVar2.F(i6, agbVar2.o);
        if (agbVar.f < i5) {
            agbVar.G(i5);
        }
        if (agbVar.j < b2) {
            agbVar.H(b2, i5);
        }
        int[] iArr = agbVar2.b;
        int i7 = agbVar2.o;
        mkm.p(agbVar.b, iArr, i7 * 5, i * 5, i5 * 5);
        Object[] objArr = agbVar2.c;
        int i8 = agbVar2.h;
        mkm.q(agbVar.c, objArr, i8, b, b2);
        int i9 = agbVar2.q;
        afz.p(iArr, i7, i9);
        int i10 = i7 - i;
        int i11 = i7 + j;
        int c = i8 - agbVar2.c(iArr, i7);
        int i12 = agbVar2.l;
        int i13 = agbVar2.k;
        int length = objArr.length;
        boolean z7 = z4;
        int i14 = i12;
        int i15 = i7;
        while (i15 < i11) {
            if (i15 != i7) {
                i2 = i11;
                afz.p(iArr, i15, afz.h(iArr, i15) + i10);
            } else {
                i2 = i11;
            }
            int c2 = agbVar2.c(iArr, i15) + c;
            if (i14 < i15) {
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = agbVar2.j;
            }
            afz.m(iArr, i15, agb.W(c2, i4, i13, length));
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i7 = i3;
            i11 = i2;
        }
        int i16 = i7;
        int i17 = i11;
        agbVar2.l = i14;
        int e = afz.e(agbVar.d, i, agbVar.f());
        int e2 = afz.e(agbVar.d, i5, agbVar.f());
        if (e < e2) {
            ArrayList arrayList = agbVar.d;
            ArrayList arrayList2 = new ArrayList(e2 - e);
            for (int i18 = e; i18 < e2; i18++) {
                aav aavVar = (aav) arrayList.get(i18);
                aavVar.a += i10;
                arrayList2.add(aavVar);
            }
            agbVar2.d.addAll(afz.e(agbVar2.d, agbVar2.o, agbVar2.f()), arrayList2);
            arrayList.subList(e, e2).clear();
            mlxVar = arrayList2;
        } else {
            mlxVar = mlx.a;
        }
        if (!mlxVar.isEmpty()) {
            HashMap hashMap = agbVar.e;
            HashMap hashMap2 = agbVar2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = mlxVar.size();
                for (int i19 = 0; i19 < size; i19++) {
                    aav aavVar2 = (aav) mlxVar.get(i19);
                    acx acxVar = (acx) hashMap.get(aavVar2);
                    if (acxVar != null) {
                        hashMap.remove(aavVar2);
                        hashMap2.put(aavVar2, acxVar);
                    }
                }
            }
        }
        int i20 = agbVar2.q;
        if (agbVar2.t(i9) != null) {
            int i21 = i20 + 1;
            int i22 = agbVar2.o;
            while (i21 < i22) {
                i21 += afz.c(agbVar2.b, i21);
            }
            throw null;
        }
        int l = agbVar.l(i);
        if (z3) {
            if (z) {
                if (l >= 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    agbVar.M();
                    agbVar.y(l - agbVar.o);
                    agbVar.M();
                }
                agbVar.y(i - agbVar.o);
                z5 = agbVar.U();
                if (z6) {
                    agbVar.K();
                    agbVar.X();
                    agbVar.K();
                    agbVar.X();
                }
            } else {
                boolean V = agbVar.V(i, j);
                agbVar.J(b, i6, i - 1);
                z5 = V;
            }
            if (z5) {
                abr.i("Unexpectedly removed anchors");
            }
        }
        int i23 = agbVar2.n;
        if (afz.v(iArr, i16)) {
            f = 1;
        } else {
            f = afz.f(iArr, i16);
        }
        agbVar2.n = i23 + f;
        if (z2) {
            agbVar2.o = i17;
            agbVar2.h = i8 + i6;
        }
        if (z7) {
            agbVar2.Q(i9);
        }
        return mlxVar;
    }
}
