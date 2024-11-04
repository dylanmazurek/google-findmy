package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aig extends aij {
    public static final aig a = new aig();

    private aig() {
        super(1, 1);
    }

    @Override // defpackage.aij
    public final String a(int i) {
        if (a.m(i, 0)) {
            return "groupSlotIndex";
        }
        return super.a(i);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        Object b = aikVar.b(0);
        boolean z = b instanceof afr;
        int a2 = aikVar.a(0);
        if (z) {
            afpVar.d(((afr) b).a);
        }
        Object x = agbVar.x(agbVar.o, a2, b);
        if (x instanceof afr) {
            abv abvVar = (abv) afpVar;
            abvVar.c(((afr) x).a, agbVar.g() - agbVar.o(agbVar.o, a2), -1, -1);
        } else if (x instanceof aeu) {
            ((aeu) x).c();
        }
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "value";
        }
        return super.c(i);
    }
}
