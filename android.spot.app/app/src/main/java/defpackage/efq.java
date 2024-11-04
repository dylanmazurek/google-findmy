package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efq implements euj {
    public final cfn a = new cfn(eul.a(euk.UNKNOWN));
    public final Executor b;
    private final efy c;

    public efq(efy efyVar, ewf ewfVar, Executor executor) {
        this.c = efyVar;
        this.b = executor;
        int i = 10;
        byte[] bArr = null;
        efyVar.d(new dym(this, i, bArr));
        ewfVar.c(new dym(this, i, bArr));
    }

    @Override // defpackage.euj
    public final cfk a() {
        this.a.l(b());
        return this.a;
    }

    public final eul b() {
        jer b = this.c.b();
        if (!b.g()) {
            return eul.a(euk.UNKNOWN);
        }
        efy efyVar = this.c;
        lqd lqdVar = ((lqc) b.c()).d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        efp a = efyVar.a(lqdVar);
        if (a == null) {
            return eul.a(euk.UNKNOWN);
        }
        if (a.h().g()) {
            euk eukVar = euk.GEO_LOCATION;
            dxw a2 = dya.a();
            a2.a = new dxr(eyf.x((lqc) b.c()));
            a2.c((lps) a.h().c());
            a2.b = a.i().b(new dvh(15));
            return eul.b(eukVar, new jms(a2.a()));
        }
        if (a.u() && a.r() == 1) {
            return eul.a(euk.FETCHING_INITIAL_LOCATION);
        }
        if (a.r() != 1 && a.r() != 7) {
            return eul.a(euk.LOCATION_FETCH_ERROR);
        }
        return eul.a(euk.NO_LOCATION_AVAILABLE);
    }
}
