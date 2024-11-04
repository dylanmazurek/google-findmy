package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqq extends ljn implements lkr {
    public static final lqq e;
    private static volatile lkx f;
    public ljv a;
    public ljv b;
    public int c;
    public lkl d = lkl.a;

    static {
        lqq lqqVar = new lqq();
        e = lqqVar;
        ljn.w(lqq.class, lqqVar);
    }

    private lqq() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (lqq.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new lqq();
            }
            return new llb(e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0001\u0002\u0000\u0001\u001b\u0002\u001b\u0004\u0004\u00052", new Object[]{"a", kym.class, "b", lln.class, "c", "d", lqp.a});
        }
        return (byte) 1;
    }
}
