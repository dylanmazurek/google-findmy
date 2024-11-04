package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqy extends ljn implements lkr {
    public static final lqy d;
    private static volatile lkx f;
    public lqt a;
    public lqc b;
    public lqx c;
    private int e;

    static {
        lqy lqyVar = new lqy();
        d = lqyVar;
        ljn.w(lqy.class, lqyVar);
    }

    private lqy() {
        lla llaVar = lla.a;
        lkh lkhVar = lkh.a;
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
                                synchronized (lqy.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new lqy();
            }
            return new llb(d, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"e", "a", "b", "c"});
        }
        return (byte) 1;
    }
}
