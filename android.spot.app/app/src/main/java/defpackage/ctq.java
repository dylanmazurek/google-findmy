package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctq extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctq(bet betVar, cvu cvuVar, ctl ctlVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.b = betVar;
        this.c = cvuVar;
        this.d = ctlVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((ctq) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((ctq) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:            if (r11 == r0) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:            if (r2 != 1) goto L22;     */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ctl] */
    /* JADX WARN: Type inference failed for: r6v0, types: [cpu, java.lang.Object] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.e
            r1 = 1
            if (r0 == 0) goto L6a
            mne r0 = defpackage.mne.a
            int r2 = r10.a
            defpackage.mjo.o(r11)
            if (r2 == 0) goto L11
            if (r2 == r1) goto L52
            goto L69
        L11:
            java.lang.Object r11 = r10.c
            java.lang.Object r2 = r10.b
            java.lang.Object r6 = r10.d
            r10.a = r1
            csl r11 = (defpackage.csl) r11
            cvu r5 = r11.a
            int r1 = defpackage.cxh.a
            boolean r1 = r5.p
            if (r1 == 0) goto L4d
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r1 < r3) goto L2a
            goto L4d
        L2a:
            eld r1 = r11.j
            android.content.Context r7 = r11.b
            java.lang.Object r11 = r1.c
            r11.getClass()
            mst r11 = defpackage.mkm.aH(r11)
            bem r1 = new bem
            r4 = r2
            cqb r4 = (defpackage.cqb) r4
            r8 = 0
            r9 = 2
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Object r11 = defpackage.mpp.l(r11, r1, r10)
            mne r1 = defpackage.mne.a
            if (r11 == r1) goto L4f
            mlh r11 = defpackage.mlh.a
            goto L4f
        L4d:
            mlh r11 = defpackage.mlh.a
        L4f:
            if (r11 != r0) goto L52
            goto L68
        L52:
            java.lang.String r11 = defpackage.csm.a
            defpackage.cqc.b()
            java.lang.Object r11 = r10.b
            cqb r11 = (defpackage.cqb) r11
            jyz r1 = r11.b()
            r2 = 2
            r10.a = r2
            java.lang.Object r11 = defpackage.csm.a(r1, r11, r10)
            if (r11 != r0) goto L69
        L68:
            return r0
        L69:
            return r11
        L6a:
            mne r0 = defpackage.mne.a
            int r2 = r10.a
            if (r2 == 0) goto L74
            defpackage.mjo.o(r11)
            goto L93
        L74:
            defpackage.mjo.o(r11)
            java.lang.Object r11 = r10.b
            java.lang.Object r2 = r10.c
            java.lang.Object r3 = r10.d
            cvu r2 = (defpackage.cvu) r2
            bet r11 = (defpackage.bet) r11
            mwv r11 = r11.p(r2)
            ctp r4 = new ctp
            r4.<init>(r3, r2)
            r10.a = r1
            java.lang.Object r11 = r11.a(r4, r10)
            if (r11 != r0) goto L93
            return r0
        L93:
            mlh r11 = defpackage.mlh.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctq.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ctl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [cpu, java.lang.Object] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.e != 0) {
            Object obj2 = this.c;
            return new ctq((csl) obj2, (cqb) this.b, (cpu) this.d, mmxVar, 1);
        }
        Object obj3 = this.b;
        return new ctq((bet) obj3, (cvu) this.c, (ctl) this.d, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctq(csl cslVar, cqb cqbVar, cpu cpuVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.c = cslVar;
        this.b = cqbVar;
        this.d = cpuVar;
    }
}
