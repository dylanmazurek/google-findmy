package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcg extends ljn implements lkr {
    public static final lcg c;
    private static volatile lkx d;
    public int a = 0;
    public Object b;

    static {
        lcg lcgVar = new lcg();
        c = lcgVar;
        ljn.w(lcg.class, lcgVar);
    }

    private lcg() {
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
                                synchronized (lcg.class) {
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
                return new lcg();
            }
            return new llb(c, "\u0001\t\u0001\u0000\u0001\n\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"b", "a", lci.class, lck.class, lbv.class, lda.class, lcf.class, ldj.class, lcp.class, lcl.class, lcm.class});
        }
        return (byte) 1;
    }
}
