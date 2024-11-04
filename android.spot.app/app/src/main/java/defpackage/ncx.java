package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncx extends ljn implements lkr {
    public static final ncx e;
    private static volatile lkx f;
    public int a;
    public int b;
    public ncz c;
    public ncl d;

    static {
        ncx ncxVar = new ncx();
        e = ncxVar;
        ljn.w(ncx.class, ncxVar);
    }

    private ncx() {
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
                                synchronized (ncx.class) {
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
                return new ncx();
            }
            return new llb(e, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0003ဉ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", "d", "c"});
        }
        return (byte) 1;
    }
}
