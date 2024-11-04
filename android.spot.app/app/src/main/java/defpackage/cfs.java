package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfs extends mnp implements mol {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cex d;
    final /* synthetic */ cew e;
    final /* synthetic */ msw f;
    final /* synthetic */ mol g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfs(cex cexVar, cew cewVar, msw mswVar, mol molVar, mmx mmxVar) {
        super(2, mmxVar);
        this.d = cexVar;
        this.e = cewVar;
        this.f = mswVar;
        this.g = molVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfs) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [mpn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            mne r0 = defpackage.mne.a
            int r1 = r14.c
            if (r1 == 0) goto L12
            java.lang.Object r0 = r14.b
            java.lang.Object r1 = r14.a
            defpackage.mjo.o(r15)     // Catch: java.lang.Throwable -> Lf
            goto L80
        Lf:
            r15 = move-exception
            goto L9e
        L12:
            defpackage.mjo.o(r15)
            cex r15 = r14.d
            cew r15 = r15.b
            cew r1 = defpackage.cew.DESTROYED
            if (r15 == r1) goto Lb7
            mpn r1 = new mpn
            r1.<init>()
            mpn r15 = new mpn
            r15.<init>()
            cew r2 = r14.e     // Catch: java.lang.Throwable -> L9a
            cex r10 = r14.d     // Catch: java.lang.Throwable -> L9a
            msw r5 = r14.f     // Catch: java.lang.Throwable -> L9a
            mol r9 = r14.g     // Catch: java.lang.Throwable -> L9a
            r14.a = r1     // Catch: java.lang.Throwable -> L9a
            r14.b = r15     // Catch: java.lang.Throwable -> L9a
            r3 = 1
            r14.c = r3     // Catch: java.lang.Throwable -> L9a
            mse r11 = new mse     // Catch: java.lang.Throwable -> L9a
            mmx r4 = defpackage.mjo.w(r14)     // Catch: java.lang.Throwable -> L9a
            r11.<init>(r4, r3)     // Catch: java.lang.Throwable -> L9a
            r11.z()     // Catch: java.lang.Throwable -> L9a
            r2.getClass()     // Catch: java.lang.Throwable -> L9a
            int r3 = r2.ordinal()     // Catch: java.lang.Throwable -> L9a
            r4 = 2
            if (r3 == r4) goto L5a
            r4 = 3
            if (r3 == r4) goto L57
            r4 = 4
            if (r3 == r4) goto L54
            r3 = 0
            goto L5c
        L54:
            cev r3 = defpackage.cev.ON_RESUME     // Catch: java.lang.Throwable -> L9a
            goto L5c
        L57:
            cev r3 = defpackage.cev.ON_START     // Catch: java.lang.Throwable -> L9a
            goto L5c
        L5a:
            cev r3 = defpackage.cev.ON_CREATE     // Catch: java.lang.Throwable -> L9a
        L5c:
            cev r6 = defpackage.ceu.a(r2)     // Catch: java.lang.Throwable -> L9a
            ncd r8 = new ncd     // Catch: java.lang.Throwable -> L9a
            r8.<init>()     // Catch: java.lang.Throwable -> L9a
            cfr r12 = new cfr     // Catch: java.lang.Throwable -> L9a
            r2 = r12
            r4 = r1
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9a
            r15.a = r12     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r15.a     // Catch: java.lang.Throwable -> L9a
            r2.getClass()     // Catch: java.lang.Throwable -> L9a
            cfa r2 = (defpackage.cfa) r2     // Catch: java.lang.Throwable -> L9a
            r10.a(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r11.j()     // Catch: java.lang.Throwable -> L9a
            if (r2 == r0) goto L99
            r0 = r15
        L80:
            mpn r1 = (defpackage.mpn) r1
            java.lang.Object r15 = r1.a
            muf r15 = (defpackage.muf) r15
            if (r15 == 0) goto L8b
            defpackage.mkm.aG(r15)
        L8b:
            mpn r0 = (defpackage.mpn) r0
            java.lang.Object r15 = r0.a
            cfa r15 = (defpackage.cfa) r15
            if (r15 == 0) goto Lb7
            cex r0 = r14.d
            r0.c(r15)
            goto Lb7
        L99:
            return r0
        L9a:
            r0 = move-exception
            r13 = r0
            r0 = r15
            r15 = r13
        L9e:
            mpn r1 = (defpackage.mpn) r1
            java.lang.Object r1 = r1.a
            muf r1 = (defpackage.muf) r1
            if (r1 == 0) goto La9
            defpackage.mkm.aG(r1)
        La9:
            mpn r0 = (defpackage.mpn) r0
            java.lang.Object r0 = r0.a
            cfa r0 = (defpackage.cfa) r0
            if (r0 == 0) goto Lb6
            cex r1 = r14.d
            r1.c(r0)
        Lb6:
            throw r15
        Lb7:
            mlh r15 = defpackage.mlh.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new cfs(this.d, this.e, this.f, this.g, mmxVar);
    }
}
