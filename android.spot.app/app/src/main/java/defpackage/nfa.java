package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfa extends ljn implements lkr {
    public static final nfa c;
    private static volatile lkx d;
    public ljr a;
    public ljr b;

    static {
        nfa nfaVar = new nfa();
        c = nfaVar;
        ljn.w(nfa.class, nfaVar);
    }

    private nfa() {
        ljo ljoVar = ljo.a;
        this.a = ljoVar;
        this.b = ljoVar;
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
                            lkx lkxVar = d;
                            if (lkxVar == null) {
                                synchronized (nfa.class) {
                                    lkxVar = d;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(c);
                                        d = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return c;
                    }
                    return new ljh(c);
                }
                return new nfa();
            }
            return new llb(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"a", "b"});
        }
        return (byte) 1;
    }
}
