package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwo extends ljn implements lkr {
    public static final kwo c;
    private static volatile lkx d;
    public int a = 0;
    public Object b;

    static {
        kwo kwoVar = new kwo();
        c = kwoVar;
        ljn.w(kwo.class, kwoVar);
    }

    private kwo() {
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
                                synchronized (kwo.class) {
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
                return new kwo();
            }
            return new llb(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003<\u0000", new Object[]{"b", "a", kwm.class});
        }
        return (byte) 1;
    }
}
