package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyg extends ljn implements lkr {
    public static final kyg d;
    private static volatile lkx e;
    public boolean a;
    public boolean b;
    public int c;

    static {
        kyg kygVar = new kyg();
        d = kygVar;
        ljn.w(kyg.class, kygVar);
    }

    private kyg() {
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
                                synchronized (kyg.class) {
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
                return new kyg();
            }
            return new llb(d, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0000\u0000\u0001\u0007\u0004\u0007\u0006\f", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
