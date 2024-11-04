package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzd extends ljn implements lkr {
    public static final kzd c;
    private static volatile lkx d;
    public int a;
    public kzs b;

    static {
        kzd kzdVar = new kzd();
        c = kzdVar;
        ljn.w(kzd.class, kzdVar);
    }

    private kzd() {
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
                                synchronized (kzd.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new kzd();
            }
            return new llb(c, "\u0000\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0000", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
