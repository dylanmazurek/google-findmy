package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahp extends aij {
    public static final ahp a = new ahp();

    private ahp() {
        super(1, 2);
    }

    @Override // defpackage.aij
    public final String a(int i) {
        if (a.m(i, 0)) {
            return "insertIndex";
        }
        return super.a(i);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        Object a2 = ((mnw) aikVar.b(0)).a();
        aav aavVar = (aav) aikVar.b(1);
        int a3 = aikVar.a(0);
        agbVar.R(agbVar.a(aavVar), a2);
        aawVar.h(a3, a2);
        aawVar.c(a2);
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "factory";
        }
        if (a.m(i, 1)) {
            return "groupAnchor";
        }
        return super.c(i);
    }
}
