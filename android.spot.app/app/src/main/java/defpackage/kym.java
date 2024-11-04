package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kym extends ljn implements lkr {
    public static final kym f;
    private static volatile lkx g;
    public int a;
    public int b = 0;
    public Object c;
    public kzp d;
    public int e;

    static {
        kym kymVar = new kym();
        f = kymVar;
        ljn.w(kym.class, kymVar);
    }

    private kym() {
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
                                synchronized (kym.class) {
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
                return new kym();
            }
            return new llb(f, "\u0000\u0004\u0001\u0001\u0005\u000b\u0004\u0000\u0000\u0000\u0005ဉ\u0000\t<\u0000\n<\u0000\u000b\f", new Object[]{"c", "b", "a", "d", kyu.class, kyo.class, "e"});
        }
        return (byte) 1;
    }
}
