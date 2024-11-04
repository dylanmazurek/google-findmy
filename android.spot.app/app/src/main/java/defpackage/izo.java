package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class izo implements SocketFactory {
    final /* synthetic */ izp a;
    private final SocketFactory b;

    public izo(izp izpVar, SocketFactory socketFactory) {
        this.a = izpVar;
        this.b = socketFactory;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        this.a.a.set(Boolean.TRUE);
        return this.b.connectSocket(socket, str, i, inetAddress, i2, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final Socket createSocket() {
        return this.b.createSocket();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final boolean isSecure(Socket socket) {
        return this.b.isSecure(socket);
    }
}
