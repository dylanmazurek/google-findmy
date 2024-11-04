package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juc extends ljn implements lkr {
    public static final juc b;
    public static final nqe c;
    private static volatile lkx f;
    private Object d;
    public int a = 0;
    private byte e = 2;

    static {
        juc jucVar = new juc();
        b = jucVar;
        ljn.w(juc.class, jucVar);
        c = ljn.B(juu.k, jucVar, jucVar, 772, llx.MESSAGE);
    }

    private juc() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b2 = 0;
                                }
                                this.e = b2;
                                return null;
                            }
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (juc.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new juc();
            }
            return new llb(b, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"d", "a", juw.class, juv.class});
        }
        return Byte.valueOf(this.e);
    }
}
