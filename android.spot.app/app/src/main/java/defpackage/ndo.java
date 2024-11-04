package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndo extends ljn implements lkr {
    public static final ndo e;
    private static volatile lkx f;
    public int a;
    public int b;
    public long c;
    public ndj d;

    static {
        ndo ndoVar = new ndo();
        e = ndoVar;
        ljn.w(ndo.class, ndoVar);
    }

    private ndo() {
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
                                synchronized (ndo.class) {
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
                return new ndo();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
