package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hur extends ljn implements lkr {
    public static final hur k;
    private static volatile lkx m;
    public int a;
    public ndp b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public ndq i;
    public int j;
    private byte l = 2;
    public String h = "";

    static {
        hur hurVar = new hur();
        k = hurVar;
        ljn.w(hur.class, hurVar);
    }

    private hur() {
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
                                this.l = b;
                                return null;
                            }
                            lkx lkxVar = m;
                            if (lkxVar == null) {
                                synchronized (hur.class) {
                                    lkxVar = m;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(k);
                                        m = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return k;
                    }
                    return new ljh(k);
                }
                return new hur();
            }
            return new llb(k, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b\nင\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        return Byte.valueOf(this.l);
    }
}
