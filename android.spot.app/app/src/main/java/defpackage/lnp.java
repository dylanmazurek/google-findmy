package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnp extends ljn implements lkr {
    public static final lnp c;
    private static volatile lkx e;
    private lkl d = lkl.a;
    public String a = "";
    public String b = "";

    static {
        lnp lnpVar = new lnp();
        c = lnpVar;
        ljn.w(lnp.class, lnpVar);
    }

    private lnp() {
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
                                synchronized (lnp.class) {
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
                return new lnp();
            }
            return new llb(c, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"a", "b", "d", lno.a});
        }
        return (byte) 1;
    }
}
