package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqs extends ljn implements lkr {
    public static final lqs k;
    private static volatile lkx l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        lqs lqsVar = new lqs();
        k = lqsVar;
        ljn.w(lqs.class, lqsVar);
    }

    private lqs() {
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
                            lkx lkxVar = l;
                            if (lkxVar == null) {
                                synchronized (lqs.class) {
                                    lkxVar = l;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(k);
                                        l = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return k;
                    }
                    return new ljh(k);
                }
                return new lqs();
            }
            return new llb(k, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        return (byte) 1;
    }
}
