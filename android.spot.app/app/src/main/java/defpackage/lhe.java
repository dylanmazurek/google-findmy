package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhe extends ljn implements lkr {
    public static final lhe a;
    private static volatile lkx b;

    static {
        lhe lheVar = new lhe();
        a = lheVar;
        ljn.w(lhe.class, lheVar);
    }

    private lhe() {
        lla llaVar = lla.a;
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
                            lkx lkxVar = b;
                            if (lkxVar == null) {
                                synchronized (lhe.class) {
                                    lkxVar = b;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(a);
                                        b = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return a;
                    }
                    return new ljh(a);
                }
                return new lhe();
            }
            return new llb(a, "\u0001\u0000", null);
        }
        return (byte) 1;
    }
}
