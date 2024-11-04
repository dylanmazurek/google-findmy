package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lex extends ljn implements lkr {
    public static final lex d;
    private static volatile lkx e;
    public int a;
    public ldv b;
    public int c;

    static {
        lex lexVar = new lex();
        d = lexVar;
        ljn.w(lex.class, lexVar);
    }

    private lex() {
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
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (lex.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(d);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return d;
                    }
                    return new ljh(d);
                }
                return new lex();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"a", "b", "c", lcw.m});
        }
        return (byte) 1;
    }
}
