package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndz extends ljn implements lkr {
    public static final ndz D;
    private static volatile lkx F;
    public long C;
    public int a;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public nej k;
    public int l;
    public ndx m;
    public int n;
    public long o;
    public int p;
    public int q;
    public int r;
    public int s;
    public String t;
    public lju u;
    public String v;
    public neb w;
    public ndw x;
    private byte E = 2;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        ndz ndzVar = new ndz();
        D = ndzVar;
        ljn.w(ndz.class, ndzVar);
    }

    private ndz() {
        lla llaVar = lla.a;
        this.t = "";
        this.u = lkh.a;
        this.v = "";
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b = 0;
                                }
                                this.E = b;
                                return null;
                            }
                            lkx lkxVar = F;
                            if (lkxVar == null) {
                                synchronized (ndz.class) {
                                    lkxVar = F;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(D);
                                        F = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return D;
                    }
                    return new ljh(D);
                }
                return new ndz();
            }
            return new llb(D, "\u0001\u0018\u0000\u0001\u0001\u001c\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018᠌\n\u0019ဈ\u0002\u001aဉ\u0017\u001b᠌\f\u001cဂ\u0018", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", lnj.r, "k", "m", "o", "p", lnj.s, "q", lnj.q, "s", "t", "r", "v", "u", "w", "l", lnj.o, "d", "x", "n", lnj.p, "C"});
        }
        return Byte.valueOf(this.E);
    }
}
