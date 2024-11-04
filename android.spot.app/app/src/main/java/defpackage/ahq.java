package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahq extends aij {
    public static final ahq a = new ahq();

    private ahq() {
        super(0, 2, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        afx afxVar = (afx) aikVar.b(1);
        aav aavVar = (aav) aikVar.b(0);
        agbVar.z();
        agbVar.Z(afxVar, afxVar.a(aavVar));
        agbVar.B();
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "anchor";
        }
        if (a.m(i, 1)) {
            return "from";
        }
        return super.c(i);
    }
}
