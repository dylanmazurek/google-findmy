package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngm {
    public ngk a;
    public int b;
    public String c;
    public nga d;
    public ngp e;
    public ngn f;
    public ngn g;
    public ngn h;
    public long i;
    public long j;
    public nhc k;
    public ktf l;
    private ngi m;

    public ngm() {
        this.b = -1;
        this.l = new ktf((byte[]) null, (byte[]) null);
    }

    public static final void b(String str, ngn ngnVar) {
        if (ngnVar != null) {
            if (ngnVar.g == null) {
                if (ngnVar.h == null) {
                    if (ngnVar.i == null) {
                        if (ngnVar.j != null) {
                            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
                }
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
    }

    public final ngn a() {
        int i = this.b;
        if (i >= 0) {
            ngk ngkVar = this.a;
            if (ngkVar != null) {
                ngi ngiVar = this.m;
                if (ngiVar != null) {
                    String str = this.c;
                    if (str != null) {
                        return new ngn(ngkVar, ngiVar, str, i, this.d, this.l.m(), this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                    }
                    throw new IllegalStateException("message == null");
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
        throw new IllegalStateException(a.ae(i, "code < 0: "));
    }

    public final void c(ngb ngbVar) {
        this.l = ngbVar.e();
    }

    public final void d(ngi ngiVar) {
        ngiVar.getClass();
        this.m = ngiVar;
    }

    public ngm(ngn ngnVar) {
        this.b = -1;
        this.a = ngnVar.a;
        this.m = ngnVar.b;
        this.b = ngnVar.d;
        this.c = ngnVar.c;
        this.d = ngnVar.e;
        this.l = ngnVar.f.e();
        this.e = ngnVar.g;
        this.f = ngnVar.h;
        this.g = ngnVar.i;
        this.h = ngnVar.j;
        this.i = ngnVar.k;
        this.j = ngnVar.l;
        this.k = ngnVar.m;
    }
}
