package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class kjs extends ljn implements lkr {
    public static final kjs a;
    private static volatile lkx b;

    static {
        kjs kjsVar = new kjs();
        a = kjsVar;
        ljn.w(kjs.class, kjsVar);
    }

    private kjs() {
        lla llaVar = lla.a;
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
                            lkx lkxVar = b;
                            if (lkxVar == null) {
                                synchronized (kjs.class) {
                                    lkxVar = b;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(a);
                                        b = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return a;
                    }
                    return new ljh(a);
                }
                return new kjs();
            }
            return new llb(a, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
