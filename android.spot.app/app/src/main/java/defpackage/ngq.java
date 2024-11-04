package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngq {
    public final nfi a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ngq(nfi nfiVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = nfiVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        if (this.a.c != null && this.b.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ngq) {
            ngq ngqVar = (ngq) obj;
            if (amr.i(ngqVar.a, this.a) && amr.i(ngqVar.b, this.b) && amr.i(ngqVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
