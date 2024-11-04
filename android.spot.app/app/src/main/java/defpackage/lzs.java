package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzs extends mbt {
    private static final long serialVersionUID = 0;
    public final InetSocketAddress a;
    private final SocketAddress b;
    private final String c;
    private final String d;

    public lzs(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        socketAddress.getClass();
        inetSocketAddress.getClass();
        hwx.X(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.b = socketAddress;
        this.a = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lzs)) {
            return false;
        }
        lzs lzsVar = (lzs) obj;
        if (!amr.g(this.b, lzsVar.b) || !amr.g(this.a, lzsVar.a) || !amr.g(this.c, lzsVar.c) || !amr.g(this.d, lzsVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    public final String toString() {
        boolean z;
        jeq q = ivc.q(this);
        q.b("proxyAddr", this.b);
        q.b("targetAddr", this.a);
        q.b("username", this.c);
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        q.f("hasPassword", z);
        return q.toString();
    }
}
