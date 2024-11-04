package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cja extends mnp implements mol {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cja(cih cihVar, mmx mmxVar, moh mohVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.c = cihVar;
        this.d = mohVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                return ((cja) c((msw) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((cja) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((cja) c((cie) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:            if (r9.a(r8) == r0) goto L61;     */
    /* JADX WARN: Type inference failed for: r0v2, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r5v15, types: [msw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [mvy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r9v12, types: [moh, java.lang.Object] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cja.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mol] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                cja cjaVar = new cja((mol) this.d, (bmf) this.c, mmxVar, 2);
                cjaVar.b = obj;
                return cjaVar;
            }
            cja cjaVar2 = new cja((hpd) this.c, (mol) this.d, mmxVar, 1);
            cjaVar2.b = obj;
            return cjaVar2;
        }
        cja cjaVar3 = new cja((cih) this.c, mmxVar, (moh) this.d, 0);
        cjaVar3.b = obj;
        return cjaVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cja(hpd hpdVar, mol molVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.c = hpdVar;
        this.d = molVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cja(mol molVar, bmf bmfVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.d = molVar;
        this.c = bmfVar;
    }
}
