package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjn extends ljn implements lkr {
    public static final hjn b;
    private static volatile lkx d;
    public jup a;
    private int c;

    static {
        hjn hjnVar = new hjn();
        b = hjnVar;
        ljn.w(hjn.class, hjnVar);
    }

    private hjn() {
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
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (hjn.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new hjn();
            }
            return new llb(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        }
        return (byte) 1;
    }
}
