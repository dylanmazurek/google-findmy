package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyf extends ljn implements lkr {
    public static final kyf r;
    private static volatile lkx s;
    public int a;
    public kxv b;
    public kyl c;
    public kzc d;
    public lim e;
    public kyq f;
    public kyg g;
    public String h;
    public String i;
    public String j;
    public int k;
    public boolean l;
    public long m;
    public int n;
    public int o;
    public int p;
    public lln q;

    static {
        kyf kyfVar = new kyf();
        r = kyfVar;
        ljn.w(kyf.class, kyfVar);
    }

    private kyf() {
        lim limVar = lim.b;
        this.e = lim.b;
        this.h = "";
        this.i = "";
        this.j = "";
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
                            lkx lkxVar = s;
                            if (lkxVar == null) {
                                synchronized (kyf.class) {
                                    lkxVar = s;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(r);
                                        s = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return r;
                    }
                    return new ljh(r);
                }
                return new kyf();
            }
            return new llb(r, "\u0000\u0010\u0000\u0001\u0001\"\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u000bဉ\u0005\u000e\f\u0013ဉ\u0003\u0014Ȉ\u0015Ȉ\u0016\f\u0017\u0002\u0018\u0004\u0019\n\u001b\u0007\u001e\f ဉ\u0002!ဉ\u0007\"Ȉ", new Object[]{"a", "b", "c", "g", "k", "f", "h", "i", "p", "m", "n", "e", "l", "o", "d", "q", "j"});
        }
        return (byte) 1;
    }
}
