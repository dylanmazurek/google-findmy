package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njb implements nhr {
    public static final List a = ngt.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List b = ngt.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final nhi c;
    private final nja d;
    private volatile njh e;
    private final ngi f;
    private volatile boolean g;

    public njb(ngh nghVar, nhi nhiVar, nja njaVar) {
        ngi ngiVar;
        this.c = nhiVar;
        this.d = njaVar;
        if (nghVar.o.contains(ngi.e)) {
            ngiVar = ngi.e;
        } else {
            ngiVar = ngi.d;
        }
        this.f = ngiVar;
    }

    @Override // defpackage.nhr
    public final long a(ngn ngnVar) {
        if (!nhs.b(ngnVar)) {
            return 0L;
        }
        return ngt.i(ngnVar);
    }

    @Override // defpackage.nhr
    public final ngm b(boolean z) {
        njh njhVar = this.e;
        if (njhVar != null) {
            ngi ngiVar = this.f;
            ngb a2 = njhVar.a();
            ngiVar.getClass();
            ktf ktfVar = new ktf((byte[]) null, (byte[]) null);
            int a3 = a2.a();
            nhw nhwVar = null;
            for (int i = 0; i < a3; i++) {
                String c = a2.c(i);
                String d = a2.d(i);
                if (amr.i(c, ":status")) {
                    nhwVar = mkm.aX("HTTP/1.1 ".concat(String.valueOf(d)));
                } else if (!b.contains(c)) {
                    ktfVar.n(c, d);
                }
            }
            if (nhwVar != null) {
                ngm ngmVar = new ngm();
                ngmVar.d(ngiVar);
                ngmVar.b = nhwVar.b;
                ngmVar.c = nhwVar.c;
                ngmVar.c(ktfVar.m());
                if (z && ngmVar.b == 100) {
                    return null;
                }
                return ngmVar;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // defpackage.nhr
    public final nhi c() {
        return this.c;
    }

    @Override // defpackage.nhr
    public final nll d(ngn ngnVar) {
        njh njhVar = this.e;
        njhVar.getClass();
        return njhVar.g;
    }

    @Override // defpackage.nhr
    public final void e() {
        this.g = true;
        njh njhVar = this.e;
        if (njhVar != null) {
            njhVar.l(9);
        }
    }

    @Override // defpackage.nhr
    public final void f() {
        njh njhVar = this.e;
        njhVar.getClass();
        njhVar.b().close();
    }

    @Override // defpackage.nhr
    public final void g() {
        this.d.d();
    }

    @Override // defpackage.nhr
    public final void h(ngk ngkVar) {
        boolean z;
        int i;
        njh njhVar;
        if (this.e == null) {
            boolean z2 = false;
            if (ngkVar.f != null) {
                z = true;
            } else {
                z = false;
            }
            ngb ngbVar = ngkVar.c;
            ArrayList arrayList = new ArrayList(ngbVar.a() + 4);
            arrayList.add(new nig(nig.c, ngkVar.b));
            arrayList.add(new nig(nig.d, mkm.aY(ngkVar.a)));
            String a2 = ngkVar.a("Host");
            if (a2 != null) {
                arrayList.add(new nig(nig.f, a2));
            }
            arrayList.add(new nig(nig.e, ngkVar.a.b));
            int a3 = ngbVar.a();
            for (int i2 = 0; i2 < a3; i2++) {
                String c = ngbVar.c(i2);
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = c.toLowerCase(locale);
                lowerCase.getClass();
                if (!a.contains(lowerCase) || (amr.i(lowerCase, "te") && amr.i(ngbVar.d(i2), "trailers"))) {
                    arrayList.add(new nig(lowerCase, ngbVar.d(i2)));
                }
            }
            nja njaVar = this.d;
            boolean z3 = !z;
            synchronized (njaVar.u) {
                synchronized (njaVar) {
                    if (njaVar.f > 1073741823) {
                        njaVar.l(8);
                    }
                    if (!njaVar.g) {
                        i = njaVar.f;
                        njaVar.f = i + 2;
                        njhVar = new njh(i, njaVar, z3, false, null);
                        if (!z || njaVar.s >= njaVar.t || njhVar.e >= njhVar.f) {
                            z2 = true;
                        }
                        if (njhVar.i()) {
                            njaVar.c.put(Integer.valueOf(i), njhVar);
                        }
                    } else {
                        throw new nif();
                    }
                }
                njaVar.u.f(z3, i, arrayList);
            }
            if (z2) {
                njaVar.u.d();
            }
            this.e = njhVar;
            if (!this.g) {
                njh njhVar2 = this.e;
                njhVar2.getClass();
                njhVar2.i.k(10000L, TimeUnit.MILLISECONDS);
                njh njhVar3 = this.e;
                njhVar3.getClass();
                njhVar3.j.k(10000L, TimeUnit.MILLISECONDS);
                return;
            }
            njh njhVar4 = this.e;
            njhVar4.getClass();
            njhVar4.l(9);
            throw new IOException("Canceled");
        }
    }

    @Override // defpackage.nhr
    public final nlj i(ngk ngkVar) {
        njh njhVar = this.e;
        njhVar.getClass();
        return njhVar.b();
    }
}
