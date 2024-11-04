package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjc extends mnp implements mol {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ cih e;
    final /* synthetic */ mww f;
    final /* synthetic */ String[] g;
    final /* synthetic */ moh h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjc(cih cihVar, mww mwwVar, String[] strArr, moh mohVar, mmx mmxVar) {
        super(2, mmxVar);
        this.e = cihVar;
        this.f = mwwVar;
        this.g = strArr;
        this.h = mohVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjc) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a7, code lost:            if (defpackage.moz.an(r15, r2, r14) == r0) goto L24;     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            mne r0 = defpackage.mne.a
            int r1 = r14.d
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r2) goto L10
            defpackage.mjo.o(r15)
            goto Laa
        L10:
            java.lang.Object r1 = r14.c
            java.lang.Object r2 = r14.b
            java.lang.Object r5 = r14.a
            java.lang.Object r6 = r14.i
            mvy r6 = (defpackage.mvy) r6
            defpackage.mjo.o(r15)
            r8 = r6
            goto L7c
        L1f:
            defpackage.mjo.o(r15)
            java.lang.Object r15 = r14.i
            r1 = r15
            msw r1 = (defpackage.msw) r1
            r15 = -1
            r5 = 6
            mvy r6 = defpackage.moz.at(r15, r3, r5)
            java.lang.String[] r15 = r14.g
            chs r5 = new chs
            r5.<init>(r15, r6)
            mlh r15 = defpackage.mlh.a
            r6.j(r15)
            r15 = 7
            mvy r15 = defpackage.moz.at(r3, r3, r15)
            cih r7 = r14.e
            r14.i = r6
            r14.a = r5
            r14.b = r15
            r14.c = r1
            r14.d = r2
            boolean r2 = r7.q()
            if (r2 == 0) goto L6e
            mnb r2 = r14.o()
            bcr r8 = defpackage.cip.a
            mmz r2 = r2.get(r8)
            cip r2 = (defpackage.cip) r2
            if (r2 != 0) goto L6d
            msw r2 = r7.b
            if (r2 != 0) goto L68
            java.lang.String r2 = "coroutineScope"
            defpackage.mpd.b(r2)
            r2 = r4
        L68:
            naj r2 = (defpackage.naj) r2
            mnb r2 = r2.a
            goto L76
        L6d:
            throw r4
        L6e:
            msw r2 = r7.j()
            naj r2 = (defpackage.naj) r2
            mnb r2 = r2.a
        L76:
            if (r2 == r0) goto Lad
            r8 = r6
            r13 = r2
            r2 = r15
            r15 = r13
        L7c:
            mnb r15 = (defpackage.mnb) r15
            bcr r6 = defpackage.muf.c
            mnb r15 = r15.minusKey(r6)
            cih r6 = r14.e
            moh r10 = r14.h
            cjb r12 = new cjb
            r7 = r5
            chs r7 = (defpackage.chs) r7
            r11 = 0
            r5 = r12
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r5 = 2
            defpackage.mpp.q(r1, r15, r3, r12, r5)
            mww r15 = r14.f
            r14.i = r4
            r14.a = r4
            r14.b = r4
            r14.c = r4
            r14.d = r5
            java.lang.Object r15 = defpackage.moz.an(r15, r2, r14)
            if (r15 != r0) goto Laa
            goto Lad
        Laa:
            mlh r15 = defpackage.mlh.a
            return r15
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        cjc cjcVar = new cjc(this.e, this.f, this.g, this.h, mmxVar);
        cjcVar.i = obj;
        return cjcVar;
    }
}
