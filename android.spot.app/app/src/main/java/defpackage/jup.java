package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jup extends ljn implements lkr {
    public static final jup a;
    public static final nqe b;
    private static volatile lkx c;

    static {
        jup jupVar = new jup();
        a = jupVar;
        ljn.w(jup.class, jupVar);
        b = ljn.B(jud.a, jupVar, jupVar, 118, llx.MESSAGE);
    }

    private jup() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                return null;
                            }
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (jup.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(a);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return a;
                    }
                    return new ljh(a);
                }
                return new jup();
            }
            return new llb(a, "\u0001\u0000", null);
        }
        return (byte) 1;
    }
}
