package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnc extends ljn implements lkr {
    public static final lnc i;
    private static volatile lkx j;
    public int a;
    public String b = "";
    public int c;
    public lmu d;
    public int e;
    public lna f;
    public lng g;
    public lnd h;

    static {
        lnc lncVar = new lnc();
        i = lncVar;
        ljn.w(lnc.class, lncVar);
    }

    private lnc() {
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
                                synchronized (lnc.class) {
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
                return new lnc();
            }
            return new llb(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004ဉ\u0004\u0006ဉ\u0006\u0007ဉ\u0002\bဉ\u0007", new Object[]{"a", "b", "c", lgb.t, "e", lgb.s, "f", "g", "d", "h"});
        }
        return (byte) 1;
    }
}
