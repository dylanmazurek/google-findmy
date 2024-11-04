package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lea extends ljn implements lkr {
    public static final lea f;
    private static volatile lkx g;
    public int a;
    public ljv b = lla.a;
    public lgz c;
    public ldm d;
    public int e;

    static {
        lea leaVar = new lea();
        f = leaVar;
        ljn.w(lea.class, leaVar);
    }

    private lea() {
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
                                synchronized (lea.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new lea();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0005᠌\u0003", new Object[]{"a", "b", lfm.class, "c", "d", "e", lgb.m});
        }
        return (byte) 1;
    }
}
