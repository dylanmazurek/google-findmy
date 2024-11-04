package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahr extends aij {
    public static final ahr a = new ahr();

    private ahr() {
        super(0, 3, 1);
    }

    @Override // defpackage.aij
    public final void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar) {
        afx afxVar = (afx) aikVar.b(1);
        aav aavVar = (aav) aikVar.b(0);
        ahb ahbVar = (ahb) aikVar.b(2);
        agb c = afxVar.c();
        try {
            if (!ahbVar.b.f()) {
                abr.i("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            ahbVar.a.c(aawVar, c, afpVar);
            c.A(true);
            agbVar.z();
            agbVar.Z(afxVar, afxVar.a(aavVar));
            agbVar.B();
        } catch (Throwable th) {
            c.A(false);
            throw th;
        }
    }

    @Override // defpackage.aij
    public final String c(int i) {
        if (a.m(i, 0)) {
            return "anchor";
        }
        if (a.m(i, 1)) {
            return "from";
        }
        if (a.m(i, 2)) {
            return "fixups";
        }
        return super.c(i);
    }
}
