package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcs extends ljn implements lkr {
    public static final lcs h;
    private static volatile lkx i;
    public int a;
    public int b;
    public int c;
    public int d;
    public lcz e;
    public String f = "";
    public int g;

    static {
        lcs lcsVar = new lcs();
        h = lcsVar;
        ljn.w(lcs.class, lcsVar);
    }

    private lcs() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                return null;
                            }
                            lkx lkxVar = i;
                            if (lkxVar == null) {
                                synchronized (lcs.class) {
                                    lkxVar = i;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(h);
                                        i = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return h;
                    }
                    return new ljh(h);
                }
                return new lcs();
            }
            return new llb(h, "\u0001\u0006\u0000\u0001\u0001%\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0003᠌\u0003\u0004ဉ\u0004\u0005ဈ\u0005\b᠌\b%᠌\u0001", new Object[]{"a", "b", kys.r, "d", kys.q, "e", "f", "g", kys.s, "c", kys.k});
        }
        return (byte) 1;
    }
}
