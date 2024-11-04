package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwp extends ljn implements lkr {
    public static final hwp e;
    private static volatile lkx g;
    public String a = "";
    public lim b = lim.b;
    public String c = "";
    public long d;
    private int f;

    static {
        hwp hwpVar = new hwp();
        e = hwpVar;
        ljn.w(hwp.class, hwpVar);
    }

    private hwp() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (hwp.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new hwp();
            }
            return new llb(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
