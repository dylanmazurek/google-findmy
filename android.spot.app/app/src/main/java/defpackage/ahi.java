package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahi extends aij {
    public static final ahi a = new ahi();

    private ahi() {
        super(0, 2, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        boolean z;
        int i;
        int k;
        boolean z2 = false;
        ali aliVar = (ali) aikVar.b(0);
        int a2 = agbVar.a((aav) aikVar.b(1));
        if (agbVar.o < a2) {
            z = true;
        } else {
            z = false;
        }
        abr.m(z);
        aim.a(agbVar, aawVar, a2);
        int i2 = agbVar.o;
        int i3 = agbVar.q;
        while (i3 >= 0 && !agbVar.T(i3)) {
            i3 = agbVar.l(i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (agbVar.S(i2, i4)) {
                if (true == agbVar.T(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                if (agbVar.T(i4)) {
                    k = 1;
                } else {
                    k = agbVar.k(i4);
                }
                i5 += k;
                i4 += agbVar.j(i4);
            }
        }
        while (true) {
            i = agbVar.o;
            if (i >= a2) {
                break;
            }
            if (agbVar.S(a2, i)) {
                int i6 = agbVar.o;
                if (i6 < agbVar.p && afz.v(agbVar.b, agbVar.h(i6))) {
                    aawVar.c(agbVar.w(agbVar.o));
                    i5 = 0;
                }
                agbVar.M();
            } else {
                i5 += agbVar.m();
            }
        }
        if (i == a2) {
            z2 = true;
        }
        abr.m(z2);
        aliVar.a = i5;
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "effectiveNodeIndexOut";
        }
        if (a.m(i, 1)) {
            return "anchor";
        }
        return super.c(i);
    }
}
