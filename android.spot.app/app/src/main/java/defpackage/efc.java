package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efc implements ehz {
    private final ewg a;
    private final Context b;
    private final elo c;

    public efc(ewg ewgVar, elo eloVar, Context context) {
        this.a = ewgVar;
        this.c = eloVar;
        this.b = context;
    }

    @Override // defpackage.ehz
    public final jer a(lqd lqdVar) {
        jer b = eyf.b(this.a.c(), lqdVar);
        if (b.g() && eyf.w((lqc) b.c()) && bsf.k((lqc) b.c()) && !bsf.o((lqc) b.c(), this.c)) {
            Bundle bundle = new Bundle();
            eyf.m(lqdVar, bundle);
            egw egwVar = new egw();
            egwVar.ak(bundle);
            return jer.i(egwVar);
        }
        return jdl.a;
    }

    @Override // defpackage.ehz
    public final /* synthetic */ jer b(lqd lqdVar) {
        return jdl.a;
    }

    @Override // defpackage.ehz
    public final jer c(lqd lqdVar) {
        if (ltl.e()) {
            jer b = eyf.b(this.a.c(), lqdVar);
            if (b.g()) {
                if (bsf.o((lqc) b.c(), this.c)) {
                    return jer.i(new egr());
                }
                return jdl.a;
            }
        }
        return jdl.a;
    }

    @Override // defpackage.ehz
    public final jer d(lqd lqdVar) {
        if (lua.a.a().M()) {
            jer b = eyf.b(this.a.c(), lqdVar);
            if (b.g() && bsf.o((lqc) b.c(), this.c) && Settings.Global.getInt(this.b.getContentResolver(), "pof_active", 0) == 1) {
                return jer.i(new egs());
            }
        }
        return jdl.a;
    }
}
