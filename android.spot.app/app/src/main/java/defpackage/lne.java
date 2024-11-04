package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lne extends ljn implements lkr {
    public static final lne c;
    private static volatile lkx d;
    public int a;
    public int b;

    static {
        lne lneVar = new lne();
        c = lneVar;
        ljn.w(lne.class, lneVar);
    }

    private lne() {
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
                                synchronized (lne.class) {
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
                return new lne();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"a", "b", kys.c});
        }
        return (byte) 1;
    }
}
