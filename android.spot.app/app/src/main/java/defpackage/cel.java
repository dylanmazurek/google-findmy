package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cel extends cfm {
    public ceg a;
    private ceo i;

    public cel(mnb mnbVar, mol molVar) {
        mnbVar.get(muf.c);
        mva mvaVar = new mva(null);
        mst mstVar = mtj.a;
        this.a = new ceg(this, molVar, msz.m(nbc.a.h().plus(mnbVar).plus(mvaVar)), new azp(this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.mmx r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cek
            if (r0 == 0) goto L13
            r0 = r5
            cek r0 = (defpackage.cek) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cek r0 = new cek
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.c
            r1 = 0
            if (r0 == 0) goto L2f
            r2 = 1
            if (r0 != r2) goto L27
            defpackage.mjo.o(r5)
            r5 = r1
            goto L33
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.mjo.o(r5)
            r5 = r4
        L33:
            r5.i = r1
            mlh r5 = defpackage.mlh.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cel.a(mmx):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfm, defpackage.cfk
    public final void b() {
        super.b();
        ceg cegVar = this.a;
        if (cegVar != null) {
            muf mufVar = cegVar.f;
            if (mufVar != null) {
                mufVar.s(null);
            }
            cegVar.f = null;
            if (cegVar.e == null) {
                cegVar.e = mpp.q(cegVar.c, null, 0, new cbk(cegVar, (mmx) null, 2), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfm, defpackage.cfk
    public final void c() {
        super.c();
        ceg cegVar = this.a;
        if (cegVar != null) {
            if (cegVar.f == null) {
                msw mswVar = cegVar.c;
                mst mstVar = mtj.a;
                cegVar.f = mpp.q(mswVar, nbc.a.h(), 0, new bea(cegVar, (mmx) null, 7), 2);
                return;
            }
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
    }
}
