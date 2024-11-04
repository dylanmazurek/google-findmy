package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndq extends ljk implements ljl {
    public static final ndq a;
    private static volatile lkx c;
    private byte b = 2;

    static {
        ndq ndqVar = new ndq();
        a = ndqVar;
        ljn.w(ndq.class, ndqVar);
    }

    private ndq() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b = 0;
                                } else {
                                    b = 1;
                                }
                                this.b = b;
                                return null;
                            }
                            lkx lkxVar = c;
                            if (lkxVar == null) {
                                synchronized (ndq.class) {
                                    lkxVar = c;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(a);
                                        c = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return a;
                    }
                    return new ljj(a);
                }
                return new ndq();
            }
            return new llb(a, "\u0001\u0000", null);
        }
        return Byte.valueOf(this.b);
    }
}
