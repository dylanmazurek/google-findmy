package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgw extends ljn implements lkr {
    public static final lgw c;
    private static volatile lkx e;
    public String a = "";
    public long b;
    private int d;

    static {
        lgw lgwVar = new lgw();
        c = lgwVar;
        ljn.w(lgw.class, lgwVar);
    }

    private lgw() {
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
                                synchronized (lgw.class) {
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
                return new lgw();
            }
            return new llb(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        }
        return (byte) 1;
    }
}
