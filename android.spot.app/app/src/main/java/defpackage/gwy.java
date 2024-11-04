package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwy extends ljn implements lkr {
    public static final gwy a;
    private static volatile lkx b;

    static {
        gwy gwyVar = new gwy();
        a = gwyVar;
        ljn.w(gwy.class, gwyVar);
    }

    private gwy() {
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
                            lkx lkxVar = b;
                            if (lkxVar == null) {
                                synchronized (gwy.class) {
                                    lkxVar = b;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(a);
                                        b = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return a;
                    }
                    return new ljh(a);
                }
                return new gwy();
            }
            return new llb(a, "\u0004\u0000", null);
        }
        return (byte) 1;
    }
}
