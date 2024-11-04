package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxm extends ljn implements lkr {
    public static final kxm c;
    private static volatile lkx e;
    public int a;
    public kxl b;
    private int d;

    static {
        kxm kxmVar = new kxm();
        c = kxmVar;
        ljn.w(kxm.class, kxmVar);
    }

    private kxm() {
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
                                synchronized (kxm.class) {
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
                return new kxm();
            }
            return new llb(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"d", "a", gek.r, "b"});
        }
        return (byte) 1;
    }
}
