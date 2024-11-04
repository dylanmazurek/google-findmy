package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class era extends mnp implements mol {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(eay eayVar, List list, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.a = eayVar;
        this.b = list;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return ((era) c((msw) obj, (mmx) obj2)).b(mlh.a);
                    }
                    return ((era) c((msw) obj, (mmx) obj2)).b(mlh.a);
                }
                return ((era) c((msw) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((era) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((era) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, adq] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23, types: [lkq, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        mjo.o(obj);
                        for (goa goaVar : ((gyx) this.b).b.b()) {
                            jis s = ((gyx) this.b).d.s(goaVar);
                            int i2 = ((jmi) s).c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                ggk ggkVar = (ggk) s.get(i3);
                                Object obj2 = this.b;
                                gip gipVar = new gip();
                                gipVar.f(frx.L(goaVar));
                                gipVar.c();
                                gipVar.d(true);
                                gipVar.b();
                                gipVar.e((gnd) this.a);
                                ((gyx) obj2).a.c(ggkVar, gipVar.a());
                            }
                        }
                        jis s2 = ((gyx) this.b).d.s(null);
                        int i4 = ((jmi) s2).c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ggk ggkVar2 = (ggk) s2.get(i5);
                            Object obj3 = this.b;
                            gip gipVar2 = new gip();
                            gipVar2.f(gir.a);
                            gipVar2.c();
                            gipVar2.d(true);
                            gipVar2.b();
                            gipVar2.e((gnd) this.a);
                            ((gyx) obj3).a.c(ggkVar2, gipVar2.a());
                        }
                        return mlh.a;
                    }
                    mjo.o(obj);
                    return ((gyt) this.b).f.b((Bundle) this.a);
                }
                mjo.o(obj);
                ?? r12 = this.b;
                Object obj4 = this.a;
                return ((gym) ((hri) obj4).a).a("/v1/updatethreadstatebytoken", null, r12, lew.a);
            }
            mjo.o(obj);
            ((eay) this.a).c.s(this.b);
            ((eay) this.a).c.t(false);
            return mlh.a;
        }
        mjo.o(obj);
        double doubleValue = ((Number) ((equ) ((wi) this.a).e()).c.e(new Double(0.0d))).doubleValue() - ((Number) ((equ) ((wi) this.a).d()).c.e(new Double(0.0d))).doubleValue();
        if (Math.abs(doubleValue) > 3.141592653589793d) {
            ?? r122 = this.b;
            r122.f(r122.b() - ((int) Math.signum(doubleValue)));
        }
        return mlh.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, adq] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new era((gyx) this.b, (gnd) this.a, mmxVar, 4);
                    }
                    return new era((gyt) this.b, (Bundle) this.a, mmxVar, 3);
                }
                return new era((hri) this.a, (lev) this.b, mmxVar, 2);
            }
            return new era((eay) this.a, (List) this.b, mmxVar, 1);
        }
        return new era((wi) this.a, (adq) this.b, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(gyt gytVar, Bundle bundle, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.b = gytVar;
        this.a = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(gyx gyxVar, gnd gndVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.b = gyxVar;
        this.a = gndVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(hri hriVar, lev levVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.a = hriVar;
        this.b = levVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(wi wiVar, adq adqVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.a = wiVar;
        this.b = adqVar;
    }
}
