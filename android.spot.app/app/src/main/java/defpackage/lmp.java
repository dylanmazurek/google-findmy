package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmp extends ljn implements lkr {
    public static final lmp e;
    private static volatile lkx f;
    public int a;
    public int b = 0;
    public Object c;
    public int d;

    static {
        lmp lmpVar = new lmp();
        e = lmpVar;
        ljn.w(lmp.class, lmpVar);
    }

    private lmp() {
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
                                synchronized (lmp.class) {
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
                return new lmp();
            }
            return new llb(e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001<\u0000\u0002᠌\u0000\u0003<\u0000\u0005<\u0000", new Object[]{"c", "b", "a", lmn.class, "d", lnj.i, lmr.class, lmq.class});
        }
        return (byte) 1;
    }
}
