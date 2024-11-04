package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class led extends ljn implements lkr {
    public static final led f;
    private static volatile lkx g;
    public int a;
    public String b = "";
    public ljv c;
    public ljv d;
    public lgq e;

    static {
        led ledVar = new led();
        f = ledVar;
        ljn.w(led.class, ledVar);
    }

    private led() {
        lla llaVar = lla.a;
        this.c = llaVar;
        this.d = llaVar;
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (led.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new led();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0004\u001b\u0005ဉ\u0001", new Object[]{"a", "b", "c", "d", ldp.class, "e"});
        }
        return (byte) 1;
    }
}
