package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhn extends ljn implements lkr {
    public static final lhn f;
    private static volatile lkx g;
    public int a;
    public Object c;
    public lhm e;
    public int b = 0;
    public int d = 1;

    static {
        lhn lhnVar = new lhn();
        f = lhnVar;
        ljn.w(lhn.class, lhnVar);
    }

    private lhn() {
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
                                synchronized (lhn.class) {
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
                return new lhn();
            }
            return new llb(f, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0000\u0001<\u0000\u0002င\u0000\u0003<\u0000\u0004ဉ\u0001\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", "a", lhc.class, "d", lhi.class, "e", lhe.class, lhh.class, lhj.class, lhd.class});
        }
        return (byte) 1;
    }
}
