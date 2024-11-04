package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncu extends ljn implements lkr {
    public static final ncu f;
    private static volatile lkx g;
    public int a;
    public double b;
    public double c;
    public double d;
    public double e;

    static {
        ncu ncuVar = new ncu();
        f = ncuVar;
        ljn.w(ncu.class, ncuVar);
    }

    private ncu() {
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
                                synchronized (ncu.class) {
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
                return new ncu();
            }
            return new llb(f, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002\u0004\u0003\u0000\u0004\u0000\u0005\u0000\u0006\u0000", new Object[]{"a", "b", "c", "d", "e"});
        }
        return (byte) 1;
    }
}
