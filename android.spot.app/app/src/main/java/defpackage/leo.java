package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class leo extends ljn implements lkr {
    public static final leo d;
    private static volatile lkx g;
    public long c;
    private int e;
    private byte f = 2;
    public ljv a = lla.a;
    public String b = "";

    static {
        leo leoVar = new leo();
        d = leoVar;
        ljn.w(leo.class, leoVar);
    }

    private leo() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b = 0;
                                }
                                this.f = b;
                                return null;
                            }
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (leo.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new leo();
            }
            return new llb(d, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0007ဂ\u0001", new Object[]{"e", "a", len.class, "b", "c"});
        }
        return Byte.valueOf(this.f);
    }
}
