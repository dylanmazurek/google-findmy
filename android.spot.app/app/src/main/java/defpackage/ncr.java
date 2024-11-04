package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncr extends ljn implements lkr {
    public static final ncr n;
    private static volatile lkx o;
    public int a;
    public ncw b;
    public boolean c;
    public ncx d;
    public ncn e;
    public double f;
    public ncu g;
    public int h;
    public ncv i;
    public nct j;
    public ncs k;
    public ncp l;
    public nck m;

    static {
        ncr ncrVar = new ncr();
        n = ncrVar;
        ljn.w(ncr.class, ncrVar);
    }

    private ncr() {
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
                            lkx lkxVar = o;
                            if (lkxVar == null) {
                                synchronized (ncr.class) {
                                    lkxVar = o;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(n);
                                        o = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return n;
                    }
                    return new ljh(n);
                }
                return new ncr();
            }
            return new llb(n, "\u0000\f\u0000\u0001\u0001\u0010\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0004ဉ\u0001\u0006ဉ\u0003\u0007\u0000\bဉ\u0004\n\u000b\u000bဉ\u0006\fဉ\u0007\rဉ\b\u000eဉ\t\u0010ဉ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        return (byte) 1;
    }
}
