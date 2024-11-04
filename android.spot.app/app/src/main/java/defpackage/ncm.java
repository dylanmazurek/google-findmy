package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncm extends ljn implements lkr {
    public static final ncm d;
    private static volatile lkx e;
    public double a;
    public double b;
    public double c;

    static {
        ncm ncmVar = new ncm();
        d = ncmVar;
        ljn.w(ncm.class, ncmVar);
    }

    private ncm() {
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
                                synchronized (ncm.class) {
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
                return new ncm();
            }
            return new llb(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
