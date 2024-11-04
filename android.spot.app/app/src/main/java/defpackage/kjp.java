package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjp extends ljn implements lkr {
    public static final kjp c;
    private static volatile lkx e;
    public int a;
    public kjq b;
    private int d;

    static {
        kjp kjpVar = new kjp();
        c = kjpVar;
        ljn.w(kjp.class, kjpVar);
    }

    private kjp() {
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
                                synchronized (kjp.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new kjp();
            }
            return new llb(c, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"d", "a", "b"});
        }
        return (byte) 1;
    }
}
