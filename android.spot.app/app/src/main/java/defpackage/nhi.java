package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhi extends nin {
    public final ngq a;
    public Socket b;
    public Socket c;
    public nga d;
    public ngi e;
    public nja f;
    public nkr g;
    public nkq h;
    public boolean i;
    public int j;
    public int k;
    public final List l;
    public long m;
    private boolean o;
    private int p;
    private int q;

    public nhi(ngq ngqVar) {
        ngqVar.getClass();
        this.a = ngqVar;
        this.k = 1;
        this.l = new ArrayList();
        this.m = Long.MAX_VALUE;
    }

    public final Socket a() {
        Socket socket = this.c;
        socket.getClass();
        return socket;
    }

    public final void b() {
        Socket socket = this.b;
        if (socket != null) {
            ngt.p(socket);
        }
    }

    public final synchronized void c() {
        this.p++;
    }

    public final synchronized void d() {
        this.o = true;
    }

    public final synchronized void e() {
        this.i = true;
    }

    @Override // defpackage.nin
    public final void f(njh njhVar) {
        njhVar.k(8, null);
    }

    public final synchronized void g(nhg nhgVar, IOException iOException) {
        if (iOException instanceof njn) {
            njn njnVar = (njn) iOException;
            if (njnVar.a == 8) {
                int i = this.q + 1;
                this.q = i;
                if (i > 1) {
                    this.i = true;
                    this.j++;
                }
            } else if (njnVar.a != 9 || !nhgVar.n) {
                this.i = true;
                this.j++;
            }
        } else if (!i() || (iOException instanceof nif)) {
            this.i = true;
            if (this.p == 0) {
                ngh nghVar = nhgVar.a;
                ngq ngqVar = this.a;
                if (ngqVar.b.type() != Proxy.Type.DIRECT) {
                    nfi nfiVar = ngqVar.a;
                    nfiVar.g.connectFailed(nfiVar.h.e(), ngqVar.b.address(), iOException);
                }
                nghVar.t.j(ngqVar);
                this.j++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:            if (defpackage.nki.b(r7, (java.security.cert.X509Certificate) r0) != false) goto L48;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.nfi r6, java.util.List r7) {
        /*
            r5 = this;
            byte[] r0 = defpackage.ngt.a
            java.util.List r0 = r5.l
            int r0 = r0.size()
            int r1 = r5.k
            r2 = 0
            if (r0 >= r1) goto Lca
            boolean r0 = r5.i
            if (r0 == 0) goto L13
            goto Lca
        L13:
            ngq r0 = r5.a
            nfi r0 = r0.a
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto Lca
            ngd r0 = r6.h
            ngq r1 = r5.a
            nfi r1 = r1.a
            ngd r1 = r1.h
            java.lang.String r0 = r0.c
            java.lang.String r1 = r1.c
            boolean r0 = defpackage.amr.i(r0, r1)
            r1 = 1
            if (r0 == 0) goto L31
            return r1
        L31:
            nja r0 = r5.f
            if (r0 != 0) goto L36
            return r2
        L36:
            if (r7 == 0) goto Lca
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L40
            goto Lca
        L40:
            java.util.Iterator r7 = r7.iterator()
        L44:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r7.next()
            ngq r0 = (defpackage.ngq) r0
            java.net.Proxy r3 = r0.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L44
            ngq r3 = r5.a
            java.net.Proxy r3 = r3.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L44
            ngq r3 = r5.a
            java.net.InetSocketAddress r0 = r0.c
            java.net.InetSocketAddress r3 = r3.c
            boolean r0 = defpackage.amr.i(r3, r0)
            if (r0 == 0) goto L44
            javax.net.ssl.HostnameVerifier r7 = r6.d
            nki r0 = defpackage.nki.a
            if (r7 != r0) goto Lca
            ngd r7 = r6.h
            ngq r0 = r5.a
            int r3 = r7.d
            nfi r0 = r0.a
            ngd r0 = r0.h
            int r4 = r0.d
            if (r3 == r4) goto L87
            goto Lca
        L87:
            java.lang.String r3 = r7.c
            java.lang.String r0 = r0.c
            boolean r0 = defpackage.amr.i(r3, r0)
            if (r0 == 0) goto L92
            goto Lb5
        L92:
            boolean r0 = r5.o
            if (r0 != 0) goto Lca
            nga r0 = r5.d
            if (r0 == 0) goto Lca
            java.util.List r0 = r0.a()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Lca
            java.lang.String r7 = r7.c
            java.lang.Object r0 = r0.get(r2)
            r0.getClass()
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            boolean r7 = defpackage.nki.b(r7, r0)
            if (r7 == 0) goto Lca
        Lb5:
            nfn r6 = r6.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r6.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            nga r7 = r5.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r7.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            java.util.List r7 = r7.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r7.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r6.b()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            return r1
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhi.h(nfi, java.util.List):boolean");
    }

    public final boolean i() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nin
    public final synchronized void j(njm njmVar) {
        njmVar.getClass();
        this.k = njmVar.d();
    }

    public final void k() {
        this.i = true;
    }

    public final void l() {
        Socket socket = this.c;
        socket.getClass();
        nkr nkrVar = this.g;
        nkrVar.getClass();
        nkq nkqVar = this.h;
        nkqVar.getClass();
        socket.setSoTimeout(0);
        nil nilVar = new nil(ngy.a);
        nilVar.b = socket;
        nilVar.c = ngt.e + " " + this.a.a.h.c;
        nilVar.d = nkrVar;
        nilVar.e = nkqVar;
        nilVar.f = this;
        nja njaVar = new nja(nilVar);
        this.f = njaVar;
        this.k = nja.a.d();
        ngy ngyVar = ngy.a;
        ngyVar.getClass();
        njaVar.u.b();
        njaVar.u.h(njaVar.q);
        if (njaVar.q.c() != 65535) {
            njaVar.u.i(0, r2 - 65535);
        }
        ngyVar.a().e(new ngw(njaVar.d, njaVar.v));
    }

    public final void m() {
        Socket socket;
        int i;
        ngq ngqVar = this.a;
        Proxy proxy = ngqVar.b;
        Proxy.Type type = proxy.type();
        if (type == null || ((i = nhh.a[type.ordinal()]) != 1 && i != 2)) {
            socket = new Socket(proxy);
        } else {
            socket = ngqVar.a.b.createSocket();
            socket.getClass();
        }
        this.b = socket;
        socket.setSoTimeout(10000);
        try {
            nju.b.h(socket, this.a.c);
            try {
                this.g = new nlf(nkz.c(socket));
                this.h = new nld(nkz.a(socket));
            } catch (NullPointerException e) {
                if (!amr.i(e.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            InetSocketAddress inetSocketAddress = this.a.c;
            Objects.toString(inetSocketAddress);
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(inetSocketAddress.toString()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final String toString() {
        Object obj;
        nga ngaVar = this.d;
        if (ngaVar != null) {
            obj = ngaVar.b;
        } else {
            obj = "none";
        }
        ngq ngqVar = this.a;
        ngi ngiVar = this.e;
        StringBuilder sb = new StringBuilder("Connection{");
        ngd ngdVar = ngqVar.a.h;
        sb.append(ngdVar.c);
        sb.append(":");
        sb.append(ngdVar.d);
        sb.append(", proxy=");
        sb.append(ngqVar.b);
        sb.append(" hostAddress=");
        sb.append(ngqVar.c);
        sb.append(" cipherSuite=");
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(ngiVar);
        sb.append("}");
        return sb.toString();
    }
}
