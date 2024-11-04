package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jun extends ljn implements lkr {
    public static final jun e;
    private static volatile lkx g;
    public Object b;
    public Object d;
    public int a = 0;
    public int c = 0;
    private byte f = 2;

    static {
        jun junVar = new jun();
        e = junVar;
        ljn.w(jun.class, junVar);
    }

    private jun() {
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
                                synchronized (jun.class) {
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
                return new jun();
            }
            return new llb(e, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001м\u0000\u0002м\u0001\u0003м\u0000\u0004;\u0000\u0005;\u0001", new Object[]{"b", "a", "d", "c", jux.class, juv.class, juw.class});
        }
        return Byte.valueOf(this.f);
    }
}
