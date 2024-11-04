package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gro extends ljn implements lkr {
    public static final ljs b = new gxd(1);
    public static final gro c;
    private static volatile lkx d;
    public ljr a = ljo.a;

    static {
        gro groVar = new gro();
        c = groVar;
        ljn.w(gro.class, groVar);
    }

    private gro() {
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
                                synchronized (gro.class) {
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
                return new gro();
            }
            return new llb(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"a", lgb.g});
        }
        return (byte) 1;
    }
}
