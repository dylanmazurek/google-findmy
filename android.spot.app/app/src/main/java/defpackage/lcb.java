package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcb extends ljn implements lkr {
    public static final lcb g;
    private static volatile lkx h;
    public int a;
    public String b = "";
    public long c;
    public long d;
    public String e;
    public String f;

    static {
        lcb lcbVar = new lcb();
        g = lcbVar;
        ljn.w(lcb.class, lcbVar);
    }

    private lcb() {
        lla llaVar = lla.a;
        this.e = "";
        this.f = "";
        lim limVar = lim.b;
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
                                synchronized (lcb.class) {
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
                return new lcb();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002", new Object[]{"a", "b", "c", "e", "f", "d"});
        }
        return (byte) 1;
    }
}
