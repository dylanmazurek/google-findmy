package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqn extends ljn implements lkr {
    public static final lqn c;
    private static volatile lkx d;
    public int a;
    public lqt b;

    static {
        lqn lqnVar = new lqn();
        c = lqnVar;
        ljn.w(lqn.class, lqnVar);
    }

    private lqn() {
        ljo ljoVar = ljo.a;
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
                                synchronized (lqn.class) {
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
                return new lqn();
            }
            return new llb(c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
