package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfe extends ljn implements lkr {
    private static volatile lkx D;
    public static final nfe v;
    public int a;
    public long b;
    public ndv e;
    public nea f;
    public ner g;
    public nez h;
    public ndh i;
    public nex j;
    public ned k;
    public ljv l;
    public ndd m;
    public nfd n;
    public neu o;
    public ljv p;
    public nen q;
    public nfc r;
    public nev s;
    public ndq t;
    public nem u;
    private nff w;
    private neo x;
    private byte C = 2;
    public String c = "";
    public String d = "";

    static {
        nfe nfeVar = new nfe();
        v = nfeVar;
        ljn.w(nfe.class, nfeVar);
    }

    private nfe() {
        lla llaVar = lla.a;
        this.l = llaVar;
        this.p = llaVar;
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
                                this.C = b;
                                return null;
                            }
                            lkx lkxVar = D;
                            if (lkxVar == null) {
                                synchronized (nfe.class) {
                                    lkxVar = D;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(v);
                                        D = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return v;
                    }
                    return new ljh(v);
                }
                return new nfe();
            }
            return new llb(v, "\u0001\u0016\u0000\u0001\u0001%\u0016\u0000\u0002\t\u0001ᐉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0004ဉ\u0004\u0005ဉ\u0015\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0016\tဉ\u0007\nᐉ\b\fဉ\n\u000eᐉ\u0018\u0010ᐉ\u000b\u0011ဈ\u0002\u0015ဉ\u0019\u0017ဉ\u0017\u001dᐉ\u0012\u001eဉ\u0013\u001fဉ\u0014 ဉ\u0010\"\u001b%Л", new Object[]{"a", "e", "b", "c", "w", "q", "f", "g", "r", "h", "i", "j", "t", "k", "d", "u", "s", "x", "n", "o", "m", "p", ndr.class, "l", nfh.class});
        }
        return Byte.valueOf(this.C);
    }
}
