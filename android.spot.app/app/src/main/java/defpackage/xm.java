package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xm extends mno implements mol {
    int a;
    final /* synthetic */ mnb b;
    final /* synthetic */ mol c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(mnb mnbVar, mol molVar, mmx mmxVar) {
        super(mmxVar);
        this.b = mnbVar;
        this.c = molVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xm) c((auy) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:            if (r6 != r0) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:            if (r6 == r0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:            return r0;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004a -> B:7:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005e -> B:7:0x002e). Please report as a decompilation issue!!! */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L14
            java.lang.Object r1 = r5.d
            auy r1 = (defpackage.auy) r1
            defpackage.mjo.o(r6)
            goto L2e
        L14:
            java.lang.Object r1 = r5.d
            auy r1 = (defpackage.auy) r1
            defpackage.mjo.o(r6)     // Catch: java.util.concurrent.CancellationException -> L1c
            goto L2e
        L1c:
            r6 = move-exception
            goto L4d
        L1e:
            java.lang.Object r1 = r5.d
            auy r1 = (defpackage.auy) r1
            defpackage.mjo.o(r6)     // Catch: java.util.concurrent.CancellationException -> L1c
            goto L42
        L26:
            defpackage.mjo.o(r6)
            java.lang.Object r6 = r5.d
            r1 = r6
            auy r1 = (defpackage.auy) r1
        L2e:
            mnb r6 = r5.b
            boolean r6 = defpackage.mkm.aD(r6)
            if (r6 == 0) goto L63
            mol r6 = r5.c     // Catch: java.util.concurrent.CancellationException -> L1c
            r5.d = r1     // Catch: java.util.concurrent.CancellationException -> L1c
            r5.a = r3     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r6 = r6.a(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r6 == r0) goto L4c
        L42:
            r5.d = r1     // Catch: java.util.concurrent.CancellationException -> L1c
            r5.a = r2     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r6 = defpackage.rk.b(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r6 != r0) goto L2e
        L4c:
            return r0
        L4d:
            mnb r4 = r5.b
            boolean r4 = defpackage.mkm.aD(r4)
            if (r4 == 0) goto L62
            r5.d = r1
            r6 = 3
            r5.a = r6
            java.lang.Object r6 = defpackage.rk.b(r1, r5)
            if (r6 == r0) goto L61
            goto L2e
        L61:
            return r0
        L62:
            throw r6
        L63:
            mlh r6 = defpackage.mlh.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        xm xmVar = new xm(this.b, this.c, mmxVar);
        xmVar.d = obj;
        return xmVar;
    }
}
