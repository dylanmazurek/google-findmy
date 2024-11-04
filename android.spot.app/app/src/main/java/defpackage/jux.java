package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jux extends ljn implements lkr {
    public static final jux e;
    private static volatile lkx g;
    public int a;
    public long b;
    public int c;
    public int d;
    private byte f = 2;

    static {
        jux juxVar = new jux();
        e = juxVar;
        ljn.w(jux.class, juxVar);
    }

    private jux() {
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
                                synchronized (jux.class) {
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
                    return new ljh(e);
                }
                return new jux();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"a", "b", "c", "d"});
        }
        return Byte.valueOf(this.f);
    }
}
