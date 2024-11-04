package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxd extends ljn implements lkr {
    public static final kxd d;
    private static volatile lkx e;
    public int a;
    public int b;
    public kxe c;

    static {
        kxd kxdVar = new kxd();
        d = kxdVar;
        ljn.w(kxd.class, kxdVar);
    }

    private kxd() {
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
                                synchronized (kxd.class) {
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
                return new kxd();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"a", "b", gek.p, "c"});
        }
        return (byte) 1;
    }
}
