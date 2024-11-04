package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnm extends ljn implements lkr {
    public static final lnm c;
    private static volatile lkx d;
    public int a;
    public int b;

    static {
        lnm lnmVar = new lnm();
        c = lnmVar;
        ljn.w(lnm.class, lnmVar);
    }

    private lnm() {
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
                                synchronized (lnm.class) {
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
                return new lnm();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rင\u0000", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
