package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huk extends ljn implements lkr {
    public static final huk i;
    public static final nqe j;
    private static volatile lkx k;
    public int a;
    public boolean d;
    public boolean h;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public ljr g = ljo.a;

    static {
        huk hukVar = new huk();
        i = hukVar;
        ljn.w(huk.class, hukVar);
        j = ljn.B(hue.c, hukVar, hukVar, 334728578, llx.MESSAGE);
    }

    private huk() {
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
                            lkx lkxVar = k;
                            if (lkxVar == null) {
                                synchronized (huk.class) {
                                    lkxVar = k;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(i);
                                        k = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return i;
                    }
                    return new ljh(i);
                }
                return new huk();
            }
            return new llb(i, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006'\u0007ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
