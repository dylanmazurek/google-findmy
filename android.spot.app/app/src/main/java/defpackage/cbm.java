package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbm extends mnp implements mol {
    Object a;
    int b;
    final /* synthetic */ mpl c;
    final /* synthetic */ Object d;
    final /* synthetic */ boolean e;
    final /* synthetic */ hpd f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbm(mpl mplVar, hpd hpdVar, Object obj, boolean z, mmx mmxVar) {
        super(2, mmxVar);
        this.c = mplVar;
        this.f = hpdVar;
        this.d = obj;
        this.e = z;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbm) c((cbo) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:            if (r5 == r0) goto L24;     */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            mne r0 = defpackage.mne.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.mjo.o(r5)
            goto L6c
        Ld:
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.g
            cbo r2 = (defpackage.cbo) r2
            defpackage.mjo.o(r5)
            goto L41
        L17:
            defpackage.mjo.o(r5)
            java.lang.Object r5 = r4.g
            cbo r5 = (defpackage.cbo) r5
            mpl r1 = r4.c
            hpd r3 = r4.f
            apc r3 = r3.n()
            r4.g = r5
            r4.a = r1
            r4.b = r2
            java.lang.Object r2 = r3.a
            bym r2 = (defpackage.bym) r2
            java.lang.Object r2 = r2.a
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            int r2 = r2.incrementAndGet()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            if (r3 == r0) goto L8f
            r2 = r5
            r5 = r3
        L41:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            mpl r1 = (defpackage.mpl) r1
            r1.a = r5
            java.lang.Object r5 = r4.d
            r1 = 0
            r4.g = r1
            r4.a = r1
            r3 = 2
            r4.b = r3
            r2.b()
            cbu r3 = new cbu
            r3.<init>(r2, r5, r1)
            java.io.File r5 = r2.a
            java.lang.Object r5 = defpackage.bsd.c(r5, r3, r4)
            mne r1 = defpackage.mne.a
            if (r5 == r1) goto L69
            mlh r5 = defpackage.mlh.a
        L69:
            if (r5 != r0) goto L6c
            goto L8f
        L6c:
            boolean r5 = r4.e
            if (r5 == 0) goto L8c
            hpd r5 = r4.f
            java.lang.Object r0 = r4.d
            cal r1 = new cal
            if (r0 == 0) goto L7d
            int r2 = r0.hashCode()
            goto L7e
        L7d:
            r2 = 0
        L7e:
            java.lang.Object r5 = r5.j
            mpl r3 = r4.c
            int r3 = r3.a
            r1.<init>(r0, r2, r3)
            ddh r5 = (defpackage.ddh) r5
            r5.s(r1)
        L8c:
            mlh r5 = defpackage.mlh.a
            return r5
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        cbm cbmVar = new cbm(this.c, this.f, this.d, this.e, mmxVar);
        cbmVar.g = obj;
        return cbmVar;
    }
}
