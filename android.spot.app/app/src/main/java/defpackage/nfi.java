package defpackage;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfi {
    public final nfw a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final nfn e;
    public final nfk f;
    public final ProxySelector g;
    public final ngd h;
    public final List i;
    public final List j;

    public nfi(String str, int i, nfw nfwVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, nfn nfnVar, nfk nfkVar, List list, List list2, ProxySelector proxySelector) {
        String str2;
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = nfwVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = nfnVar;
        this.f = nfkVar;
        this.g = proxySelector;
        ngc ngcVar = new ngc();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (moz.v(str2, "http")) {
            ngcVar.a = "http";
        } else if (moz.v(str2, "https")) {
            ngcVar.a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        char[] cArr = ngd.a;
        String bd = mkm.bd(msz.y(str, 0, 0, false, 7));
        if (bd != null) {
            ngcVar.d = bd;
            if (i > 0) {
                ngcVar.e = i;
                this.h = ngcVar.a();
                this.i = ngt.n(list);
                this.j = ngt.n(list2);
                return;
            }
            throw new IllegalArgumentException(a.ae(i, "unexpected port: "));
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(nfi nfiVar) {
        nfiVar.getClass();
        if (amr.i(this.a, nfiVar.a) && amr.i(this.f, nfiVar.f) && amr.i(this.i, nfiVar.i) && amr.i(this.j, nfiVar.j) && amr.i(this.g, nfiVar.g) && amr.i(null, null) && amr.i(this.c, nfiVar.c) && amr.i(this.d, nfiVar.d) && amr.i(this.e, nfiVar.e)) {
            if (this.h.d == nfiVar.h.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfi) {
            nfi nfiVar = (nfi) obj;
            if (amr.i(this.h, nfiVar.h) && a(nfiVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.h.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(null)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        ProxySelector proxySelector = this.g;
        java.util.Objects.toString(proxySelector);
        String concat = "proxySelector=".concat(proxySelector.toString());
        StringBuilder sb = new StringBuilder("Address{");
        ngd ngdVar = this.h;
        sb.append(ngdVar.c);
        sb.append(":");
        sb.append(ngdVar.d);
        sb.append(", ");
        sb.append(concat);
        sb.append("}");
        return sb.toString();
    }
}
