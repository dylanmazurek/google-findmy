package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgn extends ljn implements lkr {
    public static final lgn d;
    private static volatile lkx f;
    public long a;
    public long b;
    public ljv c = lla.a;
    private int e;

    static {
        lgn lgnVar = new lgn();
        d = lgnVar;
        ljn.w(lgn.class, lgnVar);
    }

    private lgn() {
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
                                synchronized (lgn.class) {
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
                return new lgn();
            }
            return new llb(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"e", "a", "b", "c", lgw.class});
        }
        return (byte) 1;
    }
}
