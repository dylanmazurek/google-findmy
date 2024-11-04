package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elh implements euj {
    public final ele a;
    public final Executor b;
    public final cfn c;
    private final ilv d;

    public elh(ele eleVar, ilv ilvVar, Executor executor) {
        this.a = eleVar;
        this.d = ilvVar;
        this.b = executor;
        ilvVar.g(new ela(this, 2));
        this.c = new cfn(b());
    }

    public static final eul c(jer jerVar, kyj kyjVar) {
        if (!jerVar.g()) {
            return eul.a(euk.UNKNOWN);
        }
        eiv eivVar = (eiv) jerVar.c();
        if (!eivVar.e) {
            if (eivVar.d.g()) {
                Stream map = Collection.EL.stream(eivVar.h.values()).map(new eff(11)).filter(new eju(5)).map(new eff(12));
                int i = jis.d;
                jis jisVar = (jis) map.collect(jgr.a);
                if (!jisVar.isEmpty() && !Collection.EL.stream(jisVar).allMatch(new eju(6))) {
                    if (Collection.EL.stream(jisVar).anyMatch(new eju(7))) {
                        return eul.b(euk.GEO_LOCATION, (jjr) Collection.EL.stream(jisVar).filter(new eju(8)).map(new eka(kyjVar, 2)).collect(jgr.b));
                    }
                    if (Collection.EL.stream(jisVar).allMatch(new eju(9))) {
                        return eul.a(euk.SEMANTIC_LOCATION_ONLY);
                    }
                    return eul.a(euk.NO_LOCATION_AVAILABLE);
                }
                return eul.a(euk.NO_LOCATION_AVAILABLE);
            }
            return eul.a(euk.FETCHING_INITIAL_LOCATION);
        }
        return eul.a(euk.LOCATION_FETCH_ERROR);
    }

    @Override // defpackage.euj
    public final cfk a() {
        this.c.l(b());
        return this.c;
    }

    public final eul b() {
        ilv ilvVar = this.d;
        return c(ilvVar.f(), (kyj) ilvVar.e().b(new dyv(this, 17)).e(kyj.DEVICE_TYPE_UNKNOWN));
    }
}
