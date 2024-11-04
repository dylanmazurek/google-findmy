package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjk extends ljn implements lkr {
    public static final kjk c;
    private static volatile lkx d;
    public int a;
    public ljv b = lla.a;

    static {
        kjk kjkVar = new kjk();
        c = kjkVar;
        ljn.w(kjk.class, kjkVar);
    }

    private kjk() {
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
                                synchronized (kjk.class) {
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
                return new kjk();
            }
            return new llb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "b", kjj.class});
        }
        return (byte) 1;
    }
}
