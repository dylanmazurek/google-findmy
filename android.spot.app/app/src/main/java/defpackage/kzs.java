package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzs extends ljn implements lkr {
    public static final kzs c;
    private static volatile lkx d;
    public int a = 0;
    public Object b;

    static {
        kzs kzsVar = new kzs();
        c = kzsVar;
        ljn.w(kzs.class, kzsVar);
    }

    private kzs() {
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
                                synchronized (kzs.class) {
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
                return new kzs();
            }
            return new llb(c, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0005Ȼ\u0000\u0006=\u0000\u0007=\u0000", new Object[]{"b", "a", kyn.class});
        }
        return (byte) 1;
    }
}
