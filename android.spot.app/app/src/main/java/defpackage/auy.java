package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auy implements ble, mmx {
    public msd a;
    public final /* synthetic */ auz b;
    private final mmx c;
    private final /* synthetic */ auz d;
    private int f = 2;
    private final mnb e = mnc.a;

    public auy(auz auzVar, mmx mmxVar) {
        this.b = auzVar;
        this.c = mmxVar;
        this.d = auzVar;
    }

    @Override // defpackage.ble
    public final float a() {
        return this.d.a();
    }

    @Override // defpackage.blj
    public final float b() {
        return this.d.b();
    }

    @Override // defpackage.blj
    public final float cc(long j) {
        return bbp.e(this.d, j);
    }

    @Override // defpackage.ble
    public final float cf(float f) {
        return bbc.b(this.d, f);
    }

    @Override // defpackage.ble
    public final float cg(int i) {
        return bbc.c(this.d, i);
    }

    @Override // defpackage.ble
    public final float ch(long j) {
        return bbc.d(this.d, j);
    }

    @Override // defpackage.ble
    public final float ci(float f) {
        return bbc.e(this.d, f);
    }

    @Override // defpackage.ble
    public final int cj(float f) {
        throw null;
    }

    @Override // defpackage.ble
    public final long ck(long j) {
        return bbc.g(this.d, j);
    }

    @Override // defpackage.blj
    public final long cl(float f) {
        return bbp.f(this.d, f);
    }

    @Override // defpackage.ble
    public final long cm(float f) {
        return bbc.h(this.d, f);
    }

    public final auf l() {
        return this.b.d;
    }

    public final bdi m() {
        return this.b.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [muf] */
    /* JADX WARN: Type inference failed for: r7v4, types: [muf] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [mol] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(long r7, defpackage.mol r9, defpackage.mmx r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.auw
            if (r0 == 0) goto L13
            r0 = r10
            auw r0 = (defpackage.auw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            auw r0 = new auw
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            defpackage.mjo.o(r10)     // Catch: java.lang.Throwable -> L29
            goto L68
        L29:
            r8 = move-exception
            goto L6f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.mjo.o(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            msd r10 = r6.a
            if (r10 == 0) goto L4c
            aug r2 = new aug
            r2.<init>(r7)
            java.lang.Object r2 = defpackage.mjo.n(r2)
            r10.p(r2)
        L4c:
            auz r10 = r6.b
            msw r10 = r10.bY()
            aux r2 = new aux
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            r8 = 0
            muf r7 = defpackage.mpp.q(r10, r4, r8, r2, r7)
            r0.a = r7     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.a(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 == r1) goto L6e
        L68:
            aty r8 = defpackage.aty.a
            r7.s(r8)
            return r10
        L6e:
            return r1
        L6f:
            aty r9 = defpackage.aty.a
            r7.s(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auy.n(long, mol, mmx):java.lang.Object");
    }

    @Override // defpackage.mmx
    public final mnb o() {
        return this.e;
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        auz auzVar = this.b;
        synchronized (auzVar.e) {
            auzVar.e.n(this);
        }
        this.c.p(obj);
    }

    public final Object q(int i, mmx mmxVar) {
        mse mseVar = new mse(mjo.w(mmxVar), 1);
        mseVar.z();
        this.f = i;
        this.a = mseVar;
        return mseVar.j();
    }

    public final void r(auf aufVar, int i) {
        msd msdVar;
        if (i == this.f && (msdVar = this.a) != null) {
            this.a = null;
            msdVar.p(aufVar);
        }
    }
}
