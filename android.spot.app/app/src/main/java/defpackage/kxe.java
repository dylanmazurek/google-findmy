package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxe extends ljn implements lkr {
    public static final kxe c;
    private static volatile lkx d;
    public int a;
    public kxf b;

    static {
        kxe kxeVar = new kxe();
        c = kxeVar;
        ljn.w(kxe.class, kxeVar);
    }

    private kxe() {
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
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (kxe.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new kxe();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001JJ\u0001\u0000\u0000\u0000Jဉ\u0013", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
