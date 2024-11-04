package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class zk extends mno implements mol {
    int a;
    final /* synthetic */ yx b;
    final /* synthetic */ yw c;
    final /* synthetic */ mjp d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(yx yxVar, mjp mjpVar, yw ywVar, mmx mmxVar) {
        super(mmxVar);
        this.b = yxVar;
        this.d = mjpVar;
        this.c = ywVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zk) c((auy) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:            if (defpackage.dc.h(r1, r3, r5, r9, r8) == r0) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:            if (defpackage.dc.g(r1, r2, r9, r8) == r0) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0026, code lost:            if (r9 != r0) goto L9;     */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            mne r0 = defpackage.mne.a
            int r1 = r8.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.mjo.o(r9)
            goto L72
        Le:
            java.lang.Object r1 = r8.e
            auy r1 = (defpackage.auy) r1
            defpackage.mjo.o(r9)
            goto L28
        L16:
            defpackage.mjo.o(r9)
            java.lang.Object r9 = r8.e
            r1 = r9
            auy r1 = (defpackage.auy) r1
            r8.e = r1
            r8.a = r3
            java.lang.Object r9 = defpackage.dc.f(r1, r8)
            if (r9 == r0) goto L75
        L28:
            auf r9 = (defpackage.auf) r9
            boolean r3 = defpackage.dc.e(r9)
            r4 = 0
            if (r3 == 0) goto L5e
            int r3 = r9.b
            r3 = r3 & 33
            if (r3 == 0) goto L5e
            java.util.List r3 = r9.a
            int r5 = r3.size()
            r6 = 0
        L3e:
            if (r6 >= r5) goto L4f
            java.lang.Object r7 = r3.get(r6)
            aum r7 = (defpackage.aum) r7
            boolean r7 = r7.c()
            if (r7 != 0) goto L5e
            int r6 = r6 + 1
            goto L3e
        L4f:
            yx r3 = r8.b
            mjp r5 = r8.d
            r8.e = r4
            r8.a = r2
            java.lang.Object r9 = defpackage.dc.h(r1, r3, r5, r9, r8)
            if (r9 != r0) goto L72
            goto L75
        L5e:
            boolean r2 = defpackage.dc.e(r9)
            if (r2 != 0) goto L72
            yw r2 = r8.c
            r8.e = r4
            r3 = 3
            r8.a = r3
            java.lang.Object r9 = defpackage.dc.g(r1, r2, r9, r8)
            if (r9 != r0) goto L72
            goto L75
        L72:
            mlh r9 = defpackage.mlh.a
            return r9
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        zk zkVar = new zk(this.b, this.d, this.c, mmxVar);
        zkVar.e = obj;
        return zkVar;
    }
}
