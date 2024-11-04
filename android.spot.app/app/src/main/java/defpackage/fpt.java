package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpt extends ljn implements lkr {
    public static final fpt i;
    private static volatile lkx k;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public boolean g;
    public fps h;
    private int j;

    static {
        fpt fptVar = new fpt();
        i = fptVar;
        ljn.w(fpt.class, fptVar);
    }

    private fpt() {
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
                                synchronized (fpt.class) {
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
                return new fpt();
            }
            return new llb(i, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006\u0007\u0007\u0007\bဉ\u0004", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
