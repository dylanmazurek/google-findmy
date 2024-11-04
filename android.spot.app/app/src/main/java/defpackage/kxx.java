package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxx extends ljn implements lkr {
    public static final kxx f;
    private static volatile lkx g;
    public Object b;
    public int a = 0;
    public lim c = lim.b;
    public lim d = lim.b;
    public String e = "";

    static {
        kxx kxxVar = new kxx();
        f = kxxVar;
        ljn.w(kxx.class, kxxVar);
    }

    private kxx() {
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
                                synchronized (kxx.class) {
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
                return new kxx();
            }
            return new llb(f, "\u0000\b\u0001\u0000\u0001\f\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003<\u0000\u0005Ȉ\b<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"b", "a", "c", "d", kzj.class, "e", laa.class, kyr.class, kzz.class, kxt.class});
        }
        return (byte) 1;
    }
}
