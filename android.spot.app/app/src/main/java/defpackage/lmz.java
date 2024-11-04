package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmz extends ljn implements lkr {
    public static final lmz c;
    private static volatile lkx d;
    public int a;
    public int b;

    static {
        lmz lmzVar = new lmz();
        c = lmzVar;
        ljn.w(lmz.class, lmzVar);
    }

    private lmz() {
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
                                synchronized (lmz.class) {
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
                return new lmz();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"a", "b", lgb.q});
        }
        return (byte) 1;
    }
}
