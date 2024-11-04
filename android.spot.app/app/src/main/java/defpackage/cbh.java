package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbh extends mnp implements moh {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ hpd e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbh(hpd hpdVar, mnb mnbVar, mol molVar, mmx mmxVar, int i) {
        super(1, mmxVar);
        this.f = i;
        this.e = hpdVar;
        this.c = mnbVar;
        this.d = molVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [mnb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mol] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        if (this.f != 0) {
            mmx mmxVar = (mmx) obj;
            return new cbh((mpn) this.d, this.e, (mpl) this.c, mmxVar, 1).b(mlh.a);
        }
        return new cbh(this.e, (mnb) this.c, (mol) this.d, (mmx) obj, 0).b(mlh.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Type inference failed for: r4v1, types: [mnb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mol] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbh.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbh(mpn mpnVar, hpd hpdVar, mpl mplVar, mmx mmxVar, int i) {
        super(1, mmxVar);
        this.f = i;
        this.d = mpnVar;
        this.e = hpdVar;
        this.c = mplVar;
    }
}
