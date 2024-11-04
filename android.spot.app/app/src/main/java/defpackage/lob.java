package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lob extends ljk implements ljl {
    public static final lob e;
    private static volatile lkx g;
    public int a;
    public lnn b;
    public int c;
    public kwx d;
    private byte f = 2;

    static {
        lob lobVar = new lob();
        e = lobVar;
        ljn.w(lob.class, lobVar);
    }

    private lob() {
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
                                synchronized (lob.class) {
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
                return new lob();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", lnj.e, "d"});
        }
        return Byte.valueOf(this.f);
    }
}
