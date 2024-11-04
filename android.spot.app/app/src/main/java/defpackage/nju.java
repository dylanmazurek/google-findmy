package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nju {
    private static final Logger a;
    public static volatile nju b;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:            if (java.lang.Integer.parseInt(r0) >= 9) goto L33;     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    static {
        /*
            boolean r0 = defpackage.mkm.aS()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L62
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.njx.a
            java.util.Map r0 = defpackage.njx.b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.njx.a
            boolean r4 = r4.add(r3)
            if (r4 == 0) goto L14
            r3.setUseParentHandlers(r1)
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            r3.setLevel(r4)
            njy r4 = defpackage.njy.a
            r3.addHandler(r4)
            goto L14
        L46:
            boolean r0 = defpackage.njo.a
            if (r0 == 0) goto L50
            njo r0 = new njo
            r0.<init>()
            goto L51
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto Le2
            boolean r0 = defpackage.njq.a
            if (r0 == 0) goto L5c
            njq r2 = new njq
            r2.<init>()
        L5c:
            r2.getClass()
        L5f:
            r0 = r2
            goto Le2
        L62:
            boolean r0 = defpackage.njt.a
            if (r0 == 0) goto L6c
            njt r0 = new njt
            r0.<init>()
            goto L6d
        L6c:
            r0 = r2
        L6d:
            if (r0 != 0) goto Le2
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            r0.getClass()     // Catch: java.lang.NumberFormatException -> L83
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L83
            r3 = 9
            if (r0 < r3) goto L83
            goto Ldb
        L83:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r2)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lda
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r1] = r7     // Catch: java.lang.Throwable -> Lda
            r6[r3] = r4     // Catch: java.lang.Throwable -> Lda
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lda
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r1] = r6     // Catch: java.lang.Throwable -> Lda
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lda
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r1] = r5     // Catch: java.lang.Throwable -> Lda
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch: java.lang.Throwable -> Lda
            njs r0 = new njs     // Catch: java.lang.Throwable -> Lda
            r7.getClass()     // Catch: java.lang.Throwable -> Lda
            r8.getClass()     // Catch: java.lang.Throwable -> Lda
            r9.getClass()     // Catch: java.lang.Throwable -> Lda
            r10.getClass()     // Catch: java.lang.Throwable -> Lda
            r11.getClass()     // Catch: java.lang.Throwable -> Lda
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lda
            r2 = r0
            goto Ldb
        Lda:
        Ldb:
            if (r2 != 0) goto L5f
            nju r0 = new nju
            r0.<init>()
        Le2:
            defpackage.nju.b = r0
            java.lang.Class<ngh> r0 = defpackage.ngh.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.nju.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nju.<clinit>():void");
    }

    public static /* synthetic */ void l(nju njuVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        njuVar.k(str, i, null);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public nkh b(X509TrustManager x509TrustManager) {
        return new nkf(e(x509TrustManager));
    }

    public boolean d(String str) {
        return true;
    }

    public nkj e(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        acceptedIssuers.getClass();
        return new nkg((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(str, 5, (Throwable) obj);
    }

    public Object g() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress) {
        socket.getClass();
        socket.connect(inetSocketAddress, 10000);
    }

    public final SSLSocketFactory j(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.getClass();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e) {
            e.toString();
            throw new AssertionError("No System TLS: ".concat(e.toString()), e);
        }
    }

    public final void k(String str, int i, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        a.log(level, str, th);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        simpleName.getClass();
        return simpleName;
    }

    public void i(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
