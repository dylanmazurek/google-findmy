package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxr extends ljn implements lkr {
    public static final kxr b;
    private static volatile lkx e;
    public jaa a;
    private int c;
    private byte d = 2;

    static {
        kxr kxrVar = new kxr();
        b = kxrVar;
        ljn.w(kxr.class, kxrVar);
    }

    private kxr() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b2 = 0;
                                }
                                this.d = b2;
                                return null;
                            }
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (kxr.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new kxr();
            }
            return new llb(b, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"c", "a"});
        }
        return Byte.valueOf(this.d);
    }
}
