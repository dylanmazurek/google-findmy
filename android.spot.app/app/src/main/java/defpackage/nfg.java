package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfg extends ljn implements lkr {
    public static final nfg c;
    private static volatile lkx e;
    public int a;
    public boolean b;
    private byte d = 2;

    static {
        nfg nfgVar = new nfg();
        c = nfgVar;
        ljn.w(nfg.class, nfgVar);
    }

    private nfg() {
        lla llaVar = lla.a;
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
                                this.d = b;
                                return null;
                            }
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (nfg.class) {
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
                return new nfg();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0001", new Object[]{"a", "b"});
        }
        return Byte.valueOf(this.d);
    }
}
