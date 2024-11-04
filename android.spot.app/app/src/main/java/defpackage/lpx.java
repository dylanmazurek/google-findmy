package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpx extends ljn implements lkr {
    public static final lpx e;
    private static volatile lkx f;
    public int a;
    public String b = "";
    public boolean c;
    public jsu d;

    static {
        lpx lpxVar = new lpx();
        e = lpxVar;
        ljn.w(lpx.class, lpxVar);
    }

    private lpx() {
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
                                synchronized (lpx.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new lpx();
            }
            return new llb(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003ဉ\u0000", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
