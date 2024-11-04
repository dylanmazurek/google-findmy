package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpw extends ljn implements lkr {
    public static final lpw i;
    private static volatile lkx j;
    public int a;
    public long b;
    public lqr c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public lpz h;

    static {
        lpw lpwVar = new lpw();
        i = lpwVar;
        ljn.w(lpw.class, lpwVar);
    }

    private lpw() {
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
                                synchronized (lpw.class) {
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
                return new lpw();
            }
            return new llb(i, "\u0000\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0000\u0000\u0002စ\u0000\u0005င\u0002\u0007ဂ\u0003\bဂ\u0004\tဇ\u0005\nဉ\u0001\u000bဉ\u0006", new Object[]{"a", "b", "d", "e", "f", "g", "c", "h"});
        }
        return (byte) 1;
    }
}
