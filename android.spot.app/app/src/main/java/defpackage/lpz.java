package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpz extends ljn implements lkr {
    public static final lpz e;
    private static volatile lkx f;
    public int a;
    public kyf b;
    public ljv c = lla.a;
    public lpy d;

    static {
        lpz lpzVar = new lpz();
        e = lpzVar;
        ljn.w(lpz.class, lpzVar);
    }

    private lpz() {
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
                                synchronized (lpz.class) {
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
                return new lpz();
            }
            return new llb(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", "d", "c", kzq.class});
        }
        return (byte) 1;
    }
}
