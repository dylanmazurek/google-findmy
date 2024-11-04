package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsu extends ljn implements lkr {
    public static final jsu c;
    private static volatile lkx d;
    public int a;
    public String b = "";

    static {
        jsu jsuVar = new jsu();
        c = jsuVar;
        ljn.w(jsu.class, jsuVar);
    }

    private jsu() {
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
                                synchronized (jsu.class) {
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
                return new jsu();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
