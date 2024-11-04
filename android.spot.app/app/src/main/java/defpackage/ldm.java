package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldm extends ljn implements lkr {
    public static final ldm e;
    private static volatile lkx f;
    public Object b;
    public Object d;
    public int a = 0;
    public int c = 0;

    static {
        ldm ldmVar = new ldm();
        e = ldmVar;
        ljn.w(ldm.class, ldmVar);
    }

    private ldm() {
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
                                synchronized (ldm.class) {
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
                return new ldm();
            }
            return new llb(e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000\u0003<\u0001\u0004<\u0001", new Object[]{"b", "a", "d", "c", lfj.class, ldk.class, ldl.class});
        }
        return (byte) 1;
    }
}
