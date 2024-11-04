package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aie extends aij {
    public static final aie a = new aie();

    private aie() {
        super(0, 1, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        agbVar.P(aikVar.b(0));
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "data";
        }
        return super.c(i);
    }
}
