package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndb extends ljn implements lkr {
    public static final ndb d;
    private static volatile lkx e;
    public int a;
    public String b = "";
    public lim c = lim.b;

    static {
        ndb ndbVar = new ndb();
        d = ndbVar;
        ljn.w(ndb.class, ndbVar);
    }

    private ndb() {
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
                                synchronized (ndb.class) {
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
                return new ndb();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
