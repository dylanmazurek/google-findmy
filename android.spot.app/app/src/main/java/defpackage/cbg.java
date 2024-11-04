package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbg extends mnp implements mol {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ hpd e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbg(hpd hpdVar, int i, mmx mmxVar, int i2) {
        super(2, mmxVar);
        this.f = i2;
        this.e = hpdVar;
        this.d = i;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((cbg) c(bool, (mmx) obj2)).b(mlh.a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((cbg) c(bool2, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v20, types: [hpd] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L69
            mne r0 = defpackage.mne.a
            int r3 = r6.b
            if (r3 == 0) goto L1e
            if (r3 == r2) goto L16
            boolean r0 = r6.c
            java.lang.Object r1 = r6.a
            defpackage.mjo.o(r7)
            goto L4a
        L16:
            boolean r3 = r6.c
            defpackage.mjo.o(r7)     // Catch: java.lang.Throwable -> L1c
            goto L2e
        L1c:
            r7 = move-exception
            goto L31
        L1e:
            defpackage.mjo.o(r7)
            boolean r3 = r6.c
            hpd r7 = r6.e     // Catch: java.lang.Throwable -> L1c
            r6.b = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r7 = r7.k(r3, r6)     // Catch: java.lang.Throwable -> L1c
            if (r7 != r0) goto L2e
            goto L68
        L2e:
            ccd r7 = (defpackage.ccd) r7     // Catch: java.lang.Throwable -> L1c
            goto L5e
        L31:
            if (r3 == 0) goto L54
            hpd r4 = r6.e
            apc r4 = r4.n()
            r6.a = r7
            r6.c = r2
            r6.b = r1
            java.lang.Object r1 = r4.h()
            if (r1 != r0) goto L46
            goto L68
        L46:
            r0 = r3
            r5 = r1
            r1 = r7
            r7 = r5
        L4a:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r3 = r0
            r0 = r7
            r7 = r1
            goto L56
        L54:
            int r0 = r6.d
        L56:
            cbw r1 = new cbw
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r1.<init>(r7, r0)
            r7 = r1
        L5e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            mkw r1 = new mkw
            r1.<init>(r7, r0)
            r0 = r1
        L68:
            return r0
        L69:
            mne r0 = defpackage.mne.a
            int r3 = r6.b
            if (r3 == 0) goto L7d
            if (r3 == r2) goto L77
            java.lang.Object r0 = r6.a
            defpackage.mjo.o(r7)
            goto La5
        L77:
            boolean r2 = r6.c
            defpackage.mjo.o(r7)
            goto L90
        L7d:
            defpackage.mjo.o(r7)
            boolean r7 = r6.c
            hpd r3 = r6.e
            r6.b = r2
            java.lang.Object r2 = r3.j(r6)
            if (r2 != r0) goto L8d
            goto Lbf
        L8d:
            r5 = r2
            r2 = r7
            r7 = r5
        L90:
            if (r2 == 0) goto Laf
            hpd r2 = r6.e
            apc r2 = r2.n()
            r6.a = r7
            r6.b = r1
            java.lang.Object r1 = r2.h()
            if (r1 != r0) goto La3
            goto Lbf
        La3:
            r0 = r7
            r7 = r1
        La5:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r5 = r0
            r0 = r7
            r7 = r5
            goto Lb1
        Laf:
            int r0 = r6.d
        Lb1:
            cal r1 = new cal
            if (r7 == 0) goto Lba
            int r2 = r7.hashCode()
            goto Lbb
        Lba:
            r2 = 0
        Lbb:
            r1.<init>(r7, r2, r0)
            r0 = r1
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.f != 0) {
            cbg cbgVar = new cbg(this.e, this.d, mmxVar, 1, null);
            cbgVar.c = ((Boolean) obj).booleanValue();
            return cbgVar;
        }
        cbg cbgVar2 = new cbg(this.e, this.d, mmxVar, 0);
        cbgVar2.c = ((Boolean) obj).booleanValue();
        return cbgVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbg(hpd hpdVar, int i, mmx mmxVar, int i2, byte[] bArr) {
        super(2, mmxVar);
        this.f = i2;
        this.e = hpdVar;
        this.d = i;
    }
}
