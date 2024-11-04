package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahy extends aij {
    public static final ahy a = new ahy();

    private ahy() {
        super(2, 0, 2);
    }

    @Override // defpackage.aij
    public final String a(int i) {
        if (a.m(i, 0)) {
            return "removeIndex";
        }
        if (a.m(i, 1)) {
            return "count";
        }
        return super.a(i);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        aawVar.j(aikVar.a(0), aikVar.a(1));
    }
}
