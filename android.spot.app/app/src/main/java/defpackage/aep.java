package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aep extends aby {
    public aep(mnw mnwVar) {
        super(mnwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aby
    public final agy a(aeq aeqVar, agy agyVar) {
        acs acsVar = null;
        if (agyVar instanceof acs) {
            if (aeqVar.d) {
                acsVar = (acs) agyVar;
                acsVar.a.h(aeqVar.a());
            }
        } else if (agyVar instanceof agv) {
            if ((aeqVar.b || aeqVar.e != null) && !aeqVar.d) {
                agv agvVar = (agv) agyVar;
                if (amr.i(aeqVar.a(), agvVar.a)) {
                    acsVar = agvVar;
                }
            }
        } else if (agyVar instanceof acg) {
            throw null;
        }
        if (acsVar == null) {
            if (aeqVar.d) {
                Object obj = aeqVar.e;
                agk agkVar = aeqVar.c;
                if (agkVar == null) {
                    agkVar = agw.a;
                }
                return new acs(new aee(obj, agkVar));
            }
            return new agv(aeqVar.a());
        }
        return acsVar;
    }

    public abstract aeq b(Object obj);

    public final aeq c(Object obj) {
        aeq b = b(obj);
        b.f = false;
        return b;
    }
}
