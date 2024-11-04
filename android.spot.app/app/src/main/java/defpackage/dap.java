package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dap extends mnp implements mol {
    int a;
    final /* synthetic */ muf b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ dat e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dap(int i, muf mufVar, int i2, int i3, dat datVar, mmx mmxVar) {
        super(2, mmxVar);
        this.f = i;
        this.b = mufVar;
        this.c = i2;
        this.d = i3;
        this.e = datVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dap) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:            r4 = defpackage.qt.b(new defpackage.bco(r2, 13), r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:            if (r4 != r0) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:            r4 = defpackage.adl.b(new defpackage.dar(r2, r4), r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:            r4 = r3.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:            r4 = r3.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:            if (((java.lang.Boolean) r4).booleanValue() == false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:            return defpackage.mlh.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:            if (r1 != 0) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:            if (defpackage.dao.a[r3.f - 1] != 1) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:            if (r3.b.t() == false) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:            r4 = r3.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:            r2 = r3.e;        r3.a = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:            if (r4 != Integer.MAX_VALUE) goto L15;     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:3:0x000a). Please report as a decompilation issue!!! */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            mne r0 = defpackage.mne.a
            int r1 = r3.a
            defpackage.mjo.o(r4)
            if (r1 == 0) goto La
            goto L46
        La:
            int r4 = r3.f
            int[] r1 = defpackage.dao.a
            int r4 = r4 + (-1)
            r4 = r1[r4]
            r1 = 1
            if (r4 != r1) goto L23
            muf r4 = r3.b
            boolean r4 = r4.t()
            if (r4 == 0) goto L20
            int r4 = r3.c
            goto L25
        L20:
            int r4 = r3.d
            goto L25
        L23:
            int r4 = r3.c
        L25:
            dat r2 = r3.e
            r3.a = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r1) goto L3a
            bco r4 = new bco
            r1 = 13
            r4.<init>(r2, r1)
            java.lang.Object r4 = defpackage.qt.b(r4, r3)
            goto L43
        L3a:
            dar r1 = new dar
            r1.<init>(r2, r4)
            java.lang.Object r4 = defpackage.adl.b(r1, r3)
        L43:
            if (r4 != r0) goto L46
            return r0
        L46:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4f
            goto La
        L4f:
            mlh r4 = defpackage.mlh.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dap.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new dap(this.f, this.b, this.c, this.d, this.e, mmxVar);
    }
}
