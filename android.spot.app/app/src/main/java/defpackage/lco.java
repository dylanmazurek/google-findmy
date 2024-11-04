package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lco extends ljn implements lkr {
    public static final lco i;
    private static volatile lkx j;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;

    static {
        lco lcoVar = new lco();
        i = lcoVar;
        ljn.w(lco.class, lcoVar);
    }

    private lco() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                return null;
                            }
                            lkx lkxVar = j;
                            if (lkxVar == null) {
                                synchronized (lco.class) {
                                    lkxVar = j;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(i);
                                        j = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return i;
                    }
                    return new ljh(i);
                }
                return new lco();
            }
            return new llb(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", kys.p});
        }
        return (byte) 1;
    }
}
