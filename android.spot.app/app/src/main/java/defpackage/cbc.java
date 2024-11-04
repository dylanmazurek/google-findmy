package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbc extends mnp implements mol {
    Object a;
    int b;
    final /* synthetic */ hpd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbc(hpd hpdVar, mmx mmxVar) {
        super(2, mmxVar);
        this.c = hpdVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbc) c((mww) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:            if (r11 != r0) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:            if (r1.dt(r6, r10) != r0) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:            if ((r11 instanceof defpackage.cbv) != false) goto L30;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, mwv] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            mne r0 = defpackage.mne.a
            int r1 = r10.b
            r2 = 5
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L13
            defpackage.mjo.o(r11)
            goto La8
        L13:
            java.lang.Object r1 = r10.a
            java.lang.Object r3 = r10.d
            mww r3 = (defpackage.mww) r3
            defpackage.mjo.o(r11)
            goto L6d
        L1d:
            java.lang.Object r1 = r10.d
            mww r1 = (defpackage.mww) r1
            defpackage.mjo.o(r11)
            goto L46
        L25:
            defpackage.mjo.o(r11)
            java.lang.Object r11 = r10.d
            mww r11 = (defpackage.mww) r11
            hpd r1 = r10.c
            r10.d = r11
            r10.b = r4
            bea r6 = new bea
            r6.<init>(r1, r5, r2, r5)
            java.lang.Object r1 = r1.a
            naj r1 = (defpackage.naj) r1
            mnb r1 = r1.a
            java.lang.Object r1 = defpackage.mpp.l(r1, r6, r10)
            if (r1 == r0) goto Lb8
            r9 = r1
            r1 = r11
            r11 = r9
        L46:
            ccd r11 = (defpackage.ccd) r11
            boolean r6 = r11 instanceof defpackage.cal
            if (r6 == 0) goto L5e
            r6 = r11
            cal r6 = (defpackage.cal) r6
            java.lang.Object r6 = r6.a
            r10.d = r1
            r10.a = r11
            r10.b = r3
            java.lang.Object r3 = r1.dt(r6, r10)
            if (r3 == r0) goto Lb8
            goto L6b
        L5e:
            boolean r3 = r11 instanceof defpackage.ccg
            if (r3 != 0) goto Lb0
            boolean r3 = r11 instanceof defpackage.cbw
            if (r3 != 0) goto Lab
            boolean r3 = r11 instanceof defpackage.cbv
            if (r3 == 0) goto L6b
            goto La8
        L6b:
            r3 = r1
            r1 = r11
        L6d:
            hpd r11 = r10.c
            caz r6 = new caz
            r6.<init>(r5)
            ewm r7 = new ewm
            java.lang.Object r11 = r11.j
            ddh r11 = (defpackage.ddh) r11
            java.lang.Object r11 = r11.a
            r8 = 6
            r7.<init>(r11, r6, r8)
            cez r11 = new cez
            ccd r1 = (defpackage.ccd) r1
            r11.<init>(r1, r5, r4)
            ewm r1 = new ewm
            r1.<init>(r7, r11, r2)
            cto r11 = new cto
            r11.<init>(r1, r4)
            r10.d = r5
            r10.a = r5
            r1 = 3
            r10.b = r1
            defpackage.mpd.B(r3)
            java.lang.Object r11 = r11.a(r3, r10)
            mne r1 = defpackage.mne.a
            if (r11 == r1) goto La5
            mlh r11 = defpackage.mlh.a
        La5:
            if (r11 != r0) goto La8
            goto Lb8
        La8:
            mlh r11 = defpackage.mlh.a
            return r11
        Lab:
            cbw r11 = (defpackage.cbw) r11
            java.lang.Throwable r11 = r11.a
            throw r11
        Lb0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r11.<init>(r0)
            throw r11
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        cbc cbcVar = new cbc(this.c, mmxVar);
        cbcVar.d = obj;
        return cbcVar;
    }
}
