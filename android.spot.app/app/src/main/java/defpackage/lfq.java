package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfq extends ljn implements lkr {
    public static final lfq j;
    private static volatile lkx k;
    public int a;
    public Object c;
    public Object e;
    public lgz h;
    public lia i;
    public int b = 0;
    public int d = 0;
    public String f = "";
    public String g = "";

    static {
        lfq lfqVar = new lfq();
        j = lfqVar;
        ljn.w(lfq.class, lfqVar);
    }

    private lfq() {
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
                                synchronized (lfq.class) {
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
                return new lfq();
            }
            return new llb(j, "\u0001\t\u0002\u0001\u0002\n\t\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004;\u0000\u0005ဉ\u0003\u0006ဉ\u0004\u0007\u083f\u0000\b;\u0001\t<\u0001\n<\u0001", new Object[]{"c", "b", "e", "d", "a", "f", "g", "h", "i", lcw.s, ldv.class, lix.class});
        }
        return (byte) 1;
    }
}
