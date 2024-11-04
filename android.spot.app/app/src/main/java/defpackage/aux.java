package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aux extends mnp implements mol {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ auy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aux(long j, auy auyVar, mmx mmxVar) {
        super(2, mmxVar);
        this.b = j;
        this.c = auyVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aux) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:            r6.p(defpackage.mjo.n(new defpackage.aug(r5.b)));     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:            return defpackage.mlh.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:            if (defpackage.msz.i(r3 - 1, r5) != r0) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:            if (r1 != 1) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:            if (defpackage.msz.i(1, r5) == r0) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:            r6 = r5.c.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:            if (r6 == null) goto L14;     */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            mne r0 = defpackage.mne.a
            int r1 = r5.a
            r2 = 1
            defpackage.mjo.o(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1a
            goto L26
        Ld:
            long r3 = r5.b
            r5.a = r2
            r1 = -1
            long r3 = r3 + r1
            java.lang.Object r6 = defpackage.msz.i(r3, r5)
            if (r6 == r0) goto L3d
        L1a:
            r6 = 2
            r5.a = r6
            r1 = 1
            java.lang.Object r6 = defpackage.msz.i(r1, r5)
            if (r6 != r0) goto L26
            goto L3d
        L26:
            auy r6 = r5.c
            msd r6 = r6.a
            if (r6 == 0) goto L3a
            long r0 = r5.b
            aug r2 = new aug
            r2.<init>(r0)
            java.lang.Object r0 = defpackage.mjo.n(r2)
            r6.p(r0)
        L3a:
            mlh r6 = defpackage.mlh.a
            return r6
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aux.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new aux(this.b, this.c, mmxVar);
    }
}
