package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsg implements lsm, lqz {
    private static final Object a = new Object();
    private volatile lsm b;
    private volatile Object c = a;

    private lsg(lsm lsmVar) {
        this.b = lsmVar;
    }

    public static lqz b(lsm lsmVar) {
        if (lsmVar instanceof lqz) {
            return (lqz) lsmVar;
        }
        lsmVar.getClass();
        return new lsg(lsmVar);
    }

    public static lqz c(mko mkoVar) {
        return b(mjo.P(mkoVar));
    }

    public static lsm d(lsm lsmVar) {
        lsmVar.getClass();
        if (lsmVar instanceof lsg) {
            return lsmVar;
        }
        return new lsg(lsmVar);
    }

    @Override // defpackage.mko, defpackage.mkn
    public final Object a() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.c;
                if (obj == obj2) {
                    obj = this.b.a();
                    Object obj3 = this.c;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }
}
