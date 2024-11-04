package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gva implements gup {
    public static final joo a = joo.m("GnpSdk");
    private final gqb b;
    private final gri c;
    private final grt d;
    private final mnb e;

    static {
        gqc.a("X-Goog-Api-Key");
        gqc.a("X-Android-Cert");
        gqc.a("X-Android-Package");
        gqc.a("Authorization");
        gqc.a("Cookie");
        gqc.a("X-Goog-Visitor-Id");
    }

    public gva(gqb gqbVar, gnv gnvVar, gri griVar, grt grtVar, mnb mnbVar) {
        gnvVar.getClass();
        grtVar.getClass();
        this.b = gqbVar;
        this.c = griVar;
        this.d = grtVar;
        this.e = mnbVar;
    }

    @Override // defpackage.gup
    public final Object a(List list, String str, lem lemVar, mmx mmxVar) {
        return mpp.l(this.e, new mxw(this, list, str, lemVar, (mmx) null, 1), mmxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.lel r9, java.lang.String r10, defpackage.goa r11, boolean r12, defpackage.mmx r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.b(lel, java.lang.String, goa, boolean, mmx):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c8 -> B:10:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r20, java.lang.String r21, defpackage.lem r22, boolean r23, defpackage.mmx r24) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.c(java.util.List, java.lang.String, lem, boolean, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r10, java.lang.String r11, defpackage.lem r12, boolean r13, defpackage.mmx r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.gux
            if (r0 == 0) goto L13
            r0 = r14
            gux r0 = (defpackage.gux) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gux r0 = new gux
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.b
            mne r7 = defpackage.mne.a
            int r1 = r0.d
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 == r2) goto L32
            if (r1 != r8) goto L2a
            defpackage.mjo.o(r14)
            goto L79
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            gva r10 = r0.e
            defpackage.mjo.o(r14)
            goto L4e
        L38:
            defpackage.mjo.o(r14)
            r0.e = r9
            r0.a = r13
            r0.d = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r0
            java.lang.Object r14 = r1.c(r2, r3, r4, r5, r6)
            if (r14 == r7) goto L80
            r10 = r9
        L4e:
            gri r11 = r10.c
            gna r14 = (defpackage.gna) r14
            java.net.URL r12 = new java.net.URL
            java.lang.String r11 = defpackage.fzo.r(r11)
            java.lang.String r13 = "/v1/multiloginupdate"
            java.lang.String r11 = r11.concat(r13)
            r12.<init>(r11)
            boolean r11 = r14 instanceof defpackage.gnc
            if (r11 == 0) goto L7a
            gnc r14 = (defpackage.gnc) r14
            java.lang.Object r11 = r14.a
            lkq r11 = (defpackage.lkq) r11
            leo r13 = defpackage.leo.d
            r14 = 0
            r0.e = r14
            r0.d = r8
            java.lang.Object r14 = r10.h(r12, r11, r13, r0)
            if (r14 != r7) goto L79
            return r7
        L79:
            return r14
        L7a:
            r14.getClass()
            gmx r14 = (defpackage.gmx) r14
            return r14
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.d(java.util.List, java.lang.String, lem, boolean, mmx):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r5, defpackage.gwf r6, boolean r7, defpackage.mmx r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.guz
            if (r0 == 0) goto L13
            r0 = r8
            guz r0 = (defpackage.guz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            guz r0 = new guz
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.mjo.o(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.mjo.o(r8)
            java.lang.String r8 = "oauth2:https://www.googleapis.com/auth/notifications"
            if (r7 == 0) goto L48
            grt r7 = r4.d
            r0.a = r6
            r0.d = r3
            java.lang.Object r8 = r7.b(r5, r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            gna r8 = (defpackage.gna) r8
            goto L4e
        L48:
            grt r7 = r4.d
            gna r8 = r7.a(r5, r8)
        L4e:
            boolean r5 = r8 instanceof defpackage.grs
            if (r5 == 0) goto L5d
            guh r5 = new guh
            grs r8 = (defpackage.grs) r8
            java.io.IOException r7 = r8.a
            r5.<init>(r7, r6)
        L5b:
            r8 = r5
            goto L79
        L5d:
            boolean r5 = r8 instanceof defpackage.grq
            if (r5 == 0) goto L6b
            guf r5 = new guf
            grq r8 = (defpackage.grq) r8
            java.lang.Throwable r7 = r8.a
            r5.<init>(r7, r6)
            goto L5b
        L6b:
            boolean r5 = r8 instanceof defpackage.grr
            if (r5 == 0) goto L79
            guf r5 = new guf
            grr r8 = (defpackage.grr) r8
            com.google.android.gms.auth.UserRecoverableAuthException r7 = r8.a
            r5.<init>(r7, r6)
            goto L5b
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.e(java.lang.String, gwf, boolean, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.mmx r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.guv
            if (r0 == 0) goto L13
            r0 = r5
            guv r0 = (defpackage.guv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            guv r0 = new guv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L41
            r1 = 1
            if (r0 != r1) goto L39
            defpackage.mjo.o(r5)
            gna r5 = (defpackage.gna) r5
            boolean r0 = r5 instanceof defpackage.gnc
            if (r0 != 0) goto L30
            r5.getClass()
            gmx r5 = (defpackage.gmx) r5
            return r5
        L30:
            gnc r5 = (defpackage.gnc) r5
            java.lang.Object r5 = r5.a
            java.util.Objects.toString(r5)
            r5 = 0
            throw r5
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L41:
            defpackage.mjo.o(r5)
            gmy r5 = new gmy
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "One of Account Name, Zwieback or API Key must be set."
            r0.<init>(r1)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.f(mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.net.URL r6, defpackage.lkq r7, defpackage.mmx r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.guw
            if (r0 == 0) goto L13
            r0 = r8
            guw r0 = (defpackage.guw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            guw r0 = new guw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gqd r6 = r0.d
            defpackage.mjo.o(r8)
            goto L54
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.mjo.o(r8)
            gqd r8 = defpackage.gqe.a()
            r2 = 2
            r8.c = r2
            r8.e(r6)
            r8.d()
            byte[] r6 = r7.g()
            r8.b = r6
            r0.d = r8
            r0.c = r3
            java.lang.Object r6 = r5.f(r0)
            if (r6 == r1) goto L6c
            r4 = r8
            r8 = r6
            r6 = r4
        L54:
            gna r8 = (defpackage.gna) r8
            boolean r7 = r8.e()
            if (r7 == 0) goto L62
            r8.getClass()
            gmx r8 = (defpackage.gmx) r8
            return r8
        L62:
            gnc r7 = new gnc
            gqe r6 = r6.a()
            r7.<init>(r6)
            return r7
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.g(java.net.URL, lkq, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.net.URL r6, defpackage.lkq r7, defpackage.lkq r8, defpackage.mmx r9) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.h(java.net.URL, lkq, lkq, mmx):java.lang.Object");
    }
}
