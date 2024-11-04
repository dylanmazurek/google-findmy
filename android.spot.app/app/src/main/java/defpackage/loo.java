package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loo extends ljn implements lkr {
    public static final loo d;
    private static volatile lkx f;
    public int a;
    public int b;
    public int c;
    private int e;

    static {
        loo looVar = new loo();
        d = looVar;
        ljn.w(loo.class, looVar);
    }

    private loo() {
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
                                synchronized (loo.class) {
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
                return new loo();
            }
            return new llb(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"e", "a", "b", lnj.g, "c"});
        }
        return (byte) 1;
    }
}
