package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgv extends ljn implements lkr {
    public static final lgv e;
    private static volatile lkx g;
    public int a;
    public long b;
    public lgu c;
    public int d;
    private int f;

    static {
        lgv lgvVar = new lgv();
        e = lgvVar;
        ljn.w(lgv.class, lgvVar);
    }

    private lgv() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (lgv.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new lgv();
            }
            return new llb(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"f", "a", lgb.k, "b", "c", "d", lgb.e});
        }
        return (byte) 1;
    }
}
