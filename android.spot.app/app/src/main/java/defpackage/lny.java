package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lny extends ljn implements lkr {
    public static final lny c;
    private static volatile lkx d;
    public int a;
    public lim b = lim.b;

    static {
        lny lnyVar = new lny();
        c = lnyVar;
        ljn.w(lny.class, lnyVar);
    }

    private lny() {
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
                                synchronized (lny.class) {
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
                return new lny();
            }
            return new llb(c, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ည\u0003", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
