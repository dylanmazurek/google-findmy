package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrf extends ljn implements lkr {
    public static final hrf c;
    private static volatile lkx e;
    public int a;
    public String b = "";
    private int d;

    static {
        hrf hrfVar = new hrf();
        c = hrfVar;
        ljn.w(hrf.class, hrfVar);
    }

    private hrf() {
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
                                synchronized (hrf.class) {
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
                return new hrf();
            }
            return new llb(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"d", "a", gek.c, "b"});
        }
        return (byte) 1;
    }
}
