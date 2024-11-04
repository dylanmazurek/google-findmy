package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmq extends ljn implements lkr {
    public static final lmq c;
    private static volatile lkx d;
    public int a = 0;
    public Object b;

    static {
        lmq lmqVar = new lmq();
        c = lmqVar;
        ljn.w(lmq.class, lmqVar);
    }

    private lmq() {
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
                                synchronized (lmq.class) {
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
                return new lmq();
            }
            return new llb(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001=\u0000\u0002<\u0000", new Object[]{"b", "a", lmr.class});
        }
        return (byte) 1;
    }
}
