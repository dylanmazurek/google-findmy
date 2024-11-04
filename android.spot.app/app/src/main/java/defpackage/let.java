package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class let extends ljn implements lkr {
    public static final let j;
    private static volatile lkx k;
    public int a;
    public int b;
    public lfj d;
    public lfh f;
    public lez g;
    public lgq h;
    public String c = "";
    public ljv e = lla.a;
    public String i = "";

    static {
        let letVar = new let();
        j = letVar;
        ljn.w(let.class, letVar);
    }

    private let() {
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
                                synchronized (let.class) {
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
                return new let();
            }
            return new llb(j, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0000\u0001ဈ\u0001\u0003\u001a\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\n᠌\u0000\fဉ\u0005\rဈ\u0006", new Object[]{"a", "c", "e", "d", "f", "g", "b", lgb.g, "h", "i"});
        }
        return (byte) 1;
    }
}
