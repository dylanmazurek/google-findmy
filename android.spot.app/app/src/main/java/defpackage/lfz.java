package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfz extends ljn implements lkr {
    public static final lfz d;
    private static volatile lkx f;
    public boolean a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        lfz lfzVar = new lfz();
        d = lfzVar;
        ljn.w(lfz.class, lfzVar);
    }

    private lfz() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (lfz.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new lfz();
            }
            return new llb(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        }
        return (byte) 1;
    }
}
