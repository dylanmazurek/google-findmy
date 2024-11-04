package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtc implements gry {
    private final mko a;
    private final gnv b;
    private final gsb c;
    private final String d;
    private final ddg e;

    public gtc(mko mkoVar, gnv gnvVar, ddg ddgVar, gsb gsbVar) {
        mkoVar.getClass();
        gnvVar.getClass();
        gsbVar.getClass();
        this.a = mkoVar;
        this.b = gnvVar;
        this.e = ddgVar;
        this.c = gsbVar;
        this.d = "GNP_PERIODIC_REGISTRATION";
        gnvVar.i.intValue();
    }

    @Override // defpackage.gry
    public final int a() {
        return 17;
    }

    @Override // defpackage.gry
    public final long b() {
        return 604800000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:            if (r7 != r0) goto L31;     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.gry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.os.Bundle r7, defpackage.mmx r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof defpackage.gtb
            if (r7 == 0) goto L13
            r7 = r8
            gtb r7 = (defpackage.gtb) r7
            int r0 = r7.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.c = r0
            goto L18
        L13:
            gtb r7 = new gtb
            r7.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r7.a
            mne r0 = defpackage.mne.a
            int r1 = r7.c
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L38
            if (r1 == r2) goto L34
            if (r1 != r3) goto L2c
            gsa r7 = r7.d
            defpackage.mjo.o(r8)
            goto L74
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.mjo.o(r8)
            goto L85
        L38:
            defpackage.mjo.o(r8)
            boolean r8 = defpackage.lvs.c()
            if (r8 == 0) goto L7b
            ddg r8 = r6.e
            int r8 = r8.n()
            if (r8 != r3) goto L7b
            gnv r8 = r6.b
            java.lang.Integer r8 = r8.i
            if (r8 == 0) goto L52
            r8.intValue()
        L52:
            mko r8 = r6.a
            gsa r1 = defpackage.gsa.a
            java.lang.Object r8 = r8.a()
            lgp r2 = defpackage.lgp.PERIODIC_REGISTRATION
            r7.d = r1
            r7.c = r3
            dzk r3 = new dzk
            gwu r8 = (defpackage.gwu) r8
            r4 = 0
            r5 = 20
            r3.<init>(r8, r2, r4, r5)
            mnb r8 = r8.c
            java.lang.Object r8 = defpackage.mpp.l(r8, r3, r7)
            if (r8 != r0) goto L73
            goto L88
        L73:
            r7 = r1
        L74:
            gna r8 = (defpackage.gna) r8
            grz r7 = r7.a(r8)
            return r7
        L7b:
            gsb r8 = r6.c
            r7.c = r2
            java.lang.Object r7 = defpackage.fzo.p(r8, r7)
            if (r7 == r0) goto L88
        L85:
            grz r7 = defpackage.grz.b
            return r7
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtc.c(android.os.Bundle, mmx):java.lang.Object");
    }

    @Override // defpackage.gry
    public final String d() {
        return this.d;
    }

    @Override // defpackage.gry
    public final boolean e() {
        return true;
    }

    @Override // defpackage.gry
    public final void f() {
    }
}
