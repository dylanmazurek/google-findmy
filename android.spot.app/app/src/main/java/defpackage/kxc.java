package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxc extends ljn implements lkr {
    public static final kxc d;
    private static volatile lkx e;
    public int a;
    public kxb b;
    public kxa c;

    static {
        kxc kxcVar = new kxc();
        d = kxcVar;
        ljn.w(kxc.class, kxcVar);
    }

    private kxc() {
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
                                synchronized (kxc.class) {
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
                return new kxc();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
