package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmu extends ljn implements lkr {
    public static final lmu i;
    private static volatile lkx j;
    public int a;
    public lmx b;
    public lms c;
    public lmv d;
    public lmw e;
    public lmy f;
    public lmt g;
    public lmz h;

    static {
        lmu lmuVar = new lmu();
        i = lmuVar;
        ljn.w(lmu.class, lmuVar);
    }

    private lmu() {
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
                            lkx lkxVar = j;
                            if (lkxVar == null) {
                                synchronized (lmu.class) {
                                    lkxVar = j;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(i);
                                        j = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return i;
                    }
                    return new ljh(i);
                }
                return new lmu();
            }
            return new llb(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\nဉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
