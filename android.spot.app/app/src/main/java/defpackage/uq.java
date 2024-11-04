package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uq extends mnp implements mol {
    Object a;
    int b;
    final /* synthetic */ mvy c;
    final /* synthetic */ agt d;
    final /* synthetic */ agt e;
    final /* synthetic */ gga f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(mvy mvyVar, gga ggaVar, agt agtVar, agt agtVar2, mmx mmxVar) {
        super(2, mmxVar);
        this.c = mvyVar;
        this.f = ggaVar;
        this.d = agtVar;
        this.e = agtVar2;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uq) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002c -> B:4:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            mne r0 = defpackage.mne.a
            int r1 = r11.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r11.a
            java.lang.Object r2 = r11.g
            msw r2 = (defpackage.msw) r2
            defpackage.mjo.o(r12)
            goto L2f
        L10:
            defpackage.mjo.o(r12)
            java.lang.Object r12 = r11.g
            msw r12 = (defpackage.msw) r12
            mvy r1 = r11.c
            mvq r1 = r1.A()
            r2 = r12
        L1e:
            r11.g = r2
            r11.a = r1
            r12 = 1
            r11.b = r12
            r12 = r1
            mvq r12 = (defpackage.mvq) r12
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r0) goto L2f
            return r0
        L2f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L62
            r12 = r1
            mvq r12 = (defpackage.mvq) r12
            java.lang.Object r12 = r12.b()
            mvy r3 = r11.c
            java.lang.Object r3 = r3.i()
            java.lang.Object r3 = defpackage.mwc.a(r3)
            if (r3 == 0) goto L4c
            r5 = r3
            goto L4d
        L4c:
            r5 = r12
        L4d:
            gga r6 = r11.f
            agt r7 = r11.d
            agt r8 = r11.e
            bem r12 = new bem
            r9 = 0
            r10 = 1
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = 3
            r4 = 0
            r5 = 0
            defpackage.mpp.q(r2, r4, r5, r12, r3)
            goto L1e
        L62:
            mlh r12 = defpackage.mlh.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        uq uqVar = new uq(this.c, this.f, this.d, this.e, mmxVar);
        uqVar.g = obj;
        return uqVar;
    }
}
