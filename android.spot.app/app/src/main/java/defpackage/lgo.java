package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgo extends ljn implements lkr {
    public static final lgo c;
    private static volatile lkx e;
    public String a = "";
    public boolean b;
    private int d;

    static {
        lgo lgoVar = new lgo();
        c = lgoVar;
        ljn.w(lgo.class, lgoVar);
    }

    private lgo() {
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
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (lgo.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new lgo();
            }
            return new llb(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0002\u0002ဈ\u0000", new Object[]{"d", "b", "a"});
        }
        return (byte) 1;
    }
}
