package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfk extends ljn implements lkr {
    public static final lfk f;
    private static volatile lkx g;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";
    public ljv e = lla.a;

    static {
        lfk lfkVar = new lfk();
        f = lfkVar;
        ljn.w(lfk.class, lfkVar);
    }

    private lfk() {
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
                                synchronized (lfk.class) {
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
                return new lfk();
            }
            return new llb(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002\u083f\u0000\u0003\u001a\u0004ဈ\u0000", new Object[]{"c", "b", "a", lfj.class, lcw.k, "e", "d"});
        }
        return (byte) 1;
    }
}
