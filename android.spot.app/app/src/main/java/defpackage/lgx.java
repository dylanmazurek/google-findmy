package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgx extends ljn implements lkr {
    public static final lgx e;
    private static volatile lkx g;
    public int a;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        lgx lgxVar = new lgx();
        e = lgxVar;
        ljn.w(lgx.class, lgxVar);
    }

    private lgx() {
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
                                synchronized (lgx.class) {
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
                return new lgx();
            }
            return new llb(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"f", "a", lgb.f, "b", lgb.c, "c", lgb.a, "d", lgb.l});
        }
        return (byte) 1;
    }
}
