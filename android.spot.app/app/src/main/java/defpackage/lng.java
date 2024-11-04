package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lng extends ljn implements lkr {
    public static final lng g;
    private static volatile lkx h;
    public int a;
    public lmp b;
    public int c;
    public String d = "";
    public String e = "";
    public lnf f;

    static {
        lng lngVar = new lng();
        g = lngVar;
        ljn.w(lng.class, lngVar);
    }

    private lng() {
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
                                synchronized (lng.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(g);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return g;
                    }
                    return new ljh(g);
                }
                return new lng();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0004\u0003᠌\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", "f", "c", lnj.h, "d", "e"});
        }
        return (byte) 1;
    }
}
