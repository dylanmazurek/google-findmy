package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khx extends ljn implements lkr {
    public static final khx b;
    private static volatile lkx c;
    public int a;

    static {
        khx khxVar = new khx();
        b = khxVar;
        ljn.w(khx.class, khxVar);
    }

    private khx() {
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
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (khx.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new khx();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
