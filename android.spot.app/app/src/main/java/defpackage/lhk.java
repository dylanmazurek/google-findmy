package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhk extends ljn implements lkr {
    public static final lhk c;
    private static volatile lkx e;
    public int a;
    public boolean b;
    private int d;

    static {
        lhk lhkVar = new lhk();
        c = lhkVar;
        ljn.w(lhk.class, lhkVar);
    }

    private lhk() {
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
                                synchronized (lhk.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new lhk();
            }
            return new llb(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
        }
        return (byte) 1;
    }
}
