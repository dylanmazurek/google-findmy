package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmw extends ljn implements lkr {
    public static final lmw d;
    private static volatile lkx e;
    public int a;
    public int b;
    public int c;

    static {
        lmw lmwVar = new lmw();
        d = lmwVar;
        ljn.w(lmw.class, lmwVar);
    }

    private lmw() {
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
                                synchronized (lmw.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new lmw();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"a", "b", kys.e, "c", kys.d});
        }
        return (byte) 1;
    }
}
