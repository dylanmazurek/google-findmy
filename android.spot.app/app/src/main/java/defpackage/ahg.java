package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahg extends aij {
    public static final ahg a = new ahg();

    private ahg() {
        super(0, 4, 1);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [aew, ach] */
    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        boolean z;
        List a2;
        ado adoVar = (ado) aikVar.b(2);
        ado adoVar2 = (ado) aikVar.b(3);
        abt abtVar = (abt) aikVar.b(1);
        adn adnVar = (adn) aikVar.b(0);
        if (adnVar == null && (adnVar = abtVar.b(adoVar)) == null) {
            abr.g("Could not resolve state for movable content");
            throw new mks();
        }
        if (agbVar.m <= 0 && agbVar.j(agbVar.o + 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        afx afxVar = adnVar.a;
        abr.m(z);
        int i = agbVar.o;
        int i2 = agbVar.h;
        int i3 = agbVar.i;
        agbVar.y(1);
        agbVar.M();
        agbVar.z();
        agb c = afxVar.c();
        try {
            a2 = aga.a(c, 2, agbVar, false, true, true);
            c.A(true);
            agbVar.B();
            agbVar.X();
            agbVar.o = i;
            agbVar.h = i2;
            agbVar.i = i3;
            aes.a(agbVar, a2, adoVar2.c);
        } catch (Throwable th) {
            c.A(false);
            throw th;
        }
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "resolvedState";
        }
        if (a.m(i, 1)) {
            return "resolvedCompositionContext";
        }
        if (a.m(i, 2)) {
            return "from";
        }
        if (a.m(i, 3)) {
            return "to";
        }
        return super.c(i);
    }
}
