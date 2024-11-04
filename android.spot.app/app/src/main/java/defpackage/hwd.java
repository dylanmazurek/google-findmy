package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwd extends ljn implements lkr {
    public static final hwd i;
    private static volatile lkx j;
    public int a;
    public String b = "";
    public lim c = lim.b;
    public String d = "";
    public ljv e;
    public ljv f;
    public boolean g;
    public long h;

    static {
        hwd hwdVar = new hwd();
        i = hwdVar;
        ljn.w(hwd.class, hwdVar);
    }

    private hwd() {
        lla llaVar = lla.a;
        this.e = llaVar;
        this.f = llaVar;
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
                                synchronized (hwd.class) {
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
                return new hwd();
            }
            return new llb(i, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"a", "d", "b", "c", "e", hwe.class, "f", "g", "h"});
        }
        return (byte) 1;
    }
}
