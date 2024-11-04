package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfs extends ljn implements lkr {
    public static final lfs g;
    private static volatile lkx h;
    public int a;
    public String b = "";
    public lgo c;
    public lgf d;
    public lgv e;
    public lgn f;

    static {
        lfs lfsVar = new lfs();
        g = lfsVar;
        ljn.w(lfs.class, lfsVar);
    }

    private lfs() {
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
                                synchronized (lfs.class) {
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
                return new lfs();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0001\u0007ဉ\u0004", new Object[]{"a", "b", "d", "e", "c", "f"});
        }
        return (byte) 1;
    }
}
