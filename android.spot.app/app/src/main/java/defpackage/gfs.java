package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfs extends ljn implements lkr {
    public static final gfs c;
    private static volatile lkx f;
    public kxq a;
    public gfr b;
    private int d;
    private byte e = 2;

    static {
        gfs gfsVar = new gfs();
        c = gfsVar;
        ljn.w(gfs.class, gfsVar);
    }

    private gfs() {
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
                                synchronized (gfs.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new gfs();
            }
            return new llb(c, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        }
        return Byte.valueOf(this.e);
    }
}
