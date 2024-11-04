package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqc extends ljn implements lkr {
    public static final lqc j;
    private static volatile lkx k;
    public int a;
    public Object c;
    public lqd d;
    public int f;
    public lpx h;
    public int b = 0;
    public ljv e = lla.a;
    public String g = "";
    public lim i = lim.b;

    static {
        lqc lqcVar = new lqc();
        j = lqcVar;
        ljn.w(lqc.class, lqcVar);
    }

    private lqc() {
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
                            lkx lkxVar = k;
                            if (lkxVar == null) {
                                synchronized (lqc.class) {
                                    lkxVar = k;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(j);
                                        k = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return j;
                    }
                    return new ljh(j);
                }
                return new lqc();
            }
            return new llb(j, "\u0000\n\u0001\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003<\u0000\u0004<\u0000\u0005ለ\u0001\u0006ဉ\u0002\u0007ည\u0003\b\f\t<\u0000\n<\u0000", new Object[]{"c", "b", "a", "d", "e", lqi.class, lpt.class, lpz.class, "g", "h", "i", "f", lpv.class, lpw.class});
        }
        return (byte) 1;
    }

    public final void c() {
        ljv ljvVar = this.e;
        if (!ljvVar.c()) {
            this.e = ljn.p(ljvVar);
        }
    }
}
