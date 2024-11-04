package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpt extends ljn implements lpu {
    public static final lpt C;
    private static volatile lkx D;
    public static final ljs o = new gxd(6);
    public int a;
    public lqr b;
    public lln c;
    public lnx h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public lqw p;
    public lpr q;
    public lpq r;
    public lqs s;
    public int t;
    public lpz u;
    public boolean v;
    public lqa w;
    public lqb x;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public ljr n = ljo.a;

    static {
        lpt lptVar = new lpt();
        C = lptVar;
        ljn.w(lpt.class, lptVar);
    }

    private lpt() {
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
                            lkx lkxVar = D;
                            if (lkxVar == null) {
                                synchronized (lpt.class) {
                                    lkxVar = D;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(C);
                                        D = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return C;
                    }
                    return new ljh(C);
                }
                return new lpt();
            }
            return new llb(C, "\u0000\u0016\u0000\u0001\u0002'\u0016\u0000\u0001\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0006ለ\u0005\u0007ለ\u0006\tဉ\b\u000eဇ\u000e\u000fဇ\u0011\u0010ဇ\u0012\u0011ဇ\u0013\u0015ဂ\n\u0018,\u001aဉ\u001a\u001eဉ\u0016\u001fဉ\u0017 ဉ\u0018!ဉ\u0019\"\f$ဉ\u0000%\u0007&ဉ\u001b'ဉ\u001c", new Object[]{"a", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "i", "n", "u", "p", "q", "r", "s", "t", "b", "v", "w", "x"});
        }
        return (byte) 1;
    }
}
