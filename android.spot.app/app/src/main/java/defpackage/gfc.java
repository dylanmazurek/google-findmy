package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfc extends ljn implements lkr {
    public static final gfc f;
    private static volatile lkx g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public gfb e;

    static {
        gfc gfcVar = new gfc();
        f = gfcVar;
        ljn.w(gfc.class, gfcVar);
    }

    private gfc() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (gfc.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new gfc();
            }
            return new llb(f, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002င\u0000\u0003ဉ\u0001\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", "a", gff.class, "d", "e", gfd.class, fsi.class, gfg.class, gfe.class});
        }
        return (byte) 1;
    }
}
