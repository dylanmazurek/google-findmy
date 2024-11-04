package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nez extends ljn implements lkr {
    public static final nez k;
    private static volatile lkx l;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public ljv j = lla.a;

    static {
        nez nezVar = new nez();
        k = nezVar;
        ljn.w(nez.class, nezVar);
    }

    private nez() {
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
                                synchronized (nez.class) {
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
                return new nez();
            }
            return new llb(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", ney.class});
        }
        return (byte) 1;
    }
}
