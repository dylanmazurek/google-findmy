package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjb extends mnp implements mol {
    Object a;
    int b;
    final /* synthetic */ cih c;
    final /* synthetic */ mvy d;
    final /* synthetic */ mvy e;
    final /* synthetic */ moh f;
    final /* synthetic */ chs g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjb(cih cihVar, chs chsVar, mvy mvyVar, mvy mvyVar2, moh mohVar, mmx mmxVar) {
        super(2, mmxVar);
        this.c = cihVar;
        this.g = chsVar;
        this.d = mvyVar;
        this.e = mvyVar2;
        this.f = mohVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjb) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:16:0x0027, B:17:0x0060, B:19:0x006a, B:21:0x0073, B:23:0x008a, B:33:0x002f, B:35:0x0037, B:37:0x005a), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0094 -> B:17:0x0060). Please report as a decompilation issue!!! */
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
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3f
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L33
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1a
            defpackage.mjo.o(r11)
            goto Lad
        L1a:
            java.lang.Object r0 = r10.a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.mjo.o(r11)
            goto Lc6
        L23:
            java.lang.Object r1 = r10.a
            mvq r1 = (defpackage.mvq) r1
            defpackage.mjo.o(r11)     // Catch: java.lang.Throwable -> L97
            goto L60
        L2b:
            java.lang.Object r1 = r10.a
            mvq r1 = (defpackage.mvq) r1
            defpackage.mjo.o(r11)     // Catch: java.lang.Throwable -> L97
            goto L8a
        L33:
            java.lang.Object r1 = r10.a
            mvq r1 = (defpackage.mvq) r1
            defpackage.mjo.o(r11)     // Catch: java.lang.Throwable -> L97
            goto L6a
        L3b:
            defpackage.mjo.o(r11)
            goto L5a
        L3f:
            defpackage.mjo.o(r11)
            cih r11 = r10.c
            chs r1 = r10.g
            cht r11 = r11.b()
            r10.b = r6
            ciz r11 = r11.c
            java.lang.Object r11 = r11.a(r1, r10)
            mne r1 = defpackage.mne.a
            if (r11 == r1) goto L58
            mlh r11 = defpackage.mlh.a
        L58:
            if (r11 == r0) goto Lc7
        L5a:
            mvy r11 = r10.d     // Catch: java.lang.Throwable -> L97
            mvq r1 = r11.A()     // Catch: java.lang.Throwable -> L97
        L60:
            r10.a = r1     // Catch: java.lang.Throwable -> L97
            r10.b = r5     // Catch: java.lang.Throwable -> L97
            java.lang.Object r11 = r1.a(r10)     // Catch: java.lang.Throwable -> L97
            if (r11 == r0) goto Lb0
        L6a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L97
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L97
            r6 = 0
            if (r11 == 0) goto L9a
            r1.b()     // Catch: java.lang.Throwable -> L97
            cih r11 = r10.c     // Catch: java.lang.Throwable -> L97
            moh r7 = r10.f     // Catch: java.lang.Throwable -> L97
            cja r8 = new cja     // Catch: java.lang.Throwable -> L97
            r9 = 0
            r8.<init>(r11, r6, r7, r9)     // Catch: java.lang.Throwable -> L97
            r10.a = r1     // Catch: java.lang.Throwable -> L97
            r10.b = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r11 = r11.u(r8, r10)     // Catch: java.lang.Throwable -> L97
            if (r11 == r0) goto L99
        L8a:
            mvy r6 = r10.e     // Catch: java.lang.Throwable -> L97
            r10.a = r1     // Catch: java.lang.Throwable -> L97
            r10.b = r3     // Catch: java.lang.Throwable -> L97
            java.lang.Object r11 = r6.h(r11, r10)     // Catch: java.lang.Throwable -> L97
            if (r11 != r0) goto L60
            return r0
        L97:
            r11 = move-exception
            goto Lb1
        L99:
            return r0
        L9a:
            cih r11 = r10.c
            chs r1 = r10.g
            cht r11 = r11.b()
            r10.a = r6
            r10.b = r2
            java.lang.Object r11 = r11.b(r1, r10)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            mlh r11 = defpackage.mlh.a
            return r11
        Lb0:
            return r0
        Lb1:
            cih r1 = r10.c
            cht r1 = r1.b()
            r10.a = r11
            r2 = 6
            r10.b = r2
            chs r2 = r10.g
            java.lang.Object r1 = r1.b(r2, r10)
            if (r1 != r0) goto Lc5
            return r0
        Lc5:
            r0 = r11
        Lc6:
            throw r0
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new cjb(this.c, this.g, this.d, this.e, this.f, mmxVar);
    }
}
