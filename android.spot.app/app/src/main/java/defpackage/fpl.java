package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpl extends ljn implements lkr {
    public static final fpl c;
    private static volatile lkx d;
    public String a = "";
    public ljv b = lla.a;

    static {
        fpl fplVar = new fpl();
        c = fplVar;
        ljn.w(fpl.class, fplVar);
    }

    private fpl() {
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
                                synchronized (fpl.class) {
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
                return new fpl();
            }
            return new llb(c, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", fpt.class});
        }
        return (byte) 1;
    }
}
