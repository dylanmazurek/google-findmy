package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nie implements nhr {
    public final ngh a;
    public final nhi b;
    public final nkr c;
    public final nkq d;
    public int e;
    public final nhx f;
    public ngb g;

    public nie(ngh nghVar, nhi nhiVar, nkr nkrVar, nkq nkqVar) {
        this.a = nghVar;
        this.b = nhiVar;
        this.c = nkrVar;
        this.d = nkqVar;
        this.f = new nhx(nkrVar);
    }

    public static final void l(nkv nkvVar) {
        nln nlnVar = nkvVar.a;
        nkvVar.a = nln.j;
        nlnVar.m();
        nlnVar.i();
    }

    private static final boolean m(ngn ngnVar) {
        return moz.v("chunked", ngn.a(ngnVar, "Transfer-Encoding"));
    }

    @Override // defpackage.nhr
    public final long a(ngn ngnVar) {
        if (!nhs.b(ngnVar)) {
            return 0L;
        }
        if (m(ngnVar)) {
            return -1L;
        }
        return ngt.i(ngnVar);
    }

    @Override // defpackage.nhr
    public final ngm b(boolean z) {
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(a.ae(i, "state: "));
        }
        try {
            nhw aX = mkm.aX(this.f.a());
            ngm ngmVar = new ngm();
            ngmVar.d(aX.a);
            ngmVar.b = aX.b;
            ngmVar.c = aX.c;
            ngmVar.c(this.f.b());
            if (z && aX.b == 100) {
                return null;
            }
            int i2 = aX.b;
            if (i2 != 100 && (i2 < 102 || i2 >= 200)) {
                this.e = 4;
                return ngmVar;
            }
            this.e = 3;
            return ngmVar;
        } catch (EOFException e) {
            ngc g = this.b.a.a.h.g("/...");
            g.getClass();
            g.b = msz.A("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            g.c = msz.A("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new IOException("unexpected end of stream on ".concat(g.a().e), e);
        }
    }

    @Override // defpackage.nhr
    public final nhi c() {
        return this.b;
    }

    @Override // defpackage.nhr
    public final nll d(ngn ngnVar) {
        if (!nhs.b(ngnVar)) {
            return j(0L);
        }
        if (m(ngnVar)) {
            ngk ngkVar = ngnVar.a;
            int i = this.e;
            if (i == 4) {
                ngd ngdVar = ngkVar.a;
                this.e = 5;
                return new nia(this, ngdVar);
            }
            throw new IllegalStateException(a.ae(i, "state: "));
        }
        long i2 = ngt.i(ngnVar);
        if (i2 != -1) {
            return j(i2);
        }
        int i3 = this.e;
        if (i3 == 4) {
            this.e = 5;
            this.b.e();
            return new nid(this);
        }
        throw new IllegalStateException(a.ae(i3, "state: "));
    }

    @Override // defpackage.nhr
    public final void e() {
        this.b.b();
    }

    @Override // defpackage.nhr
    public final void f() {
        this.d.flush();
    }

    @Override // defpackage.nhr
    public final void g() {
        this.d.flush();
    }

    @Override // defpackage.nhr
    public final void h(ngk ngkVar) {
        Proxy.Type type = this.b.a.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(ngkVar.b);
        sb.append(' ');
        if (!ngkVar.a.f && type == Proxy.Type.HTTP) {
            sb.append(ngkVar.a);
        } else {
            sb.append(mkm.aY(ngkVar.a));
        }
        sb.append(" HTTP/1.1");
        k(ngkVar.c, sb.toString());
    }

    @Override // defpackage.nhr
    public final nlj i(ngk ngkVar) {
        if (moz.v("chunked", ngkVar.a("Transfer-Encoding"))) {
            int i = this.e;
            if (i == 1) {
                this.e = 2;
                return new nhz(this);
            }
            throw new IllegalStateException(a.ae(i, "state: "));
        }
        int i2 = this.e;
        if (i2 == 1) {
            this.e = 2;
            return new nic(this);
        }
        throw new IllegalStateException(a.ae(i2, "state: "));
    }

    public final nll j(long j) {
        int i = this.e;
        if (i == 4) {
            this.e = 5;
            return new nib(this, j);
        }
        throw new IllegalStateException(a.ae(i, "state: "));
    }

    public final void k(ngb ngbVar, String str) {
        int i = this.e;
        if (i == 0) {
            nkq nkqVar = this.d;
            nkqVar.L(str);
            nkqVar.L("\r\n");
            int a = ngbVar.a();
            for (int i2 = 0; i2 < a; i2++) {
                nkq nkqVar2 = this.d;
                nkqVar2.L(ngbVar.c(i2));
                nkqVar2.L(": ");
                nkqVar2.L(ngbVar.d(i2));
                nkqVar2.L("\r\n");
            }
            this.d.L("\r\n");
            this.e = 1;
            return;
        }
        throw new IllegalStateException(a.ae(i, "state: "));
    }
}
