package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwz extends ljn implements lkr {
    public static final kwz f;
    private static volatile lkx g;
    public int a;
    public kxc b;
    public kxc c;
    public kxd d;
    public kxi e;

    static {
        kwz kwzVar = new kwz();
        f = kwzVar;
        ljn.w(kwz.class, kwzVar);
    }

    private kwz() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (kwz.class) {
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
                return new kwz();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "d", "e", "b", "c"});
        }
        return (byte) 1;
    }
}
