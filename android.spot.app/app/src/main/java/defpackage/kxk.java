package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxk extends ljn implements lkr {
    public static final kxk d;
    private static volatile lkx e;
    public int a;
    public int b;
    public lkl c = lkl.a;

    static {
        kxk kxkVar = new kxk();
        d = kxkVar;
        ljn.w(kxk.class, kxkVar);
    }

    private kxk() {
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
                                synchronized (kxk.class) {
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
                return new kxk();
            }
            return new llb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"a", "b", "c", kxj.a});
        }
        return (byte) 1;
    }

    public final lkl b() {
        lkl lklVar = this.c;
        if (!lklVar.b) {
            this.c = lklVar.a();
        }
        return this.c;
    }
}
