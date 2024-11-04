package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahn extends aij {
    public static final ahn a = new ahn();

    private ahn() {
        super(0, 1, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        agbVar.C(agbVar.a((aav) aikVar.b(0)));
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "anchor";
        }
        return super.c(i);
    }
}
