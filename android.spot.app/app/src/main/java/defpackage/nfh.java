package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfh extends ljn implements lkr {
    public static final nfh d;
    private static volatile lkx f;
    public int a;
    public nei b;
    public nfg c;
    private byte e = 2;

    static {
        nfh nfhVar = new nfh();
        d = nfhVar;
        ljn.w(nfh.class, nfhVar);
    }

    private nfh() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b = 0;
                                }
                                this.e = b;
                                return null;
                            }
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (nfh.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new nfh();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
        }
        return Byte.valueOf(this.e);
    }
}
