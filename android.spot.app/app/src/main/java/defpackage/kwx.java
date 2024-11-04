package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwx extends ljn implements lkr {
    public static final kwx d;
    private static volatile lkx e;
    public int a;
    public String b = "";
    public kww c;

    static {
        kwx kwxVar = new kwx();
        d = kwxVar;
        ljn.w(kwx.class, kwxVar);
    }

    private kwx() {
        lim limVar = lim.b;
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
                                synchronized (kwx.class) {
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
                return new kwx();
            }
            return new llb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
