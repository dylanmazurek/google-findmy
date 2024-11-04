package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpo extends ljn implements lkr {
    public static final lpo c;
    private static volatile lkx d;
    public int a = 0;
    public Object b;

    static {
        lpo lpoVar = new lpo();
        c = lpoVar;
        ljn.w(lpo.class, lpoVar);
    }

    private lpo() {
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
                                synchronized (lpo.class) {
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
                return new lpo();
            }
            return new llb(c, "\u0000\u0010\u0001\u0000\u0001#\u0010\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\u001e<\u0000\u001f<\u0000 <\u0000#<\u0000", new Object[]{"b", "a", lpa.class, loz.class, lpe.class, loy.class, lpg.class, lph.class, lpd.class, lox.class, lpc.class, lpj.class, lpf.class, lpb.class, lpl.class, lpm.class, lpn.class, lpi.class});
        }
        return (byte) 1;
    }
}
