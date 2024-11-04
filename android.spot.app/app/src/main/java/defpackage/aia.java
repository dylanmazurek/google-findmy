package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aia extends aij {
    public static final aia a = new aia();

    private aia() {
        super(0, 1, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        ((abv) afpVar).a.add((mnw) aikVar.b(0));
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "effect";
        }
        return super.c(i);
    }
}
