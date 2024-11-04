package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwl extends ljn implements lkr {
    public static final kwl d;
    private static volatile lkx e;
    public int a;
    public double b;
    public long c;

    static {
        kwl kwlVar = new kwl();
        d = kwlVar;
        ljn.w(kwl.class, kwlVar);
    }

    private kwl() {
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
                                synchronized (kwl.class) {
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
                return new kwl();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
