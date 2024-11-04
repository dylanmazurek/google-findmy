package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahz extends aij {
    public static final ahz a = new ahz();

    private ahz() {
        super(0, 0, 3);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        if (agbVar.m != 0) {
            abr.i("Cannot reset when inserting");
        }
        agbVar.I();
        agbVar.o = 0;
        agbVar.p = agbVar.e() - agbVar.g;
        agbVar.h = 0;
        agbVar.i = 0;
        agbVar.n = 0;
    }
}
