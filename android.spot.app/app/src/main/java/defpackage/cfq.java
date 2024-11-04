package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfq extends mnp implements mol {
    Object a;
    Object b;
    int c;
    final /* synthetic */ mol d;
    final /* synthetic */ ncd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfq(ncd ncdVar, mol molVar, mmx mmxVar) {
        super(2, mmxVar);
        this.e = ncdVar;
        this.d = molVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfq) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:            if (r7.b(r6) != r0) goto L23;     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            mne r0 = defpackage.mne.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 == r2) goto L11
            java.lang.Object r0 = r6.a
            defpackage.mjo.o(r7)     // Catch: java.lang.Throwable -> Lf
            goto L41
        Lf:
            r7 = move-exception
            goto L4d
        L11:
            java.lang.Object r1 = r6.b
            java.lang.Object r2 = r6.a
            defpackage.mjo.o(r7)
            r7 = r2
            goto L2d
        L1a:
            defpackage.mjo.o(r7)
            ncd r7 = r6.e
            mol r1 = r6.d
            r6.a = r7
            r6.b = r1
            r6.c = r2
            java.lang.Object r2 = r7.b(r6)
            if (r2 == r0) goto L53
        L2d:
            ceq r2 = new ceq     // Catch: java.lang.Throwable -> L49
            r3 = 2
            r4 = 0
            r2.<init>(r1, r4, r3)     // Catch: java.lang.Throwable -> L49
            r6.a = r7     // Catch: java.lang.Throwable -> L49
            r6.b = r4     // Catch: java.lang.Throwable -> L49
            r6.c = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = defpackage.msz.l(r2, r6)     // Catch: java.lang.Throwable -> L49
            if (r1 == r0) goto L53
            r0 = r7
        L41:
            ncd r0 = (defpackage.ncd) r0
            r0.d()
            mlh r7 = defpackage.mlh.a
            return r7
        L49:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L4d:
            ncd r0 = (defpackage.ncd) r0
            r0.d()
            throw r7
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new cfq(this.e, this.d, mmxVar);
    }
}
