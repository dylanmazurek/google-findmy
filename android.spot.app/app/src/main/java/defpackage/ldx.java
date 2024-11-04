package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldx extends ljn implements lkr {
    public static final ldx g;
    private static volatile lkx h;
    public int a;
    public long d;
    public long f;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        ldx ldxVar = new ldx();
        g = ldxVar;
        ljn.w(ldx.class, ldxVar);
    }

    private ldx() {
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
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (ldx.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(g);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return g;
                    }
                    return new ljh(g);
                }
                return new ldx();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဈ\u0001", new Object[]{"a", "b", "e", "d", "f", "c"});
        }
        return (byte) 1;
    }
}
