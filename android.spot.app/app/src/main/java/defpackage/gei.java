package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gei extends ljn implements lkr {
    public static final gei b;
    private static volatile lkx d;
    public int a;
    private int c;

    static {
        gei geiVar = new gei();
        b = geiVar;
        ljn.w(gei.class, geiVar);
    }

    private gei() {
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
                                synchronized (gei.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new gei();
            }
            return new llb(b, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
        }
        return (byte) 1;
    }
}