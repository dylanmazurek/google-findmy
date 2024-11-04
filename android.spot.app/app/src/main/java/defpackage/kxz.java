package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxz extends ljn implements lkr {
    public static final kxz d;
    private static volatile lkx e;
    public String a = "";
    public String b = "";
    public String c = "";

    static {
        kxz kxzVar = new kxz();
        d = kxzVar;
        ljn.w(kxz.class, kxzVar);
    }

    private kxz() {
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
                                synchronized (kxz.class) {
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
                return new kxz();
            }
            return new llb(d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ", new Object[]{"a", "b", "c"});
        }
        return (byte) 1;
    }
}
