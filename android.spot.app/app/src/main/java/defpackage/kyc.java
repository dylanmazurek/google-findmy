package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyc extends ljn implements lkr {
    public static final kyc c;
    private static volatile lkx d;
    public int a;
    public kxv b;

    static {
        kyc kycVar = new kyc();
        c = kycVar;
        ljn.w(kyc.class, kycVar);
    }

    private kyc() {
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
                                synchronized (kyc.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new kyc();
            }
            return new llb(c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}