package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nny extends nnz {
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;

    public nny(String str, byte b) {
        super(str);
        this.n = b;
    }

    private Object readResolve() {
        switch (this.n) {
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case 4:
                return d;
            case 5:
                return e;
            case 6:
                return f;
            case 7:
                return g;
            case 8:
                return h;
            case 9:
                return i;
            case 10:
                return j;
            case 11:
                return k;
            default:
                return l;
        }
    }

    @Override // defpackage.nnz
    public final nnx a(nno nnoVar) {
        byte b = this.n;
        nno c = nnt.c(nnoVar);
        switch (b) {
            case 1:
                return c.C();
            case 2:
                return c.A();
            case 3:
                return c.K();
            case 4:
                return c.L();
            case 5:
                return c.H();
            case 6:
                return c.J();
            case 7:
                return c.B();
            case 8:
                return c.D();
            case 9:
                return c.E();
            case 10:
                return c.G();
            case 11:
                return c.I();
            default:
                return c.F();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nny) && this.n == ((nny) obj).n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1 << this.n;
    }
}
