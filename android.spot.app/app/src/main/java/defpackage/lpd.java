package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpd extends ljn implements lkr {
    public static final lpd c;
    private static volatile lkx d;
    public int a;
    public String b = "";

    static {
        lpd lpdVar = new lpd();
        c = lpdVar;
        ljn.w(lpd.class, lpdVar);
    }

    private lpd() {
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
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (lpd.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new lpd();
            }
            return new llb(c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
