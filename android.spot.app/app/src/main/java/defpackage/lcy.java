package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcy extends ljn implements lkr {
    public static final lcy f;
    private static volatile lkx g;
    public int a;
    public Object c;
    public lcx e;
    public int b = 0;
    public String d = "";

    static {
        lcy lcyVar = new lcy();
        f = lcyVar;
        ljn.w(lcy.class, lcyVar);
    }

    private lcy() {
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
                                synchronized (lcy.class) {
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
                return new lcy();
            }
            return new llb(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u0003ဉ\u0001\u0004;\u0000", new Object[]{"c", "b", "a", "d", "e"});
        }
        return (byte) 1;
    }
}
