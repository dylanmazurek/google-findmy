package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ije extends ljn implements lkr {
    public static final ije e;
    private static volatile lkx f;
    public int a;
    public long c;
    public lim b = lim.b;
    public lim d = lim.b;

    static {
        ije ijeVar = new ije();
        e = ijeVar;
        ljn.w(ije.class, ijeVar);
    }

    private ije() {
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
                                synchronized (ije.class) {
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
                return new ije();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002စ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
