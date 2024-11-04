package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lad extends ljn implements lkr {
    public static final lad h;
    private static volatile lkx i;
    public int a;
    public kxv b;
    public int c;
    public kyq e;
    public long f;
    public ljv d = lla.a;
    public lim g = lim.b;

    static {
        lad ladVar = new lad();
        h = ladVar;
        ljn.w(lad.class, ladVar);
    }

    private lad() {
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
                            lkx lkxVar = i;
                            if (lkxVar == null) {
                                synchronized (lad.class) {
                                    lkxVar = i;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(h);
                                        i = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return h;
                    }
                    return new ljh(h);
                }
                return new lad();
            }
            return new llb(h, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002\f\u0003Ț\u0005ဉ\u0001\u0006\u0005\u0007\n", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        }
        return (byte) 1;
    }
}
