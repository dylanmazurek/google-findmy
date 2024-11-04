package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmx extends ljn implements lkr {
    public static final lmx f;
    private static volatile lkx g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;

    static {
        lmx lmxVar = new lmx();
        f = lmxVar;
        ljn.w(lmx.class, lmxVar);
    }

    private lmx() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (lmx.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new lmx();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"a", "b", "c", "d", "e", lgb.p});
        }
        return (byte) 1;
    }
}
