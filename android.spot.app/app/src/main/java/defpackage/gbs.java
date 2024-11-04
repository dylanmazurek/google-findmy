package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbs extends ljk implements gbt {
    public static final gbs h;
    private static volatile lkx j;
    public int a;
    public juv c;
    public int d;
    public long e;
    public long f;
    public long g;
    private byte i = 2;
    public ljr b = ljo.a;

    static {
        gbs gbsVar = new gbs();
        h = gbsVar;
        ljn.w(gbs.class, gbsVar);
    }

    private gbs() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b = 0;
                                }
                                this.i = b;
                                return null;
                            }
                            lkx lkxVar = j;
                            if (lkxVar == null) {
                                synchronized (gbs.class) {
                                    lkxVar = j;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(h);
                                        j = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return h;
                    }
                    return new ljj(h);
                }
                return new gbs();
            }
            return new llb(h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005᠌\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"a", "b", "c", "d", gek.j, "e", "f", "g"});
        }
        return Byte.valueOf(this.i);
    }
}
