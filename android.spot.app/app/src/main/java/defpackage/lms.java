package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lms extends ljn implements lkr {
    public static final lms d;
    private static volatile lkx e;
    public int a;
    public int b;
    public boolean c;

    static {
        lms lmsVar = new lms();
        d = lmsVar;
        ljn.w(lms.class, lmsVar);
    }

    private lms() {
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
                                synchronized (lms.class) {
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
                return new lms();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
