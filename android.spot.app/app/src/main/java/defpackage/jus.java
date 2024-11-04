package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jus extends ljn implements lkr {
    public static final jus e;
    public static final nqe f;
    private static volatile lkx g;
    public int a;
    public juq b;
    public jur c;
    public juo d;

    static {
        jus jusVar = new jus();
        e = jusVar;
        ljn.w(jus.class, jusVar);
        f = ljn.B(juu.k, jusVar, jusVar, 571, llx.MESSAGE);
    }

    private jus() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (jus.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new jus();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0002\u0007\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
