package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efn implements eiw {
    public jer a;
    public jer b;
    public jer c;
    public jer d;
    public jer e;
    public jer f;
    public jer g;
    public jer h;
    public int i;
    public int j;
    private eiu k;
    private eiv l;
    private ekk m;
    private ekl n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private jer s;
    private byte t;

    public efn() {
        throw null;
    }

    @Override // defpackage.eiw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final efp c() {
        int i;
        int i2;
        boolean z;
        eiu eiuVar = this.k;
        if (eiuVar != null) {
            this.l = eiuVar.a();
        } else if (this.l == null) {
            this.l = eiv.c().a();
        }
        ekk ekkVar = this.m;
        if (ekkVar != null) {
            this.n = ekkVar.a();
        } else if (this.n == null) {
            this.n = ekl.a().a();
        }
        if (this.t == 15 && (i = this.i) != 0 && (i2 = this.j) != 0) {
            efz efzVar = new efz(this.l, this.n, this.a, this.o, this.p, this.q, this.b, this.c, i, this.r, this.d, i2, this.s, this.e, this.f, this.g, this.h);
            boolean z2 = false;
            if (efzVar.l.g() && efzVar.m.g()) {
                z = false;
            } else {
                z = true;
            }
            hwx.U(z);
            if (efzVar.n.g() == efzVar.o.g()) {
                z2 = true;
            }
            hwx.J(z2);
            return efzVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.t & 1) == 0) {
            sb.append(" historicLocationReceived");
        }
        if ((this.t & 2) == 0) {
            sb.append(" liveLocationReceived");
        }
        if ((this.t & 4) == 0) {
            sb.append(" pastLocateActionTimeout");
        }
        if (this.i == 0) {
            sb.append(" locationError");
        }
        if ((this.t & 8) == 0) {
            sb.append(" shouldRefreshLocation");
        }
        if (this.j == 0) {
            sb.append(" locationSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eiw
    public final eiu b() {
        if (this.k == null) {
            eiv eivVar = this.l;
            if (eivVar == null) {
                this.k = eiv.c();
            } else {
                this.k = eivVar.d();
                this.l = null;
            }
        }
        return this.k;
    }

    @Override // defpackage.eiw
    public final ekk d() {
        if (this.m == null) {
            ekl eklVar = this.n;
            if (eklVar == null) {
                this.m = ekl.a();
            } else {
                this.m = new ekk(eklVar);
                this.n = null;
            }
        }
        return this.m;
    }

    public final void e(boolean z) {
        this.o = z;
        this.t = (byte) (this.t | 1);
    }

    public final void f(Long l) {
        this.s = jer.i(l);
    }

    public final void g(boolean z) {
        this.p = z;
        this.t = (byte) (this.t | 2);
    }

    public final void h(boolean z) {
        this.q = z;
        this.t = (byte) (this.t | 4);
    }

    public final void i(boolean z) {
        this.r = z;
        this.t = (byte) (this.t | 8);
    }

    public efn(efp efpVar) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        this.c = jdlVar;
        this.d = jdlVar;
        this.s = jdlVar;
        this.e = jdlVar;
        this.f = jdlVar;
        this.g = jdlVar;
        this.h = jdlVar;
        this.l = efpVar.a();
        this.n = efpVar.c();
        this.a = efpVar.f();
        this.o = efpVar.o();
        this.p = efpVar.p();
        this.q = efpVar.q();
        this.b = efpVar.e();
        this.c = efpVar.h();
        this.i = efpVar.r();
        this.r = efpVar.n();
        this.d = efpVar.i();
        this.j = efpVar.s();
        this.s = efpVar.g();
        this.e = efpVar.j();
        this.f = efpVar.m();
        this.g = efpVar.k();
        this.h = efpVar.l();
        this.t = (byte) 15;
    }

    public efn(byte[] bArr) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        this.c = jdlVar;
        this.d = jdlVar;
        this.s = jdlVar;
        this.e = jdlVar;
        this.f = jdlVar;
        this.g = jdlVar;
        this.h = jdlVar;
    }
}
