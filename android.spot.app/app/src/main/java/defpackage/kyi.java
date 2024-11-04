package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyi extends ljn implements lkr {
    public static final kyi d;
    private static volatile lkx e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        kyi kyiVar = new kyi();
        d = kyiVar;
        ljn.w(kyi.class, kyiVar);
    }

    private kyi() {
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
                                synchronized (kyi.class) {
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
                return new kyi();
            }
            return new llb(d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003=\u0000", new Object[]{"b", "a", "c", kyk.class});
        }
        return (byte) 1;
    }
}
