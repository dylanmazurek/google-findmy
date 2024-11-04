package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahd extends aij {
    public static final ahd a = new ahd();

    private ahd() {
        super(0, 2, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        aav aavVar = (aav) aikVar.b(0);
        Object b = aikVar.b(1);
        if (b instanceof afr) {
            afpVar.d(((afr) b).a);
        }
        if (agbVar.m != 0) {
            abr.i("Can only append a slot if not current inserting");
        }
        int i = agbVar.h;
        int i2 = agbVar.i;
        int a2 = agbVar.a(aavVar);
        int c = agbVar.c(agbVar.b, agbVar.h(a2 + 1));
        agbVar.h = c;
        agbVar.i = c;
        agbVar.F(1, a2);
        if (i >= c) {
            i++;
            i2++;
        }
        agbVar.c[c] = b;
        agbVar.h = i;
        agbVar.i = i2;
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "anchor";
        }
        if (a.m(i, 1)) {
            return "value";
        }
        return super.c(i);
    }
}
