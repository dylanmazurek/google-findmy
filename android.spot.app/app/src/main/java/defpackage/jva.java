package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jva extends ljn implements lkr {
    public static final jva f;
    private static volatile lkx h;
    public int a;
    public long d;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public ljv e = lla.a;

    static {
        jva jvaVar = new jva();
        f = jvaVar;
        ljn.w(jva.class, jvaVar);
    }

    private jva() {
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
                                this.g = b;
                                return null;
                            }
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (jva.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new jva();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"a", "b", "c", "d", "e", juz.class});
        }
        return Byte.valueOf(this.g);
    }
}
