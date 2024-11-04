package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndg extends ljn implements lkr {
    public static final ndg l;
    private static volatile lkx n;
    public int a;
    public int b;
    public long c;
    public ndq f;
    public int g;
    public long h;
    public ndp i;
    public long j;
    public long k;
    private byte m = 2;
    public String d = "";
    public String e = "";

    static {
        ndg ndgVar = new ndg();
        l = ndgVar;
        ljn.w(ndg.class, ndgVar);
    }

    private ndg() {
        lla llaVar = lla.a;
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
                                this.m = b;
                                return null;
                            }
                            lkx lkxVar = n;
                            if (lkxVar == null) {
                                synchronized (ndg.class) {
                                    lkxVar = n;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(l);
                                        n = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return l;
                    }
                    return new ljh(l);
                }
                return new ndg();
            }
            ljq ljqVar = lnj.l;
            return new llb(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"a", "b", ljqVar, "g", ljqVar, "h", "i", "j", "c", "d", "e", "f", "k"});
        }
        return Byte.valueOf(this.m);
    }
}
