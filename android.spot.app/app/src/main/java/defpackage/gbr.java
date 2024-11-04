package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbr extends ljk implements ljl {
    public static final gbr d;
    private static volatile lkx f;
    public int a;
    public int b;
    private byte e = 2;
    public ljr c = ljo.a;

    static {
        gbr gbrVar = new gbr();
        d = gbrVar;
        ljn.w(gbr.class, gbrVar);
    }

    private gbr() {
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
                                synchronized (gbr.class) {
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
                    return new ljj(d);
                }
                return new gbr();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"a", "b", gek.m, "c"});
        }
        return Byte.valueOf(this.e);
    }
}
