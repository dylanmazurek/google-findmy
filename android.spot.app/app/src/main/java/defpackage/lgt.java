package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgt extends ljn implements lkr {
    public static final lgt c;
    private static volatile lkx e;
    public lgz a;
    public ljv b = lla.a;
    private int d;

    static {
        lgt lgtVar = new lgt();
        c = lgtVar;
        ljn.w(lgt.class, lgtVar);
    }

    private lgt() {
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
                                synchronized (lgt.class) {
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
                return new lgt();
            }
            return new llb(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", lfm.class});
        }
        return (byte) 1;
    }
}
