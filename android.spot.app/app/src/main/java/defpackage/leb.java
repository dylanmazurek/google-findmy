package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class leb extends ljn implements lkr {
    public static final leb e;
    private static volatile lkx f;
    public int a;
    public String b = "";
    public ljv c = lla.a;
    public lgq d;

    static {
        leb lebVar = new leb();
        e = lebVar;
        ljn.w(leb.class, lebVar);
    }

    private leb() {
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
                                synchronized (leb.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new leb();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002", new Object[]{"a", "b", "c", lea.class, "d"});
        }
        return (byte) 1;
    }
}
