package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpr extends ljn implements lkr {
    public static final fpr b;
    private static volatile lkx c;
    public lkl a = lkl.a;

    static {
        fpr fprVar = new fpr();
        b = fprVar;
        ljn.w(fpr.class, fprVar);
    }

    private fpr() {
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
                                synchronized (fpr.class) {
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
                return new fpr();
            }
            return new llb(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", fpq.a});
        }
        return (byte) 1;
    }
}