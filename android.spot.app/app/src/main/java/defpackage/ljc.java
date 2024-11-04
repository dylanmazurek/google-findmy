package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljc extends ljn implements lkr {
    public static final ljc b;
    private static volatile lkx c;
    public ljv a = lla.a;

    static {
        ljc ljcVar = new ljc();
        b = ljcVar;
        ljn.w(ljc.class, ljcVar);
    }

    private ljc() {
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
                                synchronized (ljc.class) {
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
                return new ljc();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
