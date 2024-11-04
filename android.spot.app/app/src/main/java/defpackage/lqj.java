package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqj extends ljn implements lkr {
    public static final lqj e;
    private static volatile lkx f;
    public int a;
    public lqd b;
    public lpo c;
    public lqt d;

    static {
        lqj lqjVar = new lqj();
        e = lqjVar;
        ljn.w(lqj.class, lqjVar);
    }

    private lqj() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (lqj.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new lqj();
            }
            return new llb(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
