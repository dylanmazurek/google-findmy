package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxt extends ljn implements lkr {
    public static final kxt f;
    private static volatile lkx h;
    public kyf a;
    public ljv b;
    public ljv c;
    public int d;
    public lkl e = lkl.a;
    private int g;

    static {
        kxt kxtVar = new kxt();
        f = kxtVar;
        ljn.w(kxt.class, kxtVar);
    }

    private kxt() {
        lla llaVar = lla.a;
        this.b = llaVar;
        this.c = llaVar;
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
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (kxt.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new kxt();
            }
            return new llb(f, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0005\u0004\u00062", new Object[]{"g", "a", "b", kym.class, "c", lln.class, "d", "e", kxs.a});
        }
        return (byte) 1;
    }
}
