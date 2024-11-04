package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjm extends ljn implements lkr {
    public static final kjm c;
    private static volatile lkx d;
    public int a;
    public ljv b = lla.a;

    static {
        kjm kjmVar = new kjm();
        c = kjmVar;
        ljn.w(kjm.class, kjmVar);
    }

    private kjm() {
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
                                synchronized (kjm.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new kjm();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "b", kjl.class});
        }
        return (byte) 1;
    }
}
