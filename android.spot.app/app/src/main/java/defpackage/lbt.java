package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbt extends ljn implements lkr {
    public static final lbt b;
    private static volatile lkx e;
    public int a;
    private int c;
    private byte d = 2;

    static {
        lbt lbtVar = new lbt();
        b = lbtVar;
        ljn.w(lbt.class, lbtVar);
    }

    private lbt() {
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
                                this.d = b2;
                                return null;
                            }
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (lbt.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new lbt();
            }
            return new llb(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
        }
        return Byte.valueOf(this.d);
    }
}
