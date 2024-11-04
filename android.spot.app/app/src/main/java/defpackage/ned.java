package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ned extends ljn implements lkr {
    public static final ned f;
    private static volatile lkx h;
    public int a;
    public long b;
    public int c;
    public neh e;
    private byte g = 2;
    public ljv d = lla.a;

    static {
        ned nedVar = new ned();
        f = nedVar;
        ljn.w(ned.class, nedVar);
    }

    private ned() {
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
                                this.g = b;
                                return null;
                            }
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (ned.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new ned();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"a", "b", "d", nee.class, "c", lnj.t, "e"});
        }
        return Byte.valueOf(this.g);
    }
}
