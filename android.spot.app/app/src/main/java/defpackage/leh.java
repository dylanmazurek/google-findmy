package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class leh extends ljn implements lkr {
    public static final leh l;
    private static volatile lkx m;
    public int a;
    public lfk c;
    public long d;
    public lfh e;
    public int f;
    public lgq g;
    public int i;
    public lgy k;
    public String b = "";
    public ljr h = ljo.a;
    public ljv j = lla.a;

    static {
        leh lehVar = new leh();
        l = lehVar;
        ljn.w(leh.class, lehVar);
    }

    private leh() {
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
                            lkx lkxVar = m;
                            if (lkxVar == null) {
                                synchronized (leh.class) {
                                    lkxVar = m;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(l);
                                        m = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return l;
                    }
                    return new ljh(l);
                }
                return new leh();
            }
            return new llb(l, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0002\u0000\u0001ဈ\u0000\u0005ဂ\u0002\u0007ဉ\u0001\bဉ\u0004\t᠌\u0005\nဉ\u0006\fࠬ\r᠌\u0007\u000f\u001b\u0010ဉ\t", new Object[]{"a", "b", "d", "c", "e", "f", lgb.d, "g", "h", lgb.e, "i", lcw.l, "j", lfm.class, "k"});
        }
        return (byte) 1;
    }
}
