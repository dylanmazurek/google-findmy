package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aht extends aij {
    public static final aht a = new aht();

    private aht() {
        super(3, 0, 2);
    }

    @Override // defpackage.aij
    public final String a(int i) {
        if (a.m(i, 0)) {
            return "from";
        }
        if (a.m(i, 1)) {
            return "to";
        }
        if (a.m(i, 2)) {
            return "count";
        }
        return super.a(i);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        aawVar.i(aikVar.a(0), aikVar.a(1), aikVar.a(2));
    }
}
