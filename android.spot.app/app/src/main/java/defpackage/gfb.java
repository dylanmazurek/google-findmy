package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfb extends ljn implements lkr {
    public static final gfb e;
    private static volatile lkx f;
    public int a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        gfb gfbVar = new gfb();
        e = gfbVar;
        ljn.w(gfb.class, gfbVar);
    }

    private gfb() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (gfb.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new gfb();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0004", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}