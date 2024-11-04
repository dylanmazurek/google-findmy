package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class len extends ljn implements lkr {
    public static final len f;
    private static volatile lkx h;
    public int a;
    public lbt b;
    public lfj c;
    private byte g = 2;
    public String d = "";
    public String e = "";

    static {
        len lenVar = new len();
        f = lenVar;
        ljn.w(len.class, lenVar);
    }

    private len() {
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
                                synchronized (len.class) {
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
                return new len();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        }
        return Byte.valueOf(this.g);
    }
}
