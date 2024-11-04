package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nes extends ljn implements lkr {
    public static final nes f;
    private static volatile lkx g;
    public int a;
    public int b;
    public int c;
    public ljr d;
    public ljr e;

    static {
        nes nesVar = new nes();
        f = nesVar;
        ljn.w(nes.class, nesVar);
    }

    private nes() {
        ljo ljoVar = ljo.a;
        this.d = ljoVar;
        this.e = ljoVar;
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
                                synchronized (nes.class) {
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
                return new nes();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"a", "b", "c", "d", "e"});
        }
        return (byte) 1;
    }
}
