package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxw extends ljn implements lkr {
    public static final hxw g;
    private static volatile lkx h;
    public int a;
    public long e;
    public String b = "";
    public lim c = lim.b;
    public String d = "";
    public ljv f = lla.a;

    static {
        hxw hxwVar = new hxw();
        g = hxwVar;
        ljn.w(hxw.class, hxwVar);
    }

    private hxw() {
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
                                synchronized (hxw.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(g);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return g;
                    }
                    return new ljh(g);
                }
                return new hxw();
            }
            return new llb(g, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", hxx.class});
        }
        return (byte) 1;
    }
}
