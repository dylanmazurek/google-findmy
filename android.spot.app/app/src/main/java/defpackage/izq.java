package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izq implements SocketFactory {
    public static final izq a = new izq();

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        if (str != null) {
            if (httpParams != null) {
                if (socket == null) {
                    socket = new Socket();
                }
                if (inetAddress != null || i2 > 0) {
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    socket.bind(new InetSocketAddress(inetAddress, i2));
                }
                int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
                InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
                try {
                    System.currentTimeMillis();
                    socket.connect(inetSocketAddress, connectionTimeout);
                    System.currentTimeMillis();
                    String str2 = dga.a;
                    return socket;
                } catch (SocketTimeoutException unused) {
                    throw new ConnectTimeoutException(a.af(inetSocketAddress, "Connect to ", " timed out"));
                }
            }
            throw new IllegalArgumentException("Parameters may not be null.");
        }
        throw new IllegalArgumentException("Target host may not be null.");
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final Socket createSocket() {
        return new Socket();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return izq.class.hashCode();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final boolean isSecure(Socket socket) {
        if (socket != null) {
            if (socket.getClass() == Socket.class) {
                if (!socket.isClosed()) {
                    return false;
                }
                throw new IllegalArgumentException("Socket is closed.");
            }
            throw new IllegalArgumentException("Socket not created by this factory.");
        }
        throw new IllegalArgumentException("Socket may not be null.");
    }
}
