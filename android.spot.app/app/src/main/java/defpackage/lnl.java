package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnl extends ljn implements lkr {
    public static final lnl b;
    private static volatile lkx c;
    public lkl a = lkl.a;

    static {
        lnl lnlVar = new lnl();
        b = lnlVar;
        ljn.w(lnl.class, lnlVar);
    }

    private lnl() {
        lla llaVar = lla.a;
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
                                synchronized (lnl.class) {
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
                return new lnl();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", lnk.a});
        }
        return (byte) 1;
    }
}
