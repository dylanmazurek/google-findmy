package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gig extends ljn implements lkr {
    public static final gig d;
    private static volatile lkx e;
    public int a;
    public gih b;
    public lkl c = lkl.a;

    static {
        gig gigVar = new gig();
        d = gigVar;
        ljn.w(gig.class, gigVar);
    }

    private gig() {
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
                                synchronized (gig.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new gig();
            }
            return new llb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"a", "b", "c", gif.a});
        }
        return (byte) 1;
    }
}