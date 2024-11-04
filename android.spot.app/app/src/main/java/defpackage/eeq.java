package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeq {
    public final efy a;
    public final mkt b;
    public final ewf c;
    public final ejr d;
    public final int e;
    public final apc f;
    private final ele g;

    public eeq(efy efyVar, int i, ewf ewfVar, apc apcVar, ejr ejrVar, ele eleVar) {
        efyVar.getClass();
        ewfVar.getClass();
        apcVar.getClass();
        ejrVar.getClass();
        eleVar.getClass();
        this.a = efyVar;
        this.e = 1;
        this.c = ewfVar;
        this.f = apcVar;
        this.d = ejrVar;
        this.g = eleVar;
        this.b = new mla(new ctm(this, 10));
    }

    public static final dyi b(eif eifVar) {
        if (eifVar != null) {
            int ordinal = eifVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new mku();
                    }
                } else {
                    return dyi.DISABLED;
                }
            } else {
                return dyi.AVAILABLE;
            }
        }
        return dyi.UNAVAILABLE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean c(lqy lqyVar) {
        lpt lptVar;
        lqc lqcVar = lqyVar.b;
        if (lqcVar == null) {
            lqcVar = lqc.j;
        }
        if (lqcVar.b == 3) {
            lptVar = (lpt) lqcVar.c;
        } else {
            lptVar = lpt.C;
        }
        lqe b = lqe.b(lptVar.t);
        if (b == null) {
            b = lqe.UNRECOGNIZED;
        }
        if (b != lqe.RESPONSE_NO_ERROR) {
            return true;
        }
        return false;
    }

    public final dyi a(lqc lqcVar, Map map, ejy ejyVar) {
        if (this.g.b(lqcVar)) {
            return b((eif) map.get(ejyVar));
        }
        return dyi.UNAVAILABLE;
    }
}
