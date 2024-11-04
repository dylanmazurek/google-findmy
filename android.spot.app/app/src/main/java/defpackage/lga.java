package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lga extends ljn implements lkr {
    private static volatile lkx C;
    public static final lga x;
    public int a;
    public lgh e;
    public long f;
    public lfx h;
    public lfy j;
    public int k;
    public lfz l;
    public lft n;
    public int p;
    public int r;
    public boolean s;
    public lgl u;
    public lgm v;
    public boolean w;
    public String b = "";
    public String c = "";
    public ljv d = lla.a;
    public String g = "";
    public String i = "";
    public String m = "";
    public String o = "";
    public String q = "";
    public String t = "";

    static {
        lga lgaVar = new lga();
        x = lgaVar;
        ljn.w(lga.class, lgaVar);
    }

    private lga() {
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
                            lkx lkxVar = C;
                            if (lkxVar == null) {
                                synchronized (lga.class) {
                                    lkxVar = C;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(x);
                                        C = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return x;
                    }
                    return new ljh(x);
                }
                return new lga();
            }
            return new llb(x, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\bဈ\u0006\tဉ\u0007\n᠌\b\u000bဉ\t\fဈ\n\rဉ\u000b\u000eဈ\f\u000fင\r\u0010ဈ\u000e\u0011᠌\u000f\u0012ဇ\u0010\u0013ဈ\u0011\u0016ဉ\u0014\u0017ဉ\u0015\u0019ဇ\u0017", new Object[]{"a", "b", "c", "d", lgh.class, "e", "f", "g", "h", "i", "j", "k", lcw.t, "l", "m", "n", "o", "p", "q", "r", lgb.b, "s", "t", "u", "v", "w"});
        }
        return (byte) 1;
    }
}
