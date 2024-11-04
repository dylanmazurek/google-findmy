package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kho extends ljn implements lkr {
    public static final kho d;
    private static volatile lkx e;
    public int a;
    public int b;
    public khp c;

    static {
        kho khoVar = new kho();
        d = khoVar;
        ljn.w(kho.class, khoVar);
    }

    private kho() {
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
                                synchronized (kho.class) {
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
                return new kho();
            }
            return new llb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
