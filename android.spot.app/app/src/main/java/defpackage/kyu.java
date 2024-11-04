package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyu extends ljn implements lkr {
    public static final kyu d;
    private static volatile lkx e;
    public int a;
    public int b;
    public float c;

    static {
        kyu kyuVar = new kyu();
        d = kyuVar;
        ljn.w(kyu.class, kyuVar);
    }

    private kyu() {
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
                                synchronized (kyu.class) {
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
                return new kyu();
            }
            return new llb(d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\r\u0002\r\u0004\u0001", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
