package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxh extends ljn implements lkr {
    public static final kxh c;
    private static volatile lkx d;
    public int a;
    public kxg b;

    static {
        kxh kxhVar = new kxh();
        c = kxhVar;
        ljn.w(kxh.class, kxhVar);
    }

    private kxh() {
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
                                synchronized (kxh.class) {
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
                return new kxh();
            }
            return new llb(c, "\u0001\u0001\u0000\u000100\u0001\u0000\u0000\u00000ဉ\u0010", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}