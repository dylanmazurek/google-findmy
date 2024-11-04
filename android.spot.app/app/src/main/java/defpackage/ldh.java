package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldh extends ljn implements lkr {
    public static final ldh c;
    private static volatile lkx d;
    public int a = 0;
    public Object b;

    static {
        ldh ldhVar = new ldh();
        c = ldhVar;
        ljn.w(ldh.class, ldhVar);
    }

    private ldh() {
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
                                synchronized (ldh.class) {
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
                return new ldh();
            }
            return new llb(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002\u083f\u0000", new Object[]{"b", "a", lcw.e});
        }
        return (byte) 1;
    }
}
