package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nea extends ljn implements lkr {
    public static final nea c;
    private static volatile lkx e;
    public ljv a;
    public ljv b;
    private byte d = 2;

    static {
        nea neaVar = new nea();
        c = neaVar;
        ljn.w(nea.class, neaVar);
    }

    private nea() {
        lla llaVar = lla.a;
        this.a = llaVar;
        this.b = llaVar;
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
                                this.d = b;
                                return null;
                            }
                            lkx lkxVar = e;
                            if (lkxVar == null) {
                                synchronized (nea.class) {
                                    lkxVar = e;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        e = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new nea();
            }
            return new llb(c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"a", ndz.class, "b", nec.class});
        }
        return Byte.valueOf(this.d);
    }

    public final void c() {
        ljv ljvVar = this.a;
        if (!ljvVar.c()) {
            this.a = ljn.p(ljvVar);
        }
    }
}
