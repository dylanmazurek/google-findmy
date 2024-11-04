package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxx extends ljn implements lkr {
    public static final hxx e;
    private static volatile lkx f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        hxx hxxVar = new hxx();
        e = hxxVar;
        ljn.w(hxx.class, hxxVar);
    }

    private hxx() {
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
                                synchronized (hxx.class) {
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
                return new hxx();
            }
            return new llb(e, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"c", "b", "a", "d"});
        }
        return (byte) 1;
    }
}
