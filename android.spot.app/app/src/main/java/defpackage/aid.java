package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aid extends aij {
    public static final aid a = new aid();

    private aid() {
        super(1, 2);
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
        int i;
        Object b = aikVar.b(0);
        aav aavVar = (aav) aikVar.b(1);
        boolean z = b instanceof afr;
        int a2 = aikVar.a(0);
        if (z) {
            afpVar.d(((afr) b).a);
        }
        int a3 = agbVar.a(aavVar);
        Object x = agbVar.x(a3, a2, b);
        if (x instanceof afr) {
            int g = agbVar.g() - agbVar.o(a3, a2);
            afr afrVar = (afr) x;
            aav aavVar2 = afrVar.b;
            int i2 = -1;
            if (aavVar2 != null && aavVar2.a()) {
                i2 = agbVar.a(aavVar2);
                i = agbVar.g() - agbVar.p(i2);
            } else {
                i = -1;
            }
            ((abv) afpVar).c(afrVar.a, g, i2, i);
            return;
        }
        if (x instanceof aeu) {
            ((aeu) x).c();
        }
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "value";
        }
        if (a.m(i, 1)) {
            return "anchor";
        }
        return super.c(i);
    }
}
