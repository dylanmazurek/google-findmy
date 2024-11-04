package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lod extends ljn implements lkr {
    public static final lod b;
    private static volatile lkx c;
    public ljv a = lla.a;

    static {
        lod lodVar = new lod();
        b = lodVar;
        ljn.w(lod.class, lodVar);
    }

    private lod() {
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
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (lod.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new lod();
            }
            return new llb(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", loc.class});
        }
        return (byte) 1;
    }
}
