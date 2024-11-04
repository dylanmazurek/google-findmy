package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnr extends nns {
    private static final long serialVersionUID = -9937958251642L;
    public final transient nnz a;
    private final byte z;

    public nnr(String str, byte b, nnz nnzVar) {
        super(str);
        this.z = b;
        this.a = nnzVar;
    }

    private Object readResolve() {
        switch (this.z) {
            case 1:
                return nns.b;
            case 2:
                return nns.c;
            case 3:
                return nns.d;
            case 4:
                return nns.e;
            case 5:
                return nns.f;
            case 6:
                return nns.g;
            case 7:
                return nns.h;
            case 8:
                return nns.i;
            case 9:
                return nns.j;
            case 10:
                return nns.k;
            case 11:
                return nns.l;
            case 12:
                return nns.m;
            case 13:
                return nns.n;
            case 14:
                return nns.o;
            case 15:
                return nns.p;
            case 16:
                return nns.q;
            case 17:
                return nns.r;
            case 18:
                return nns.s;
            case 19:
                return nns.t;
            case 20:
                return nns.u;
            case 21:
                return nns.v;
            case 22:
                return nns.w;
            default:
                return nns.x;
        }
    }

    @Override // defpackage.nns
    public final nnq a(nno nnoVar) {
        byte b = this.z;
        nno c = nnt.c(nnoVar);
        switch (b) {
            case 1:
                return c.i();
            case 2:
                return c.y();
            case 3:
                return c.c();
            case 4:
                return c.x();
            case 5:
                return c.w();
            case 6:
                return c.h();
            case 7:
                return c.q();
            case 8:
                return c.f();
            case 9:
                return c.v();
            case 10:
                return c.u();
            case 11:
                return c.t();
            case 12:
                return c.g();
            case 13:
                return c.j();
            case 14:
                return c.l();
            case 15:
                return c.e();
            case 16:
                return c.d();
            case 17:
                return c.k();
            case 18:
                return c.o();
            case 19:
                return c.p();
            case 20:
                return c.r();
            case 21:
                return c.s();
            case 22:
                return c.m();
            default:
                return c.n();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nnr) && this.z == ((nnr) obj).z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1 << this.z;
    }
}
