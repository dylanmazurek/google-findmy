package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwv extends ljn implements lkr {
    public static final hwv b;
    private static volatile lkx c;
    public lkl a = lkl.a;

    static {
        hwv hwvVar = new hwv();
        b = hwvVar;
        ljn.w(hwv.class, hwvVar);
    }

    private hwv() {
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
                                synchronized (hwv.class) {
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
                return new hwv();
            }
            return new llb(b, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", hwu.a});
        }
        return (byte) 1;
    }
}
