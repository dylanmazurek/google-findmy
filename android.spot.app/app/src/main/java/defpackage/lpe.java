package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpe extends ljn implements lkr {
    public static final lpe d;
    private static volatile lkx e;
    public String a = "";
    public String b = "";
    public String c = "";

    static {
        lpe lpeVar = new lpe();
        d = lpeVar;
        ljn.w(lpe.class, lpeVar);
    }

    private lpe() {
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
                                synchronized (lpe.class) {
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
                return new lpe();
            }
            return new llb(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
