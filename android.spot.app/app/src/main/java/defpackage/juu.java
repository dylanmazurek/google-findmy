package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juu extends ljk implements ljl {
    public static final juu k;
    private static volatile lkx n;
    public int a;
    public int b;
    public int f;
    public lmm g;
    public int h;
    public juj j;
    private byte m = 2;
    public int c = -1;
    public ljr d = ljo.a;
    public String e = "";
    public int i = -1;

    static {
        juu juuVar = new juu();
        k = juuVar;
        ljn.w(juu.class, juuVar);
    }

    private juu() {
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
                                synchronized (juu.class) {
                                    lkxVar = n;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(k);
                                        n = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return k;
                    }
                    return new ljj(k);
                }
                return new juu();
            }
            return new llb(k, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006᠌\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\bèᐉ\t", new Object[]{"a", "b", "c", "d", "e", "h", gek.j, "f", "g", "i", "j"});
        }
        return Byte.valueOf(this.m);
    }
}
