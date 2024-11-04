package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsq implements lsm {
    private static final Object a = new Object();
    private volatile lsm b;
    private volatile Object c = a;

    private lsq(lsm lsmVar) {
        this.b = lsmVar;
    }

    public static lsm b(lsm lsmVar) {
        if (!(lsmVar instanceof lsq) && !(lsmVar instanceof lsg)) {
            return new lsq(lsmVar);
        }
        return lsmVar;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final Object a() {
        Object obj = this.c;
        if (obj == a) {
            lsm lsmVar = this.b;
            if (lsmVar == null) {
                return this.c;
            }
            Object a2 = lsmVar.a();
            this.c = a2;
            this.b = null;
            return a2;
        }
        return obj;
    }
}
