package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpr extends ljn implements lkr {
    public static final lpr c;
    private static volatile lkx d;
    public String a = "";
    public int b;

    static {
        lpr lprVar = new lpr();
        c = lprVar;
        ljn.w(lpr.class, lprVar);
    }

    private lpr() {
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
                                synchronized (lpr.class) {
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
                return new lpr();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
