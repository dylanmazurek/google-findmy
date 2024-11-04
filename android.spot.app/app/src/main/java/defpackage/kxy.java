package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxy extends ljn implements lkr {
    public static final kxy f;
    private static volatile lkx g;
    public Object b;
    public int c;
    public boolean e;
    public int a = 0;
    public lim d = lim.b;

    static {
        kxy kxyVar = new kxy();
        f = kxyVar;
        ljn.w(kxy.class, kxyVar);
    }

    private kxy() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (kxy.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new kxy();
            }
            return new llb(f, "\u0000\u0005\u0001\u0000\u0001\b\u0005\u0000\u0000\u0000\u0001\f\u0002\n\u0003<\u0000\u0005\u0007\b<\u0000", new Object[]{"b", "a", "c", "d", kzk.class, "e", kxu.class});
        }
        return (byte) 1;
    }
}
