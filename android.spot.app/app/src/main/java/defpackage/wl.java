package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wl {
    public static final /* synthetic */ int a = 0;

    static {
        mkm.a(3, ph.d);
    }

    public static final wi a(Object obj, String str, abi abiVar, int i) {
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (P == abh.a) {
            P = new wi(new wm(obj), null, str);
            abpVar.Z(P);
        }
        wi wiVar = (wi) P;
        wiVar.f(obj, abiVar, (i & 8) | 48 | (i & 14));
        Object P2 = abpVar.P();
        if (P2 == abh.a) {
            P2 = new oq(wiVar, 12);
            abpVar.Z(P2);
        }
        act.c(wiVar, (moh) P2, abiVar);
        return wiVar;
    }

    public static final agt b(wi wiVar, Object obj, Object obj2, vj vjVar, atk atkVar, abi abiVar, int i) {
        boolean z;
        int i2 = (i & 14) ^ 6;
        boolean z2 = false;
        if ((i2 > 4 && abiVar.B(wiVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (z || P == abh.a) {
            P = new we(wiVar, obj, qi.f(atkVar, obj2), atkVar);
            abpVar.Z(P);
        }
        we weVar = (we) P;
        if (wiVar.s()) {
            weVar.h(obj, obj2, vjVar);
        } else {
            weVar.i(obj2, vjVar);
        }
        if ((i2 > 4 && abiVar.B(wiVar)) || (i & 6) == 4) {
            z2 = true;
        }
        boolean B = abiVar.B(weVar) | z2;
        Object P2 = abpVar.P();
        if (B || P2 == abh.a) {
            P2 = new tn(wiVar, weVar, 9, null);
            abpVar.Z(P2);
        }
        act.c(weVar, (moh) P2, abiVar);
        return weVar;
    }

    public static final kgf c(wi wiVar, atk atkVar, abi abiVar, int i) {
        boolean z;
        wb a2;
        int i2 = (i & 14) ^ 6;
        boolean z2 = false;
        if ((i2 > 4 && abiVar.B(wiVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (z || P == abh.a) {
            P = new kgf(wiVar, atkVar);
            abpVar.Z(P);
        }
        kgf kgfVar = (kgf) P;
        if ((i2 > 4 && abiVar.B(wiVar)) || (i & 6) == 4) {
            z2 = true;
        }
        boolean D = abiVar.D(kgfVar) | z2;
        Object P2 = abpVar.P();
        if (D || P2 == abh.a) {
            P2 = new tn(wiVar, kgfVar, 8, null);
            abpVar.Z(P2);
        }
        act.c(kgfVar, (moh) P2, abiVar);
        if (wiVar.s() && (a2 = kgfVar.a()) != null) {
            wi wiVar2 = (wi) kgfVar.a;
            a2.a.h(a2.c.a(wiVar2.c().a()), a2.c.a(wiVar2.c().b()), (vj) a2.b.a(wiVar2.c()));
        }
        return kgfVar;
    }
}
