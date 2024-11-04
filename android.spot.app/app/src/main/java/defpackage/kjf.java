package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjf extends ljn implements lkr {
    public static final kjf d;
    private static volatile lkx f;
    public int a;
    public kjd b;
    public lim c = lim.b;
    private int e;

    static {
        kjf kjfVar = new kjf();
        d = kjfVar;
        ljn.w(kjf.class, kjfVar);
    }

    private kjf() {
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
                                synchronized (kjf.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new kjf();
            }
            return new llb(d, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"e", "a", "b", "c"});
        }
        return (byte) 1;
    }
}
