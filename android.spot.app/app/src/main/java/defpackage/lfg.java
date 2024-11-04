package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfg extends ljn implements lkr {
    public static final lfg s;
    private static volatile lkx t;
    public int a;
    public float b;
    public int c;
    public int i;
    public ljv l;
    public ljv m;
    public int n;
    public String o;
    public lgj p;
    public lgs q;
    public int r;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";

    static {
        lfg lfgVar = new lfg();
        s = lfgVar;
        ljn.w(lfg.class, lfgVar);
    }

    private lfg() {
        lla llaVar = lla.a;
        this.l = llaVar;
        this.m = llaVar;
        this.o = "";
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
                                synchronized (lfg.class) {
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
                return new lfg();
            }
            return new llb(s, "\u0001\u0011\u0000\u0001\u0002\u0012\u0011\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007င\u0007\bဈ\b\t᠌\u0001\nဈ\u0002\u000bဈ\t\f\u001b\r\u001b\u000e᠌\n\u000fဈ\u000b\u0010ဉ\f\u0011ဉ\r\u0012᠌\u000e", new Object[]{"a", "b", "e", "f", "g", "h", "i", "j", "c", lcw.r, "d", "k", "l", lfd.class, "m", lff.class, "n", lcw.o, "o", "p", "q", "r", lcw.n});
        }
        return (byte) 1;
    }

    public final void b() {
        ljv ljvVar = this.l;
        if (!ljvVar.c()) {
            this.l = ljn.p(ljvVar);
        }
    }

    public final void c() {
        ljv ljvVar = this.m;
        if (!ljvVar.c()) {
            this.m = ljn.p(ljvVar);
        }
    }
}
