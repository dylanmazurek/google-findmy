package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldd extends ljn implements lkr {
    public static final ldd e;
    private static volatile lkx f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        ldd lddVar = new ldd();
        e = lddVar;
        ljn.w(ldd.class, lddVar);
    }

    private ldd() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (ldd.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new ldd();
            }
            return new llb(e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\u083f\u0000\u0004ဈ\u0000", new Object[]{"c", "b", "a", ldc.class, kys.g, "d"});
        }
        return (byte) 1;
    }
}
