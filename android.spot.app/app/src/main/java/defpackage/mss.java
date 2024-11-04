package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mss {
    public static final mnb a(mnb mnbVar, mnb mnbVar2, boolean z) {
        boolean d = d(mnbVar);
        boolean d2 = d(mnbVar2);
        if (!d && !d2) {
            return mnbVar.plus(mnbVar2);
        }
        mpn mpnVar = new mpn();
        mpnVar.a = mnbVar2;
        mnb mnbVar3 = (mnb) mnbVar.fold(mnc.a, new msr(mpnVar, z));
        if (d2) {
            mpnVar.a = ((mnb) mpnVar.a).fold(mnc.a, cbj.e);
        }
        return mnbVar3.plus((mnb) mpnVar.a);
    }

    public static final mnb b(msw mswVar, mnb mnbVar) {
        mnb mnbVar2;
        mnb a = a(mswVar.b(), mnbVar, true);
        if (msy.a) {
            mnbVar2 = a.plus(new msu(msy.c.incrementAndGet()));
        } else {
            mnbVar2 = a;
        }
        if (a != mtj.a && a.get(mmy.k) == null) {
            return mnbVar2.plus(mtj.a);
        }
        return mnbVar2;
    }

    public static final mvh c(mmx mmxVar, mnb mnbVar, Object obj) {
        mvh mvhVar = null;
        if (!(mmxVar instanceof mnm)) {
            return null;
        }
        if (mnbVar.get(mvi.a) != null) {
            mnm mnmVar = (mnm) mmxVar;
            while (true) {
                if ((mnmVar instanceof mtg) || (mnmVar = mnmVar.bO()) == null) {
                    break;
                }
                if (mnmVar instanceof mvh) {
                    mvhVar = (mvh) mnmVar;
                    break;
                }
            }
            if (mvhVar != null) {
                mvhVar.S(mnbVar, obj);
            }
        }
        return mvhVar;
    }

    public static final boolean d(mnb mnbVar) {
        return ((Boolean) mnbVar.fold(false, cbj.f)).booleanValue();
    }
}
