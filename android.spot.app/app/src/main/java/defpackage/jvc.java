package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvc extends ljn implements lkr {
    public static final jvc e;
    private static volatile lkx g;
    public int a;
    public jva b;
    public int c;
    private byte f = 2;
    public ljr d = ljo.a;

    static {
        jvc jvcVar = new jvc();
        e = jvcVar;
        ljn.w(jvc.class, jvcVar);
    }

    private jvc() {
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
                                this.f = b;
                                return null;
                            }
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (jvc.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new jvc();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new Object[]{"a", "b", "c", "d"});
        }
        return Byte.valueOf(this.f);
    }
}
