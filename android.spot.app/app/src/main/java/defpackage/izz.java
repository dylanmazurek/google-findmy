package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izz extends ljn implements lkr {
    public static final izz e;
    private static volatile lkx f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        izz izzVar = new izz();
        e = izzVar;
        ljn.w(izz.class, izzVar);
    }

    private izz() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (izz.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new izz();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0006\u0005ဈ\u0007", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}