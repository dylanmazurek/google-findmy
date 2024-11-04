package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahu extends aij {
    public static final ahu a = new ahu();

    private ahu() {
        super(1, 1);
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
        aav aavVar = (aav) aikVar.b(0);
        int a2 = aikVar.a(0);
        aawVar.f();
        aawVar.g(a2, agbVar.w(agbVar.a(aavVar)));
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "groupAnchor";
        }
        return super.c(i);
    }
}
