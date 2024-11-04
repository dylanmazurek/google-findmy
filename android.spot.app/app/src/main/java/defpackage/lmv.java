package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmv extends ljn implements lkr {
    public static final lmv f;
    private static volatile lkx i;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    private boolean g;
    private boolean h;

    static {
        lmv lmvVar = new lmv();
        f = lmvVar;
        ljn.w(lmv.class, lmvVar);
    }

    private lmv() {
    }

    public static /* synthetic */ void c(lmv lmvVar) {
        lmvVar.a |= 1;
        lmvVar.g = true;
    }

    public static /* synthetic */ void h(lmv lmvVar) {
        lmvVar.a |= 2;
        lmvVar.h = true;
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
                            lkx lkxVar = i;
                            if (lkxVar == null) {
                                synchronized (lmv.class) {
                                    lkxVar = i;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        i = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new lmv();
            }
            return new llb(f, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0003\u0003ဇ\u0004\u0004ဇ\u0002\u0005ဂ\u0005\u0006ဇ\u0001", new Object[]{"a", "g", "c", "d", "b", "e", "h"});
        }
        return (byte) 1;
    }
}
