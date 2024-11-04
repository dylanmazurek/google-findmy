package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqd extends ljn implements lkr {
    public static final lqd d;
    private static volatile lkx e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        lqd lqdVar = new lqd();
        d = lqdVar;
        ljn.w(lqd.class, lqdVar);
    }

    private lqd() {
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
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (lqd.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new lqd();
            }
            return new llb(d, "\u0000\u0004\u0001\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001<\u0000\u0002\f\u0003<\u0000\u0005<\u0000", new Object[]{"b", "a", lpp.class, "c", lqu.class, lql.class});
        }
        return (byte) 1;
    }
}
