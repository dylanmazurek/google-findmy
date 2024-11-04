package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cby {
    public List b;
    final /* synthetic */ hpd c;
    private final ncd d = new ncd();
    public final msk a = new msk();

    public cby(hpd hpdVar, List list) {
        this.c = hpdVar;
        this.b = mkm.ag(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:25:0x005f, B:27:0x0067, B:30:0x006d), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:25:0x005f, B:27:0x0067, B:30:0x006d), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.mmx r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbx
            if (r0 == 0) goto L13
            r0 = r6
            cbx r0 = (defpackage.cbx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbx r0 = new cbx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            ncd r1 = r0.e
            cby r0 = r0.d
            defpackage.mjo.o(r6)     // Catch: java.lang.Throwable -> L2e
            goto L7b
        L2e:
            r6 = move-exception
            goto L8c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            ncd r2 = r0.e
            cby r4 = r0.d
            defpackage.mjo.o(r6)
            r6 = r2
            goto L5f
        L41:
            defpackage.mjo.o(r6)
            msk r6 = r5.a
            boolean r6 = r6.O()
            if (r6 == 0) goto L4f
            mlh r6 = defpackage.mlh.a
            return r6
        L4f:
            ncd r6 = r5.d
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r2 = r6.b(r0)
            if (r2 != r1) goto L5e
            goto L88
        L5e:
            r4 = r5
        L5f:
            msk r2 = r4.a     // Catch: java.lang.Throwable -> L89
            boolean r2 = r2.O()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L6d
            mlh r0 = defpackage.mlh.a     // Catch: java.lang.Throwable -> L89
            r6.d()
            return r0
        L6d:
            r0.d = r4     // Catch: java.lang.Throwable -> L89
            r0.e = r6     // Catch: java.lang.Throwable -> L89
            r0.c = r3     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == r1) goto L88
            r1 = r6
            r0 = r4
        L7b:
            msk r6 = r0.a     // Catch: java.lang.Throwable -> L2e
            mlh r0 = defpackage.mlh.a     // Catch: java.lang.Throwable -> L2e
            r6.R(r0)     // Catch: java.lang.Throwable -> L2e
            r1.d()
            mlh r6 = defpackage.mlh.a
            return r6
        L88:
            return r1
        L89:
            r0 = move-exception
            r1 = r6
            r6 = r0
        L8c:
            r1.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cby.a(mmx):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.mmx r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.car
            if (r0 == 0) goto L13
            r0 = r7
            car r0 = (defpackage.car) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            car r0 = new car
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            cby r0 = r0.d
            defpackage.mjo.o(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            cby r0 = r0.d
            defpackage.mjo.o(r7)
            goto L72
        L3a:
            defpackage.mjo.o(r7)
            java.util.List r7 = r6.b
            if (r7 == 0) goto L63
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L48
            goto L63
        L48:
            hpd r7 = r6.c
            apc r2 = r7.n()
            cau r4 = new cau
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.d = r6
            r0.b = r3
            java.lang.Object r7 = r2.f(r4, r0)
            if (r7 != r1) goto L5f
            goto L70
        L5f:
            r0 = r6
        L60:
            cal r7 = (defpackage.cal) r7
            goto L74
        L63:
            hpd r7 = r6.c
            r0.d = r6
            r0.b = r4
            r2 = 0
            java.lang.Object r7 = r7.k(r2, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            r0 = r6
        L72:
            cal r7 = (defpackage.cal) r7
        L74:
            hpd r0 = r0.c
            java.lang.Object r0 = r0.j
            ddh r0 = (defpackage.ddh) r0
            r0.s(r7)
            mlh r7 = defpackage.mlh.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cby.b(mmx):java.lang.Object");
    }

    public cby() {
    }
}
