package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjo extends ljn implements lkr {
    public static final kjo b;
    private static volatile lkx c;
    public String a = "";

    static {
        kjo kjoVar = new kjo();
        b = kjoVar;
        ljn.w(kjo.class, kjoVar);
    }

    private kjo() {
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
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (kjo.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new kjo();
            }
            return new llb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        }
        return (byte) 1;
    }
}
