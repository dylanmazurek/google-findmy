package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahw extends aij {
    public static final ahw a = new ahw();

    private ahw() {
        super(0, 1, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        afpVar.d((afq) aikVar.b(0));
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "value";
        }
        return super.c(i);
    }
}
