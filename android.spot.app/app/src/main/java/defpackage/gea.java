package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gea implements gcr {
    private final gcr a = new gdz(0);
    private final gcr b;
    private final Map c;

    public gea(gcr gcrVar, Map map) {
        this.b = gcrVar;
        this.c = map;
    }

    private final gcr i(gbf gbfVar) {
        if (gbfVar instanceof gcn) {
            gcn gcnVar = (gcn) gbfVar;
            gbs a = gcnVar.a();
            nqe nqeVar = gec.a;
            a.h(nqeVar);
            if (a.l.m((ljm) nqeVar.d)) {
                gbs a2 = gcnVar.a();
                nqe nqeVar2 = gec.a;
                a2.h(nqeVar2);
                Object k = a2.l.k((ljm) nqeVar2.d);
                if (k == null) {
                    k = nqeVar2.a;
                } else {
                    nqeVar2.h(k);
                }
                gcr gcrVar = (gcr) this.c.get(((geb) k).b);
                gcrVar.getClass();
                return gcrVar;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.gcr
    public final jer a(gbf gbfVar) {
        return i(gbfVar).a(gbfVar);
    }

    @Override // defpackage.gcr
    public final jer b(gbf gbfVar) {
        return i(gbfVar).b(gbfVar);
    }

    @Override // defpackage.gcr
    public final jer c(gbf gbfVar) {
        return i(gbfVar).c(gbfVar);
    }

    @Override // defpackage.gcr
    public final jyz d(gbf gbfVar, jyz jyzVar) {
        return i(gbfVar).d(gbfVar, jyzVar);
    }

    @Override // defpackage.gcr
    public final jyz e(gbf gbfVar, jyz jyzVar) {
        return i(gbfVar).e(gbfVar, jyzVar);
    }

    @Override // defpackage.gcr
    public final String f(gbf gbfVar) {
        return i(gbfVar).f(gbfVar);
    }

    @Override // defpackage.gcr
    public final jyz g() {
        return ivc.E(null);
    }

    @Override // defpackage.gcr
    public final void h(gbf gbfVar) {
        i(gbfVar).h(gbfVar);
    }
}
