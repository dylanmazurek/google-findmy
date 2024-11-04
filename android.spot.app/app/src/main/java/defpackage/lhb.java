package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhb extends ljn implements lkr {
    public static final lhb b;
    private static volatile lkx d;
    public boolean a;
    private int c;

    static {
        lhb lhbVar = new lhb();
        b = lhbVar;
        ljn.w(lhb.class, lhbVar);
    }

    private lhb() {
        lla llaVar = lla.a;
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
                                synchronized (lhb.class) {
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
                return new lhb();
            }
            return new llb(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0000", new Object[]{"c", "a"});
        }
        return (byte) 1;
    }
}
