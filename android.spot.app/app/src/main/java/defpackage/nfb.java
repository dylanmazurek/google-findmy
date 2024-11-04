package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfb extends ljn implements lkr {
    public static final nfb a;
    private static volatile lkx e;
    private int b;
    private ner c;
    private byte d = 2;

    static {
        nfb nfbVar = new nfb();
        a = nfbVar;
        ljn.w(nfb.class, nfbVar);
    }

    private nfb() {
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
                                synchronized (nfb.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(a);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return a;
                    }
                    return new ljh(a);
                }
                return new nfb();
            }
            return new llb(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        return Byte.valueOf(this.d);
    }
}
