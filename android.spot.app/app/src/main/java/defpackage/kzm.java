package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzm extends ljn implements lkr {
    public static final kzm d;
    private static volatile lkx e;
    public int a;
    public ljv b = lla.a;
    public kzo c;

    static {
        kzm kzmVar = new kzm();
        d = kzmVar;
        ljn.w(kzm.class, kzmVar);
    }

    private kzm() {
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
                                synchronized (kzm.class) {
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
                return new kzm();
            }
            return new llb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", kze.class, "c"});
        }
        return (byte) 1;
    }
}
