package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgn extends lyt {
    final /* synthetic */ mgq a;

    public mgn(mgq mgqVar) {
        this.a = mgqVar;
    }

    @Override // defpackage.lyt
    public final lyv a(mbg mbgVar, lys lysVar) {
        ScheduledExecutorService a;
        mgu mguVar = this.a.c;
        Executor d = mguVar.d(lysVar);
        if (mguVar.C) {
            a = null;
        } else {
            a = this.a.c.i.a();
        }
        mdp mdpVar = new mdp(mbgVar, d, lysVar, mguVar.P, a, this.a.c.D);
        mdpVar.j = this.a.c.n;
        return mdpVar;
    }

    @Override // defpackage.lyt
    public final String b() {
        return this.a.b;
    }
}
