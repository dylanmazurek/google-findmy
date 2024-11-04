package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqx extends ljn implements lkr {
    public static final lqx c;
    private static volatile lkx d;
    public ljv a;
    public ljv b;

    static {
        lqx lqxVar = new lqx();
        c = lqxVar;
        ljn.w(lqx.class, lqxVar);
    }

    private lqx() {
        lla llaVar = lla.a;
        this.a = llaVar;
        this.b = llaVar;
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
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (lqx.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new lqx();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", lqi.class, "b", lqi.class});
        }
        return (byte) 1;
    }
}
