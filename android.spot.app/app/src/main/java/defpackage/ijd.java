package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijd extends ljn implements lkr {
    public static final ijd d;
    private static volatile lkx e;
    public int a;
    public lim b = lim.b;
    public lim c = lim.b;

    static {
        ijd ijdVar = new ijd();
        d = ijdVar;
        ljn.w(ijd.class, ijdVar);
    }

    private ijd() {
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
                                synchronized (ijd.class) {
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
                return new ijd();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
