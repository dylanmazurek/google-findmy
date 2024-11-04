package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class lek extends ljn implements lkr {
    public static final lek d;
    private static volatile lkx e;
    public int a;
    public ljv b = lla.a;
    public long c;

    static {
        lek lekVar = new lek();
        d = lekVar;
        ljn.w(lek.class, lekVar);
    }

    private lek() {
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
                                synchronized (lek.class) {
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
                return new lek();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဂ\u0000\u0005\u001b", new Object[]{"a", "c", "b", lgf.class});
        }
        return (byte) 1;
    }
}
