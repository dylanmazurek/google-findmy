package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lah extends ljn implements lkr {
    public static final lah c;
    private static volatile lkx d;
    public lim a = lim.b;
    public boolean b;

    static {
        lah lahVar = new lah();
        c = lahVar;
        ljn.w(lah.class, lahVar);
    }

    private lah() {
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
                                synchronized (lah.class) {
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
                return new lah();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0007", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
