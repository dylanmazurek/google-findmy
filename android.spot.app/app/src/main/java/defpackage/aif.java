package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aif extends aij {
    public static final aif a = new aif();

    private aif() {
        super(0, 2, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        ((mol) aikVar.b(1)).a(aawVar.a(), aikVar.b(0));
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "value";
        }
        if (a.m(i, 1)) {
            return "block";
        }
        return super.c(i);
    }
}
