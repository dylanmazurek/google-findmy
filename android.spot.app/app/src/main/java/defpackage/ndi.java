package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndi extends ljn implements lkr {
    public static final ndi d;
    private static volatile lkx e;
    public int a;
    public int b;
    public ndj c;

    static {
        ndi ndiVar = new ndi();
        d = ndiVar;
        ljn.w(ndi.class, ndiVar);
    }

    private ndi() {
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
                                synchronized (ndi.class) {
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
                return new ndi();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}