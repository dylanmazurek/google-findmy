package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kij extends ljn implements lkr {
    public static final kij d;
    private static volatile lkx f;
    public int a;
    public kik b;
    public lim c = lim.b;
    private int e;

    static {
        kij kijVar = new kij();
        d = kijVar;
        ljn.w(kij.class, kijVar);
    }

    private kij() {
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
                                synchronized (kij.class) {
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
                return new kij();
            }
            return new llb(d, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"e", "a", "b", "c"});
        }
        return (byte) 1;
    }
}