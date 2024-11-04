package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndk extends ljn implements lkr {
    public static final ndk e;
    private static volatile lkx f;
    public int a;
    public ljv b;
    public ljv c;
    public ndj d;

    static {
        ndk ndkVar = new ndk();
        e = ndkVar;
        ljn.w(ndk.class, ndkVar);
    }

    private ndk() {
        lla llaVar = lla.a;
        this.b = llaVar;
        this.c = llaVar;
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
                                synchronized (ndk.class) {
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
                return new ndk();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", ndn.class, "c", ndi.class, "d"});
        }
        return (byte) 1;
    }
}
