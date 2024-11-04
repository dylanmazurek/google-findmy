package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class neq extends ljn implements lkr {
    public static final neq d;
    private static volatile lkx e;
    public int a;
    public int b;
    public int c;

    static {
        neq neqVar = new neq();
        d = neqVar;
        ljn.w(neq.class, neqVar);
    }

    private neq() {
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
                                synchronized (neq.class) {
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
                return new neq();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"a", "b", nep.a, "c"});
        }
        return (byte) 1;
    }
}
