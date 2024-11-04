package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbz extends mnp implements mol {
    Object a;
    int b;
    final /* synthetic */ eld c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbz(eld eldVar, mmx mmxVar) {
        super(2, mmxVar);
        this.c = eldVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbz) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:            if (r5 == r0) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:            if (r1.a(r5, r4) != r0) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:            return r0;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [mvy, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:5:0x0049). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.mjo.o(r5)
            goto L49
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.mjo.o(r5)
            goto L3d
        L13:
            defpackage.mjo.o(r5)
            eld r5 = r4.c
            java.lang.Object r5 = r5.c
            bym r5 = (defpackage.bym) r5
            int r5 = r5.b()
            if (r5 <= 0) goto L5e
        L22:
            eld r5 = r4.c
            java.lang.Object r5 = r5.d
            naj r5 = (defpackage.naj) r5
            mnb r5 = r5.a
            defpackage.mkm.aB(r5)
            eld r5 = r4.c
            java.lang.Object r1 = r5.b
            r4.a = r1
            r4.b = r2
            java.lang.Object r5 = r5.a
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto L5d
        L3d:
            r3 = 0
            r4.a = r3
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L5d
        L49:
            eld r5 = r4.c
            java.lang.Object r5 = r5.c
            bym r5 = (defpackage.bym) r5
            java.lang.Object r5 = r5.a
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            int r5 = r5.decrementAndGet()
            if (r5 == 0) goto L5a
            goto L22
        L5a:
            mlh r5 = defpackage.mlh.a
            return r5
        L5d:
            return r0
        L5e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new cbz(this.c, mmxVar);
    }
}
