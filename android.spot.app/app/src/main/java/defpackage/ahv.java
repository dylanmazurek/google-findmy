package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahv extends aij {
    public static final ahv a = new ahv();

    private ahv() {
        super(0, 3, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int k;
        List a2;
        boolean z4;
        int length;
        Object obj;
        boolean z5;
        ach achVar = (ach) aikVar.b(0);
        abt abtVar = (abt) aikVar.b(1);
        ado adoVar = (ado) aikVar.b(2);
        afx afxVar = new afx();
        if (agbVar.e != null) {
            afxVar.e();
        }
        if (agbVar.s != null) {
            afxVar.d();
        }
        agb c = afxVar.c();
        try {
            c.z();
            c.N(126665345, adoVar.a);
            agb.Y(c);
            c.aa(adoVar.b);
            aav aavVar = adoVar.e;
            if (c.m > 0) {
                z = true;
            } else {
                z = false;
            }
            abr.m(z);
            if (agbVar.m == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            abr.m(z2);
            abr.m(aavVar.a());
            int a3 = agbVar.a(aavVar) + 1;
            int i = agbVar.o;
            if (i <= a3 && a3 < agbVar.p) {
                z3 = true;
            } else {
                z3 = false;
            }
            abr.m(z3);
            int l = agbVar.l(a3);
            int j = agbVar.j(a3);
            if (agbVar.T(a3)) {
                k = 1;
            } else {
                k = agbVar.k(a3);
            }
            a2 = aga.a(agbVar, a3, c, false, false, true);
            agbVar.Q(l);
            if (k > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            while (l >= i) {
                int h = agbVar.h(l);
                int[] iArr = agbVar.b;
                afz.n(iArr, h, afz.c(iArr, h) - j);
                if (z4 && !afz.v(agbVar.b, h)) {
                    int[] iArr2 = agbVar.b;
                    afz.o(iArr2, h, afz.f(iArr2, h) - k);
                    z4 = true;
                    l = agbVar.l(l);
                }
                z4 = false;
                l = agbVar.l(l);
            }
            if (z4) {
                if (agbVar.n >= k) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                abr.m(z5);
                agbVar.n -= k;
            }
            c.m();
            c.X();
            c.B();
            c.A(true);
            adn adnVar = new adn(afxVar);
            if (!a2.isEmpty()) {
                int size = a2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    aav aavVar2 = (aav) a2.get(i2);
                    if (afxVar.f(aavVar2)) {
                        int a4 = afxVar.a(aavVar2);
                        int j2 = afz.j(afxVar.a, a4);
                        int i3 = a4 + 1;
                        if (i3 < afxVar.b) {
                            length = afz.b(afxVar.a, i3);
                        } else {
                            length = afxVar.c.length;
                        }
                        if (length - j2 > 0) {
                            obj = afxVar.c[j2];
                        } else {
                            obj = abh.a;
                        }
                        if (obj instanceof aeu) {
                            ail ailVar = new ail(achVar, adoVar);
                            c = afxVar.c();
                            try {
                                aes.a(c, a2, ailVar);
                                c.A(true);
                                break;
                            } finally {
                            }
                        }
                    }
                    i2++;
                }
            }
            abtVar.j(adoVar, adnVar);
        } finally {
        }
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "composition";
        }
        if (a.m(i, 1)) {
            return "parentCompositionContext";
        }
        if (a.m(i, 2)) {
            return "reference";
        }
        return super.c(i);
    }
}
