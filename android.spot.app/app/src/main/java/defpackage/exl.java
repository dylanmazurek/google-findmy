package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exl {
    public static final jnk a = jnk.l("com/google/android/apps/adm/tos/TosHandlerImpl");
    public final evy b;
    public final msw c;
    public final dhx d;
    public final apc e;

    public exl(evy evyVar, apc apcVar, dhx dhxVar, msw mswVar) {
        evyVar.getClass();
        apcVar.getClass();
        dhxVar.getClass();
        this.b = evyVar;
        this.e = apcVar;
        this.d = dhxVar;
        this.c = mswVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:            r5 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:            ((defpackage.jni) ((defpackage.jni) defpackage.exl.a.f()).i(r5).j("com/google/android/apps/adm/tos/TosHandlerImpl", "getStoredTosVersion", 157, "TosHandlerImpl.kt")).r("Reading ToS version failed");        r5 = 0;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.accounts.Account r5, defpackage.mmx r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.exj
            if (r0 == 0) goto L13
            r0 = r6
            exj r0 = (defpackage.exj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            exj r0 = new exj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.mjo.o(r6)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.mjo.o(r6)
            dhx r6 = r4.d     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.f(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L3f
            return r1
        L3f:
            evx r6 = (defpackage.evx) r6     // Catch: java.lang.Exception -> L27
            int r5 = r6.b     // Catch: java.lang.Exception -> L27
            goto L64
        L44:
            jnk r6 = defpackage.exl.a
            jnx r6 = r6.f()
            jni r6 = (defpackage.jni) r6
            jnx r5 = r6.i(r5)
            java.lang.String r6 = "getStoredTosVersion"
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.String r1 = "com/google/android/apps/adm/tos/TosHandlerImpl"
            java.lang.String r2 = "TosHandlerImpl.kt"
            jnx r5 = r5.j(r1, r6, r0, r2)
            jni r5 = (defpackage.jni) r5
            java.lang.String r6 = "Reading ToS version failed"
            r5.r(r6)
            r5 = 0
        L64:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exl.a(android.accounts.Account, mmx):java.lang.Object");
    }

    public final void b(int i, Account account) {
        exf exfVar = new exf(0);
        dfu dfuVar = new dfu() { // from class: exg
            @Override // defpackage.dfu
            public final void a(dfy dfyVar) {
                ((jni) ((jni) exl.a.f()).i(dfyVar).j("com/google/android/apps/adm/tos/TosHandlerImpl", "setServerAcceptedTosVersionAsync$lambda$1", 137, "TosHandlerImpl.kt")).r("Failed to get server ToS version.");
            }
        };
        ljh k = lom.c.k();
        if (!k.b.y()) {
            k.t();
        }
        apc apcVar = this.e;
        lom lomVar = (lom) k.b;
        lomVar.a |= 2;
        lomVar.b = i;
        apcVar.r((lom) k.q(), account, exfVar, dfuVar);
    }

    public final void c(int i, Account account) {
        mpp.q(this.c, null, 0, new gsd(this, i, account, (mmx) null, 1), 3).w(cka.l);
    }
}
