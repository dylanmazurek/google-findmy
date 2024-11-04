package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkb extends ljn implements lkr {
    public static final kkb c;
    private static volatile lkx d;
    public int a;
    public lim b = lim.b;

    static {
        kkb kkbVar = new kkb();
        c = kkbVar;
        ljn.w(kkb.class, kkbVar);
    }

    private kkb() {
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
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (kkb.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new kkb();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
