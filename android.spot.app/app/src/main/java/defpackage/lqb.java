package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqb extends ljn implements lkr {
    public static final lqb b;
    private static volatile lkx d;
    public int a;
    private int c;

    static {
        lqb lqbVar = new lqb();
        b = lqbVar;
        ljn.w(lqb.class, lqbVar);
    }

    private lqb() {
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
                                synchronized (lqb.class) {
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
                return new lqb();
            }
            return new llb(b, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a"});
        }
        return (byte) 1;
    }
}
