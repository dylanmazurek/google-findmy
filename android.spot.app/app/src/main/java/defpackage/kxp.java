package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxp extends ljn implements lkr {
    public static final kxp c;
    private static volatile lkx d;
    public int a;
    public int b;

    static {
        kxp kxpVar = new kxp();
        c = kxpVar;
        ljn.w(kxp.class, kxpVar);
    }

    private kxp() {
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
                                synchronized (kxp.class) {
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
                return new kxp();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"a", "b", gek.t});
        }
        return (byte) 1;
    }
}
