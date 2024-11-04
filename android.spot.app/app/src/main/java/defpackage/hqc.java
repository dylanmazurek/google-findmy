package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqc extends ljn implements lkr {
    public static final hqc e;
    private static volatile lkx g;
    public boolean a;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        hqc hqcVar = new hqc();
        e = hqcVar;
        ljn.w(hqc.class, hqcVar);
    }

    private hqc() {
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
                                synchronized (hqc.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new hqc();
            }
            return new llb(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"f", "a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
