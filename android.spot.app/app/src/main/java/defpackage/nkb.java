package defpackage;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkb implements nkc {
    private nkc a;
    private final njz b;

    public nkb(njz njzVar) {
        this.b = njzVar;
    }

    private final synchronized nkc e(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            Class<?> cls = sSLSocket.getClass();
            Class<?> cls2 = cls;
            while (cls2 != null && !amr.i(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    Objects.toString(cls);
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(cls)));
                }
            }
            cls2.getClass();
            this.a = new nka(cls2);
        }
        return this.a;
    }

    @Override // defpackage.nkc
    public final String a(SSLSocket sSLSocket) {
        nkc e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.nkc
    public final void b(SSLSocket sSLSocket, String str, List list) {
        nkc e = e(sSLSocket);
        if (e != null) {
            e.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.nkc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.nkc
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }
}
