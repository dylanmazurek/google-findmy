package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpo extends ljn implements lkr {
    public static final fpo b;
    private static volatile lkx d;
    public lkl a = lkl.a;
    private lkl c = lkl.a;

    static {
        fpo fpoVar = new fpo();
        b = fpoVar;
        ljn.w(fpo.class, fpoVar);
    }

    private fpo() {
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
                                synchronized (fpo.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new fpo();
            }
            return new llb(b, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"a", fpn.a, "c", fpm.a});
        }
        return (byte) 1;
    }
}
