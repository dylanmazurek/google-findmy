package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqr extends ljn implements lkr {
    public static final lqr g;
    private static volatile lkx h;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public lln e;
    public lqq f;

    static {
        lqr lqrVar = new lqr();
        g = lqrVar;
        ljn.w(lqr.class, lqrVar);
    }

    private lqr() {
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
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (lqr.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(g);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return g;
                    }
                    return new ljh(g);
                }
                return new lqr();
            }
            return new llb(g, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\f\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"c", "b", "a", kym.class, lqh.class, "d", "e", "f"});
        }
        return (byte) 1;
    }
}
