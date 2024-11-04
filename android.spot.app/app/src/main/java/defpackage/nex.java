package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nex extends ljn implements lkr {
    public static final nex o;
    private static volatile lkx p;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public nfa i;
    public ljv j = lla.a;
    public int k;
    public int l;
    public int m;
    public nfa n;

    static {
        nex nexVar = new nex();
        o = nexVar;
        ljn.w(nex.class, nexVar);
    }

    private nex() {
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
                            lkx lkxVar = p;
                            if (lkxVar == null) {
                                synchronized (nex.class) {
                                    lkxVar = p;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(o);
                                        p = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return o;
                    }
                    return new ljh(o);
                }
                return new nex();
            }
            return new llb(o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"a", "b", "c", "e", "h", "j", Cnew.class, "k", "d", "f", "g", "i", "l", "m", "n"});
        }
        return (byte) 1;
    }
}
