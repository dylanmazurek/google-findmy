package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsv {
    public static LocaleList a(Configuration configuration) {
        LocaleList locales;
        locales = configuration.getLocales();
        return locales;
    }

    static void b(Configuration configuration, bsy bsyVar) {
        configuration.setLocales(ct$$ExternalSyntheticApiModelOutline0.m73m(bsyVar.b.b()));
    }

    public static final cey c(cfc cfcVar) {
        cey ceyVar;
        cex N = cfcVar.N();
        N.getClass();
        while (true) {
            ceyVar = (cey) N.a.get();
            if (ceyVar != null) {
                break;
            }
            mva mvaVar = new mva(null);
            mst mstVar = mtj.a;
            ceyVar = new cey(N, mjo.A(mvaVar, nbc.a.h()));
            if (a.q(N.a, ceyVar)) {
                mpp.q(ceyVar, nbc.a.h(), 0, new cez(ceyVar, (mmx) null, 0), 2);
                break;
            }
        }
        return ceyVar;
    }
}
