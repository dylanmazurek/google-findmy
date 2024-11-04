package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgj extends ljn implements lkr {
    public static final lgj b;
    private static volatile lkx c;
    public lju a = lkh.a;

    static {
        lgj lgjVar = new lgj();
        b = lgjVar;
        ljn.w(lgj.class, lgjVar);
    }

    private lgj() {
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
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (lgj.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new lgj();
            }
            return new llb(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"a"});
        }
        return (byte) 1;
    }

    public final void b() {
        lju ljuVar = this.a;
        if (!ljuVar.c()) {
            this.a = ljn.o(ljuVar);
        }
    }
}
