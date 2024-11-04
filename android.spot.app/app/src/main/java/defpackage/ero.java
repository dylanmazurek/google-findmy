package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ero extends mnp implements mol {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ gga d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ero(boolean z, gga ggaVar, boolean z2, mmx mmxVar) {
        super(2, mmxVar);
        this.b = z;
        this.d = ggaVar;
        this.c = z2;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ero) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:            if (defpackage.err.b(r5, r1, r4) == r0) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:            if (defpackage.err.b(r5, true, r4) == r0) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:            if (defpackage.err.c(r5, r4) == r0) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:            return r0;     */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, agt] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            mne r0 = defpackage.mne.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            defpackage.mjo.o(r5)
            if (r1 == 0) goto Lc
            goto L48
        Lc:
            boolean r5 = r4.b
            if (r5 == 0) goto L1b
            gga r5 = r4.d
            r4.a = r3
            java.lang.Object r5 = defpackage.err.c(r5, r4)
            if (r5 != r0) goto L48
            goto L47
        L1b:
            gga r5 = r4.d
            java.lang.Object r5 = r5.e
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L38
            gga r5 = r4.d
            boolean r1 = r4.c
            r4.a = r2
            java.lang.Object r5 = defpackage.err.b(r5, r1, r4)
            if (r5 != r0) goto L48
            goto L47
        L38:
            boolean r5 = r4.c
            if (r5 == 0) goto L48
            gga r5 = r4.d
            r1 = 3
            r4.a = r1
            java.lang.Object r5 = defpackage.err.b(r5, r3, r4)
            if (r5 != r0) goto L48
        L47:
            return r0
        L48:
            mlh r5 = defpackage.mlh.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ero.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new ero(this.b, this.d, this.c, mmxVar);
    }
}
