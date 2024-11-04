package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahs extends aij {
    public static final ahs a = new ahs();

    private ahs() {
        super(1, 0, 2);
    }

    @Override // defpackage.aij
    public final String a(int i) {
        if (a.m(i, 0)) {
            return "offset";
        }
        return super.a(i);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        aav aavVar;
        int a2;
        int i;
        int i2;
        int a3 = aikVar.a(0);
        if (agbVar.m != 0) {
            abr.i("Cannot move a group while inserting");
        }
        if (a3 < 0) {
            abr.i("Parameter offset is out of bounds");
        }
        if (a3 != 0) {
            int i3 = agbVar.o;
            int i4 = agbVar.q;
            int i5 = agbVar.p;
            int i6 = i3;
            while (a3 > 0) {
                i6 += afz.c(agbVar.b, agbVar.h(i6));
                if (i6 > i5) {
                    abr.i("Parameter offset is out of bounds");
                }
                a3--;
            }
            int c = afz.c(agbVar.b, agbVar.h(i6));
            int c2 = agbVar.c(agbVar.b, agbVar.h(agbVar.o));
            int c3 = agbVar.c(agbVar.b, agbVar.h(i6));
            int i7 = i6 + c;
            int c4 = agbVar.c(agbVar.b, agbVar.h(i7));
            int i8 = c4 - c3;
            agbVar.F(i8, Math.max(agbVar.o - 1, 0));
            agbVar.E(c);
            int[] iArr = agbVar.b;
            int h = agbVar.h(i7) * 5;
            mkm.p(iArr, iArr, agbVar.h(i3) * 5, h, (c * 5) + h);
            if (i8 > 0) {
                Object[] objArr = agbVar.c;
                mkm.q(objArr, objArr, c2, agbVar.d(c3 + i8), agbVar.d(c4 + i8));
            }
            int i9 = c3 + i8;
            int i10 = i9 - c2;
            int i11 = agbVar.j;
            int i12 = agbVar.k;
            int length = agbVar.c.length;
            int i13 = agbVar.l;
            int i14 = i3 + c;
            int i15 = i3;
            while (i15 < i14) {
                int h2 = agbVar.h(i15);
                int i16 = i11;
                int c5 = agbVar.c(iArr, h2) - i10;
                if (i13 < h2) {
                    i = i10;
                    i2 = 0;
                } else {
                    i = i10;
                    i2 = i16;
                }
                afz.m(iArr, h2, agb.W(agb.W(c5, i2, i12, length), agbVar.j, agbVar.k, agbVar.c.length));
                i15++;
                i11 = i16;
                i10 = i;
                i12 = i12;
                length = length;
            }
            int i17 = i7 + c;
            int f = agbVar.f();
            int e = afz.e(agbVar.d, i7, f);
            ArrayList arrayList = new ArrayList();
            while (e < agbVar.d.size() && (a2 = agbVar.a((aavVar = (aav) agbVar.d.get(e)))) >= i7 && a2 < i17) {
                arrayList.add(aavVar);
                agbVar.d.remove(e);
            }
            int i18 = i3 - i7;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                aav aavVar2 = (aav) arrayList.get(i19);
                int a4 = agbVar.a(aavVar2) + i18;
                if (a4 >= agbVar.f) {
                    aavVar2.a = -(f - a4);
                } else {
                    aavVar2.a = a4;
                }
                agbVar.d.add(afz.e(agbVar.d, a4, f), aavVar2);
            }
            if (agbVar.V(i7, c)) {
                abr.i("Unexpectedly removed anchors");
            }
            agbVar.D(i4, agbVar.p, i3);
            if (i8 > 0) {
                agbVar.J(i9, i8, i7 - 1);
            }
        }
    }
}
