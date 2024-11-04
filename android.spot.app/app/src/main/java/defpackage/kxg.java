package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxg extends ljn implements lkr {
    public static final kxg h;
    private static volatile lkx i;
    public int a;
    public kwy b;
    public kwy c;
    public kwy d;
    public kwy e;
    public String f = "";
    public String g = "";

    static {
        kxg kxgVar = new kxg();
        h = kxgVar;
        ljn.w(kxg.class, kxgVar);
    }

    private kxg() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                return null;
                            }
                            lkx lkxVar = i;
                            if (lkxVar == null) {
                                synchronized (kxg.class) {
                                    lkxVar = i;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(h);
                                        i = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return h;
                    }
                    return new ljh(h);
                }
                return new kxg();
            }
            return new llb(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        }
        return (byte) 1;
    }
}
