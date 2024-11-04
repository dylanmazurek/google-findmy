package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gww extends ljn implements lkr {
    public static final gww b;
    private static volatile lkx c;
    public String a = "";

    static {
        gww gwwVar = new gww();
        b = gwwVar;
        ljn.w(gww.class, gwwVar);
    }

    private gww() {
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
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (gww.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new gww();
            }
            return new llb(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
