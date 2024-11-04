package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndv extends ljk implements ljl {
    public static final ndv g;
    private static volatile lkx i;
    public int a;
    public ndu b;
    public nek c;
    public int d;
    public ndt e;
    private byte h = 2;
    public String f = "";

    static {
        ndv ndvVar = new ndv();
        g = ndvVar;
        ljn.w(ndv.class, ndvVar);
    }

    private ndv() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                if (obj == null) {
                                    b = 0;
                                }
                                this.h = b;
                                return null;
                            }
                            lkx lkxVar = i;
                            if (lkxVar == null) {
                                synchronized (ndv.class) {
                                    lkxVar = i;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(g);
                                        i = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return g;
                    }
                    return new ljj(g);
                }
                return new ndv();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", lnj.m, "e", "f"});
        }
        return Byte.valueOf(this.h);
    }
}
