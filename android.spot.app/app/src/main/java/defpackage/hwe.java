package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwe extends ljn implements lkr {
    public static final hwe e;
    private static volatile lkx f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        hwe hweVar = new hwe();
        e = hweVar;
        ljn.w(hwe.class, hweVar);
    }

    private hwe() {
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
                                synchronized (hwe.class) {
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
                return new hwe();
            }
            return new llb(e, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"c", "b", "a", "d"});
        }
        return (byte) 1;
    }
}
