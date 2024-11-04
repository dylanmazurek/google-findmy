package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjz extends ljn implements lkr {
    public static final kjz i;
    private static volatile lkx k;
    public int a;
    public kka b;
    public lim c = lim.b;
    public lim d;
    public lim e;
    public lim f;
    public lim g;
    public lim h;
    private int j;

    static {
        kjz kjzVar = new kjz();
        i = kjzVar;
        ljn.w(kjz.class, kjzVar);
    }

    private kjz() {
        lim limVar = lim.b;
        this.d = limVar;
        this.e = limVar;
        this.f = limVar;
        this.g = limVar;
        this.h = limVar;
    }

    @Override // defpackage.ljn
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                return null;
                            }
                            lkx lkxVar = k;
                            if (lkxVar == null) {
                                synchronized (kjz.class) {
                                    lkxVar = k;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(i);
                                        k = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return i;
                    }
                    return new ljh(i);
                }
                return new kjz();
            }
            return new llb(i, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
