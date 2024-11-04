package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndc extends ljn implements lkr {
    public static final ndc k;
    private static volatile lkx l;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public ndb j;

    static {
        ndc ndcVar = new ndc();
        k = ndcVar;
        ljn.w(ndc.class, ndcVar);
    }

    private ndc() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                return null;
                            }
                            lkx lkxVar = l;
                            if (lkxVar == null) {
                                synchronized (ndc.class) {
                                    lkxVar = l;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(k);
                                        l = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return k;
                    }
                    return new ljh(k);
                }
                return new ndc();
            }
            return new llb(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007\tဉ\b", new Object[]{"a", "b", "c", lnj.k, "d", "e", lnj.j, "f", "g", "h", "i", "j"});
        }
        return (byte) 1;
    }
}
