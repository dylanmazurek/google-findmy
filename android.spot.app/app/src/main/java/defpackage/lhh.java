package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhh extends ljn implements lkr {
    public static final lhh h;
    private static volatile lkx i;
    public int a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        lhh lhhVar = new lhh();
        h = lhhVar;
        ljn.w(lhh.class, lhhVar);
    }

    private lhh() {
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
                                synchronized (lhh.class) {
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
                return new lhh();
            }
            return new llb(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", lgb.n, "d", "e", lgb.o, "f", "g"});
        }
        return (byte) 1;
    }
}
