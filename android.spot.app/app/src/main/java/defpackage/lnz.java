package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnz extends ljk implements ljl {
    public static final lnz k;
    private static volatile lkx n;
    public int a;
    public long b;
    public long c;
    public int d;
    public lim e;
    public long f;
    public lim g;
    public boolean h;
    public String i;
    public lob j;
    private byte m = 2;

    static {
        lnz lnzVar = new lnz();
        k = lnzVar;
        ljn.w(lnz.class, lnzVar);
    }

    private lnz() {
        lla llaVar = lla.a;
        lim limVar = lim.b;
        lim limVar2 = lim.b;
        this.e = limVar2;
        this.f = 180000L;
        this.g = limVar2;
        ljo ljoVar = ljo.a;
        this.i = "";
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
                                this.m = b;
                                return null;
                            }
                            lkx lkxVar = n;
                            if (lkxVar == null) {
                                synchronized (lnz.class) {
                                    lkxVar = n;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(k);
                                        n = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return k;
                    }
                    return new ljj(k);
                }
                return new lnz();
            }
            return new llb(k, "\u0001\t\u0000\u0001\u0001!\t\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0012ည\u0013\u0019ဇ\u0017\u001cဈ\u0018!ᐉ\u001b", new Object[]{"a", "b", "e", "d", "f", "c", "g", "h", "i", "j"});
        }
        return Byte.valueOf(this.m);
    }
}
