package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldl extends ljn implements lkr {
    public static final ldl e;
    private static volatile lkx f;
    public int a;
    public int b;
    public String c = "";
    public int d;

    static {
        ldl ldlVar = new ldl();
        e = ldlVar;
        ljn.w(ldl.class, ldlVar);
    }

    private ldl() {
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
                                synchronized (ldl.class) {
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
                return new ldl();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"a", "b", lcw.h, "c", "d", lcw.i});
        }
        return (byte) 1;
    }
}