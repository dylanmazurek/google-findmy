package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzr extends ljn implements lkr {
    public static final kzr c;
    private static volatile lkx d;
    public lim a = lim.b;
    public lim b = lim.b;

    static {
        kzr kzrVar = new kzr();
        c = kzrVar;
        ljn.w(kzr.class, kzrVar);
    }

    private kzr() {
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
                                synchronized (kzr.class) {
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
                return new kzr();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004\n\u0005\n", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
