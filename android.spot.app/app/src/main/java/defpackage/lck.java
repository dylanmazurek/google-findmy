package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lck extends ljn implements lkr {
    public static final lck f;
    private static volatile lkx g;
    public int a;
    public long c;
    public long e;
    public String b = "";
    public String d = "";

    static {
        lck lckVar = new lck();
        f = lckVar;
        ljn.w(lck.class, lckVar);
    }

    private lck() {
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
                                synchronized (lck.class) {
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
                return new lck();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004", new Object[]{"a", "b", "d", "c", "e"});
        }
        return (byte) 1;
    }
}
