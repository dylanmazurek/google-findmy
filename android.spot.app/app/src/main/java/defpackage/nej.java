package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nej extends ljn implements lkr {
    public static final nej h;
    private static volatile lkx i;
    public int a;
    public long b;
    public boolean c;
    public int d;
    public int f;
    public String e = "";
    public String g = "";

    static {
        nej nejVar = new nej();
        h = nejVar;
        ljn.w(nej.class, nejVar);
    }

    private nej() {
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
                                synchronized (nej.class) {
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
                return new nej();
            }
            return new llb(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        }
        return (byte) 1;
    }
}
