package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjx extends ljn implements lkr {
    public static final kjx e;
    private static volatile lkx f;
    public int a;
    public kjy b;
    public int c;
    public lim d = lim.b;

    static {
        kjx kjxVar = new kjx();
        e = kjxVar;
        ljn.w(kjx.class, kjxVar);
    }

    private kjx() {
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
                                synchronized (kjx.class) {
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
                return new kjx();
            }
            return new llb(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
