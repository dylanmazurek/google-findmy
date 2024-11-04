package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gfm implements jxd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gfm(gfn gfnVar, gfj gfjVar, int i, int i2) {
        this.d = i2;
        this.b = gfnVar;
        this.c = gfjVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        lnb lnbVar;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                int i2 = 0;
                int i3 = 2;
                int i4 = 4;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            int i5 = this.a;
                            ArrayList arrayList = new ArrayList(i5);
                            while (i2 < i5) {
                                if (((Boolean) ivc.M((Future) this.b.get(i2))).booleanValue()) {
                                    arrayList.add(((ilq) ((ils) this.c).a.get(i2)).a());
                                }
                                i2++;
                            }
                            return ivc.S(arrayList).a(new hxl(4), jxv.a);
                        }
                        final lkq lkqVar = (lkq) obj;
                        final ?? r0 = this.b;
                        final int i6 = this.a;
                        final ils ilsVar = (ils) this.c;
                        return ivc.Q(r0).b(jbn.b(new jxc() { // from class: ilr
                            @Override // defpackage.jxc
                            public final jyz a() {
                                jyz E = ivc.E(lkqVar);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if (((Boolean) ivc.M((Future) r0.get(i7))).booleanValue()) {
                                        E = jwu.h(E, jbn.c(new ifl((ilq) ils.this.a.get(i7), 11)), jxv.a);
                                    }
                                }
                                return E;
                            }
                        }), ilsVar.b);
                    }
                    gfs gfsVar = (gfs) obj;
                    boolean i7 = gfn.i(gfsVar);
                    int i8 = this.a;
                    Object obj2 = this.c;
                    Object obj3 = this.b;
                    if (i7 && gfn.h(gfsVar)) {
                        gfn gfnVar = (gfn) obj3;
                        gok gokVar = gfnVar.e;
                        gfr gfrVar = gfsVar.b;
                        if (gfrVar == null) {
                            gfrVar = gfr.g;
                        }
                        return jbx.d(gokVar.j(gfrVar, i8)).e(new gfa(i4), jxv.a).a(Exception.class, new gfa(5), jxv.a).f(new enm(gfnVar, gfsVar, (gfj) obj2, i8, 2), jxv.a);
                    }
                    return ((gfn) obj3).b((gfj) obj2, i8);
                }
                gfs gfsVar2 = (gfs) obj;
                boolean i9 = gfn.i(gfsVar2);
                Object obj4 = this.b;
                if (i9 && gfn.h(gfsVar2)) {
                    gok gokVar2 = ((gfn) obj4).e;
                    gfr gfrVar2 = gfsVar2.b;
                    if (gfrVar2 == null) {
                        gfrVar2 = gfr.g;
                    }
                    return jbx.d(gokVar2.j(gfrVar2, this.a)).e(new gfa(i4), jxv.a).a(Exception.class, new gfa(i3), jxv.a).f(new gfl(obj4, gfsVar2, this.c, i2), jxv.a);
                }
                return ivc.E(((gfn) obj4).a());
            }
            Throwable th = (Throwable) obj;
            ((jni) ((jni) ((jni) eqk.a.g()).i(th)).j("com/google/android/apps/adm/integrations/spot/markaslost/MarkAsLostHandlerImpl", "lambda$updateLostState$4", (char) 162, "MarkAsLostHandlerImpl.java")).r("Error updating the lost state.");
            if (this.a == 3) {
                lnbVar = lnb.MARK_LOST_FAILED;
            } else {
                lnbVar = lnb.MARK_FOUND_FAILED;
            }
            Object obj5 = this.c;
            Object obj6 = this.b;
            ((eqk) obj5).h.c(lnbVar, jdl.a, (lqd) obj6);
            return iuu.r(th);
        }
        gfs gfsVar3 = (gfs) obj;
        if (!gfn.j(gfsVar3, (gfj) this.c)) {
            return ivc.D(new gfk());
        }
        Object obj7 = this.b;
        gfr gfrVar3 = gfsVar3.b;
        if (gfrVar3 == null) {
            gfrVar3 = gfr.g;
        }
        return ((gfn) obj7).e.j(gfrVar3, this.a);
    }

    public /* synthetic */ gfm(ils ilsVar, List list, int i, int i2) {
        this.d = i2;
        this.c = ilsVar;
        this.b = list;
        this.a = i;
    }

    public /* synthetic */ gfm(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }
}
