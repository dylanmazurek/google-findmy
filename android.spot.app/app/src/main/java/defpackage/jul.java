package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jul extends ljk implements ljl {
    public static final jul g;
    private static volatile lkx i;
    public int a;
    public jun b;
    public int c;
    public jun d;
    public long e;
    public boolean f;
    private byte h = 2;

    static {
        jul julVar = new jul();
        g = julVar;
        ljn.w(jul.class, julVar);
    }

    private jul() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                if (obj == null) {
                                    b = 0;
                                }
                                this.h = b;
                                return null;
                            }
                            lkx lkxVar = i;
                            if (lkxVar == null) {
                                synchronized (jul.class) {
                                    lkxVar = i;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(g);
                                        i = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return g;
                    }
                    return new ljj(g);
                }
                return new jul();
            }
            return new llb(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", gek.f, "d", "e", "f"});
        }
        return Byte.valueOf(this.h);
    }
}
