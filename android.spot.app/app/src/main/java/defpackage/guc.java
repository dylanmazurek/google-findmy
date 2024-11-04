package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guc {
    private static final joo a = joo.m("GnpSdk");
    private final jer b;
    private final jer c;

    public guc(jer jerVar, jer jerVar2) {
        jerVar.getClass();
        jerVar2.getClass();
        this.b = jerVar;
        this.c = jerVar2;
    }

    public final Object a(gsr gsrVar, mmx mmxVar) {
        int ordinal = gsrVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                return new gnc(null);
            }
            return b(mmxVar);
        }
        return c(mmxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.mmx r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gua
            if (r0 == 0) goto L13
            r0 = r5
            gua r0 = (defpackage.gua) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gua r0 = new gua
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.mjo.o(r5)     // Catch: java.lang.Exception -> L27
            goto L4a
        L27:
            r5 = move-exception
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.mjo.o(r5)
            jer r5 = r4.c
            boolean r2 = r5.g()
            if (r2 == 0) goto L62
            java.lang.Object r5 = r5.c()     // Catch: java.lang.Exception -> L27
            gwr r5 = (defpackage.gwr) r5     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Exception -> L27
            if (r5 == r1) goto L50
        L4a:
            gnc r0 = new gnc     // Catch: java.lang.Exception -> L27
            r0.<init>(r5)     // Catch: java.lang.Exception -> L27
            goto L61
        L50:
            return r1
        L51:
            joo r0 = defpackage.guc.a
            jnx r0 = r0.f()
            java.lang.String r1 = "Failed getting YouTube visitor data cookie"
            defpackage.der.f(r0, r1, r5)
            gmy r0 = new gmy
            r0.<init>(r5)
        L61:
            return r0
        L62:
            joo r5 = defpackage.guc.a
            jnx r5 = r5.f()
            jol r5 = (defpackage.jol) r5
            java.lang.String r0 = "YouTubeVisitorDataProvider not found, can't get YouTube Visitor cookie"
            r5.r(r0)
            gmy r5 = new gmy
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guc.b(mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.mmx r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gub
            if (r0 == 0) goto L13
            r0 = r5
            gub r0 = (defpackage.gub) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gub r0 = new gub
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.mjo.o(r5)
            goto L67
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.mjo.o(r5)
            jer r5 = r4.b
            boolean r2 = r5.g()
            if (r2 != 0) goto L52
            joo r5 = defpackage.guc.a
            jnx r5 = r5.f()
            jol r5 = (defpackage.jol) r5
            java.lang.String r0 = "PseudonymousIdHelper not found, can't get Zwieback ID"
            r5.r(r0)
            gmy r5 = new gmy
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r5.<init>(r1)
            return r5
        L52:
            java.lang.Object r5 = r5.c()
            gvw r5 = (defpackage.gvw) r5
            jyz r5 = r5.a()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.mpd.p(r5, r0)
            if (r5 == r1) goto L8b
        L67:
            com.google.android.gms.pseudonymous.PseudonymousIdToken r5 = (com.google.android.gms.pseudonymous.PseudonymousIdToken) r5
            java.lang.String r5 = r5.a
            if (r5 != 0) goto L85
            joo r5 = defpackage.guc.a
            jnx r5 = r5.f()
            jol r5 = (defpackage.jol) r5
            java.lang.String r0 = "Failed to get Zwieback ID"
            r5.r(r0)
            gmz r5 = new gmz
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r5.<init>(r1)
            return r5
        L85:
            gnc r0 = new gnc
            r0.<init>(r5)
            return r0
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guc.c(mmx):java.lang.Object");
    }
}
