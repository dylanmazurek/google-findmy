package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpp extends ljn implements lkr {
    public static final fpp b;
    private static volatile lkx d;
    public kxn a;
    private int c;

    static {
        fpp fppVar = new fpp();
        b = fppVar;
        ljn.w(fpp.class, fppVar);
    }

    private fpp() {
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
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (fpp.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new fpp();
            }
            return new llb(b, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        }
        return (byte) 1;
    }
}