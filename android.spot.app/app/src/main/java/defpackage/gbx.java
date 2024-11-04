package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbx implements gbb {
    private final gay a;

    public gbx(gay gayVar) {
        this.a = gayVar;
    }

    @Override // defpackage.gbb
    public final jyz a(gbf gbfVar) {
        if (gbfVar instanceof gcn) {
            gcn gcnVar = (gcn) gbfVar;
            gbs a = gcnVar.a();
            nqe nqeVar = gbz.a;
            a.h(nqeVar);
            if (a.l.m((ljm) nqeVar.d)) {
                gbs a2 = gcnVar.a();
                nqe nqeVar2 = gbz.a;
                a2.h(nqeVar2);
                Object k = a2.l.k((ljm) nqeVar2.d);
                if (k == null) {
                    k = nqeVar2.a;
                } else {
                    nqeVar2.h(k);
                }
                gby gbyVar = (gby) k;
                int D = a.D(gbyVar.c);
                if (D == 0) {
                    D = 1;
                }
                int i = D - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return ivc.E(this.a);
                            }
                            throw new IllegalArgumentException("Unknown type");
                        }
                        return ivc.E(new gay(2, null));
                    }
                    return ivc.E(new gay(3, null));
                }
                if ((gbyVar.a & 1) != 0) {
                    return ivc.E(gay.a(gbyVar.b));
                }
                throw new IllegalArgumentException("GAIA type must have a name");
            }
        }
        return ivc.E(null);
    }
}
