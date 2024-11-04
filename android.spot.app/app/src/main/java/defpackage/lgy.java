package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgy extends ljn implements lkr {
    public static final lgy b;
    private static volatile lkx c;
    public ljr a = ljo.a;

    static {
        lgy lgyVar = new lgy();
        b = lgyVar;
        ljn.w(lgy.class, lgyVar);
    }

    private lgy() {
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
                                synchronized (lgy.class) {
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
                return new lgy();
            }
            return new llb(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002ࠬ", new Object[]{"a", lgb.c});
        }
        return (byte) 1;
    }
}
