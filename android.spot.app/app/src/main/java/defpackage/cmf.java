package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmf extends cme {
    final /* synthetic */ rx a;
    final /* synthetic */ cmg b;

    public cmf(cmg cmgVar, rx rxVar) {
        this.b = cmgVar;
        this.a = rxVar;
    }

    @Override // defpackage.cme, defpackage.cma
    public final void b(cmd cmdVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(cmdVar);
        cmdVar.B(this);
    }
}
