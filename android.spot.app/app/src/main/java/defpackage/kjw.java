package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjw extends ljn implements lkr {
    public static final kjw e;
    private static volatile lkx g;
    public int a;
    public kju b;
    public lim c = lim.b;
    public lim d = lim.b;
    private int f;

    static {
        kjw kjwVar = new kjw();
        e = kjwVar;
        ljn.w(kjw.class, kjwVar);
    }

    private kjw() {
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
                                synchronized (kjw.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new kjw();
            }
            return new llb(e, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"f", "a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
