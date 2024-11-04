package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aic extends aij {
    public static final aic a = new aic();

    private aic() {
        super(1, 0, 2);
    }

    @Override // defpackage.aij
    public final String a(int i) {
        if (a.m(i, 0)) {
            return "count";
        }
        return super.a(i);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        boolean z;
        int i;
        boolean z2 = false;
        int a2 = aikVar.a(0);
        int g = agbVar.g();
        int i2 = agbVar.q;
        int q = agbVar.q(i2);
        int c = agbVar.c(agbVar.b, agbVar.h(i2 + 1));
        for (int max = Math.max(q, c - a2); max < c; max++) {
            Object obj = agbVar.c[agbVar.d(max)];
            if (obj instanceof afr) {
                int i3 = g - max;
                afr afrVar = (afr) obj;
                aav aavVar = afrVar.b;
                int i4 = -1;
                if (aavVar != null && aavVar.a()) {
                    i4 = agbVar.a(aavVar);
                    i = agbVar.g() - agbVar.p(i4);
                } else {
                    i = -1;
                }
                ((abv) afpVar).c(afrVar.a, i3, i4, i);
            } else if (obj instanceof aeu) {
                ((aeu) obj).c();
            }
        }
        if (a2 > 0) {
            z = true;
        } else {
            z = false;
        }
        abr.m(z);
        int i5 = agbVar.q;
        int n = agbVar.n(agbVar.b, agbVar.h(i5));
        int c2 = agbVar.c(agbVar.b, agbVar.h(i5 + 1)) - a2;
        if (c2 >= n) {
            z2 = true;
        }
        abr.m(z2);
        agbVar.J(c2, a2, i5);
        int i6 = agbVar.h;
        if (i6 >= n) {
            agbVar.h = i6 - a2;
        }
    }
}
