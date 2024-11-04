package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyl extends ljn implements lkr {
    public static final kyl j;
    private static volatile lkx k;
    public int a;
    public Object c;
    public int e;
    public int g;
    public kxz h;
    public int i;
    public int b = 0;
    public String d = "";
    public ljv f = lla.a;

    static {
        kyl kylVar = new kyl();
        j = kylVar;
        ljn.w(kyl.class, kylVar);
    }

    private kyl() {
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
                            lkx lkxVar = k;
                            if (lkxVar == null) {
                                synchronized (kyl.class) {
                                    lkxVar = k;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(j);
                                        k = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return j;
                    }
                    return new ljh(j);
                }
                return new kyl();
            }
            return new llb(j, "\u0000\b\u0001\u0001\u0001\u000f\b\u0000\u0001\u0000\u0001Ȉ\u0002\f\t<\u0000\n=\u0000\u000b\f\fဉ\u0000\r\f\u000f\u001b", new Object[]{"c", "b", "a", "d", "e", kyk.class, "g", "h", "i", "f", kyi.class});
        }
        return (byte) 1;
    }
}
