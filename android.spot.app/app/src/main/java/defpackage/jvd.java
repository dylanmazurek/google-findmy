package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvd extends ljn implements lkr {
    public static final jvd f;
    private static volatile lkx h;
    public int a;
    public Object c;
    public jva d;
    public int b = 0;
    private byte g = 2;
    public ljv e = lla.a;

    static {
        jvd jvdVar = new jvd();
        f = jvdVar;
        ljn.w(jvd.class, jvdVar);
    }

    private jvd() {
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
                                this.g = b;
                                return null;
                            }
                            lkx lkxVar = h;
                            if (lkxVar == null) {
                                synchronized (jvd.class) {
                                    lkxVar = h;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(f);
                                        h = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return f;
                    }
                    return new ljh(f);
                }
                return new jvd();
            }
            return new llb(f, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"c", "b", "a", "d", "e", jva.class, jvb.class});
        }
        return Byte.valueOf(this.g);
    }

    public final void b() {
        ljv ljvVar = this.e;
        if (!ljvVar.c()) {
            this.e = ljn.p(ljvVar);
        }
    }
}
