package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hom extends hoo {
    public static final hom a = new hom();

    private hom() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @Override // defpackage.hoo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.lkq a(java.lang.String r5, java.lang.Object r6) {
        /*
            r4 = this;
            android.os.health.HealthStats r6 = defpackage.ct$$ExternalSyntheticApiModelOutline0.m74m(r6)
            ndk r0 = defpackage.ndk.e
            ljh r0 = r0.k()
            hop r1 = defpackage.hop.a
            r2 = 40001(0x9c41, float:5.6053E-41)
            java.util.Map r2 = defpackage.hog.m(r6, r2)
            java.util.List r1 = r1.d(r2)
            r0.L(r1)
            hol r1 = defpackage.hol.a
            if (r6 == 0) goto L2c
            r2 = 40002(0x9c42, float:5.6055E-41)
            boolean r3 = defpackage.ct$$ExternalSyntheticApiModelOutline0.m$4(r6, r2)
            if (r3 == 0) goto L2c
            java.util.Map r6 = defpackage.ct$$ExternalSyntheticApiModelOutline0.m$2(r6, r2)
            goto L30
        L2c:
            java.util.Map r6 = java.util.Collections.emptyMap()
        L30:
            java.util.List r6 = r1.d(r6)
            r0.M(r6)
            if (r5 == 0) goto L57
            ndj r5 = defpackage.hog.n(r5)
            ljn r6 = r0.b
            boolean r6 = r6.y()
            if (r6 != 0) goto L48
            r0.t()
        L48:
            ljn r6 = r0.b
            ndk r6 = (defpackage.ndk) r6
            r5.getClass()
            r6.d = r5
            int r5 = r6.a
            r5 = r5 | 1
            r6.a = r5
        L57:
            ljn r5 = r0.q()
            ndk r5 = (defpackage.ndk) r5
            boolean r6 = defpackage.hog.s(r5)
            if (r6 == 0) goto L64
            r5 = 0
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hom.a(java.lang.String, java.lang.Object):lkq");
    }

    @Override // defpackage.hoo
    public final /* synthetic */ lkq b(lkq lkqVar, lkq lkqVar2) {
        ndk ndkVar = (ndk) lkqVar;
        ndk ndkVar2 = (ndk) lkqVar2;
        if (ndkVar != null && ndkVar2 != null) {
            ljh k = ndk.e.k();
            k.L(hop.a.e(ndkVar.b, ndkVar2.b));
            k.M(hol.a.e(ndkVar.c, ndkVar2.c));
            ndj ndjVar = ndkVar.d;
            if (ndjVar == null) {
                ndjVar = ndj.d;
            }
            if (!k.b.y()) {
                k.t();
            }
            ndk ndkVar3 = (ndk) k.b;
            ndjVar.getClass();
            ndkVar3.d = ndjVar;
            ndkVar3.a |= 1;
            ndk ndkVar4 = (ndk) k.q();
            if (hog.s(ndkVar4)) {
                return null;
            }
            return ndkVar4;
        }
        return ndkVar;
    }

    @Override // defpackage.hoo
    public final /* bridge */ /* synthetic */ String c(lkq lkqVar) {
        ndj ndjVar = ((ndk) lkqVar).d;
        if (ndjVar == null) {
            ndjVar = ndj.d;
        }
        return ndjVar.c;
    }
}
