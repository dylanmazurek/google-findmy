package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxq extends ljn implements lkr {
    public static final kxq b;
    private static volatile lkx d;
    private byte c = 2;
    public ljv a = lla.a;

    static {
        kxq kxqVar = new kxq();
        b = kxqVar;
        ljn.w(kxq.class, kxqVar);
    }

    private kxq() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b2 = 0;
                                }
                                this.c = b2;
                                return null;
                            }
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (kxq.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new kxq();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", kxr.class});
        }
        return Byte.valueOf(this.c);
    }
}