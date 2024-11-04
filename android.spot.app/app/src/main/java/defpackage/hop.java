package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hop extends hoo {
    public static final hop a = new hop();

    private hop() {
    }

    @Override // defpackage.hoo
    public final /* synthetic */ lkq a(String str, Object obj) {
        HealthStats m74m = ct$$ExternalSyntheticApiModelOutline0.m74m(obj);
        ljh k = ndn.e.k();
        int k2 = (int) hog.k(m74m, 50001);
        if (k2 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndn ndnVar = (ndn) k.b;
            ndnVar.a |= 1;
            ndnVar.b = k2;
        }
        int k3 = (int) hog.k(m74m, 50002);
        if (k3 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndn ndnVar2 = (ndn) k.b;
            ndnVar2.a |= 2;
            ndnVar2.c = k3;
        }
        if (str != null) {
            ndj n = hog.n(str);
            if (!k.b.y()) {
                k.t();
            }
            ndn ndnVar3 = (ndn) k.b;
            n.getClass();
            ndnVar3.d = n;
            ndnVar3.a |= 4;
        }
        ndn ndnVar4 = (ndn) k.q();
        if (hog.u(ndnVar4)) {
            return null;
        }
        return ndnVar4;
    }

    @Override // defpackage.hoo
    public final /* synthetic */ lkq b(lkq lkqVar, lkq lkqVar2) {
        int i;
        int i2;
        ndn ndnVar = (ndn) lkqVar;
        ndn ndnVar2 = (ndn) lkqVar2;
        if (ndnVar != null && ndnVar2 != null) {
            ljh k = ndn.e.k();
            if ((ndnVar.a & 1) != 0 && (i2 = ndnVar.b - ndnVar2.b) != 0) {
                if (!k.b.y()) {
                    k.t();
                }
                ndn ndnVar3 = (ndn) k.b;
                ndnVar3.a |= 1;
                ndnVar3.b = i2;
            }
            if ((ndnVar.a & 2) != 0 && (i = ndnVar.c - ndnVar2.c) != 0) {
                if (!k.b.y()) {
                    k.t();
                }
                ndn ndnVar4 = (ndn) k.b;
                ndnVar4.a |= 2;
                ndnVar4.c = i;
            }
            ndj ndjVar = ndnVar.d;
            if (ndjVar == null) {
                ndjVar = ndj.d;
            }
            if (!k.b.y()) {
                k.t();
            }
            ndn ndnVar5 = (ndn) k.b;
            ndjVar.getClass();
            ndnVar5.d = ndjVar;
            ndnVar5.a |= 4;
            ndn ndnVar6 = (ndn) k.q();
            if (hog.u(ndnVar6)) {
                return null;
            }
            return ndnVar6;
        }
        return ndnVar;
    }

    @Override // defpackage.hoo
    public final /* bridge */ /* synthetic */ String c(lkq lkqVar) {
        ndj ndjVar = ((ndn) lkqVar).d;
        if (ndjVar == null) {
            ndjVar = ndj.d;
        }
        return ndjVar.c;
    }
}
