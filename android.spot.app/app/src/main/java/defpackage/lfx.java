package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfx extends ljn implements lkr {
    public static final lfx i;
    private static volatile lkx j;
    public int a;
    public String b = "";
    public String c = "";
    public ljv d;
    public ljv e;
    public int f;
    public ljv g;
    public lfw h;

    static {
        lfx lfxVar = new lfx();
        i = lfxVar;
        ljn.w(lfx.class, lfxVar);
    }

    private lfx() {
        lla llaVar = lla.a;
        this.d = llaVar;
        this.e = llaVar;
        this.g = llaVar;
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
                                synchronized (lfx.class) {
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
                return new lfx();
            }
            return new llb(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002\u0006\u001b\u0007ဉ\u0003", new Object[]{"a", "b", "c", "d", lgh.class, "e", lfq.class, "f", lcw.u, "g", lgh.class, "h"});
        }
        return (byte) 1;
    }
}
