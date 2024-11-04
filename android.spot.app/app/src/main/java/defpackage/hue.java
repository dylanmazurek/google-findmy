package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hue extends ljk implements ljl {
    public static final hue c;
    private static volatile lkx e;
    public int a;
    public nfe b;
    private byte d = 2;

    static {
        hue hueVar = new hue();
        c = hueVar;
        ljn.w(hue.class, hueVar);
    }

    private hue() {
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
                                this.d = b;
                                return null;
                            }
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (hue.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljj(c);
                }
                return new hue();
            }
            return new llb(c, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        }
        return Byte.valueOf(this.d);
    }
}
