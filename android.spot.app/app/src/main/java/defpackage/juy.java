package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juy extends ljn implements lkr {
    public static final juy a;
    private static volatile lkx h;
    private int b;
    private jux c;
    private int e;
    private jvd f;
    private byte g = 2;
    private String d = "";

    static {
        juy juyVar = new juy();
        a = juyVar;
        ljn.w(juy.class, juyVar);
    }

    private juy() {
        lla llaVar = lla.a;
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b = 0;
                                }
                                this.g = b;
                                return null;
                            }
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (juy.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(a);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return a;
                    }
                    return new ljh(a);
                }
                return new juy();
            }
            return new llb(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\bᐉ\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        return Byte.valueOf(this.g);
    }
}
