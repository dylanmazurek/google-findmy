package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkc extends ljn implements lkr {
    public static final kkc b;
    private static volatile lkx c;
    public int a;

    static {
        kkc kkcVar = new kkc();
        b = kkcVar;
        ljn.w(kkc.class, kkcVar);
    }

    private kkc() {
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
                                synchronized (kkc.class) {
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
                return new kkc();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
