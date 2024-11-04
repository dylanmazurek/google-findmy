package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juf extends ljn implements lkr {
    public static final juf c;
    private static volatile lkx e;
    public int a;
    public juw b;
    private byte d = 2;

    static {
        juf jufVar = new juf();
        c = jufVar;
        ljn.w(juf.class, jufVar);
    }

    private juf() {
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
                                this.d = b;
                                return null;
                            }
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (juf.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new juf();
            }
            return new llb(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        }
        return Byte.valueOf(this.d);
    }
}
