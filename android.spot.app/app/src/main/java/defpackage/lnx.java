package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnx extends ljn implements lkr {
    public static final lnx b;
    private static volatile lkx d;
    public int a;
    private int c;

    static {
        lnx lnxVar = new lnx();
        b = lnxVar;
        ljn.w(lnx.class, lnxVar);
    }

    private lnx() {
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
                                synchronized (lnx.class) {
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
                return new lnx();
            }
            return new llb(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003᠌\u0003", new Object[]{"c", "a", lnj.d});
        }
        return (byte) 1;
    }
}
