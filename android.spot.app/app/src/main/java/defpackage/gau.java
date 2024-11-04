package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gau implements lyw {
    private final jfe a;

    public gau(jfe jfeVar) {
        this.a = jfeVar;
    }

    @Override // defpackage.lyw
    public final lyv a(mbg mbgVar, lys lysVar, lyt lytVar) {
        gat gatVar;
        if (!((Boolean) ((jfh) this.a).a).booleanValue()) {
            return lytVar.a(mbgVar, lysVar);
        }
        hmq hmqVar = (hmq) lysVar.e(gan.a);
        if (hmqVar == null) {
            gatVar = new gat(new hsb(null, "https://" + lytVar.b() + "/" + mbgVar.b, false, SystemClock.elapsedRealtime()));
        } else {
            gatVar = new gat(hsb.a(lytVar.b(), hmqVar));
        }
        return new gar(lytVar.a(mbgVar, lysVar.g(gatVar)), gatVar);
    }
}
