package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgm extends ljn implements lkr {
    public static final lgm c;
    private static volatile lkx e;
    public String a = "";
    public lgl b;
    private int d;

    static {
        lgm lgmVar = new lgm();
        c = lgmVar;
        ljn.w(lgm.class, lgmVar);
    }

    private lgm() {
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
                                synchronized (lgm.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new lgm();
            }
            return new llb(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        }
        return (byte) 1;
    }
}
