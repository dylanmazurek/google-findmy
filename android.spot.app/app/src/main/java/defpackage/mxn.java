package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mxn extends mnp implements mom {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ mol c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxn(mol molVar, mmx mmxVar) {
        super(3, mmxVar);
        this.c = molVar;
    }

    @Override // defpackage.mom
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        mxn mxnVar = new mxn(this.c, (mmx) obj3);
        mxnVar.d = (mww) obj;
        mxnVar.b = obj2;
        return mxnVar.b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:            if (r1.dt(r5, r4) == r0) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:            if (r5 != r0) goto L9;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [mww] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
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
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.mjo.o(r5)
            goto L31
        Ld:
            java.lang.Object r1 = r4.d
            defpackage.mjo.o(r5)
            goto L24
        L13:
            defpackage.mjo.o(r5)
            java.lang.Object r1 = r4.d
            java.lang.Object r5 = r4.b
            mol r3 = r4.c
            r4.a = r2
            java.lang.Object r5 = r3.a(r5, r4)
            if (r5 == r0) goto L34
        L24:
            r2 = 0
            r4.d = r2
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.dt(r5, r4)
            if (r5 != r0) goto L31
            goto L34
        L31:
            mlh r5 = defpackage.mlh.a
            return r5
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxn.b(java.lang.Object):java.lang.Object");
    }
}
