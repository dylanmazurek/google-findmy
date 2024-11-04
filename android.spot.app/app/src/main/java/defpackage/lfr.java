package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfr extends ljn implements lkr {
    public static final lfr d;
    private static volatile lkx f;
    public Object b;
    private int e;
    public int a = 0;
    public lim c = lim.b;

    static {
        lfr lfrVar = new lfr();
        d = lfrVar;
        ljn.w(lfr.class, lfrVar);
    }

    private lfr() {
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
                                synchronized (lfr.class) {
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
                return new lfr();
            }
            return new llb(d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002ည\u0000\u0003=\u0000", new Object[]{"b", "a", "e", lfs.class, "c"});
        }
        return (byte) 1;
    }
}
