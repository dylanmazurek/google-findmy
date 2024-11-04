package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcj extends ljn implements lkr {
    public static final lcj f;
    private static volatile lkx g;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        lcj lcjVar = new lcj();
        f = lcjVar;
        ljn.w(lcj.class, lcjVar);
    }

    private lcj() {
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
                                synchronized (lcj.class) {
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
                return new lcj();
            }
            ljq ljqVar = kys.o;
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"a", "b", "c", kys.n, "d", ljqVar, "e", ljqVar});
        }
        return (byte) 1;
    }
}
