package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpr extends ljn implements lkr {
    public static final hpr f;
    private static volatile lkx h;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public float e;
    private int g;

    static {
        hpr hprVar = new hpr();
        f = hprVar;
        ljn.w(hpr.class, hprVar);
    }

    private hpr() {
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
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (hpr.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new hpr();
            }
            return new llb(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
        }
        return (byte) 1;
    }
}
