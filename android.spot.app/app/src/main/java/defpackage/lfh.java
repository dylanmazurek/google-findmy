package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfh extends ljn implements lkr {
    public static final lfh g;
    private static volatile lkx h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public lfg e;
    public lia f;

    static {
        lfh lfhVar = new lfh();
        g = lfhVar;
        ljn.w(lfh.class, lfhVar);
    }

    private lfh() {
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
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (lfh.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(g);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return g;
                    }
                    return new ljh(g);
                }
                return new lfh();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u001e\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0005\u0004ဈ\u0003\u0005ဈ\u0002\u001eဉ\u0006", new Object[]{"a", "b", "e", "d", "c", "f"});
        }
        return (byte) 1;
    }
}
