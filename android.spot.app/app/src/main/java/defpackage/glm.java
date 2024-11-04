package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glm implements gkb {
    private static final joo a = joo.m("GnpSdk");
    private final glu b;
    private final ghf c;

    public glm(glu gluVar, ghf ghfVar) {
        this.b = gluVar;
        this.c = ghfVar;
    }

    @Override // defpackage.gkb
    public final void a(goa goaVar, lkq lkqVar, Throwable th) {
        String str;
        jol jolVar = (jol) ((jol) a.k().i(th)).j("com/google/android/libraries/notifications/internal/sync/impl/BatchUpdateThreadStateCallback", "onFailure", 83, "BatchUpdateThreadStateCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.u("Failed to updated thread state for account: %s.", str);
        if (lkqVar != null) {
            for (lea leaVar : ((leb) lkqVar).c) {
                ghg a2 = this.c.a(lcr.FAILED_TO_UPDATE_THREAD_STATE);
                a2.e(goaVar);
                a2.i(leaVar.b);
                a2.a();
            }
        }
    }

    @Override // defpackage.gkb
    public final void b(goa goaVar, lkq lkqVar, lkq lkqVar2) {
        String str;
        jol jolVar = (jol) a.k().j("com/google/android/libraries/notifications/internal/sync/impl/BatchUpdateThreadStateCallback", "onSuccess", 40, "BatchUpdateThreadStateCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.u("Successfully updated thread state for account: %s.", str);
        ArrayList arrayList = new ArrayList();
        for (lea leaVar : ((leb) lkqVar).c) {
            ghg b = this.c.b(lde.SUCCEED_TO_UPDATE_THREAD_STATE);
            b.e(goaVar);
            b.i(leaVar.b);
            b.a();
            lgz lgzVar = leaVar.c;
            if (lgzVar == null) {
                lgzVar = lgz.f;
            }
            int w = a.w(lgzVar.e);
            if (w != 0 && w == 3) {
                arrayList.addAll(leaVar.b);
            }
        }
        if (!arrayList.isEmpty() && goaVar != null) {
            this.b.b(goaVar, arrayList, null);
        }
    }
}
