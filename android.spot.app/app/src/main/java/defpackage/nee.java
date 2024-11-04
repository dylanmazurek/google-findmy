package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nee extends ljk implements ljl {
    public static final nee e;
    private static volatile lkx g;
    public int a;
    public long c;
    private byte f = 2;
    public String b = "";
    public String d = "";

    static {
        nee neeVar = new nee();
        e = neeVar;
        ljn.w(nee.class, neeVar);
    }

    private nee() {
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
                                this.f = b;
                                return null;
                            }
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (nee.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljj(e);
                }
                return new nee();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"a", "b", "c", "d"});
        }
        return Byte.valueOf(this.f);
    }
}
