package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgz extends ljn implements lkr {
    public static final lgz f;
    private static volatile lkx g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        lgz lgzVar = new lgz();
        f = lgzVar;
        ljn.w(lgz.class, lgzVar);
    }

    private lgz() {
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
                                synchronized (lgz.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new lgz();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"a", "b", lgb.f, "c", lgb.c, "d", lgb.a, "e", lgb.l});
        }
        return (byte) 1;
    }
}
