package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jad extends ljn implements lkr {
    public static final jad e;
    private static volatile lkx f;
    public int a;
    public jab b;
    public String c = "";
    public boolean d;

    static {
        jad jadVar = new jad();
        e = jadVar;
        ljn.w(jad.class, jadVar);
    }

    private jad() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (jad.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new jad();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        }
        return (byte) 1;
    }
}
