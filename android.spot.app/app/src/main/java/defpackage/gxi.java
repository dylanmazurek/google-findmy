package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxi extends ljn implements lkr {
    public static final gxi g;
    private static volatile lkx h;
    public int a;
    public lgz c;
    public int d;
    public int f;
    public ljv b = lla.a;
    public String e = "";

    static {
        gxi gxiVar = new gxi();
        g = gxiVar;
        ljn.w(gxi.class, gxiVar);
    }

    private gxi() {
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
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (gxi.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(g);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return g;
                    }
                    return new ljh(g);
                }
                return new gxi();
            }
            return new llb(g, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0002\u0004᠌\u0001\u0005᠌\u0003", new Object[]{"a", "b", lfm.class, "c", "e", "d", lcw.i, "f", lgb.m});
        }
        return (byte) 1;
    }

    public final void b() {
        ljv ljvVar = this.b;
        if (!ljvVar.c()) {
            this.b = ljn.p(ljvVar);
        }
    }
}
