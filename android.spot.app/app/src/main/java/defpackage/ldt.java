package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldt extends ljn implements lkr {
    public static final ldt a;
    private static volatile lkx b;

    static {
        ldt ldtVar = new ldt();
        a = ldtVar;
        ljn.w(ldt.class, ldtVar);
    }

    private ldt() {
        lim limVar = lim.b;
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
                            lkx lkxVar = b;
                            if (lkxVar == null) {
                                synchronized (ldt.class) {
                                    lkxVar = b;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(a);
                                        b = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return a;
                    }
                    return new ljh(a);
                }
                return new ldt();
            }
            return new llb(a, "\u0001\u0000", null);
        }
        return (byte) 1;
    }
}
