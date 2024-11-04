package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhl extends ljn implements lkr {
    public static final lhl d;
    private static volatile lkx e;
    public int a;
    public ljv b = lla.a;
    public lhf c;

    static {
        lhl lhlVar = new lhl();
        d = lhlVar;
        ljn.w(lhl.class, lhlVar);
    }

    private lhl() {
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
                                synchronized (lhl.class) {
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
                return new lhl();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", lhk.class, "c"});
        }
        return (byte) 1;
    }
}
