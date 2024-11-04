package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lae extends ljn implements lkr {
    public static final lae c;
    private static volatile lkx e;
    public ljv a = lla.a;
    public kyf b;
    private int d;

    static {
        lae laeVar = new lae();
        c = laeVar;
        ljn.w(lae.class, laeVar);
    }

    private lae() {
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
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (lae.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new lae();
            }
            return new llb(c, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", kzq.class, "b"});
        }
        return (byte) 1;
    }
}
