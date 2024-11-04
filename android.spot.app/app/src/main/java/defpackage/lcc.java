package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcc extends ljn implements lkr {
    public static final lcc l;
    private static volatile lkx m;
    public int a;
    public ljv b = lla.a;
    public String c = "";
    public String d = "";
    public String e = "";
    public lcy f;
    public ldd g;
    public lch h;
    public long i;
    public long j;
    public lco k;

    static {
        lcc lccVar = new lcc();
        l = lccVar;
        ljn.w(lcc.class, lccVar);
    }

    private lcc() {
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
                            lkx lkxVar = m;
                            if (lkxVar == null) {
                                synchronized (lcc.class) {
                                    lkxVar = m;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(l);
                                        m = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return l;
                    }
                    return new ljh(l);
                }
                return new lcc();
            }
            return new llb(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဈ\u0001\u0007ဉ\u0005\tဂ\u0007\nဂ\b\u000bဉ\t\fဈ\u0002", new Object[]{"a", "b", lcb.class, "c", "f", "g", "d", "h", "i", "j", "k", "e"});
        }
        return (byte) 1;
    }
}
