package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwq extends ljn implements lkr {
    public static final kwq e;
    private static volatile lkx f;
    public int a;
    public long b;
    public lju c;
    public ljv d;

    static {
        kwq kwqVar = new kwq();
        e = kwqVar;
        ljn.w(kwq.class, kwqVar);
    }

    private kwq() {
        lla llaVar = lla.a;
        this.c = lkh.a;
        this.d = lla.a;
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
                                synchronized (kwq.class) {
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
                return new kwq();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"a", "d", kwp.class, "b", "c"});
        }
        return (byte) 1;
    }
}
