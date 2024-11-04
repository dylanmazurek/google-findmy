package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lml extends ljn implements lkr {
    public static final lml b;
    private static volatile lkx c;
    public ljv a = lla.a;

    static {
        lml lmlVar = new lml();
        b = lmlVar;
        ljn.w(lml.class, lmlVar);
    }

    private lml() {
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
                                synchronized (lml.class) {
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
                return new lml();
            }
            return new llb(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
