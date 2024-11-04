package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class leu extends ljn implements lkr {
    public static final leu f;
    private static volatile lkx g;
    public int a;
    public lfj b;
    public long d;
    public String c = "";
    public String e = "";

    static {
        leu leuVar = new leu();
        f = leuVar;
        ljn.w(leu.class, leuVar);
    }

    private leu() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (leu.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new leu();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဉ\u0001\u0006ဈ\u0002\u0007ဂ\u0003\bဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        }
        return (byte) 1;
    }
}
