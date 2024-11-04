package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcm extends ljn implements lkr {
    public static final lcm a;
    private static volatile lkx b;

    static {
        lcm lcmVar = new lcm();
        a = lcmVar;
        ljn.w(lcm.class, lcmVar);
    }

    private lcm() {
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
                                synchronized (lcm.class) {
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
                return new lcm();
            }
            return new llb(a, "\u0001\u0000", null);
        }
        return (byte) 1;
    }
}
