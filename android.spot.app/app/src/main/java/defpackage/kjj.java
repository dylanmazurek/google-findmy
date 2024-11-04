package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjj extends ljn implements lkr {
    public static final kjj f;
    private static volatile lkx g;
    public int a;
    public kjh b;
    public int c;
    public int d;
    public int e;

    static {
        kjj kjjVar = new kjj();
        f = kjjVar;
        ljn.w(kjj.class, kjjVar);
    }

    private kjj() {
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
                                synchronized (kjj.class) {
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
                return new kjj();
            }
            return new llb(f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "b", "c", "d", "e"});
        }
        return (byte) 1;
    }
}
