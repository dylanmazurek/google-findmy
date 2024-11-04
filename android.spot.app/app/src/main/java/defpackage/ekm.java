package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekm implements ele {
    private final /* synthetic */ int a;

    public ekm(int i) {
        this.a = i;
    }

    @Override // defpackage.ele
    public final lpz a(lqc lqcVar) {
        lpt lptVar;
        if (this.a != 0) {
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            lpz lpzVar = lptVar.u;
            if (lpzVar == null) {
                return lpz.e;
            }
            return lpzVar;
        }
        if (lqcVar.b == 4) {
            return (lpz) lqcVar.c;
        }
        return lpz.e;
    }

    @Override // defpackage.ele
    public final boolean b(lqc lqcVar) {
        lpt lptVar;
        if (this.a != 0) {
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            if ((lptVar.a & 67108864) != 0) {
                return true;
            }
            return false;
        }
        if (lqcVar.b == 4) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ele
    public final ljh c(ljh ljhVar, ljh ljhVar2) {
        lpt lptVar;
        if (this.a != 0) {
            lqc lqcVar = (lqc) ljhVar.b;
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            ljh ljhVar3 = (ljh) lptVar.z(5);
            ljhVar3.w(lptVar);
            if (!ljhVar3.b.y()) {
                ljhVar3.t();
            }
            lpt lptVar2 = (lpt) ljhVar3.b;
            lpz lpzVar = (lpz) ljhVar2.q();
            ljs ljsVar = lpt.o;
            lpzVar.getClass();
            lptVar2.u = lpzVar;
            lptVar2.a |= 67108864;
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            lqc lqcVar2 = (lqc) ljhVar.b;
            lpt lptVar3 = (lpt) ljhVar3.q();
            lptVar3.getClass();
            lqcVar2.c = lptVar3;
            lqcVar2.b = 3;
            return ljhVar;
        }
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lqc lqcVar3 = (lqc) ljhVar.b;
        lpz lpzVar2 = (lpz) ljhVar2.q();
        lqc lqcVar4 = lqc.j;
        lpzVar2.getClass();
        lqcVar3.c = lpzVar2;
        lqcVar3.b = 4;
        return ljhVar;
    }
}
