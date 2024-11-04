package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jve extends ljn implements lkr {
    public static final jve f;
    private static volatile lkx g;
    public int a;
    public String b = "";
    public long c;
    public long d;
    public int e;

    static {
        jve jveVar = new jve();
        f = jveVar;
        ljn.w(jve.class, jveVar);
    }

    private jve() {
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
                                synchronized (jve.class) {
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
                return new jve();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        }
        return (byte) 1;
    }
}
