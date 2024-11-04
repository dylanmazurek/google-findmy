package defpackage;

/* compiled from: PG */
/* renamed from: new, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cnew extends ljn implements lkr {
    public static final Cnew e;
    private static volatile lkx f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        Cnew cnew = new Cnew();
        e = cnew;
        ljn.w(Cnew.class, cnew);
    }

    private Cnew() {
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
                                synchronized (Cnew.class) {
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
                return new Cnew();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
