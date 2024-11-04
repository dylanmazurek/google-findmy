package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqo extends ljn implements lkr {
    public static final lqo b;
    private static volatile lkx c;
    public ljv a = lla.a;

    static {
        lqo lqoVar = new lqo();
        b = lqoVar;
        ljn.w(lqo.class, lqoVar);
    }

    private lqo() {
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
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (lqo.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new lqo();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", lqc.class});
        }
        return (byte) 1;
    }
}
