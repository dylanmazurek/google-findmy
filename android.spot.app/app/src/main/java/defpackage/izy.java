package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izy extends ljn implements lkr {
    public static final izy b;
    private static volatile lkx d;
    public int a = 1;
    private int c;

    static {
        izy izyVar = new izy();
        b = izyVar;
        ljn.w(izy.class, izyVar);
    }

    private izy() {
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
                                synchronized (izy.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new izy();
            }
            return new llb(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0003", new Object[]{"c", "a", gek.d});
        }
        return (byte) 1;
    }
}
