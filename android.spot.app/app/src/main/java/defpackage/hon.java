package defpackage;

import android.os.health.HealthStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hon extends hoo {
    public static final hon a = new hon();

    private hon() {
    }

    @Override // defpackage.hoo
    public final /* synthetic */ lkq a(String str, Object obj) {
        HealthStats m74m = ct$$ExternalSyntheticApiModelOutline0.m74m(obj);
        ljh k = ndm.i.k();
        long k2 = hog.k(m74m, 30001);
        if (k2 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndm ndmVar = (ndm) k.b;
            ndmVar.a |= 1;
            ndmVar.b = k2;
        }
        long k3 = hog.k(m74m, 30002);
        if (k3 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndm ndmVar2 = (ndm) k.b;
            ndmVar2.a |= 2;
            ndmVar2.c = k3;
        }
        long k4 = hog.k(m74m, 30003);
        if (k4 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndm ndmVar3 = (ndm) k.b;
            ndmVar3.a |= 4;
            ndmVar3.d = k4;
        }
        long k5 = hog.k(m74m, 30004);
        if (k5 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndm ndmVar4 = (ndm) k.b;
            ndmVar4.a |= 8;
            ndmVar4.e = k5;
        }
        long k6 = hog.k(m74m, 30005);
        if (k6 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndm ndmVar5 = (ndm) k.b;
            ndmVar5.a |= 16;
            ndmVar5.f = k6;
        }
        long k7 = hog.k(m74m, 30006);
        if (k7 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndm ndmVar6 = (ndm) k.b;
            ndmVar6.a |= 32;
            ndmVar6.g = k7;
        }
        if (str != null) {
            ndj n = hog.n(str);
            if (!k.b.y()) {
                k.t();
            }
            ndm ndmVar7 = (ndm) k.b;
            n.getClass();
            ndmVar7.h = n;
            ndmVar7.a |= 64;
        }
        ndm ndmVar8 = (ndm) k.q();
        if (hog.t(ndmVar8)) {
            return null;
        }
        return ndmVar8;
    }

    @Override // defpackage.hoo
    public final /* synthetic */ lkq b(lkq lkqVar, lkq lkqVar2) {
        ndm ndmVar = (ndm) lkqVar;
        ndm ndmVar2 = (ndm) lkqVar2;
        if (ndmVar != null && ndmVar2 != null) {
            ljh k = ndm.i.k();
            if ((ndmVar.a & 1) != 0) {
                long j = ndmVar.b - ndmVar2.b;
                if (j != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndm ndmVar3 = (ndm) k.b;
                    ndmVar3.a |= 1;
                    ndmVar3.b = j;
                }
            }
            if ((ndmVar.a & 2) != 0) {
                long j2 = ndmVar.c - ndmVar2.c;
                if (j2 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndm ndmVar4 = (ndm) k.b;
                    ndmVar4.a |= 2;
                    ndmVar4.c = j2;
                }
            }
            if ((ndmVar.a & 4) != 0) {
                long j3 = ndmVar.d - ndmVar2.d;
                if (j3 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndm ndmVar5 = (ndm) k.b;
                    ndmVar5.a |= 4;
                    ndmVar5.d = j3;
                }
            }
            if ((ndmVar.a & 8) != 0) {
                long j4 = ndmVar.e - ndmVar2.e;
                if (j4 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndm ndmVar6 = (ndm) k.b;
                    ndmVar6.a |= 8;
                    ndmVar6.e = j4;
                }
            }
            if ((ndmVar.a & 16) != 0) {
                long j5 = ndmVar.f - ndmVar2.f;
                if (j5 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndm ndmVar7 = (ndm) k.b;
                    ndmVar7.a |= 16;
                    ndmVar7.f = j5;
                }
            }
            if ((ndmVar.a & 32) != 0) {
                long j6 = ndmVar.g - ndmVar2.g;
                if (j6 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndm ndmVar8 = (ndm) k.b;
                    ndmVar8.a |= 32;
                    ndmVar8.g = j6;
                }
            }
            ndj ndjVar = ndmVar.h;
            if (ndjVar == null) {
                ndjVar = ndj.d;
            }
            if (!k.b.y()) {
                k.t();
            }
            ndm ndmVar9 = (ndm) k.b;
            ndjVar.getClass();
            ndmVar9.h = ndjVar;
            ndmVar9.a |= 64;
            ndm ndmVar10 = (ndm) k.q();
            if (hog.t(ndmVar10)) {
                return null;
            }
            return ndmVar10;
        }
        return ndmVar;
    }

    @Override // defpackage.hoo
    public final /* bridge */ /* synthetic */ String c(lkq lkqVar) {
        ndj ndjVar = ((ndm) lkqVar).h;
        if (ndjVar == null) {
            ndjVar = ndj.d;
        }
        return ndjVar.c;
    }
}
