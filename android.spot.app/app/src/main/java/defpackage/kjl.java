package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjl extends ljn implements lkr {
    public static final kjl e;
    private static volatile lkx f;
    public String a = "";
    public int b;
    public int c;
    public int d;

    static {
        kjl kjlVar = new kjl();
        e = kjlVar;
        ljn.w(kjl.class, kjlVar);
    }

    private kjl() {
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
                                synchronized (kjl.class) {
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
                return new kjl();
            }
            return new llb(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
