package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khz extends ljn implements lkr {
    public static final khz c;
    private static volatile lkx d;
    public int a;
    public int b;

    static {
        khz khzVar = new khz();
        c = khzVar;
        ljn.w(khz.class, khzVar);
    }

    private khz() {
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
                                synchronized (khz.class) {
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
                return new khz();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
