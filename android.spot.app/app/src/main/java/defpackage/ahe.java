package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahe extends aij {
    public static final ahe a = new ahe();

    private ahe() {
        super(0, 2, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        int i;
        ali aliVar = (ali) aikVar.b(1);
        if (aliVar != null) {
            i = aliVar.a;
        } else {
            i = 0;
        }
        agz agzVar = (agz) aikVar.b(0);
        if (i > 0) {
            aawVar = new adv(aawVar, i);
        }
        agzVar.b(aawVar, agbVar, afpVar);
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "changes";
        }
        if (a.m(i, 1)) {
            return "effectiveNodeIndex";
        }
        return super.c(i);
    }
}
