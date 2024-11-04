package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jue extends ljn implements lkr {
    public static final jue h;
    private static volatile lkx k;
    public int a;
    public juw b;
    public juw d;
    public jut e;
    public jum f;
    public juf g;
    private juw i;
    private byte j = 2;
    public ljv c = lla.a;

    static {
        jue jueVar = new jue();
        h = jueVar;
        ljn.w(jue.class, jueVar);
    }

    private jue() {
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
                                this.j = b;
                                return null;
                            }
                            lkx lkxVar = k;
                            if (lkxVar == null) {
                                synchronized (jue.class) {
                                    lkxVar = k;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(h);
                                        k = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return h;
                    }
                    return new ljh(h);
                }
                return new jue();
            }
            return new llb(h, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new Object[]{"a", "b", "c", juu.class, "d", "e", "f", "i", "g"});
        }
        return Byte.valueOf(this.j);
    }
}
