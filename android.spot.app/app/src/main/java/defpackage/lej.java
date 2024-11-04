package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class lej extends ljn implements lkr {
    public static final lej j;
    private static volatile lkx k;
    public int a;
    public lfk c;
    public long d;
    public int e;
    public lfh f;
    public int g;
    public lgq i;
    public String b = "";
    public ljv h = lla.a;

    static {
        lej lejVar = new lej();
        j = lejVar;
        ljn.w(lej.class, lejVar);
    }

    private lej() {
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
                            lkx lkxVar = k;
                            if (lkxVar == null) {
                                synchronized (lej.class) {
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
                return new lej();
            }
            return new llb(j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0001\u0000\u0001ဈ\u0000\u0005᠌\u0004\u0007ဂ\u0002\bဉ\u0001\tဉ\u0005\n\u001b\u000b᠌\u0006\fဉ\u0007", new Object[]{"a", "b", "e", lgb.h, "d", "c", "f", "h", lfm.class, "g", lgb.d, "i"});
        }
        return (byte) 1;
    }
}
