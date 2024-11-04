package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyr extends ljn implements lkr {
    public static final kyr b;
    private static volatile lkx d;
    public kxv a;
    private int c;

    static {
        kyr kyrVar = new kyr();
        b = kyrVar;
        ljn.w(kyr.class, kyrVar);
    }

    private kyr() {
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
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (kyr.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new kyr();
            }
            return new llb(b, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        }
        return (byte) 1;
    }
}
