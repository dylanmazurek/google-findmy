package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnh extends ljn implements lkr {
    public static final lnh g;
    private static volatile lkx h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";

    static {
        lnh lnhVar = new lnh();
        g = lnhVar;
        ljn.w(lnh.class, lnhVar);
    }

    private lnh() {
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
                                synchronized (lnh.class) {
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
                return new lnh();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003\u0006᠌\u0005\u0007ဈ\u0006", new Object[]{"a", "b", lnj.c, "c", lnj.b, "d", lnj.a, "e", lgb.u, "f"});
        }
        return (byte) 1;
    }
}
