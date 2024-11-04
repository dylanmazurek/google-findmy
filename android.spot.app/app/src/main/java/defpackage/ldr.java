package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldr extends ljn implements lkr {
    public static final ldr c;
    private static volatile lkx d;
    public int a = 0;
    public Object b;

    static {
        ldr ldrVar = new ldr();
        c = ldrVar;
        ljn.w(ldr.class, ldrVar);
    }

    private ldr() {
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
                                synchronized (ldr.class) {
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
                return new ldr();
            }
            return new llb(c, "\u0001\b\u0001\u0000\u0001\t\b\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"b", "a", ldx.class, ldn.class, ldo.class, lfn.class, ldy.class, lds.class, lfi.class, ldz.class});
        }
        return (byte) 1;
    }
}
