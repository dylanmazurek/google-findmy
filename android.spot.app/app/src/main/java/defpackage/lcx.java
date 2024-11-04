package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcx extends ljn implements lkr {
    public static final lcx q;
    private static volatile lkx r;
    public int a;
    public float b;
    public int c;
    public int i;
    public ljv k;
    public ljv l;
    public int m;
    public String n;
    public lcv o;
    public int p;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";

    static {
        lcx lcxVar = new lcx();
        q = lcxVar;
        ljn.w(lcx.class, lcxVar);
    }

    private lcx() {
        lla llaVar = lla.a;
        this.k = llaVar;
        this.l = llaVar;
        this.n = "";
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
                            lkx lkxVar = r;
                            if (lkxVar == null) {
                                synchronized (lcx.class) {
                                    lkxVar = r;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(q);
                                        r = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return q;
                    }
                    return new ljh(q);
                }
                return new lcx();
            }
            return new llb(q, "\u0001\u000f\u0000\u0001\u0002\u0011\u000f\u0000\u0002\u0000\u0002ခ\u0000\u0003᠌\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tင\u0007\nဈ\b\f\u001b\r\u001b\u000e᠌\n\u000fဈ\u000b\u0010ဉ\f\u0011᠌\r", new Object[]{"a", "b", "c", kys.h, "d", "e", "f", "g", "h", "i", "j", "k", lbz.class, "l", lbx.class, "m", kys.u, "n", "o", "p", lcw.a});
        }
        return (byte) 1;
    }

    public final void b() {
        ljv ljvVar = this.k;
        if (!ljvVar.c()) {
            this.k = ljn.p(ljvVar);
        }
    }
}
