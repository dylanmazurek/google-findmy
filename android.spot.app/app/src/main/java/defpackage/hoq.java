package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoq extends hoo {
    public static final hoq a = new hoq();

    private hoq() {
    }

    @Override // defpackage.hoo
    public final /* synthetic */ lkq a(String str, Object obj) {
        return hog.q(str, ct$$ExternalSyntheticApiModelOutline0.m77m(obj));
    }

    @Override // defpackage.hoo
    public final /* synthetic */ lkq b(lkq lkqVar, lkq lkqVar2) {
        return hog.p((ndo) lkqVar, (ndo) lkqVar2);
    }

    @Override // defpackage.hoo
    public final /* bridge */ /* synthetic */ String c(lkq lkqVar) {
        ndo ndoVar = (ndo) lkqVar;
        ndj ndjVar = ndoVar.d;
        if (ndjVar == null) {
            ndjVar = ndj.d;
        }
        int i = ndjVar.a & 2;
        ndj ndjVar2 = ndoVar.d;
        if (i != 0) {
            if (ndjVar2 == null) {
                ndjVar2 = ndj.d;
            }
            return ndjVar2.c;
        }
        if (ndjVar2 == null) {
            ndjVar2 = ndj.d;
        }
        return Long.toHexString(ndjVar2.b);
    }
}
