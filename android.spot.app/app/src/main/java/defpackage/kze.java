package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kze extends ljn implements lkr {
    public static final kze e;
    private static volatile lkx f;
    public int a;
    public ljv b = lla.a;
    public lln c;
    public kym d;

    static {
        kze kzeVar = new kze();
        e = kzeVar;
        ljn.w(kze.class, kzeVar);
    }

    private kze() {
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
                                synchronized (kze.class) {
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
                return new kze();
            }
            return new llb(e, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001\u001b\u0004ဉ\u0000\u0006ဉ\u0001", new Object[]{"a", "b", kzd.class, "c", "d"});
        }
        return (byte) 1;
    }
}
