package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gys extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gys(gyt gytVar, Bundle bundle, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = gytVar;
        this.c = bundle;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return ((gys) c((msw) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((gys) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((gys) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:            if (r9 == r0) goto L40;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v23, types: [mnb, java.lang.Object] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gys.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gyw, java.lang.Object] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return new gys((gyw) this.b, (gnd) this.c, mmxVar, 2);
            }
            return new gys((hri) this.c, (lev) this.b, mmxVar, 1);
        }
        return new gys((gyt) this.b, (Bundle) this.c, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gys(gyw gywVar, gnd gndVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = gywVar;
        this.c = gndVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gys(hri hriVar, lev levVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.c = hriVar;
        this.b = levVar;
    }
}
