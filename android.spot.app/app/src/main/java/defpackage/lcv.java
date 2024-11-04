package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcv extends ljn implements lkr {
    public static final lcv c;
    private static volatile lkx d;
    public int a;
    public int b;

    static {
        lcv lcvVar = new lcv();
        c = lcvVar;
        ljn.w(lcv.class, lcvVar);
    }

    private lcv() {
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
                                synchronized (lcv.class) {
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
                return new lcv();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004᠌\u0003", new Object[]{"a", "b", lcw.b});
        }
        return (byte) 1;
    }
}
