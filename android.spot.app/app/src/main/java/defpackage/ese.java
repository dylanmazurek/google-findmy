package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ese implements ifi {
    public final lqd a;
    public final /* synthetic */ esf b;

    public ese(esf esfVar, lqd lqdVar) {
        this.b = esfVar;
        this.a = lqdVar;
    }

    @Override // defpackage.ifi
    public final void a(ifj ifjVar, long j, jer jerVar) {
        lnb lnbVar;
        if (ifjVar != this.b.h.d(this.a).m || jerVar.g()) {
            if (ifjVar == ifj.STOPPED) {
                this.b.b();
            }
            esf esfVar = this.b;
            ((Executor) esfVar.c.a()).execute(new got(this, ifjVar, jerVar, j, 1));
            if (ifjVar == ifj.STOPPED) {
                if (jerVar.g()) {
                    lnbVar = lnb.RING_LOCAL_INSTRUCTION_RESULT_ERROR;
                } else {
                    lnbVar = lnb.STOP_RINGING_LOCAL_INSTRUCTION_RESULT_SUCCESS;
                }
            } else if (ifjVar == ifj.RINGING) {
                if (jerVar.g()) {
                    lnbVar = lnb.STOP_RINGING_LOCAL_INSTRUCTION_RESULT_ERROR;
                } else {
                    lnbVar = lnb.RING_LOCAL_INSTRUCTION_RESULT_SUCCESS;
                }
            } else {
                lnbVar = null;
            }
            if (lnbVar != null) {
                esf esfVar2 = this.b;
                esfVar2.g.c(lnbVar, jdl.a, this.a);
            }
        }
    }
}
