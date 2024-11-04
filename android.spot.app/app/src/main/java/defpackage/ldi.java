package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldi extends ljn implements lkr {
    public static final ldi n;
    private static volatile lkx o;
    public int a;
    public int b;
    public int d;
    public int f;
    public lbz g;
    public lbx h;
    public lcz i;
    public int j;
    public int k;
    public int l;
    public ldg m;
    public String c = "";
    public ljv e = lla.a;

    static {
        ldi ldiVar = new ldi();
        n = ldiVar;
        ljn.w(ldi.class, ldiVar);
    }

    private ldi() {
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
                                synchronized (ldi.class) {
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
                return new ldi();
            }
            return new llb(n, "\u0001\f\u0000\u0001\u0001\"\f\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0005ဉ\u0007\u0006ဉ\b\t᠌\u0002\n᠌\f\f\u001b\r᠌\r\u000eဉ\u000b\u000f᠌\u000e\u0013ဉ\u0010\"᠌\u0006", new Object[]{"a", "b", lcw.g, "c", "g", "h", "d", lcw.e, "j", lcw.f, "e", ldh.class, "k", kys.t, "i", "l", kys.m, "m", "f", kys.k});
        }
        return (byte) 1;
    }
}
