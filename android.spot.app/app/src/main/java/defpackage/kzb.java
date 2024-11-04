package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzb extends ljn implements lkr {
    public static final kzb i;
    private static volatile lkx j;
    public int a;
    public kym b;
    public lln c;
    public ljv d;
    public ljv e;
    public int f;
    public lkl g = lkl.a;
    public int h;

    static {
        kzb kzbVar = new kzb();
        i = kzbVar;
        ljn.w(kzb.class, kzbVar);
    }

    private kzb() {
        lla llaVar = lla.a;
        this.d = llaVar;
        this.e = llaVar;
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
                                synchronized (kzb.class) {
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
                return new kzb();
            }
            return new llb(i, "\u0000\u0007\u0000\u0001\u0001\n\u0007\u0001\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005\u001b\u0006\u001b\b\f\t\u0004\n2", new Object[]{"a", "b", "c", "d", kym.class, "e", lln.class, "h", "f", "g", kza.a});
        }
        return (byte) 1;
    }
}
