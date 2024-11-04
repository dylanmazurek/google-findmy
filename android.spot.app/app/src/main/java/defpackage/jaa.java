package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jaa extends ljn implements lkr {
    public static final jaa e;
    private static volatile lkx g;
    public ljv a;
    public ljv b;
    public ljv c;
    public ljv d;
    private byte f = 2;

    static {
        jaa jaaVar = new jaa();
        e = jaaVar;
        ljn.w(jaa.class, jaaVar);
    }

    private jaa() {
        lla llaVar = lla.a;
        this.a = llaVar;
        this.b = llaVar;
        this.c = llaVar;
        this.d = llaVar;
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
                                synchronized (jaa.class) {
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
                return new jaa();
            }
            return new llb(e, "\u0001\u0004\u0000\u0000\u00032\u0004\u0000\u0004\u0000\u0003\u001b\u0004\u001b0\u001b2\u001b", new Object[]{"b", izz.class, "c", jad.class, "a", jae.class, "d", izy.class});
        }
        return Byte.valueOf(this.f);
    }
}
