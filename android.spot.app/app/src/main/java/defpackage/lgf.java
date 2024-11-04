package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgf extends ljn implements lkr {
    public static final lgf s;
    private static volatile lkx t;
    public int a;
    public Object c;
    public long g;
    public lgx h;
    public long j;
    public long k;
    public lia m;
    public long o;
    public lix p;
    public int q;
    public lhb r;
    public int b = 0;
    public String d = "";
    public String e = "";
    public String f = "";
    public ljv i = lla.a;
    public String l = "";
    public String n = "";

    static {
        lgf lgfVar = new lgf();
        s = lgfVar;
        ljn.w(lgf.class, lgfVar);
    }

    private lgf() {
        lim limVar = lim.b;
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
                            lkx lkxVar = t;
                            if (lkxVar == null) {
                                synchronized (lgf.class) {
                                    lkxVar = t;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(s);
                                        t = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return s;
                    }
                    return new ljh(s);
                }
                return new lgf();
            }
            return new llb(s, "\u0001\u0014\u0001\u0001\u0002\u001c\u0014\u0000\u0001\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0005\u001b\bဂ\t\tဂ\n\nဈ\u0001\f<\u0000\r<\u0000\u000eဉ\f\u000fဉ\u0006\u0010ဈ\r\u0011<\u0000\u0012<\u0000\u0014ဂ\u000e\u0015᠌\u0010\u0016ဈ\u000b\u0017ဂ\u0005\u0018ဉ\u0011\u0019<\u0000\u001cဉ\u000f", new Object[]{"c", "b", "a", "e", "f", "i", lge.class, "j", "k", "d", lga.class, lgk.class, "m", "h", "n", lha.class, lgi.class, "o", "q", lgb.j, "l", "g", "r", lgg.class, "p"});
        }
        return (byte) 1;
    }
}
