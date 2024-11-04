package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwt extends ljn implements lkr {
    public static final hwt d;
    private static volatile lkx e;
    public int a;
    public ljv b = lla.a;
    public String c = "";

    static {
        hwt hwtVar = new hwt();
        d = hwtVar;
        ljn.w(hwt.class, hwtVar);
    }

    private hwt() {
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
                                synchronized (hwt.class) {
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
                return new hwt();
            }
            return new llb(d, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
