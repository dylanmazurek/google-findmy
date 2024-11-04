package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyq extends ljn implements lkr {
    public static final kyq g;
    private static volatile lkx h;
    public int a;
    public Object c;
    public lln f;
    public int b = 0;
    public lim d = lim.b;
    public lim e = lim.b;

    static {
        kyq kyqVar = new kyq();
        g = kyqVar;
        ljn.w(kyq.class, kyqVar);
    }

    private kyq() {
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
                                synchronized (kyq.class) {
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
                return new kyq();
            }
            return new llb(g, "\u0000\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001\n\u00037\u0000\u0004\n\u0006<\u0000\bဉ\u0000\t<\u0000\n:\u0000", new Object[]{"c", "b", "a", "d", "e", kzr.class, "f", lln.class});
        }
        return (byte) 1;
    }
}
