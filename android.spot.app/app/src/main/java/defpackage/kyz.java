package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyz extends ljn implements lkr {
    public static final kyz c;
    private static volatile lkx d;
    public lim a = lim.b;
    public lim b = lim.b;

    static {
        kyz kyzVar = new kyz();
        c = kyzVar;
        ljn.w(kyz.class, kyzVar);
    }

    private kyz() {
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
                                synchronized (kyz.class) {
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
                return new kyz();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}