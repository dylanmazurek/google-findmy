package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kiq extends ljn implements lkr {
    public static final kiq d;
    private static volatile lkx e;
    public int a;
    public int b;
    public lim c = lim.b;

    static {
        kiq kiqVar = new kiq();
        d = kiqVar;
        ljn.w(kiq.class, kiqVar);
    }

    private kiq() {
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
                                synchronized (kiq.class) {
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
                return new kiq();
            }
            return new llb(d, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
