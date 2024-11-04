package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kht extends ljn implements lkr {
    public static final kht d;
    private static volatile lkx e;
    public int a;
    public khu b;
    public int c;

    static {
        kht khtVar = new kht();
        d = khtVar;
        ljn.w(kht.class, khtVar);
    }

    private kht() {
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
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (kht.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new kht();
            }
            return new llb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
