package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lna extends ljn implements lkr {
    public static final lna d;
    private static volatile lkx e;
    public int a;
    public int b;
    public String c = "";

    static {
        lna lnaVar = new lna();
        d = lnaVar;
        ljn.w(lna.class, lnaVar);
    }

    private lna() {
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
                                synchronized (lna.class) {
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
                return new lna();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"a", "b", lgb.r, "c"});
        }
        return (byte) 1;
    }
}
