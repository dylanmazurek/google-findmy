package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahj extends aij {
    public static final ahj a = new ahj();

    private ahj() {
        super(0, 1, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        for (Object obj : (Object[]) aikVar.b(0)) {
            aawVar.c(obj);
        }
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "nodes";
        }
        return super.c(i);
    }
}
