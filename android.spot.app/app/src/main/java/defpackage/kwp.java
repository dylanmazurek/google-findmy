package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwp extends ljn implements lkr {
    public static final kwp d;
    private static volatile lkx e;
    public int a;
    public ljv b = lla.a;
    public kwo c;

    static {
        kwp kwpVar = new kwp();
        d = kwpVar;
        ljn.w(kwp.class, kwpVar);
    }

    private kwp() {
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
                                synchronized (kwp.class) {
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
                return new kwp();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", kwn.class, "c"});
        }
        return (byte) 1;
    }
}
