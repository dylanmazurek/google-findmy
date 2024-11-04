package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldc extends ljn implements lkr {
    public static final ldc e;
    private static volatile lkx f;
    public int a;
    public int b;
    public lcg c;
    public String d = "";

    static {
        ldc ldcVar = new ldc();
        e = ldcVar;
        ljn.w(ldc.class, ldcVar);
    }

    private ldc() {
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
                                synchronized (ldc.class) {
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
                return new ldc();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0005ဈ\u0003", new Object[]{"a", "b", kys.f, "c", "d"});
        }
        return (byte) 1;
    }
}
