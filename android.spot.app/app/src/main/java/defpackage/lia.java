package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lia extends ljn implements lkr {
    public static final lia b;
    private static volatile lkx c;
    public lim a = lim.b;

    static {
        lia liaVar = new lia();
        b = liaVar;
        ljn.w(lia.class, liaVar);
    }

    private lia() {
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
                                synchronized (lia.class) {
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
                return new lia();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
