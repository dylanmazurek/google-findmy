package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gel extends ljn implements lkr {
    public static final gel d;
    private static volatile lkx f;
    public int a;
    public int b = 250;
    public gei c;
    private int e;

    static {
        gel gelVar = new gel();
        d = gelVar;
        ljn.w(gel.class, gelVar);
    }

    private gel() {
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
                                synchronized (gel.class) {
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
                return new gel();
            }
            return new llb(d, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"e", "a", gek.a, "b", "c"});
        }
        return (byte) 1;
    }
}
