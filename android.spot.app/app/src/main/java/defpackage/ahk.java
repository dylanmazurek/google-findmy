package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahk extends aij {
    public static final ahk a = new ahk();

    private ahk() {
        super(0, 2, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        ((moh) aikVar.b(0)).a((abs) aikVar.b(1));
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "anchor";
        }
        if (a.m(i, 1)) {
            return "composition";
        }
        return super.c(i);
    }
}
