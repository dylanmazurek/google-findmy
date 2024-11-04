package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwr extends ljn implements lkr {
    public static final ljs g = new gxd(4);
    public static final hwr h;
    private static volatile lkx j;
    public boolean b;
    public ljv d;
    public ljv e;
    public ljr f;
    private int i;
    public lim a = lim.b;
    public String c = "";

    static {
        hwr hwrVar = new hwr();
        h = hwrVar;
        ljn.w(hwr.class, hwrVar);
    }

    private hwr() {
        lla llaVar = lla.a;
        this.d = llaVar;
        this.e = llaVar;
        this.f = ljo.a;
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
                            lkx lkxVar = j;
                            if (lkxVar == null) {
                                synchronized (hwr.class) {
                                    lkxVar = j;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(h);
                                        j = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return h;
                    }
                    return new ljh(h);
                }
                return new hwr();
            }
            return new llb(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ", new Object[]{"i", "a", "b", "c", "d", "e", "f", gek.n});
        }
        return (byte) 1;
    }
}
