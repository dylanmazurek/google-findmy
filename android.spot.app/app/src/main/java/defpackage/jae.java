package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jae extends ljn implements lkr {
    public static final ljs c = new gxd(5);
    public static final jae d;
    private static volatile lkx f;
    public String a = "";
    public ljr b = ljo.a;
    private int e;

    static {
        jae jaeVar = new jae();
        d = jaeVar;
        ljn.w(jae.class, jaeVar);
    }

    private jae() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (jae.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new jae();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"e", "a", "b", gek.e});
        }
        return (byte) 1;
    }
}
