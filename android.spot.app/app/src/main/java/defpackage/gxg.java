package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxg extends ljn implements lkr {
    public static final gxg b;
    private static volatile lkx c;
    public ljv a = lla.a;

    static {
        gxg gxgVar = new gxg();
        b = gxgVar;
        ljn.w(gxg.class, gxgVar);
    }

    private gxg() {
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
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (gxg.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new gxg();
            }
            return new llb(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", lia.class});
        }
        return (byte) 1;
    }
}
