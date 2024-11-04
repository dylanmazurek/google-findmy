package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwq extends ljn implements lkr {
    public static final ljs i = new gxd(3);
    public static final hwq j;
    private static volatile lkx k;
    public int a;
    public boolean c;
    public long e;
    public ljv f;
    public ljv g;
    public ljr h;
    public lim b = lim.b;
    public String d = "";

    static {
        hwq hwqVar = new hwq();
        j = hwqVar;
        ljn.w(hwq.class, hwqVar);
    }

    private hwq() {
        lla llaVar = lla.a;
        this.f = llaVar;
        this.g = llaVar;
        this.h = ljo.a;
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
                                synchronized (hwq.class) {
                                    lkxVar = k;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(j);
                                        k = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return j;
                    }
                    return new ljh(j);
                }
                return new hwq();
            }
            return new llb(j, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", gek.n});
        }
        return (byte) 1;
    }
}
