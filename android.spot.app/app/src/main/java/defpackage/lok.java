package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lok extends ljn implements lkr {
    public static final lok e;
    private static volatile lkx f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        lok lokVar = new lok();
        e = lokVar;
        ljn.w(lok.class, lokVar);
    }

    private lok() {
    }

    public static /* synthetic */ void c(lok lokVar) {
        lokVar.a |= 4;
        lokVar.c = 100;
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
                                synchronized (lok.class) {
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
                return new lok();
            }
            return new llb(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0005᠌\u0004", new Object[]{"a", "b", "c", "d", lnj.f});
        }
        return (byte) 1;
    }
}
