package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eke implements ehz {
    private final ewg a;
    private final ele b;

    public eke(ewg ewgVar, ele eleVar) {
        this.a = ewgVar;
        this.b = eleVar;
    }

    @Override // defpackage.ehz
    public final jer a(lqd lqdVar) {
        jer b = eyf.b(this.a.c(), lqdVar);
        if (b.g()) {
            kyf kyfVar = this.b.a((lqc) b.c()).b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            if (eku.m(kyfVar)) {
                Bundle bundle = new Bundle();
                eyf.m(lqdVar, bundle);
                eol eolVar = new eol();
                eolVar.ak(bundle);
                return jer.i(eolVar);
            }
        }
        Bundle bundle2 = new Bundle();
        eyf.m(lqdVar, bundle2);
        eok eokVar = new eok();
        eokVar.ak(bundle2);
        return jer.i(eokVar);
    }

    @Override // defpackage.ehz
    public final jer b(lqd lqdVar) {
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        eoj eojVar = new eoj();
        eojVar.ak(bundle);
        return jer.i(eojVar);
    }

    @Override // defpackage.ehz
    public final /* synthetic */ jer c(lqd lqdVar) {
        return jdl.a;
    }

    @Override // defpackage.ehz
    public final /* synthetic */ jer d(lqd lqdVar) {
        return jdl.a;
    }
}
