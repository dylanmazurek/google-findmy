package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hol extends hoo {
    public static final hol a = new hol();

    private hol() {
    }

    @Override // defpackage.hoo
    public final /* bridge */ /* synthetic */ lkq a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        ljh k = ndi.d.k();
        if (!k.b.y()) {
            k.t();
        }
        ndi ndiVar = (ndi) k.b;
        ndiVar.a |= 1;
        ndiVar.b = intValue;
        if (str != null) {
            ndj n = hog.n(str);
            if (!k.b.y()) {
                k.t();
            }
            ndi ndiVar2 = (ndi) k.b;
            n.getClass();
            ndiVar2.c = n;
            ndiVar2.a |= 2;
        }
        return (ndi) k.q();
    }

    @Override // defpackage.hoo
    public final /* synthetic */ lkq b(lkq lkqVar, lkq lkqVar2) {
        int i;
        ndi ndiVar = (ndi) lkqVar;
        ndi ndiVar2 = (ndi) lkqVar2;
        if (ndiVar != null && ndiVar2 != null) {
            if ((ndiVar.a & 1) == 0 || (i = ndiVar.b - ndiVar2.b) == 0) {
                return null;
            }
            ljh k = ndi.d.k();
            if ((ndiVar.a & 2) != 0) {
                ndj ndjVar = ndiVar.c;
                if (ndjVar == null) {
                    ndjVar = ndj.d;
                }
                if (!k.b.y()) {
                    k.t();
                }
                ndi ndiVar3 = (ndi) k.b;
                ndjVar.getClass();
                ndiVar3.c = ndjVar;
                ndiVar3.a |= 2;
            }
            if (!k.b.y()) {
                k.t();
            }
            ndi ndiVar4 = (ndi) k.b;
            ndiVar4.a |= 1;
            ndiVar4.b = i;
            return (ndi) k.q();
        }
        return ndiVar;
    }

    @Override // defpackage.hoo
    public final /* bridge */ /* synthetic */ String c(lkq lkqVar) {
        ndj ndjVar = ((ndi) lkqVar).c;
        if (ndjVar == null) {
            ndjVar = ndj.d;
        }
        return ndjVar.c;
    }
}
