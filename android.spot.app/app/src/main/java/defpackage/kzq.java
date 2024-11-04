package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzq extends ljn implements lkr {
    public static final kzq g;
    private static volatile lkx h;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;
    public boolean e;
    public kzr f;

    static {
        kzq kzqVar = new kzq();
        g = kzqVar;
        ljn.w(kzq.class, kzqVar);
    }

    private kzq() {
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
                                synchronized (kzq.class) {
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
                return new kzq();
            }
            return new llb(g, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007\u0007ဉ\u0000", new Object[]{"a", "b", "c", "d", "e", "f"});
        }
        return (byte) 1;
    }
}
