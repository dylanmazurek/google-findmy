package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndj extends ljn implements lkr {
    public static final ndj d;
    private static volatile lkx e;
    public int a;
    public long b;
    public String c = "";

    static {
        ndj ndjVar = new ndj();
        d = ndjVar;
        ljn.w(ndj.class, ndjVar);
    }

    private ndj() {
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
                                synchronized (ndj.class) {
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
                return new ndj();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
