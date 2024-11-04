package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfm extends ljn implements lkr {
    public static final lfm e;
    private static volatile lkx f;
    public int a;
    public String b = "";
    public long c;
    public long d;

    static {
        lfm lfmVar = new lfm();
        e = lfmVar;
        ljn.w(lfm.class, lfmVar);
    }

    private lfm() {
        lim limVar = lim.b;
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
                                synchronized (lfm.class) {
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
                return new lfm();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဂ\u0001\u0004ဈ\u0000\u0005ဂ\u0002", new Object[]{"a", "c", "b", "d"});
        }
        return (byte) 1;
    }
}
