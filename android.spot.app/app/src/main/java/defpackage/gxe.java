package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxe extends ljn implements lkr {
    public static final ljs b = new gxd(0);
    public static final gxe c;
    private static volatile lkx d;
    public ljr a = ljo.a;

    static {
        gxe gxeVar = new gxe();
        c = gxeVar;
        ljn.w(gxe.class, gxeVar);
    }

    private gxe() {
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
                                synchronized (gxe.class) {
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
                return new gxe();
            }
            return new llb(c, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"a", lgb.d});
        }
        return (byte) 1;
    }
}
