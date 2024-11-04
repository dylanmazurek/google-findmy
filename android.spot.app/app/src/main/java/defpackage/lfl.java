package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfl extends ljn implements lkr {
    public static final lfl c;
    private static volatile lkx d;
    public int a = 0;
    public Object b;

    static {
        lfl lflVar = new lfl();
        c = lflVar;
        ljn.w(lfl.class, lflVar);
    }

    private lfl() {
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
                                synchronized (lfl.class) {
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
                return new lfl();
            }
            return new llb(c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", ldw.class, lfp.class, ldq.class, lfo.class, ldu.class});
        }
        return (byte) 1;
    }
}
