package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alw {
    public static final agt a(cfk cfkVar, Object obj, abi abiVar) {
        cfc cfcVar = (cfc) abiVar.f(cgr.a);
        Object g = abiVar.g();
        if (g == abh.a) {
            if (cfkVar.n()) {
                obj = cfkVar.d();
            }
            Object aeeVar = new aee(obj, agw.a);
            abiVar.w(aeeVar);
            g = aeeVar;
        }
        adt adtVar = (adt) g;
        boolean D = abiVar.D(cfkVar) | abiVar.D(cfcVar);
        Object g2 = abiVar.g();
        if (D || g2 == abh.a) {
            g2 = new alv(cfkVar, cfcVar, adtVar);
            abiVar.w(g2);
        }
        act.b(cfkVar, cfcVar, (moh) g2, abiVar);
        return adtVar;
    }
}
