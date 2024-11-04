package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrg extends ljn implements lkr {
    public static final hrg d;
    private static volatile lkx f;
    public String a = "";
    public ljv b = lla.a;
    public boolean c;
    private int e;

    static {
        hrg hrgVar = new hrg();
        d = hrgVar;
        ljn.w(hrg.class, hrgVar);
    }

    private hrg() {
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
                                synchronized (hrg.class) {
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
                return new hrg();
            }
            return new llb(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "a", "b", hrf.class, "c"});
        }
        return (byte) 1;
    }
}
