package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eio implements ele {
    private final Map a;

    public eio(Map map) {
        this.a = map;
    }

    @Override // defpackage.ele
    public final lpz a(lqc lqcVar) {
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqf b = lqf.b(lqdVar.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        ele eleVar = (ele) this.a.get(b);
        if (eleVar == null) {
            return lpz.e;
        }
        return eleVar.a(lqcVar);
    }

    @Override // defpackage.ele
    public final boolean b(lqc lqcVar) {
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqf b = lqf.b(lqdVar.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        if (!this.a.containsKey(b)) {
            return false;
        }
        return ((ele) this.a.get(b)).b(lqcVar);
    }

    @Override // defpackage.ele
    public final ljh c(ljh ljhVar, ljh ljhVar2) {
        lqd lqdVar = ((lqc) ljhVar.b).d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqf b = lqf.b(lqdVar.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        ele eleVar = (ele) this.a.get(b);
        if (eleVar != null) {
            return eleVar.c(ljhVar, ljhVar2);
        }
        throw new IllegalStateException("Missing SpotInfoAccessor for device type ".concat(String.valueOf(b.name())));
    }
}
