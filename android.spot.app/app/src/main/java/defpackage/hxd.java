package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxd extends ljn implements lkr {
    public static final hxd b;
    private static volatile lkx c;
    public ljv a = lla.a;

    static {
        hxd hxdVar = new hxd();
        b = hxdVar;
        ljn.w(hxd.class, hxdVar);
    }

    private hxd() {
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
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (hxd.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new hxd();
            }
            return new llb(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
