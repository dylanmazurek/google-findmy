package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnf extends ljn implements lkr {
    public static final lnf g;
    private static volatile lkx h;
    public int a;
    public boolean b;
    public int c;
    public lne d;
    public int e;
    public boolean f;

    static {
        lnf lnfVar = new lnf();
        g = lnfVar;
        ljn.w(lnf.class, lnfVar);
    }

    private lnf() {
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
                                synchronized (lnf.class) {
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
                return new lnf();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0002\u0003᠌\u0003\u0004᠌\u0001\u0005ဇ\u0004", new Object[]{"a", "b", "d", "e", gek.u, "c", kys.b, "f"});
        }
        return (byte) 1;
    }
}
