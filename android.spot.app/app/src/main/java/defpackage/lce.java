package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lce extends ljn implements lkr {
    public static final lce d;
    private static volatile lkx e;
    public int a;
    public lcd b;
    public int c;

    static {
        lce lceVar = new lce();
        d = lceVar;
        ljn.w(lce.class, lceVar);
    }

    private lce() {
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
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (lce.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new lce();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"a", "b", "c", kys.l});
        }
        return (byte) 1;
    }
}
