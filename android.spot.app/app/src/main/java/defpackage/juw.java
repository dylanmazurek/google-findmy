package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juw extends ljn implements lkr {
    public static final juw d;
    private static volatile lkx f;
    public int a;
    public jux b;
    public long c;
    private byte e = 2;

    static {
        juw juwVar = new juw();
        d = juwVar;
        ljn.w(juw.class, juwVar);
    }

    private juw() {
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
                                this.e = b;
                                return null;
                            }
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (juw.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new juw();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        }
        return Byte.valueOf(this.e);
    }
}
