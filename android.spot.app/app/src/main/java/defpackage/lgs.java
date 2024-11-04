package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgs extends ljn implements lkr {
    public static final lgs f;
    private static volatile lkx g;
    public int a;
    public lgr b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        lgs lgsVar = new lgs();
        f = lgsVar;
        ljn.w(lgs.class, lgsVar);
    }

    private lgs() {
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
                                synchronized (lgs.class) {
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
                return new lgs();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", "c", "d", "e"});
        }
        return (byte) 1;
    }
}
