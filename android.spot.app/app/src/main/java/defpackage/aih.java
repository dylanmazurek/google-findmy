package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aih extends aij {
    public static final aih a = new aih();

    private aih() {
        super(1, 0, 2);
    }

    @Override // defpackage.aij
    public final String a(int i) {
        if (a.m(i, 0)) {
            return "count";
        }
        return super.a(i);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        int a2 = aikVar.a(0);
        for (int i = 0; i < a2; i++) {
            aawVar.f();
        }
    }
}
