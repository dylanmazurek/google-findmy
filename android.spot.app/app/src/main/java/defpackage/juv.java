package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juv extends ljn implements lkr {
    public static final juv e;
    private static volatile lkx g;
    public int a;
    public int c;
    public juw d;
    private byte f = 2;
    public int b = -1;

    static {
        juv juvVar = new juv();
        e = juvVar;
        ljn.w(juv.class, juvVar);
    }

    private juv() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b = 0;
                                }
                                this.f = b;
                                return null;
                            }
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (juv.class) {
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
                return new juv();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\rᐉ\u000b", new Object[]{"a", "b", "c", "d"});
        }
        return Byte.valueOf(this.f);
    }
}
