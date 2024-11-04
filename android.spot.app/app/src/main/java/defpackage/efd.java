package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efd implements ehu {
    private final ewg a;
    private final bym b;

    public efd(ewg ewgVar, bym bymVar) {
        this.a = ewgVar;
        this.b = bymVar;
    }

    @Override // defpackage.ehu
    public final ag a(lqd lqdVar) {
        jer b = eyf.b(this.a.c(), lqdVar);
        if (!b.g()) {
            return dzb.a(lqdVar);
        }
        if (this.b.z((lqc) b.c())) {
            return ehy.a(lqdVar);
        }
        return dzb.a(lqdVar);
    }

    @Override // defpackage.ehu
    public final ag b(lqd lqdVar) {
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        efh efhVar = new efh();
        efhVar.ak(bundle);
        return efhVar;
    }

    @Override // defpackage.ehu
    public final /* synthetic */ jis c(lqd lqdVar) {
        int i = jis.d;
        return jmi.a;
    }

    @Override // defpackage.ehu
    public final /* synthetic */ jer d(eul eulVar) {
        return bsg.g(eulVar);
    }
}
