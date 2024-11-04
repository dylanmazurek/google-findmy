package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcd extends ljn implements lkr {
    public static final lcd e;
    private static volatile lkx f;
    public int a;
    public int b = 0;
    public Object c;
    public lcc d;

    static {
        lcd lcdVar = new lcd();
        e = lcdVar;
        ljn.w(lcd.class, lcdVar);
    }

    private lcd() {
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
                            lkx lkxVar = f;
                            if (lkxVar == null) {
                                synchronized (lcd.class) {
                                    lkxVar = f;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(e);
                                        f = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return e;
                    }
                    return new ljh(e);
                }
                return new lcd();
            }
            return new llb(e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", "a", "d", ldi.class, lcs.class, ldb.class});
        }
        return (byte) 1;
    }
}
