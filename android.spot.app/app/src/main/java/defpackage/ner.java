package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ner extends ljn implements lkr {
    public static final ner k;
    private static volatile lkx m;
    public int a;
    public boolean b;
    public nek c;
    public int f;
    public jvd h;
    public net i;
    public neq j;
    private byte l = 2;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        ner nerVar = new ner();
        k = nerVar;
        ljn.w(ner.class, nerVar);
    }

    private ner() {
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
                                this.l = b;
                                return null;
                            }
                            lkx lkxVar = m;
                            if (lkxVar == null) {
                                synchronized (ner.class) {
                                    lkxVar = m;
                                    if (lkxVar == null) {
                                        lkxVar = new lji(k);
                                        m = lkxVar;
                                    }
                                }
                            }
                            return lkxVar;
                        }
                        return k;
                    }
                    return new ljh(k);
                }
                return new ner();
            }
            return new llb(k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\u000bဉ\n\fဉ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", nep.c, "g", "h", "i", "j"});
        }
        return Byte.valueOf(this.l);
    }
}
