package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edv extends cgk {
    public final edc a;
    public final ewg b;
    public final lqd c;
    public final mys d;
    public final lpk e;
    public final ewf f;

    /* JADX WARN: Type inference failed for: r4v2, types: [mys, java.lang.Object, mwv] */
    public edv(edc edcVar, ewf ewfVar, ewg ewgVar, ilv ilvVar, eel eelVar, ejg ejgVar, cfz cfzVar) {
        cgw cgwVar;
        mnb mnbVar;
        lpk lpkVar;
        edcVar.getClass();
        ewfVar.getClass();
        ewgVar.getClass();
        ilvVar.getClass();
        eelVar.getClass();
        ejgVar.getClass();
        cfzVar.getClass();
        this.a = edcVar;
        this.f = ewfVar;
        this.b = ewgVar;
        lqd h = eyf.h(cfzVar);
        h.getClass();
        this.c = h;
        ?? r4 = ilvVar.f;
        dhs dhsVar = new dhs((Object) this, 3, (short[]) null);
        r4.getClass();
        ewm ewmVar = new ewm((mwv) r4, dhsVar, 0);
        synchronized (cgl.a) {
            cgwVar = (cgw) q("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (cgwVar == null) {
                try {
                    mst mstVar = mtj.a;
                    mnbVar = nbc.a.h();
                } catch (IllegalStateException | mkv unused) {
                    mnbVar = mnc.a;
                }
                cgw cgwVar2 = new cgw(mnbVar.plus(new mva(null)));
                r("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", cgwVar2);
                cgwVar = cgwVar2;
            }
        }
        int i = myk.a;
        mys u = mpd.u(ewmVar, cgwVar, myj.a, dhsVar.a(r4.c()));
        this.d = u;
        if (bsf.n(this.c)) {
            lpkVar = lpk.SPOT_LOCATE;
        } else {
            lpkVar = lpk.FAST_PAIR_LOCATE;
        }
        this.e = lpkVar;
        lqc lqcVar = ((eds) u.c()).a;
        if (!bsf.m(lqcVar)) {
            if (eyf.k(lqcVar).containsKey(lpk.FAST_PAIR_LOCATE)) {
                ilv ilvVar2 = eelVar.a;
                lqd lqdVar = lqcVar.d;
                lqdVar = lqdVar == null ? lqd.d : lqdVar;
                lqdVar.getClass();
                edy s = ilvVar2.s(lqdVar);
                Long l = s != null ? s.e : null;
                if (l != null && SystemClock.elapsedRealtime() - l.longValue() < TimeUnit.SECONDS.toMillis(lti.a.a().a())) {
                    return;
                }
                eelVar.c(lqcVar);
                return;
            }
            return;
        }
        ejgVar.g(lqcVar);
    }
}
