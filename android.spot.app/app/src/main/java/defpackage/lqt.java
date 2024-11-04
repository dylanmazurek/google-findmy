package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqt extends ljn implements lkr {
    public static final lqt h;
    private static volatile lkx i;
    public int a;
    public Object c;
    public int d;
    public boolean g;
    public int b = 0;
    public String e = "";
    public String f = "";

    static {
        lqt lqtVar = new lqt();
        h = lqtVar;
        ljn.w(lqt.class, lqtVar);
    }

    private lqt() {
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
                                synchronized (lqt.class) {
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
                return new lqt();
            }
            return new llb(h, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006ဇ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", lqm.class, lqv.class, "g"});
        }
        return (byte) 1;
    }
}
