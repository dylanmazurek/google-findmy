package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpj extends ljn implements lkr {
    public static final lpj b;
    private static volatile lkx c;
    public lim a = lim.b;

    static {
        lpj lpjVar = new lpj();
        b = lpjVar;
        ljn.w(lpj.class, lpjVar);
    }

    private lpj() {
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
                                synchronized (lpj.class) {
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
                return new lpj();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
