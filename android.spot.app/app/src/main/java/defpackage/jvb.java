package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvb extends ljn implements lkr {
    public static final jvb b;
    private static volatile lkx d;
    private byte c = 2;
    public ljv a = lla.a;

    static {
        jvb jvbVar = new jvb();
        b = jvbVar;
        ljn.w(jvb.class, jvbVar);
    }

    private jvb() {
    }

    @Override // defpackage.ljn
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b2 = 0;
                                }
                                this.c = b2;
                                return null;
                            }
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (jvb.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(b);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return b;
                    }
                    return new ljh(b);
                }
                return new jvb();
            }
            return new llb(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", jvc.class});
        }
        return Byte.valueOf(this.c);
    }

    public final void b() {
        ljv ljvVar = this.a;
        if (!ljvVar.c()) {
            this.a = ljn.p(ljvVar);
        }
    }
}
