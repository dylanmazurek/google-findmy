package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lei extends ljn implements lkr {
    public static final lei e;
    private static volatile lkx g;
    public ljv a;
    public ljv b;
    public long c;
    public long d;
    private int f;

    static {
        lei leiVar = new lei();
        e = leiVar;
        ljn.w(lei.class, leiVar);
    }

    private lei() {
        lla llaVar = lla.a;
        this.a = llaVar;
        this.b = llaVar;
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
                                synchronized (lei.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new lei();
            }
            return new llb(e, "\u0001\u0004\u0000\u0001\u0004\t\u0004\u0000\u0002\u0000\u0004ဂ\u0001\u0005ဂ\u0002\u0007\u001b\t\u001b", new Object[]{"f", "c", "d", "a", lgf.class, "b", lgc.class});
        }
        return (byte) 1;
    }
}
