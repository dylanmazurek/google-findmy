package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekf implements ehu {
    public final ele a;
    private final ewg b;
    private final eou c;

    public ekf(ewg ewgVar, ele eleVar, eou eouVar) {
        this.b = ewgVar;
        this.a = eleVar;
        this.c = eouVar;
    }

    @Override // defpackage.ehu
    public final ag a(lqd lqdVar) {
        jer b = eyf.b(this.b.c(), lqdVar).b(new dyv(this, 13));
        if (!b.g()) {
            return dzb.a(lqdVar);
        }
        if (eku.l((kyf) b.c())) {
            euh euhVar = new euh();
            Bundle bundle = new Bundle();
            eyf.m(lqdVar, bundle);
            euhVar.ak(bundle);
            return euhVar;
        }
        return dzb.a(lqdVar);
    }

    @Override // defpackage.ehu
    public final ag b(lqd lqdVar) {
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        ekh ekhVar = new ekh();
        ekhVar.ak(bundle);
        return ekhVar;
    }

    @Override // defpackage.ehu
    public final jis c(lqd lqdVar) {
        if (this.c.g(lqdVar)) {
            return jis.q(epj.d(lqdVar));
        }
        int i = jis.d;
        return jmi.a;
    }

    @Override // defpackage.ehu
    public final jer d(eul eulVar) {
        int ordinal = eulVar.a.ordinal();
        if (ordinal != 3) {
            if (ordinal != 4 && ordinal != 5) {
                return jdl.a;
            }
            return jer.i(new ebz());
        }
        return jer.i(new esu());
    }
}
