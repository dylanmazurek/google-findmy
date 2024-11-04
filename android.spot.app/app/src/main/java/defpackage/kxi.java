package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxi extends ljn implements lkr {
    public static final kxi d;
    private static volatile lkx e;
    public int a;
    public int b;
    public kxh c;

    static {
        kxi kxiVar = new kxi();
        d = kxiVar;
        ljn.w(kxi.class, kxiVar);
    }

    private kxi() {
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
                                synchronized (kxi.class) {
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
                return new kxi();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0003", new Object[]{"a", "b", gek.o, "c"});
        }
        return (byte) 1;
    }
}
