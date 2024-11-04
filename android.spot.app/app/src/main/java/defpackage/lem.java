package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lem extends ljn implements lkr {
    public static final lem h;
    private static volatile lkx i;
    public int a;
    public lfj c;
    public int d;
    public ldt f;
    public String b = "";
    public ljv e = lla.a;
    public String g = "";

    static {
        lem lemVar = new lem();
        h = lemVar;
        ljn.w(lem.class, lemVar);
    }

    private lem() {
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
                                synchronized (lem.class) {
                                    lkxVar = i;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(h);
                                        i = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return h;
                    }
                    return new ljh(h);
                }
                return new lem();
            }
            return new llb(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0005᠌\u0002\u0006ဉ\u0003\u0007ဈ\u0004", new Object[]{"a", "b", "c", "e", lel.class, "d", lgb.g, "f", "g"});
        }
        return (byte) 1;
    }

    public final void b() {
        ljv ljvVar = this.e;
        if (!ljvVar.c()) {
            this.e = ljn.p(ljvVar);
        }
    }
}
