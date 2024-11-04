package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfc extends ljn implements lkr {
    public static final nfc d;
    private static volatile lkx g;
    public int a;
    public int b;
    private nfb e;
    private byte f = 2;
    public int c = 1;

    static {
        nfc nfcVar = new nfc();
        d = nfcVar;
        ljn.w(nfc.class, nfcVar);
    }

    private nfc() {
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
                                this.f = b;
                                return null;
                            }
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (nfc.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new nfc();
            }
            return new llb(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", nep.d, "c", "e"});
        }
        return Byte.valueOf(this.f);
    }
}
