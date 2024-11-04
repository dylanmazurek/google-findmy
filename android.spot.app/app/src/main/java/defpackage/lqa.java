package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqa extends ljn implements lkr {
    public static final lqa c;
    private static volatile lkx d;
    public String a = "";
    public String b = "";

    static {
        lqa lqaVar = new lqa();
        c = lqaVar;
        ljn.w(lqa.class, lqaVar);
    }

    private lqa() {
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
                                synchronized (lqa.class) {
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
                return new lqa();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
