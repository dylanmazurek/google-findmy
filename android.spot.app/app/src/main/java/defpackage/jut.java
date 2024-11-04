package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jut extends ljk implements ljl {
    public static final jut j;
    private static volatile lkx m;
    public int a;
    public juv b;
    public int d;
    public int e;
    public int f;
    public jud i;
    private byte k = 2;
    public int c = -1;
    public int g = -1;
    public ljv h = lla.a;

    static {
        jut jutVar = new jut();
        j = jutVar;
        ljn.w(jut.class, jutVar);
    }

    private jut() {
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
                                this.k = b;
                                return null;
                            }
                            lkx lkxVar = m;
                            if (lkxVar == null) {
                                synchronized (jut.class) {
                                    lkxVar = m;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(j);
                                        m = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return j;
                    }
                    return new ljj(j);
                }
                return new jut();
            }
            return new llb(j, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"a", "c", "d", "e", "f", "g", "h", juu.class, "i", "b"});
        }
        return Byte.valueOf(this.k);
    }
}
