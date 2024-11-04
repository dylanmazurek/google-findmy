package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class neh extends ljn implements lkr {
    public static final neh w;
    private static volatile lkx x;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;
    public boolean s;
    public nef t;
    public nef u;
    public lkl v = lkl.a;

    static {
        neh nehVar = new neh();
        w = nehVar;
        ljn.w(neh.class, nehVar);
    }

    private neh() {
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
                            lkx lkxVar = x;
                            if (lkxVar == null) {
                                synchronized (neh.class) {
                                    lkxVar = x;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(w);
                                        x = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return w;
                    }
                    return new ljh(w);
                }
                return new neh();
            }
            return new llb(w, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016᠌\u0011\u0017ဂ\r\u0018ဂ\u000e\u0019ဇ\u0012", new Object[]{"a", "b", "e", "h", "j", "k", "p", "q", "t", "u", "c", "d", "v", neg.a, "f", "i", "g", "l", "m", "r", lnj.u, "n", "o", "s"});
        }
        return (byte) 1;
    }
}
