package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ler extends ljn implements lkr {
    public static final ler f;
    private static volatile lkx g;
    public int a;
    public String b = "";
    public ljv c = lla.a;
    public lfj d;
    public lgq e;

    static {
        ler lerVar = new ler();
        f = lerVar;
        ljn.w(ler.class, lerVar);
    }

    private ler() {
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
                            lkx lkxVar = g;
                            if (lkxVar == null) {
                                synchronized (ler.class) {
                                    lkxVar = g;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        g = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new ler();
            }
            return new llb(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", lex.class, "d", "e"});
        }
        return (byte) 1;
    }
}
