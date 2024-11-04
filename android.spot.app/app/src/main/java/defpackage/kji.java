package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kji extends ljn implements lkr {
    public static final kji d;
    private static volatile lkx e;
    public String a = "";
    public lim b = lim.b;
    public int c;

    static {
        kji kjiVar = new kji();
        d = kjiVar;
        ljn.w(kji.class, kjiVar);
    }

    private kji() {
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
                                synchronized (kji.class) {
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
                return new kji();
            }
            return new llb(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
