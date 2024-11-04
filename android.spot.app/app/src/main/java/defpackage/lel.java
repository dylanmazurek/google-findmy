package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lel extends ljn implements lkr {
    public static final lel g;
    private static volatile lkx h;
    public int a;
    public lfl c;
    public lfh e;
    public String b = "";
    public ljv d = lla.a;
    public String f = "";

    static {
        lel lelVar = new lel();
        g = lelVar;
        ljn.w(lel.class, lelVar);
    }

    private lel() {
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
                                synchronized (lel.class) {
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
                return new lel();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဉ\u0002\u0005ဈ\u0004\u0006ဉ\u0001", new Object[]{"a", "b", "d", "e", "f", "c"});
        }
        return (byte) 1;
    }
}
