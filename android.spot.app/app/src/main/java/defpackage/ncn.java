package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncn extends ljn implements lkr {
    public static final ncn d;
    private static volatile lkx e;
    public long a;
    public long b;
    public int c;

    static {
        ncn ncnVar = new ncn();
        d = ncnVar;
        ljn.w(ncn.class, ncnVar);
    }

    private ncn() {
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
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (ncn.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new ncn();
            }
            return new llb(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0004", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
