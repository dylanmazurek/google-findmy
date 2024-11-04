package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eef implements ele {
    @Override // defpackage.ele
    public final lpz a(lqc lqcVar) {
        lqcVar.getClass();
        lpz l = bsf.l(lqcVar);
        if (l == null) {
            ljh k = lpz.e.k();
            k.getClass();
            ljn q = k.q();
            q.getClass();
            return (lpz) q;
        }
        return l;
    }

    @Override // defpackage.ele
    public final boolean b(lqc lqcVar) {
        lqcVar.getClass();
        if (bsf.l(lqcVar) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ele
    public final ljh c(ljh ljhVar, ljh ljhVar2) {
        lpw lpwVar;
        lqc lqcVar = (lqc) ljhVar.b;
        if (lqcVar.b == 10) {
            lpwVar = (lpw) lqcVar.c;
        } else {
            lpwVar = lpw.i;
        }
        ljh ljhVar3 = (ljh) lpwVar.z(5);
        ljhVar3.w(lpwVar);
        if (!ljhVar3.b.y()) {
            ljhVar3.t();
        }
        lpw lpwVar2 = (lpw) ljhVar3.b;
        lpz lpzVar = (lpz) ljhVar2.q();
        lpw lpwVar3 = lpw.i;
        lpzVar.getClass();
        lpwVar2.h = lpzVar;
        lpwVar2.a |= 64;
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lqc lqcVar2 = (lqc) ljhVar.b;
        lpw lpwVar4 = (lpw) ljhVar3.q();
        lpwVar4.getClass();
        lqcVar2.c = lpwVar4;
        lqcVar2.b = 10;
        return ljhVar;
    }
}
