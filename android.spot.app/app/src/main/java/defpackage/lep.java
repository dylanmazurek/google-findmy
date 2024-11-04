package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lep extends ljn implements lkr {
    public static final lep g;
    private static volatile lkx h;
    public int a;
    public lfj c;
    public lez d;
    public lgq e;
    public String b = "";
    public String f = "";

    static {
        lep lepVar = new lep();
        g = lepVar;
        ljn.w(lep.class, lepVar);
    }

    private lep() {
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
                                synchronized (lep.class) {
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
                return new lep();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        }
        return (byte) 1;
    }
}
