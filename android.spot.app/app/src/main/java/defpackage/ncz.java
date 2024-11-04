package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncz extends ljn implements lkr {
    public static final ncz e;
    private static volatile lkx f;
    public int a;
    public double b;
    public ncq c;
    public int d;

    static {
        ncz nczVar = new ncz();
        e = nczVar;
        ljn.w(ncz.class, nczVar);
    }

    private ncz() {
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
                                synchronized (ncz.class) {
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
                return new ncz();
            }
            return new llb(e, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0000\u0002ဉ\u0000\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
